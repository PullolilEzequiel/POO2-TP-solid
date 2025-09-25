package ar.edu.unq.poo2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class CreditoPersonalTest {

    Cliente cliente;
    CreditoPersonal creditoSuject;
    final double ingreso_anual_minimo = 15001;
    final double monto_total = 10000;
    final int plazo_en_meses = 12;
    final double couta_mensual_credito= monto_total / plazo_en_meses;
    @BeforeEach
    public void  setup(){
        cliente= mock(Cliente.class);
        creditoSuject = new CreditoPersonal(monto_total, plazo_en_meses, cliente);
    }

    @Test
    public void noEsAceptableConIngresoAnualMenorOIgualA15k(){

        doReturn(-ingreso_anual_minimo).when(cliente).sueldoNetoAnual();
        Assertions.assertFalse(creditoSuject.esAceptable());

        doReturn(ingreso_anual_minimo-1).when(cliente).sueldoNetoAnual();
        Assertions.assertFalse(creditoSuject.esAceptable());

    }

    @Test
    public void noEsAceptableConMontoCoutaMayorAl70PorcientoDelIngresoMensual(){
        doReturn(ingreso_anual_minimo).when(cliente).sueldoNetoAnual();

        doReturn(couta_mensual_credito * 0.7).when(cliente).sueldoNeto();

        Assertions.assertFalse(creditoSuject.esAceptable());
    }

    @Test
    public void ingresoAnual15kYCuotaMenorAlIngresoMensual(){
        doReturn(ingreso_anual_minimo).when(cliente).sueldoNetoAnual();
        doReturn(ingreso_anual_minimo / 12).when(cliente).sueldoNeto();

        Assertions.assertTrue(creditoSuject.esAceptable());
    }
}

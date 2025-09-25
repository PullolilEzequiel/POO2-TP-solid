package ar.edu.unq.poo2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class CreditoHipotecarioTest {
    final double PORCENTAJE_MINIMO_VALOR_FISCAL = 0.7;
    final double PORCENTAJE_MINIMO_COUTA_MENSUAL = 0.5;
    final double monto_total = 10000;
    final int meses = 12;
    final double couta_mensual =monto_total / meses;
    CreditoHipotecario creditoHipotecario;
    PropiedadInmobiliaria propiedadSpy;
    Cliente clienteSpy;
    @BeforeEach
    public void  setup() {
        clienteSpy = spy(new Cliente("", "", "", 25, 1000000d));
        propiedadSpy = spy(new PropiedadInmobiliaria("", "", 1000000d));
        creditoHipotecario = new CreditoHipotecario(monto_total, meses, clienteSpy, propiedadSpy);
    }


    @Test
    public void coutaMayorAl50porcientoDelSueldoMensual(){
        doReturn(couta_mensual * PORCENTAJE_MINIMO_COUTA_MENSUAL).when(clienteSpy).sueldoNeto();
        Assertions.assertFalse(creditoHipotecario.esAceptable());
    }

    @Test
    public void montoMayorAl70PorcientoDelValorFiscalInmueble(){
        doReturn(monto_total * PORCENTAJE_MINIMO_VALOR_FISCAL).when(propiedadSpy).valorFiscal();
        Assertions.assertFalse(creditoHipotecario.esAceptable());

    }

    @Test
    public void laEdadDelClienteSuperaLos65AlTerminarDePagarElCredito(){
        doReturn(64).when(clienteSpy).edad();
        Assertions.assertFalse(creditoHipotecario.esAceptable());
    }


    @Test
    public void esAceptable(){
        Assertions.assertTrue(creditoHipotecario.esAceptable());
    }
}

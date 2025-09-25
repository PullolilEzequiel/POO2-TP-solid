package ar.edu.unq.poo2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
public class BancoTest {
    Banco banco;
    Cliente cliente = new Cliente(
            "Ezequie",
            "k",
            "H. yrigoyen",
            30,
            1000
    );
    SolicitudDeCredito creditoSencillo = new SolicitudDeCredito(12000, 12, cliente) {
        @Override
        public boolean esAceptable() {
            return false;
        }
    };
    SolicitudDeCredito creditoSencilloSpy;
    @BeforeEach
    public void setup(){
        banco = new Banco();
        creditoSencilloSpy = spy(creditoSencillo);
    }

    @Test
    public void agregarCliente(){
        Assertions.assertFalse(banco.registroClientes().contains(cliente));
        banco.agregarCliente(cliente);
        Assertions.assertTrue(banco.registroClientes().contains(cliente));
    }


    @Test
    public void aumentaElMontoADesembolsarEnCreditosValidos(){
        doReturn(true).when(creditoSencilloSpy).esAceptable();

        Assertions.assertEquals(0, banco.montoADesembolsarPorCreditos());
        banco.agregarSolicitudDeCredito(creditoSencilloSpy);
        Assertions.assertEquals(12000, banco.montoADesembolsarPorCreditos());

    }

    @Test
    public void noAumentaElMontoADesembolsarEnCreditoInvalidos(){
        doReturn(false).when(creditoSencilloSpy).esAceptable();

        Assertions.assertEquals(0, banco.montoADesembolsarPorCreditos());
        banco.agregarSolicitudDeCredito(creditoSencilloSpy);
        Assertions.assertEquals(0, banco.montoADesembolsarPorCreditos());
    }
}

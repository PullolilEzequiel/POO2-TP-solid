package ar.edu.unq.poo2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
public class BancoTest {
    Banco banco;
    Cliente cliente;

    @BeforeEach
    public void setup(){
        banco = new Banco();
        cliente = new Cliente(
                "Ezequie",
                "k",
                "H. yrigoyen",
                30,
                1000
        );
    }

    @Test
    public void agregarCliente(){
        Assertions.assertFalse(banco.registroClientes().contains(cliente));
        banco.agregarCliente(cliente);
        Assertions.assertTrue(banco.registroClientes().contains(cliente));
    }


    @Test
    public void aumentaElMontoADesembolsarEnCreditos(){
        SolicitudDeCredito credito = new CreditoPersonal(12000, 12, cliente);

        SolicitudDeCredito creditoSpy = spy(credito);
        doReturn(true).when(creditoSpy).esAceptable();


        Assertions.assertEquals(0, banco.montoADesembolsarPorCreditos());
        banco.agregarSolicitudDeCredito(creditoSpy);

        Assertions.assertEquals(12000, banco.montoADesembolsarPorCreditos());

    }
}

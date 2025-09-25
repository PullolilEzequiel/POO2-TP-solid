package ar.edu.unq.poo2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClientTest {
    @Test
    public void calculoSueldoNeto(){
        Cliente cliente = new Cliente(
                "Ezequie",
                "k",
                "H. yrigoyen",
                30,
                5000
        );

        Assertions.assertEquals(5000*12, cliente.sueldoNetoAnual());
    }
}

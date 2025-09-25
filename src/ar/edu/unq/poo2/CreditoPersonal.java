package ar.edu.unq.poo2;

public class CreditoPersonal extends SolicitudDeCredito{
    public CreditoPersonal(double monto, int plazo_en_meses, Cliente cliente) {
        super(monto, plazo_en_meses, cliente);
    }

    @Override
    public boolean esAceptable() {
        return false;
    }
}

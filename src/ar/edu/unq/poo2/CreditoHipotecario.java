package ar.edu.unq.poo2;

public class CreditoHipotecario extends SolicitudDeCredito{
    private PropiedadInmobiliaria inmueble_garantia;
    public CreditoHipotecario(double monto, int plazo_en_meses, Cliente cliente, PropiedadInmobiliaria inmueble) {
        super(monto, plazo_en_meses, cliente);
        this.inmueble_garantia = inmueble;
    }

    @Override
    public boolean esAceptable() {
        return (this.montoMensual() < (solicitante.sueldoNeto() * 0.5)) && (monto() < inmueble_garantia.valorFiscal() *0.7) && (solicitante.edad() + (plazoEnMeses() / 12) < 65);
    }
}

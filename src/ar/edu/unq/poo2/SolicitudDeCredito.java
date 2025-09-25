package ar.edu.unq.poo2;

public abstract class SolicitudDeCredito {
    private double monto;
    private int plazo_en_meses;
    protected Cliente solicitante;
    public SolicitudDeCredito(double monto, int plazo_en_meses, Cliente cliente){
        this.monto = monto;
        this.plazo_en_meses = plazo_en_meses;
        this.solicitante = cliente;
    }

    public  abstract boolean esAceptable();

    public double montoMensual(){
        return this.monto / plazo_en_meses;
    }

    public double montoTotal(){
        return this.monto;
    }

    public int plazoEnMeses(){
        return  this.plazo_en_meses;
    }
}

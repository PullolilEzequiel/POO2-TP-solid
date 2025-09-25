package ar.edu.unq.poo2;

public class PropiedadInmobiliaria {
    private String descripcion;
    private String direccion;
    private double valor_fiscal;


    public PropiedadInmobiliaria(String descripcion, String direccion, double valor_fiscal){
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.valor_fiscal = valor_fiscal;
    }
    public double valorFiscal(){
        return  this.valor_fiscal;
    }
}

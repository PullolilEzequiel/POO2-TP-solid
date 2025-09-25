package ar.edu.unq.poo2;

public class Cliente {
    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    private double sueldo_neto;
    public Cliente(String nombre, String apellido, String direccion, int edad, double sueldo_mensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.sueldo_neto = sueldo_mensual;
    }


    public double sueldoNetoAnual() {
        return 12*this.sueldo_neto;
    }

    public double sueldoNeto() {
        return this.sueldo_neto;
    }
}

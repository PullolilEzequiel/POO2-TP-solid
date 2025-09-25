package ar.edu.unq.poo2;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> registro_clientes = new ArrayList<>();
    private ArrayList<SolicitudDeCredito> solicitudes_pendientes = new ArrayList<>();


    public ArrayList<Cliente> registroClientes(){
        return this.registro_clientes;
    }

    public void agregarCliente(Cliente cliente) {
        this.registro_clientes.add(cliente);
    }

    public void agregarSolicitudDeCredito(SolicitudDeCredito solicitud){
        this.solicitudes_pendientes.add(solicitud);
    }

    public double montoADesembolsarPorCreditos() {
        double montoTotal = 0;
        for(SolicitudDeCredito solicitud: this.solicitudes_pendientes){
            if(solicitud.esAceptable()){
                montoTotal += solicitud.monto();
            }
        }

        return  montoTotal;
    }
}

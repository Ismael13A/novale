package ec.edu.uce.ia.practica;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class ClienteService {


    public String procesoCliente(String nombre, String telefono,String correo){

        System.out.println("Nombre de cliente: "+ nombre);
        System.out.println("Teléfono de cliente: "+ telefono);
        System.out.println("Correo de cliente: "+ correo);
        return "Porceso Cliente terminado con exito";
    }
}

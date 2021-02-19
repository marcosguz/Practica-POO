package test;

import cine.*;

/**
 *
 * @author Marcos
 */
public class TestCliente {

    public static void main(String args[]) {

        Cliente cliente = new Cliente();
        cliente.setNombre("Marcos");
        cliente.setApellido("Guzmán");
        cliente.setRuc("0850266248001");
        cliente.setEmail("marcosguzzz@gmail.com");
        cliente.setDireccion("Cochapamba Sur");
        cliente.setFechaCumpleaños("24-04-2005");
        cliente.setTelefono("0999286146");
        cliente.setEstado(true);
       
         

    }

    public static CategoriaCliente obtenerCategoriaDeBDD() {
        CategoriaCliente categoriaCliente = new CategoriaCliente();
        categoriaCliente.setIdCategoriaCliente(0);
        categoriaCliente.setNombre("Habitual");
        categoriaCliente.setDescripcion("Cliente de preferencia");
        categoriaCliente.setEstado(true);
        
        return categoriaCliente;

    }
}

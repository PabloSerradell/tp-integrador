package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Cliente;
import logica.Empleado;
import logica.Usuario;


public class ControladoraPersistencia {
    
    EmpleadoJpaController empleJPA = new EmpleadoJpaController();
    UsuarioJpaController usuJPA = new UsuarioJpaController();
    ClienteJpaController clienJPA = new ClienteJpaController();
    VentaJpaController ventaJPA = new VentaJpaController();
    ServicioTuristicoJpaController servJPA = new ServicioTuristicoJpaController();
    PaqueteTuristicoJpaController paqueJPA = new PaqueteTuristicoJpaController();

    
    // Método para crear un usuario y su empleado asociado:
    
    public void crearUsuario(Usuario usu, Empleado emple) {
        empleJPA.create(emple);
        usuJPA.create(usu);
    }
    
    
    // Método para obtener una lista de todos los usuarios activos:
    
    public List<Usuario> traerUsuariosActivos() {
        List<Usuario> listaUsuarios = usuJPA.findUsuarioEntities();
        
        for(int i=0; i<listaUsuarios.size(); i++){
            if(listaUsuarios.get(i).isActivo() == false){
                listaUsuarios.remove(i);
            }
        }
        
        return listaUsuarios;
    }

    
    // Métodos para buscar un usuario y un empleado en particular a través de su id:

    public Usuario buscarUsuario(long id_usuario) {
        return usuJPA.findUsuario(id_usuario);
    }
    
    public Empleado buscarEmpleado(long id_empleado) {
        return empleJPA.findEmpleado(id_empleado);
    }
    
    
    // Métodos para modificar un empleado y un usuario:

    public void modificarEmpleado(Empleado unEmpleado) {
        try {
            empleJPA.edit(unEmpleado);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarUsuario(Usuario usu) {
        try {
            usuJPA.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    // Método para obtener una lista de todos los clientes activos:
    
    public List<Cliente> traerClientesActivos() {
        List<Cliente> listaClientes = clienJPA.findClienteEntities();
        
        for(int i=0; i<listaClientes.size(); i++){
            if(listaClientes.get(i).isActivo() == false){
                listaClientes.remove(i);
            }
        }
        
        return listaClientes;
    }

    
    // Método para crear un cliente:
    
    public void crearCliente(Cliente clie) {
        clienJPA.create(clie);
    }
    
    
    
    
    
}

package logica;

import java.util.Date;
import java.util.List;
import persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearUsuario(String nombre, String apellido, String nombre_usu, Date fecha_nac, String direccion, String dni, String nacionalidad, long celular, String email, String cargo, double sueldo, String contrasenia) {
        
        Usuario usu = new Usuario();
        Empleado emple = new Empleado();
        
        // Asigno valores a usuario:
        usu.setNombre_usuario(nombre_usu);
        usu.setContrasenia(contrasenia);
        usu.setActivo(true);
        
        // Asigno valores a empleado:
        emple.setNombre(nombre);
        emple.setApellido(apellido);
        emple.setDireccion(direccion);
        emple.setDni(dni);
        emple.setNacionalidad(nacionalidad);
        emple.setCelular(celular);
        emple.setEmail(email);
        emple.setCargo(cargo);
        emple.setSueldo(sueldo);
        emple.setFecha_nac(fecha_nac);
        emple.setActivo(true);
        
        // Asigno empleado a usuario:
        usu.setUnEmpleado(emple);

        controlPersis.crearUsuario(usu, emple);
    }
    
    //           - - - - - -
    

    public boolean verificarUsuario(String nombre_usuario, String contrasenia){
        List<Usuario> listaUsuarios = controlPersis.traerUsuariosActivos();
        
        if (listaUsuarios != null){
            for (Usuario usu : listaUsuarios){
                if (usu.getNombre_usuario().equals(nombre_usuario) && usu.getContrasenia().equals(contrasenia)){
                    return true;
                }
            }
        }
        return false;
    }
    
    //           - - - - - -
    
    
    public List<Usuario> traerUsuariosActivos() {
        return controlPersis.traerUsuariosActivos();
    }
    
    //           - - - - - -
    
    
    //Método para deshabilitar un usuario y su respectivo empleado asociado
    public void deshabilitarUsuario(long id_usuario) {
        Usuario usu = controlPersis.buscarUsuario(id_usuario);
        usu.setActivo(false);
        usu.getUnEmpleado().setActivo(false);
        controlPersis.modificarEmpleado(usu.getUnEmpleado());
        controlPersis.modificarUsuario(usu);
    }

    //           - - - - - -
    
    
    public Usuario buscarUsuario(long id_usuario) {
        return controlPersis.buscarUsuario(id_usuario);
    }

    public Empleado buscarEmpleado(long id_empleado) {
        return controlPersis.buscarEmpleado(id_empleado);
    }
    
    //           - - - - - -
    

    public void modificarEmpleado(Empleado emple) {
        controlPersis.modificarEmpleado(emple);
    }

    public void modificarUsuario(Usuario usu) {
        controlPersis.modificarUsuario(usu);
    }
    
    //           - - - - - -
    

    public List<Cliente> traerClientesActivos() {
        return controlPersis.traerClientesActivos();
    }
    
    //           - - - - - -
    

    public void crearCliente(String nombre, String apellido, Date fecha_nac, String direccion, String dni, String nacionalidad, long celular, String email) {
        
        Cliente clie = new Cliente();
        
        // Asigno valores al cliente:
        clie.setNombre(nombre);
        clie.setApellido(apellido);
        clie.setDireccion(direccion);
        clie.setDni(dni);
        clie.setNacionalidad(nacionalidad);
        clie.setCelular(celular);
        clie.setEmail(email);
        clie.setFecha_nac(fecha_nac);
        clie.setActivo(true);
        
        controlPersis.crearCliente(clie);
    }

    
    
    
    
}

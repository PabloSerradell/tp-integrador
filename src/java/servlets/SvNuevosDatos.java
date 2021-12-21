package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;
import logica.Empleado;
import logica.Usuario;

@WebServlet(name = "SvNuevosDatos", urlPatterns = {"/SvNuevosDatos"})
public class SvNuevosDatos extends HttpServlet {

    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Traigo los datos del Front y los asigno en variables:
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String nombre_usu = request.getParameter("nombre_usu");
        
        // Acá convierto de String a Date a través del método:
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        Date fecha_nac = null;
        try {
            fecha_nac = formato.parse(request.getParameter("fecha_nac"));
        } catch (ParseException ex) {
            Logger.getLogger(SvNuevosDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String direccion = request.getParameter("direccion");
        String dni = request.getParameter("dni");
        String nacionalidad = request.getParameter("nacionalidad");
        long celular = Long.parseLong(request.getParameter("celular"));
        String email = request.getParameter("email");
        String cargo = request.getParameter("cargo");
        double sueldo = Double.parseDouble(request.getParameter("sueldo"));
        String contrasenia = request.getParameter("contrasenia");
        long id_usuario = Long.parseLong(request.getParameter("id_usuario"));
        long id_empleado = Long.parseLong(request.getParameter("id_empleado"));
        
        
        
        // Actualizo la base de datos:
        Empleado emple = control.buscarEmpleado(id_empleado);
        Usuario usu = control.buscarUsuario(id_usuario);
        
        emple.setNombre(nombre);
        emple.setApellido(apellido);
        usu.setNombre_usuario(nombre_usu);
        emple.setFecha_nac(fecha_nac);
        emple.setDireccion(direccion);
        emple.setDni(dni);
        emple.setNacionalidad(nacionalidad);
        emple.setCelular(celular);
        emple.setEmail(email);
        emple.setCargo(cargo);
        emple.setSueldo(sueldo);
        usu.setContrasenia(contrasenia);
        
        control.modificarEmpleado(emple);
        control.modificarUsuario(usu);
        
        // Actualizo la lista de usuarios en la sesión
        request.getSession().setAttribute("listaUsuarios", control.traerUsuariosActivos());
        
        // Redirecciono al servlet "SvConsultarEmpleados" para que muestre los empleados
        response.sendRedirect("SvConsultarEmpleados");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

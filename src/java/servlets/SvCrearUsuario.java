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

@WebServlet(name = "SvCrearUsuario", urlPatterns = {"/SvCrearUsuario"})
public class SvCrearUsuario extends HttpServlet {

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
            Logger.getLogger(SvCrearUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String direccion = request.getParameter("direccion");
        String dni = request.getParameter("dni");
        String nacionalidad = request.getParameter("nacionalidad");
        long celular = Long.parseLong(request.getParameter("celular"));
        String email = request.getParameter("email");
        String cargo = request.getParameter("cargo");
        double sueldo = Double.parseDouble(request.getParameter("sueldo"));
        String contrasenia = request.getParameter("contrasenia");
        
        
        
        // A través de las variables creadas, le paso los datos a la controladora de la lógica:
        control.crearUsuario(nombre, apellido, nombre_usu, fecha_nac, direccion, dni, nacionalidad, celular, email, cargo, sueldo, contrasenia);
        
        // Redirecciono al servlet "SvConsultarEmpleados" para que muestre los empleados
        response.sendRedirect("SvConsultarEmpleados");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

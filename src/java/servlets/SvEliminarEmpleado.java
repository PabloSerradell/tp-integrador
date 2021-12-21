package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;


@WebServlet(name = "SvEliminarEmpleado", urlPatterns = {"/SvEliminarEmpleado"})
public class SvEliminarEmpleado extends HttpServlet {

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
        
        // Traigo la id del usuario
        long id_usuario = Long.parseLong(request.getParameter("id_usuario"));
        
        // Deshabilito al usuario y a su empleado asociado a través del método
        // que se encuentra en la controladora de la lógica
        control.deshabilitarUsuario(id_usuario);
        
        // Actualizo la lista de usuarios en la sesión
        request.getSession().setAttribute("listaUsuarios", control.traerUsuariosActivos());
        
        // Actualizo la página sin el registro eliminado(en realidad deshabilitado)
        response.sendRedirect("verEmpleados.jsp");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

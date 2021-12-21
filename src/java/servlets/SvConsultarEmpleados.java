package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Usuario;

@WebServlet(name = "SvConsultarEmpleados", urlPatterns = {"/SvConsultarEmpleados"})
public class SvConsultarEmpleados extends HttpServlet {

    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        // Traigo una lista de los usuarios activos(ya que en cada usuario esta su
        // respectivo empleado como atributo)
        List<Usuario> listaUsuarios = control.traerUsuariosActivos();
        
        // Traigo la sesion
        HttpSession miSession = request.getSession();
        
        // Seteo la lista de usuarios a la sesion
        miSession.setAttribute("listaUsuarios", listaUsuarios);
        
        // Redirecciono al jsp donde va a estar la lista de los empleados
        response.sendRedirect("verEmpleados.jsp");
        
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

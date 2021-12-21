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
import logica.Cliente;
import logica.Controladora;

@WebServlet(name = "SvConsultarClientes", urlPatterns = {"/SvConsultarClientes"})
public class SvConsultarClientes extends HttpServlet {

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
        
        // Traigo una lista de los clientes activos
        List<Cliente> listaClientes = control.traerClientesActivos();
        
        // Traigo la sesion
        HttpSession miSession = request.getSession();
        
        // Seteo la lista de clientes a la sesion
        miSession.setAttribute("listaClientes", listaClientes);
        
        // Redirecciono al jsp donde va a estar la lista de los clientes
        response.sendRedirect("verClientes.jsp");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

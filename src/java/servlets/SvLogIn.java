package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;

@WebServlet(name = "SvLogIn", urlPatterns = {"/SvLogIn"})
public class SvLogIn extends HttpServlet {

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
        
        String nombre_usuario = request.getParameter("nombre_usu");
        String contrasenia = request.getParameter("contrasenia");
        
        boolean autorizado = control.verificarUsuario(nombre_usuario, contrasenia);
        
        if (autorizado == true){
            // Asigno usuario y contraseña a la sesión
            HttpSession miSession = request.getSession();
            miSession.setAttribute("nombre_usuario", nombre_usuario);
            miSession.setAttribute("contrasenia", contrasenia);
            
            response.sendRedirect("indexEmpleados.jsp");
        }else{
            response.sendRedirect("index.jsp");
        }
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

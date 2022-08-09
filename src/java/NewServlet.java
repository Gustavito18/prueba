import java.io.ClienteModell;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author JP
 */
@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {
    NewServlet alumno;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter respuesta = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            alumno=new NewServlet();
            
               String pass =  request.getParameter("pass");
               String opcion =  request.getParameter("opcion");
            alumno.setNombre(request.getParameter("nombre"));
            alumno.setApellido(request.getParameter("apellido"));
            alumno.setCorreo(request.getParameter("correo"));
            alumno.setCodigo(request.getParameter("codigo"));
            alumno.setNumero(request.getParameter("numero"));
            alumno.setDireccion(request.getParameter("direccion"));
            
            respuesta.println("<!DOCTYPE html>");
            respuesta.println("<html>");
            respuesta.println("<head>");
            respuesta.println("<title>Servlet NewServlet</title>");            
            respuesta.println("</head>");
            respuesta.println("<body>");
            respuesta.println("<h1>Mi primer servlet " + request.getContextPath() + "</h1>");
            respuesta.println("<h1>Datos del alumno registrado, gracias por registrarse </h1><br>");     
            respuesta.println("<h2>Nombre del cliente</h2>");
            respuesta.println("<h3>" + alumno.getNombre() + "</h3>");
            respuesta.println("<h2>Apellido del cliente</h2>");
            respuesta.println("<h3>" + alumno.getApellido() + "</h3>");
            respuesta.println("<h2>Correo del cliente</h2>");
            respuesta.println("<h3>" + alumno.getCorreo() + "</h3>");
            respuesta.println("<h2>Codigo del cliente</h1>");
            respuesta.println("<h3>" + alumno.getCodigo() + "</h3>");
            respuesta.println("<h2>Numero de telefono del cliente</h2>");
            respuesta.println("<h3>" + alumno.getNumero() + "</h3>");
             respuesta.println("<h2>Dirección del cliente</h2>");
            respuesta.println("<h3>" + alumno.getDireccion() + "</h3>");
            respuesta.println("</body>");
            respuesta.println("</html>");
            respuesta.println("<button><a href=\"index2.html\">Volver</a></button>");
            respuesta.println("<link href=\"estiloAplicacion.css\" rel=\"stylesheet\" type=\"text/css\"/>");
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getApellido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getCorreo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getNumero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getDireccion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setNombre(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setApellido(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
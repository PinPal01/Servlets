 //Primer   Servlet.
//Muy   sencillo.
package servletHTML;

import java.io.*;
import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//@WebServlet(name = "ServletHolaMundo", urlPatterns = {"/ServletHolaMundo"})
public class ServletHolaMundo extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = new PrintWriter(res.getOutputStream());
        out.println("<html>");
        out.println("<head><title>HolaMundoServlet</title>");
        out.println("<style> body  {");
        out.println("background-color: #ff8080;");
        out.println("}");
        out.println("h1{");
        out.println("color:white;");
        out.println("}</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1><center>Hola   Mundo   desde   el   servidor WEB</center></h1>");
        out.println("<br><br><br>");
        out.println("<center><img src=\"images/fondo.png\" alt=\"Imagen chida\" style=\"width:304px;height:228px;\"></center>");
        out.println("</body></html>");
        out.close();
    }

    public String getServletInfo() {
        return "Crea   una   página   HTML   que   dice   HolaMundo";
    }
}

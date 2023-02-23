
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgeServlet extends HttpServlet {

   
   

        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //doGet: 1 
       getServletContext().getRequestDispatcher("/WEB-INF/Agecalculate.jsp").forward(request, response);
    
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String age = request.getParameter("age");
        
        if (age.equals("") || age == null){
            request.setAttribute("message", "You must give your current age.");
        }
        else {
            Integer nextAge = Integer.parseInt(age) + 1;
            request.setAttribute("message", "Your age next birthday " + nextAge);
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/Agecalculate.jsp").forward(request, response); 
    }   
}
   

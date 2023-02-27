
package servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ShoppingServlet extends HttpServlet {
 
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Get a session object
        HttpSession session = request.getSession();
        getServletContext().getRequestDispatcher("/WEB-INF/user.jsp")
                .forward(request, response);
      
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         HttpSession session = request.getSession();
        ArrayList<String> items;
        String action = request.getParameter("action");
        //try using switch and case
        switch(action){
            //action 1: logout
            //using  session.invalidate() to return to the register page 
            case "Logout":{
                session.invalidate(); //logout
                //go back to register page
                response.sendRedirect("/WEB-INF/register.jsp");
                break;
            }
            //action 2: when user register 
            case "Register":{
                items = new ArrayList();
                session.setAttribute("itemArray", items);
                String username = request.getParameter("username");
                session.setAttribute("username", username);
                getServletContext().getRequestDispatcher("/WEB-INF/shoppinglist.jsp").forward(request, response);
                break;
               //action 3: when user add a product
           
           
            }
            
        }

    }
    }

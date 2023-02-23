
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticServlet extends HttpServlet {

 

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "-----");
       getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String calc = request.getParameter("calc");
        int result = 0;
        double divResult = 0;

        if (calc.equals("") || calc == null) {
            request.setAttribute("message", "-----");
        } else if (first.equals("") || first == null || second.equals("") || second == null) {
            request.setAttribute("message", "invalid");
        } else {
            int firstInt = Integer.parseInt(first);
            int secondInt = Integer.parseInt(second);

            if (calc.equals("+")) {
                result = firstInt + secondInt;
                request.setAttribute("message", result);
            } else if (calc.equals("-")) {
                result = firstInt - secondInt;
                request.setAttribute("message", result);
            } else if (calc.equals("*")) {
                result = firstInt * secondInt;
                request.setAttribute("message", result);
            } else if (calc.equals("%")) {
            
                double firstDouble = firstInt;
                double secondDouble = secondInt;
                divResult = (firstDouble %=secondDouble);
                request.setAttribute("message", divResult);
                
            }
        }
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
    }

    private double console(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

   



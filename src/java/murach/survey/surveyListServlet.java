/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package murach.survey;



import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import murach.business.User;
import murach.data.UserDB;

/**
 *
 * @author ASUS
 */
public class surveyListServlet extends HttpServlet {

   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String url = "/index.html";
        // get current action
        String action = request.getParameter("action");
        if(action == null){
            action = "join"; // default action
        }
        // perform action and set URL to appropriate page
        if(action.equals("join")){
            url = "/index.html"; // the "join page 
        }
        else if(action.equals("add")){
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String birthDay= request.getParameter("birthDay");
            
            
            String radio = request.getParameter("heardFrom");
            String check = request.getParameter("yes");
            String option = request.getParameter("contact");
            // store data in User object and save User object in db
            User user = new User(firstName, lastName, email, birthDay);
            UserDB.insert(user);
            
            
            
            
            // set User object in request object and set URL
            request.setAttribute("user", user);
            request.setAttribute("radio", radio);
            request.setAttribute("check", check);
            request.setAttribute("option", option);
            url = "/thanks.jsp"; // the "thanks" page
            
        }
        
        // forward request and response object to specified URL 
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        
    }
    
    @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
     }
}

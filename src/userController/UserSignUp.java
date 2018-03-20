package userController;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;

@WebServlet("/UserSignUp")
public class UserSignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
        try
        {
        	Class.forName("com.mysql.jdbc.Driver");
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Kuda","apoorv","june1998");
    		
            String name = request.getParameter("name");
            String userName = request.getParameter("uname");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String mobile = request.getParameter("mobile");
           
            if(!userExists(userName,con))
            {

                PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?,?)");
                ps.setString(1,userName);
                ps.setString(2,name);
                ps.setString(4,email);
                ps.setString(3,password);
                ps.setString(5,mobile);
 
                int i = ps.executeUpdate();
                if(i>0){
                	HttpSession session = request.getSession();
                    session.setAttribute("userName",userName);
                    response.sendRedirect("home.jsp");
                }
                
            }
            else
            {
            	request.getRequestDispatcher("UserSignUp.html").include(request,response);
            	response.setContentType("text/html");
            	response.getWriter().print("<script>window.alert('UserName already exists');</script>");
            }
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }
   
    boolean userExists(String userName,Connection con){
    	try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from user where username="+userName);
    	
        if(rs.next())
        {
            return true;
        }
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    	return false;
    }

}




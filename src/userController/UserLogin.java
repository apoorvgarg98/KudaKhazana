package userController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;

@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected static boolean validLogin(String uname,String pass)throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Kuda","apoorv","june1998");
		
        PreparedStatement ps = con.prepareStatement("select * from user where username ="+uname+"and password ="+pass);
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
           return true;
        }
        return false;
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   String uName=request.getParameter("userName");
		   String pass=request.getParameter("password");
		try{
			   
		   
		   boolean check= validLogin(uName,pass);
		   if(check)
		   {
			   HttpSession session=request.getSession();
			   session.setAttribute("userName",uName);
			   response.sendRedirect("index.jsp");
		   }
		   else
		   {
			   request.getRequestDispatcher("index.jsp").include(request,response);
			   response.setContentType("text/html");
			   response.getWriter().print("<script>window.alert('Invalid username or password');</script>");
		   }
		}
		catch(Exception e){
			e.printStackTrace();
			response.sendRedirect("index.jsp");
		}
		
		}
	

}

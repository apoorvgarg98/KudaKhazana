package ngoController;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/NGOLogin")
public class NGOLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected static boolean validLogin(String id,String pass)throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Kuda","apoorv","june1998");
		
        PreparedStatement ps = con.prepareStatement("select * from ngo where id ='"+id+"' and password ='"+pass+"';");
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
           return true;
        }
        return false;
	}

       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   String id = request.getParameter("ngo-id");
		   String pass=request.getParameter("password");
		try{
			   
		   
		   boolean check= validLogin(id,pass);
		   if(check)
		   {
			   HttpSession session=request.getSession();
			   session.setAttribute("id",id);
			   response.sendRedirect("home.jsp");
		   }
		   else
		   {
			   request.getRequestDispatcher("index.jsp").include(request,response);
			   response.setContentType("text/html");
			   response.getWriter().print("<script>window.alert('Invalid NGO-id or password');</script>");
		   }
		}
		catch(Exception e){
			e.printStackTrace();
			response.sendRedirect("index.jsp");
		}

	}

}

package ngoController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;

@WebServlet("/NGOSignUp")
public class NGOSignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE" , "system" , "connect");
           
            String name = request.getParameter("name");
            String id = request.getParameter("id");
            String required = request.getParameter("required");
            String password = request.getParameter("password");
            String website = request.getParameter("website");
           
            PreparedStatement ps = con.prepareStatement("insert into ngo values(?,?,?,?,?);");
            ps.setString(1,id);
            ps.setString(2,name);
            ps.setString(3,password);
            ps.setString(4,required);
            ps.setString(5,website);
           
            if(!userExists(id,con))
            {
                int i = ps.executeUpdate();
                if(i>0)
                {
                    HttpSession session = request.getSession();
                    session.setAttribute("id",id);
                    response.sendRedirect("home.jsp");
                }
            }
            else
            {
            	request.getRequestDispatcher("index.jsp").include(request,response);
 			   response.setContentType("text/html");
 			   response.getWriter().print("<script>window.alert('Invalid username or password');</script>");
            }
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }
   
    boolean userExists(String id,Connection con)
    {	
    	try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from users where id="+id);
       
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

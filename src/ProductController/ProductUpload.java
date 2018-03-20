package ProductController;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class ProductUpload
 */

@MultipartConfig
@WebServlet("/ProductUpload")
public class ProductUpload extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		          
		String name = request.getParameter("name");
		String category = request.getParameter("category");
		String desc = request.getParameter("desc");
		String price = request.getParameter("price");
		System.out.println(name);
		
		
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Kuda","apoorv","june1998");
			PreparedStatement ps = con.prepareStatement("insert into products(name,category,price,descp) values(?,?,?,?);");
			ps.setString(1, name);
			ps.setString(2, category);
			ps.setString(3, price);
			ps.setString(4, desc);
			
			int i=ps.executeUpdate();
			
			if(i>0)
			{	HttpSession session = request.getSession();
				session.setAttribute("productName", name);
				request.getRequestDispatcher("getImage.jsp").forward(request,response);
				System.out.println("product uploaded nigga");
			}
		
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}

}

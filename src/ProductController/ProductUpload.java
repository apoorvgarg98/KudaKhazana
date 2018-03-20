package ProductController;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;


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

		HttpSession session = request.getSession();
		
		String name = request.getParameter("name");
		String category = request.getParameter("category");
		String price = request.getParameter("price");
		String descp = request.getParameter("desc");
		//String owner = session.getAttribute("userName").toString();
		String owner = "Apoorv";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Kuda","apoorv","june1998");
			
			PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?,?,?);");
			ps.setString(1, name);
			ps.setString(2, category);
			ps.setString(3, price);
			ps.setString(4, descp);
			ps.setString(5, owner);
			
			int i=ps.executeUpdate();
			
			if(i>0)
			{
				System.out.println("product uploaded");
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

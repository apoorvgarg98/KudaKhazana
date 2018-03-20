package ProductController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;

@WebServlet("/ProductImage")
public class ProductImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(); 
		String name = (String) session.getAttribute("name");
		out.println("name : " + name);
	
		MultipartRequest m = new MultipartRequest(request,"d:/new");  
		String imgString = "d:/new/"+name+".jpg";
		
		
		
	}

}

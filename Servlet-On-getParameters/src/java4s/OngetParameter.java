package java4s;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OngetParameter
 */
@WebServlet("/OngetParameter")
public class OngetParameter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
		{
			PrintWriter out=res.getWriter();
			res.setContentType("text/html");

			int n1=Integer.parseInt(req.getParameter("n1"));
			int n2=Integer.parseInt(req.getParameter("n2"));
            int result=n1+n2;		
			out.println("Sum of two numbers " +result);
			out.close();

		}

	}
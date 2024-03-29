package java4s;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OngetParametersNames
 */
@WebServlet("/OngetParametersNames")
public class OngetParametersNames extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");

	Enumeration en=req.getParameterNames();

	while(en.hasMoreElements())
	{
		Object objOri=en.nextElement();
		String param=(String)objOri;
		String value=req.getParameter(param);
		pw.println("Parameter Name is '"+param+"' and Parameter Value is '"+value+"'");
	}		
		pw.close();	
}
}
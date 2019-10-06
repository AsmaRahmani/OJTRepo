

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ExampleHttpServlet")
public class ExampleHttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String mymsg;
    public void init() throws ServletException 
    {
    }
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		  // Setting up the content type of web page      
        response.setContentType("text/html");
        // Writing the message on the web page      
        PrintWriter out = response.getWriter();      
        out.println("<h1>" + "Http Servlet Demo" + "</h1>");      
        out.println("<p>" + "Hello Friends!" + "</p>"); 
		
	}

	
}



import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ServletConfig config = getServletConfig();
		ServletContext context = config.getServletContext();
		String context_param1 = context.getInitParameter("Email");
		String context_param2 = context.getInitParameter("Username");

		
			String uname = request.getParameter("uname");
		String email = request.getParameter("email");
		
		if (email.equals(context_param1) || email.equals(context_param2)){
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("welcome.jsp");
			
		}else{
			response.sendRedirect("login.jsp");
		}
	}

	}

	



package in.co.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginCtl() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		
		if (user.equals("raviraj") && pwd.equals("ravi123")) { 
			  RequestDispatcher rd = request.getRequestDispatcher("/WlcmCtl");
			  rd.forward(request, response);
		  }

		  else if (user.equals("") && pwd.equals("")) {
			RequestDispatcher rd = request.getRequestDispatcher("/LoginWeb.jsp");
			request.setAttribute("errorpass", "Password Required");
			request.setAttribute("errorlogin", "UserId Required");
			rd.forward(request, response);
		}	
		  else if (user.equals("")) {

			RequestDispatcher rd = request.getRequestDispatcher("/LoginWeb.jsp");
			request.setAttribute("errorlogin", "UserId Required");
			rd.forward(request, response);
		}
		  else if (pwd.equals("")) {

			RequestDispatcher rd = request.getRequestDispatcher("/LoginWeb.jsp");
			request.setAttribute("errorpass", "Password Required");
			rd.forward(request, response);
		}
		 else { RequestDispatcher rd = request.getRequestDispatcher("LoginWeb.jsp");
		  request.setAttribute("error", "Invalid UserId & Password"); 
		  rd.forward(request, response); 
		  }
		
	}

}

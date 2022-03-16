package in.co.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Registration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserRegistrationCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserRegistrationCtl() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String add = request.getParameter("add");
		String dob = request.getParameter("dob");

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.println(fname + " " + lname + " " + gender + " " + email + " " + contact + " " + add + " " + dob);

		out.close();

		doGet(request, response);
	}

}

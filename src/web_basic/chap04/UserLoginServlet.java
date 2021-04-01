package web_basic.chap04;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/chap04/userLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("user-id");
		String pass = request.getParameter("user-pass");
		String passConfirm = request.getParameter("user-passConfirm");
		String name = request.getParameter("user-name");
		String mail = request.getParameter("user-mail");
		String phone = request.getParameter("user-phone");
		String homep = request.getParameter("user-homep");
		
		
		out.println("가입정보<br>");
		out.println("id  " + id + "<br>");
		
		if(pass.contentEquals(passConfirm)) {
			out.println("password = 일치<br>");
		}else {
			out.print("password = 불일치<br>");
		}
		
		out.println("name " + name + "<br>");
		out.println("email " + mail + "<br>");
		out.println("phone " + phone + "<br>");
		out.println("homepage " + homep + "<br>");

		
	}
}

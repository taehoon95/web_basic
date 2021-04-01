package web_basic.chap04;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/chap04/registerServlet2")
public class RegisterServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String color = request.getParameter("color");
		String[] Class = request.getParameterValues("Class");
		String Class2 = request.getParameter("Class");
		Map<String, String[]> mapClass = request.getParameterMap();
		String[] choices = request.getParameterValues("choices");
		String intro = request.getParameter("intro");
		String introstr = intro.replace("\n","<br>");
		
		out.println(id + "<br>");
		out.println(pass + "<br>");
		out.println(color + "<br>");
		
		for(String s : Class) {
			out.printf("%s<br>", s);
		}
		
//		switch (Class2) {
//			case "건축공학과" : out.print("건축공학과<br>"); break;
//			case "기계공학과" : out.print("기계공학과<br>"); break;
//			case "산업공학과" : out.print("산업공학과<br>"); break;
//		}
		
		for(String c : choices) {
			out.printf("%s<br>", c);
		}
		
		out.println(introstr);
	}
}

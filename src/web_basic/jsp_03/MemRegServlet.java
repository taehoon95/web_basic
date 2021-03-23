package web_basic.jsp_03;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;


//@WebServlet("/jsp_01/memReg")
public class MemRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServerException, IOException, ServletException {
		PrintWriter out = response.getWriter();
		if (request.getMethod().equals("GET")) {
			out.printf("get method call ");
		} else {		
			out.printf("get method post ");
		}
	}

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response)
			throws UnsupportedEncodingException, IOException {
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html;charset=utf-8");
		
		if(request.getMethod().equalsIgnoreCase("GET")) {
			PrintWriter out = response.getWriter();
			String name = request.getParameter("name");
			out.println("이름 = " + name);
			
		}else {
			PrintWriter out = response.getWriter();
			String name = request.getParameter("name");
			String addr = request.getParameter("addr");
			String tel = request.getParameter("tel");
			String hobby = request.getParameter("hobby");
			
			out.println("이름 = " + name + "<br>");
			out.println("주소 = " + addr + "<br>");
			out.println("전화번호 = " + tel + "<br>");
			out.println("취미 = " + hobby + "<br>");
		}
		
	}

}

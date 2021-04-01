package web_basic.chap04;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap04/order_test")
public class Order_test extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("uname");
		String tel = request.getParameter("tel");
		
		String addr = request.getParameter("addr");
		String tel2 = request.getParameter("tel2");
		String comment = request.getParameter("comment");
		
		
		String[] prodInfo = request.getParameterValues("prodInfo");
		int guate = Integer.parseInt(request.getParameter("guate"));
		int indo = Integer.parseInt(request.getParameter("indo"));
		int tamra = Integer.parseInt(request.getParameter("tamra"));
		
		out.println("<h2>개인 정보</h2>");
		out.println("이름 : " + uname + "<br>");
		out.println("연락처 : " + tel+"<br>");
		out.println("<h2>주소지 정보</h2>");
		out.println("주소 : " + addr+"<br>");
		out.println("전화번호 : " + tel2+"<br>");
		out.println("메모 : " + comment+"<br>");
		out.println("<h2>주문 정보</h2>");
		
		for(String p : prodInfo) {
			if(p.equals("guate")) {
				if(guate != 0) {
					out.println("과테말라 안티구아(100g) : " + guate + "개"+"<br>");
				}else {
					out.println("과테말라 안티구아(100g) : 개수를 입력해주세요"+"<br>");
				}
			}
			if(p.equals("indo")) {
				if(indo != 0) {
					out.println("인도네시아 만델링(100g) : " + indo + "개"+"<br>");
				}else {
					out.println("인도네시아 만델링(100g) : 개수를 입력해주세요"+"<br>");
				}
				
			}
			if(p.equals("tamra")) {
				if(tamra != 0) {
					out.println("탐라는 도다(블렌딩)(100g) : " + tamra + "개"+"<br>");
				}else {
					out.println("탐라는 도다(블렌딩)(100g) : 개수를 입력해주세요"+"<br>");
				}
				
			}
		}	
	}
}

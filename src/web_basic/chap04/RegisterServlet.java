package web_basic.chap04;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap04/registerServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");
		String pass = request.getParameter("pas8s");
		String subject = request.getParameter("subject");
		String[] gubuns = request.getParameterValues("gubun");

		if (request.getMethod().equalsIgnoreCase("get")) {
			out.println("<html>");
			out.println("<head>");
			out.println("</head>");
			out.println("<body>");
			out.println("id = " + id);
			out.println("pass = " + pass);
			out.println("<h2>수강과목</h2>");
			if (subject.equals("eng")) {
				out.println("영어<br>");
			}
			if (subject.equals("ch")) {
				out.println("중국어회화<br>");
			}
			if (subject.equals("jp")) {
				out.println("일어회화<br>");
			}
			out.println("<h2>수강 분야</h2>");
			for (String gubun : gubuns) {
				if (gubun.equals("grm")) {
					out.print("문법<br>");
				}
				if (gubun.equals("wr")) {
					out.print("작문<br>");
				}
				if (gubun.equals("rd")) {
					out.print("독해<br>");
				}

			}
			out.println("</body>");
			out.print("</html>");
		}

	}

}

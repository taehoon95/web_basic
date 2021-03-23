package web_basic.jsp_03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp_01/choiceDog")
public class ChoiceDogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		chooseDog(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		chooseDog(request, response);
	}

	private void chooseDog(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		String[] dog = request.getParameterValues("dog");
		if(request.getMethod().equalsIgnoreCase("GET")) {
			out.println("GET");
			out.println("<html>");
			out.println("<head>");
			out.println("</head>");
			out.println("<body bgcolor = 'black'>");
			out.println("<table align = 'center' bgcolor = 'yellow'>");
			out.println("<tr>");
			for(int i = 0; i < dog.length; i++) {
				out.println("<td>");
				out.println("<img src = 'images/"+dog[0] + "'/>");
				out.println("</td>");
			}
			out.println("</tr>");
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
		}else {
			out.println("<html>");
			out.println("<head>");
			out.println("</head>");
			out.println("<body bgcolor = 'black'>");
			out.println("<table align = 'center' bgcolor = 'yellow'>");
			out.println("<tr>");
			for(int i = 0; i < dog.length; i++) {
				out.println("<td>");
				out.println("<img src = 'images/"+dog[i] + "'/>");
				out.println("</td>");
			}
			out.println("</tr>");
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
		}
		
	}
	
	

}

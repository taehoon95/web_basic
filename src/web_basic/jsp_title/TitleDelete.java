package web_basic.jsp_title;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_basic.jsp_13.erp.TitleService;

@WebServlet("/title/TitleDelete")
public class TitleDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TitleService service;
	
    public TitleDelete() {
    	service = new TitleService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int tno = Integer.parseInt(request.getParameter("tNo"));
		service.removeTitle(tno);
		
		response.sendRedirect("/web_basic/title/TitleServlet2");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

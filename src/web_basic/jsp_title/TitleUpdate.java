package web_basic.jsp_title;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_basic.jsp_13.erp.Title;
import web_basic.jsp_13.erp.TitleService;

@WebServlet("/title/TitleUpdate")
public class TitleUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TitleService service;
	
    public TitleUpdate() {
    	service = new TitleService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int tNo = Integer.parseInt(request.getParameter("tNo"));
		String tName = request.getParameter("tName");
		
		Title modiTitle = new Title(tNo,tName);
		service.modiTitle(modiTitle);
		
		response.sendRedirect("/web_basic/title/TitleServlet2");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

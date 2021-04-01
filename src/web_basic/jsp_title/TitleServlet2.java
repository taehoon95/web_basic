package web_basic.jsp_title;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_basic.jsp_13.erp.Title;
import web_basic.jsp_13.erp.TitleService;

@WebServlet("/title/TitleServlet2")
public class TitleServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TitleService service;

    public TitleServlet2() {
    	service = new TitleService();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset = UTF-8");
		List<Title> lists = service.showTitles();
		
		request.setAttribute("list", lists);
		request.getRequestDispatcher("/title/main2.jsp?page=TitleSelect.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

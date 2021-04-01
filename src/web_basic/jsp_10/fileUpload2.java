package web_basic.jsp_10;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;


@WebServlet("/jsp_10/fileUpload2")
public class fileUpload2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html;charset=utf-8");
		
		
		String uploadPath = request.getRealPath("/upload");
		int size = 10*1024*1024;
	
		String name = "";
		String subject = "";
		String filename1 = "";
		String filename2 = "";
		String origfilename1 = "";
		String origfilename2 = "";
		
		try {
			
			
			MultipartRequest multi = new MultipartRequest(request,
					uploadPath,
					size,
					"UTF-8",
					new DefaultFileRenamePolicy());
			
			name = multi.getParameter("name");
			subject = multi.getParameter("subject");
			
			Enumeration files = multi.getFileNames();
			
			String file1 = (String) files.nextElement();
			filename1 = multi.getFilesystemName(file1);
			origfilename1 = multi.getOriginalFileName(file1);
			
			String file2 = (String) files.nextElement();
			filename2 = multi.getFilesystemName(file2);
			origfilename2 = multi.getOriginalFileName(file2);
			
			RequestDispatcher rd = request.getRequestDispatcher("/jsp_10/fileCheck.jsp");

			request.setAttribute("name",name);
			request.setAttribute("subject",subject); 
			request.setAttribute("filename1",filename1);
			request.setAttribute("filename2",filename2);
			request.setAttribute("origfilename1",origfilename1);
			request.setAttribute("origfilename2",origfilename2);
			
			rd.forward(request, response);



		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

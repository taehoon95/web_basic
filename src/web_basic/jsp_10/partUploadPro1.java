package web_basic.jsp_10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@WebServlet("/jsp_10/partUploadPro1")
@MultipartConfig(
		fileSizeThreshold = 0,
		location = "D:/upload"
		)
public class partUploadPro1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public partUploadPro1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String writer = request.getParameter("writer");
		Part part = request.getPart("partFile1");
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		String contentDisposition = part.getHeader("content-disposition");
		System.out.println(contentDisposition); // form-data; name="partFile1"; filename="first.jpg"
		String uploadFileName = part.getSubmittedFileName();
		String uploadFileName2 = getUploadFileName(contentDisposition);
		part.write(uploadFileName);

		System.out.println(uploadFileName);    // first.jpg
		System.out.println(uploadFileName2); // first.jpg
		out.printf("작성자 : %s 님이 %s 파일을 업로드(%dKB) 하였습니다.", writer, uploadFileName,part.getSize());
		
	}

	private String getUploadFileName(String contentDisposition) {
		String uploadFileName = null;
		String[] contentSplitStr = contentDisposition.split(";");
		int firstQutosIndex = contentSplitStr[2].indexOf("\"");
		int lastQutosIndex = contentSplitStr[2].lastIndexOf("\"");
		uploadFileName = contentSplitStr[2].substring(firstQutosIndex + 1, lastQutosIndex);
		return uploadFileName;
	}

}

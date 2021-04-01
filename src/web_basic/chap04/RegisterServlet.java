package web_basic.chap04;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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
				try {
					process(request, response);
				} catch (IOException | ParseException e) {
					e.printStackTrace();
				}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			process(request, response);
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String passConfirm = request.getParameter("user-passConfirm");
		
		String subject = request.getParameter("subject");
		String[] gubuns = request.getParameterValues("gubun");
		
		int member = Integer.parseInt(request.getParameter("member"));
		int stuffs = Integer.parseInt(request.getParameter("stuffs"));
		String saits = request.getParameter("saits");
		
		String[] mailing = request.getParameterValues("mailing"); 
		
	
		String color = request.getParameter("color");
		
		
////////////////////////// 시간 설정  //////////////////////////
		//request로 시간 string 타입으로 받아옴
		String startDate = request.getParameter("startDate");
		String endDate = request.getParameter("endDate");
		String start1 = request.getParameter("start1");
		String end1 = request.getParameter("end1");
		String start2 = request.getParameter("start2");
		String end2 = request.getParameter("end2");
		
		LocalDateTime setStart1Date = LocalDateTime.parse(start1, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		LocalDateTime setEndDate = LocalDateTime.parse(start1, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		// 시간 커스텀
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm");
		
		
		Date start1Date = new Date(sdf.parse(start1).getTime());
		Date end1Date = new Date(sdf.parse(end1).getTime());
	

		
////////////////////////시간 설정  //////////////////////////		
		
		
		
			out.println("<h2>로그인</h2>");
			out.println("id = " + id + "<br>");
			if(pass.contentEquals(passConfirm)) {
				out.println("password = 일치<br>");
			}else {
				out.print("password = 불일치<br>");
			}
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
			out.println("<h2>등록 정보</h2>");
			out.println("참여인원 : " + member);
			out.println("지원물품 : " + stuffs);
			
			if(saits.equals("1")) {
				out.print("희망단계 : 하<br>");
			}
			if(saits.equals("2")) {
				out.print("희망단계 : 중<br>");
			}
			if(saits.equals("3")) {
				out.print("희망단계 : 상<br>");
			}
			
			out.println("<h2>메일링</h2>");
			for (String m : mailing) {
				if (m.equals("news")) {
					out.print("해외단신<br>");
				}
				if (m.equals("dialog")) {
					out.print("5분 회화<br>");
				}
				if (m.equals("pops")) {
					out.print("모닝팝스<br>");
				}
			}
			out.println("<h2>과티</h2>");
			out.println("과티 색 : " + color);
			out.println("<h2>조회기간</h2>");
			
			
			
			out.println("시작 : " +  startDate);
			out.println("끝 : " +  endDate);
			out.println("<h2>대관시간(오늘)</h2>");
			out.printf("시작시간: %s  종료시간 : %s",start1Date,end1Date);
			out.println("<h2>대관시간(다른날짜)</h2>");
			out.printf("시작시간: %s %n종료시간 : %s",start2,end2);

		

	}

}

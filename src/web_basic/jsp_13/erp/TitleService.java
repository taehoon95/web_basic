package web_basic.jsp_13.erp;

import java.sql.Connection;
import java.util.List;

import web_basic.jsp_13.JndiDs;

public class TitleService {
	private Connection con = JndiDs.getConnection();
	private TitleDaoimpl dao = TitleDaoimpl.getInstance();
	
	public TitleService() {
		dao.setCon(con);
	}
	
	public List<Title> showTitles(){
		return dao.selectTitleByAll();
	}
	
	public void addTitle(Title title) {
		dao.insertTitle(title);
	}
	
	public void removeTitle(int tno) {
		dao.deleteTitle(tno);
	}
	
	public void modiTitle(Title title) {
		dao.updateTitle(title);
	}
}

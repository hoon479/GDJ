package service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ActionForward;
import domain.Free;
import repository.FreeDao;


public class FreeModifyService implements FreeService {

	private Free free;

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
	
		int freeNo = Integer.parseInt(request.getParameter("freeNo"));
		String name = request.getParameter("name");
		int ip = Integer.parseInt(request.getParameter("ip"));
		int hit = Integer.parseInt(request.getParameter("hit"));
		
	
		int result = FreeDao.getInstance().updateFree(free);
		
		
		PrintWriter out = response.getWriter();
		if(result > 0) {
			out.println("<script>");
			out.println("alert('정보가 수정되었습니다.')");
			out.println("location.href='" + request.getContextPath() + "/free/detail.do?freeNo=" + freeNo + "'");
			out.println("</script>");
		} else {
			out.println("<script>");
			out.println("alert('정보 수정이 실패했습니다.')");
			out.println("history.back()");
			out.println("</script>");
		}
		out.close();
		
		return null;  
	}
	
}
	
		
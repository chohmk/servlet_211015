package com.test.quiz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz09")
public class PostMethodQuiz09 extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		String name = request.getParameter("name");
		String selfIntroduction = request.getParameter("selfIntroduction");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><head><title>입사지원서</title></head><body>");
		out.print("<b>" + name + "</b>" + "님 지원이 완료되었습니다.<br>");
		out.print("<h2>지원내용</h2>");
		out.print(selfIntroduction);
		
		
		
		
		out.print("</body></html>");
		
	}

}
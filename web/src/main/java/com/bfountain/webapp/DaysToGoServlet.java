package com.bfountain.webapp;

import java.io.IOException;
import javax.servlet.http.*;
import com.bfountain.global.*;

public class DaysToGoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println(new DateUtils().daysToNewYear() + " to go in 2014. Learn Gradle now!");
	}
}

package com.tcs.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	         response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			int count = 0;
			Cookie cookies[] = request.getCookies();
			Cookie c = null;
			boolean flag = false;
			for (int i = 0; i < cookies.length; i++) {
				c = cookies[i];
				if (c.getName().equals("visits")) {
					flag = true;
					break;
				}
			}
			if (flag) { // flag==true means visits cookie is found only after first visit
				count = Integer.parseInt(c.getValue());
				count++;
				c.setValue(count+"");
				response.addCookie(c);
			} else {
				Cookie cookie = new Cookie("visits", ++count + "");
				response.addCookie(cookie); // response header 
			}
			out.println("<h3>You have refreshed the page " + count + "  times</h3>");
		}


		/*
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int count = 0;
		Cookie cookies[] = request.getCookies();
		if(cookies == null) {
			Cookie cookie = new Cookie("visits",++count+""); // convert the int to string(widening)
			response.addCookie(cookie);
		}
		else {
			Cookie c = null;
			boolean flag = false;
			for(int i=0;i<cookies.length;i++) {
				c=cookies[i];
				if(c.getName().equals("visits")) {
					flag  = true;
					break;
				}
			}
			if(flag) { //cookie is found
				count = Integer.parseInt(c.getValue());
				count++;
				c.setValue(count+"");
				response.addCookie(c);
			}
		}
		
		out.println("<h3>You have refreshed the page "+count+" times</h3>");
	}*/
	
	
	
	   /* response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int count = 0;
		Cookie cookies[] = request.getCookies();
		Cookie c = null;
		boolean flag = false;
		for(int i=0;i<cookies.length;i++) {
			c=cookies[i];
			if(c.getName().equals("visits")) {
				flag  = true;
				break;
			}
		}
		if(flag) { //cookie is found
				count = Integer.parseInt(c.getValue());
				count++;
				c.setValue(count+"");
				response.addCookie(c);
		}else {
				
			
		Cookie cookie = new Cookie("visits",++count+""); // convert the int to string(widening)
		response.addCookie(cookie);
		}
		
		//out.println(count = count +1);
		
		
		out.println("<h3>You have refreshed the page "+count+" times</h3>");
		
	}*/

}

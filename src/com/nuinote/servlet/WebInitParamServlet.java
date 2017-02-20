package com.nuinote.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WebInitParamServlet
 */
@WebServlet(urlPatterns={"/webInitParam"},initParams={@WebInitParam(name="type",value="checking")})
public class WebInitParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String type=null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WebInitParamServlet() {
        super();
        // TODO Auto-generated constructor stub
        
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	super.init(config);
    	type=config.getInitParameter("type");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("getParameter : ").append(request.getParameter("tx"));
		
		HttpSession session=request.getSession(true);
		response.getWriter().append("session : ").append((String) session.getAttribute("username"));

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

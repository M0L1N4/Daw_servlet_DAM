package daw_servlet_DAM;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AppIndex
 */
public class AppIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AppIndex() {
        super();
        // TODO Auto-generated constructor stub
    }

    private String message;
    
    private static boolean resp = false;
    
    public void init() throws ServletException {
       // Do required initialization
       message = "Hello World";
    }
    
    public static boolean resposta() {
    	if (resp == false) {
    		return false;
    	}
    	else {
    		return true;
    	}
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		getServletContext().getRequestDispatcher("/jsp/index.jsp").forward(request, response);
		resp = true;
		// Set response content type
//	      response.setContentType("text/html");

	      // Actual logic goes here.
//	      PrintWriter out = response.getWriter();
//	      out.println("<h1>" + message + "</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

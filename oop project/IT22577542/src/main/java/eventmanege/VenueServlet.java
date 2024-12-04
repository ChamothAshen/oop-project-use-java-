package eventmanege;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VenueServlet
 */
@WebServlet("/VenueServlet")
public class VenueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
			  
			  List<eventvenue> venuedetails = veneuedbutil.geteventvenue();
				request.getSession().setAttribute("venuedetails", venuedetails);
				
				 RequestDispatcher dis = request.getRequestDispatcher("veiwvenue.jsp");
				dis.forward(request, response); 
			 
			
	}

}
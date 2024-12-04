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
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String venuecategory = request.getParameter("event");
		String venueName = request.getParameter("venueName");
		String location = request.getParameter("location");
		String capacity = request.getParameter("capacity");
		
boolean isTrue;
		
		isTrue = veneuedbutil.updateVenueDetails(id, venuecategory, venueName, location, capacity);
		
		
		if(isTrue == true) {
			
			List<eventvenue> venuedetails = veneuedbutil.geteventvenue();
			request.getSession().setAttribute("venuedetails", venuedetails);
			
			 RequestDispatcher dis = request.getRequestDispatcher("veiwvenue.jsp");
			dis.forward(request, response); 
			
		}
		else {
			
			List<eventvenue> venuedetails = veneuedbutil.geteventvenue();
			request.getSession().setAttribute("venuedetails", venuedetails);
			
			 RequestDispatcher dis = request.getRequestDispatcher("veiwvenue.jsp");
			dis.forward(request, response);  
			
		}
	}

}

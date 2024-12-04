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
 * Servlet implementation class VneueInserst
 */
@WebServlet("/VneueInserst")
public class VneueInserst extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String venuecatagory = request.getParameter("event");
		 String venuename =request.getParameter("venueName");
		 String venuelocation =request.getParameter("location");
		 String   venuecapacity = request.getParameter("capacity");
		 
			/*
			 * try { venuecapacity = Integer.parseInt(request.getParameter("capacity")); }
			 * catch (NumberFormatException e) { // Handle the parsing error, e.g., log it
			 * or show an error message }
			 */

		 System.out.println("Ready to Update Items DB util. Converted value: venuecapacity = "+venuecapacity);

		  
		  System.out.println("Redy to Update Items DB util passed converted Val item id = '"+venuecatagory+"'");
		  System.out.println("Redy to Update Items DB util passed converted Val item id = '"+venuecatagory+"'");
		  System.out.println("Redy to Update Items DB util passed converted Val item id = '"+venuelocation+"'"); 
		  System.out.println("Redy to Update Items DB util passed converted Val item id = '"+venuecapacity+"'"); 
		 
		  boolean isTrue;
		  
		  isTrue = veneuedbutil.inserttovenue(venuecatagory,venuename,venuelocation,venuecapacity);
		  
		  if(isTrue == true) {
			  
			  List<eventvenue> venuedetails = veneuedbutil.geteventvenue();
				request.getSession().setAttribute("venuedetails", venuedetails);
				
				 RequestDispatcher dis = request.getRequestDispatcher("veiwvenue.jsp");
				dis.forward(request, response); 
			 }
		  
			 else {
				 RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
				 dis2.forward(request, response);
			 }
	
	}
	
	
	
}

 package eventmanege;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import eventmanege.eventvenue;
import  eventmanege.DBconnection;
import eventmanege.eventvenue;
import java.util.List;
import java.util.ArrayList;

public class veneuedbutil {
	 private static boolean isSucsess;
	 private static Connection con = null;
	 private static Statement  stmt = null;
	 private static  ResultSet rs  = null;
	 
	 public static  List <eventvenue> geteventvenue(){
			/* int converteventid = Integer.parseInt(venueid); */
		 ArrayList<eventvenue> venue = new ArrayList<>(); 
		
		 try {	
			 con = DBconnection.getConnection1();
			  stmt = con.createStatement();
			 String Sql = "select * from evengt_planning.eventvenue";
			 rs=stmt.executeQuery(Sql);
			 
			while(rs.next()) {
				
				String vid = rs.getString(1);
				String venuecatagory = rs.getString(2);
				String venuename = rs.getString(3);
				String venuelocation = rs.getString(4);
				String venuecapacity  = rs.getString(5);
				System.out.println("Redy to Update Items DB util passed converted Val item id = '"+vid+"'");
				System.out.println("Redy to Update Items DB util passed converted Val item id = '"+venuecatagory+"'");
				eventvenue ve = new eventvenue(vid,venuecatagory,venuename,venuelocation,venuecapacity);
				venue.add(ve);	
			}
		 }catch(Exception e) {
			 
		 }
		return  venue;
	 }
	
	
	public static boolean inserttovenue(String venuecatagory,String venuename,String venuelocation,String venuecapacity){
	 
		
		 boolean isSucsess = false;
		 	
		 try {
			    con = DBconnection.getConnection1();
			    stmt = con.createStatement();
				String Sql = ("INSERT INTO eventvenue values(0,'"+venuecatagory+"','"+venuename+"','"+venuelocation+"',"+venuecapacity+")");
				int rs = stmt.executeUpdate(Sql);
				
				if (rs>0) {
					isSucsess = true;	
		         }
		        else {
		        	isSucsess = false;
		        }
		 }
		 catch (Exception e){
			  e.printStackTrace();
		 }
		 
		 return isSucsess;
	}
	
	public static boolean deleteVenueDetails(String cid) {
		 
		 
		 try {
			 
			 con = DBconnection.getConnection1();
			    stmt = con.createStatement();
		        
		        String sql = "delete from evengt_planning.eventvenue where venueID='"+cid+"'";
		        int rs = stmt.executeUpdate(sql);
		        
		        
		        
		        if(rs > 0) {
					
		        	isSucsess = true;
				}
				else {
					
					isSucsess = false;
				}

				
			}
			catch(Exception e) {
				
				e.printStackTrace();
			}
		 
		 return isSucsess;
	 }
	
	public static boolean updateVenueDetails(String id,String venuecategory, String venueName, String location, String capacity)  {
		 
		 try {
			 
			 con = DBconnection.getConnection1();
			    stmt = con.createStatement();
			 
		        String sql = "update evengt_planning.eventvenue set venuecategory='"+venuecategory+"',venueName='"+venueName+"',location='"+location+"',capacity='"+capacity+"'"
		        		+ "where venueID='"+id+"'";
		        int rs = stmt.executeUpdate(sql);
		        
		        if(rs > 0) {
					
		        	isSucsess = true;
				}
				else {
					
					
					isSucsess = false;
				}
		 }
		 
		 catch(Exception e) {
			 
			 e.printStackTrace();
		 }
		 return isSucsess;
	 }
	
	 }

	


		
	
	



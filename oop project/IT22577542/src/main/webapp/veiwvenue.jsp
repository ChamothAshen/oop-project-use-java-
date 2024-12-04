<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


    <!DOCTYPE html>
 <html>
 <head>
    <style>
    	h2 {
            margin-left: 240px;
        }    
        table {
            border-collapse: collapse;
            width: 70%;
            margin-left: 240px;
        }    
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
    
 </head>
 <body>
 	
		<br><br>
       <h2>Venue Information</h2>
     <table>
         <thead>
             <tr>
     
                <th>venueID</th>
                <th>venueCategory</th>
                <th>venueName</th>
                <th>location</th>
                <th>capacity</th>
                <th></th>
            </tr>
             <c:forEach var="ve" items="${venuedetails}">
            <tr>
                <th>${ve.vid}</th>
                <th>${ve.venuecatagory}</th>
                <th>${ve.venuename}</th>
                <th>${ve.venuelocation}</th>
                <th>${ve.venuecapacity}</th>
                
                <c:url value="updatevenue.jsp" var="vupdate">
		
		<c:param name="id" value="${ve.vid}"/>
		<c:param name="venuecategory" value="${ve.venuecatagory}"/>
		<c:param name="venueName" value="${ve.venuename}"/>
		<c:param name="location" value="${ve.venuelocation}"/>
		<c:param name="capacity" value="${ve.venuecapacity}"/>
		
		
				</c:url>
                <th><a href="${vupdate}"><input type="submit" name="update" Value="Update"></a></th>
                
                
				<form action="DeleteServlet" method="post">
                
                
                <input type="hidden" name="id" value="${ve.vid}">
                
                <th><input type="submit" name="delete" Value="Delete"></th>
                </form>
            </tr>
            </c:forEach>
        </thead>
        <tbody>
           
        </tbody>
    </table>
    <br>
    <a href="dashboard.jsp" style="margin-left: 240px;">
    <input type="submit" name="venues" value="Back"></a>
</body>
</html>

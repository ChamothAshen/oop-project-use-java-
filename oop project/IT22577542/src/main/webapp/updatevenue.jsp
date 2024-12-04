<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    
    <%
		String id = request.getParameter("id");
		String venuecategory = request.getParameter("venuecategory");
		String venueName = request.getParameter("venueName");
		String location = request.getParameter("location");
		String capacity = request.getParameter("capacity");
		
	%>
	<style>
    	form {
            margin-left: 80px;
        }    
    </style>
    
</head>
<body>
<br><br><br><br>
<div class="container mt-4">
      <form action="UpdateServlet" method="post">
      
      <input type="hidden" name="id" value="<%=id %>">
            <div class="form-group">
                <label for="event">Select venue_category:</label>
                <select name="event" id="event" class="form-control">
                    <option value="Hotels">Hotels and Resorts</option>
                    <option value="Outdoor">Outdoor Venues</option>
                    <option value="Venues">Beachfront Venues</option>
                    <option value="Banquet">Banquet Halls</option>
                    <option value="Conference">Conference Centers</option>
                </select>
            </div>

            <div class="form-group">
                <label for="venueName">Venue Name:</label>
                <input type="text" id="venueName" name="venueName" class="form-control" value="<%= venueName%>">
            </div>

            <div class="form-group">
                <label for="location">Location:</label>
                <input type="text" id="location" name="location" class="form-control" value="<%= location%>">
            </div>

            <div class="form-group">
                <label for="capacity">Capacity:</label>
                <input type="text" id="capacity" name="capacity" class="form-control" value="<%= capacity%>">
            </div>

            <div class="form-group">
                <p>Check Availability:</p>
                <div class="form-check">
                    <input type="radio" id="availability-right" name="availability" value="right" class="form-check-input">
                    <label for="availability-right" class="form-check-label">Right</label>
                </div>
                <div class="form-check">
                    <input type="radio" id="availability-wrong" name="availability" value="wrong" class="form-check-input" >
                    <label for="availability-wrong" class="form-check-label">Wrong</label>
                </div>
            </div>
            

		
		<input type="submit" name="submit" value="Update Data">
		
	</form>
        <br>
        <a href="veiwvenue.jsp" style="margin-left: 80px;"><input type="submit" name="venues" Value="Back"></a>
    </div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<br><br><br>
	<h2 style="margin-left: 620px;">Add Venue</h2>
    <div class="container mt-4">
        <form action="VneueInserst" method="post">
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
                <input type="text" id="venueName" name="venueName" class="form-control">
            </div>

            <div class="form-group">
                <label for="location">Location:</label>
                <input type="text" id="location" name="location" class="form-control">
            </div>

            <div class="form-group">
                <label for="capacity">Capacity:</label>
                <input type="text" id="capacity" name="capacity" class="form-control">
            </div>

            <div class="form-group">
                <p>Check Availability:</p>
                <div class="form-check">
                    <input type="radio" id="availability-right" name="availability" value="right" class="form-check-input">
                    <label for="availability-right" class="form-check-label">Right</label>
                </div>
                <div class="form-check">
                    <input type="radio" id="availability-wrong" name="availability" value="wrong" class="form-check-input">
                    <label for="availability-wrong" class="form-check-label">Wrong</label>
                </div>
            </div>

            <button type="submit" class="btn btn-primary">Submit</button><br>
        </form>
        <br>
        <a href="dashboard.jsp"><input type="submit" name="venues" Value="Back"></a>
    </div>
</body>
</html>
    
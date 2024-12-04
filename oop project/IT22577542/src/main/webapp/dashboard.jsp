<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>View Venue</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
        }

        h1 {
            color: #333;
            margin-left: 30px;
        }

        form {
            margin: 20px;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            border: none;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        a {
            text-decoration: none;
        }

        a input[type="submit"] {
            background-color: #28a745;
        }

        a input[type="submit"]:hover {
            background-color: #1f8039;
        }
    </style>
    <jsp:include page="admin dashboard.jsp" />
</head>
<body>
<br><br><br><br><br><br><br><br><br><br><br><br><br></br>
    <h1>View Venue</h1>

    <form action="VenueServlet" method="post">
        <input type="submit" name="venues" value="View Venue">
    </form>

    <a href="event_venue.jsp">
        <input type="submit" name="venues" value="Add Venue">
    </a>
</body>
</html>

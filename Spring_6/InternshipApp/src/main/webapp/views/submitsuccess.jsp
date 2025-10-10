<%@ page import="com.rods.internshipapp.model.Internship" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Internship Added Successfully</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f6f9;
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 600px;
            margin: 50px auto;
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);
        }

        h2 {
            color: green;
            text-align: center;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 15px;
        }

        th, td {
            padding: 10px;
            border-bottom: 1px solid #ddd;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

        .btn {
            display: block;
            width: 100%;
            padding: 10px;
            margin-top: 20px;
            text-align: center;
            background: #28a745;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }

        .btn:hover {
            background: #218838;
        }
    </style>
</head>
<body>


<%--<%--%>
<%--    Internship internship = (Internship) request.getAttribute("internship");--%>
<%--// Optional incase we weren't using the Model Object--%>
<%--%>--%>

<div class="container">
    <h2>Internship Details Submitted Successfully ✅</h2>
    <table>
        <tr>
            <th>Internship ID</th>
            <td>${internship.id}</td>
        </tr>
        <tr>
            <th>Company</th>
            <td>${internship.company}</td>
        </tr>
        <tr>
            <th>Position</th>
            <td>${internship.position}</td>
        </tr>
        <tr>
            <th>Stipend</th>
            <td>${internship.stipend}</td>
        </tr>
        <tr>
            <th>Description</th>
            <td>${internship.desc}</td>
        </tr>
    </table>
    <a href="add-internship" class="btn">Add Another Internship</a>
</div>
</body>
</html>

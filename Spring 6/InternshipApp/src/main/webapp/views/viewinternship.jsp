<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Internships</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            background: #f0f2f5;
        }

        h2 {
            text-align: center;
            color: #333;
            margin-top: 2rem;
        }

        .container {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            gap: 2rem;
            padding: 2rem;
        }

        .card {
            background: white;
            width: 280px;
            border-radius: 15px;
            padding: 1.5rem;
            box-shadow: 0px 8px 20px rgba(0,0,0,0.1);
            transition: transform 0.3s, box-shadow 0.3s;
            display: flex;
            flex-direction: column;
            justify-content: space-between;
        }

        .card:hover {
            transform: translateY(-10px);
            box-shadow: 0px 15px 30px rgba(0,0,0,0.2);
        }

        .card h3 {
            margin: 0 0 0.5rem 0;
            color: #2ebf91;
        }

        .card p {
            margin: 0.3rem 0;
            color: #555;
            font-size: 0.95rem;
        }

        .stipend {
            font-weight: bold;
            color: #8360c3;
        }

        .back-link {
            display: block;
            text-align: center;
            margin: 2rem 0;
            text-decoration: none;
            font-weight: bold;
            color: #2ebf91;
        }

        .back-link:hover {
            text-decoration: underline;
        }

    </style>
</head>
<body>

<h2>All Internships</h2>

<div class="container">
    <c:forEach var="internship" items="${internships}">
        <div class="card">
            <h3>${internship.position}</h3>
            <p><strong>Company:</strong> ${internship.company}</p>
            <p><strong>ID:</strong> ${internship.id}</p>
            <p class="stipend"><strong>Stipend:</strong> ₹${internship.stipend}</p>
            <p><strong>Description:</strong> ${internship.desc}</p>
        </div>
    </c:forEach>
</div>

<a href="/" class="back-link">⬅ Back to Home</a>

</body>
</html>

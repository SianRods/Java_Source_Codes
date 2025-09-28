<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Internship Portal</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            background: linear-gradient(to right, #1e3c72, #2a5298);
            color: white;
            text-align: center;
        }

        header {
            padding: 2rem;
            background: rgba(0, 0, 0, 0.3);
        }

        h1 {
            font-size: 2.8rem;
            margin-bottom: 0.5rem;
        }

        p {
            font-size: 1.2rem;
        }

        .options {
            margin-top: 4rem;
            display: flex;
            justify-content: center;
            gap: 2rem;
        }

        .card {
            background: white;
            color: #333;
            padding: 2rem;
            border-radius: 15px;
            width: 250px;
            box-shadow: 0px 8px 15px rgba(0, 0, 0, 0.2);
            transition: transform 0.2s ease-in-out;
            text-decoration: none;
        }

        .card:hover {
            transform: translateY(-10px);
            box-shadow: 0px 12px 20px rgba(0, 0, 0, 0.3);
        }

        .card h2 {
            font-size: 1.5rem;
            margin-bottom: 1rem;
        }
    </style>
</head>
<body>
<header>
    <h1>Welcome to Internship Portal</h1>
    <p>Your one-stop place to explore and post internships</p>
</header>

<div class="options">
    <a href="view-internships" class="card">
        <h2>View All Internships</h2>
        <p>Browse available internships easily.</p>
    </a>
    <a href="add-internship" class="card">
        <h2>Add Internship</h2>
        <p>Post a new internship opportunity.</p>
    </a>
</div>
</body>
</html>

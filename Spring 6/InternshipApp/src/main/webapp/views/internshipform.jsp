<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Internship</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            background: linear-gradient(to right, #8360c3, #2ebf91);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .form-container {
            background: #fff;
            padding: 2.5rem;
            border-radius: 15px;
            width: 450px;
            box-shadow: 0px 10px 25px rgba(0, 0, 0, 0.2);
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 1.5rem;
        }

        label {
            font-weight: bold;
            margin-bottom: 0.5rem;
            display: block;
            color: #444;
        }

        input, textarea {
            width: 100%;
            padding: 0.75rem;
            margin-bottom: 1.2rem;
            border: 1px solid #ccc;
            border-radius: 8px;
            font-size: 1rem;
            transition: 0.3s;
        }

        input:focus, textarea:focus {
            border-color: #2ebf91;
            outline: none;
            box-shadow: 0px 0px 6px rgba(46, 191, 145, 0.5);
        }

        textarea {
            resize: none;
            height: 120px;
        }

        button {
            width: 100%;
            padding: 0.9rem;
            background: linear-gradient(to right, #2ebf91, #8360c3);
            color: white;
            border: none;
            border-radius: 8px;
            font-size: 1.1rem;
            font-weight: bold;
            cursor: pointer;
            transition: transform 0.2s;
        }

        button:hover {
            transform: translateY(-3px);
            box-shadow: 0px 6px 15px rgba(0, 0, 0, 0.2);
        }

        .back-link {
            display: block;
            margin-top: 1rem;
            text-align: center;
            color: #2ebf91;
            font-weight: bold;
            text-decoration: none;
        }

        .back-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<div class="form-container">
    <h2>Add Internship</h2>

    <!-- Plain HTML form -->
    <form action="/save-internship" method="post">
        <label for="id">Internship ID</label>
        <input type="number" id="id" name="id" required/>

        <label for="position">Position</label>
        <input type="text" id="position" name="position" required/>

        <label for="company">Company</label>
        <input type="text" id="company" name="company" required/>

        <label for="stipend">Stipend</label>
        <input type="number" id="stipend" name="stipend" step="0.01" required/>

        <label for="desc">Description</label>
        <textarea id="desc" name="desc" required></textarea>

        <button type="submit">Submit Internship</button>
    </form>

    <a href="/" class="back-link">⬅ Back to Home</a>
</div>
</body>
</html>

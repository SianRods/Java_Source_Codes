<!DOCTYPE html>
<html>
<head>
    <title>Number Input Form</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #89f7fe, #66a6ff);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            color: #333;
        }

        .container {
            background: rgba(255, 255, 255, 0.9);
            padding: 20px 40px;
            border-radius: 10px;
            box-shadow: 0 8px 15px rgba(0, 0, 0, 0.1);
            text-align: center;
        }

        h1 {
            margin-bottom: 20px;
            color: #444;
        }

        form {
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        input[type="number"] {
            width: 80%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }

        input[type="submit"] {
            background-color: #66a6ff;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #5595e9;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Enter Two Numbers</h1>
        <form action="add">
            <input type="text" name="number1" placeholder="Enter first number" required>
            <input type="text" name="number2" placeholder="Enter second number" required>
            <input type="submit">
        </form>
    </div>
</body>
</html>

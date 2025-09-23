<%@ page language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Response Received</title>
    <link rel="stylesheet" href="../response-style.css">
</head>
<body>
<div class="response-container">
    <div class="response-icon">✔️</div>
    <h2>Thank You!</h2>
        <p> <%=session.getAttribute("fullname")%> has been successfully received.</p>
    <a href="index.jsp" class="btn">Submit Another Response</a>
</div>
</body>
</html>

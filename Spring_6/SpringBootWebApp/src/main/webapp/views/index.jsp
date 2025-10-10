<%@ page language = "java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Beautiful Form</title>
    <link rel="stylesheet" href="../style.css">
</head>
<body>
<div class="form-container">
    <h2>Register</h2>
    <form action="acknowledge">
        <div class="form-group" >
            <label for="name">Full Name</label>
            <input type="text" name="name" placeholder="Enter your full name" required>
        </div>

        <div class="form-group">
            <label for="email">Email Address</label>
            <input type="email" id="email" placeholder="Enter your email" required>
        </div>

        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" id="password" placeholder="Create a password" required>
        </div>

        <div class="form-group">
            <label for="gender">Gender</label>
            <select id="gender" required>
                <option value="" disabled selected>Select your gender</option>
                <option value="male">Male</option>
                <option value="female">Female</option>
                <option value="other">Other</option>
            </select>
        </div>

        <div class="form-group">
            <label>
                <input type="checkbox" required> I agree to the terms & conditions
            </label>
        </div>

        <button type="submit" class="btn">Submit</button>
    </form>
</div>
</body>
</html>

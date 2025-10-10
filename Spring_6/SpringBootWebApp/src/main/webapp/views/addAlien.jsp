<%@ page language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Alien Object Form</title>
</head>
<body style="font-family: Arial, sans-serif; background-color: #111; color: #eee; text-align: center; padding: 50px;">

<h1 style="color: #7fffd4; margin-bottom: 30px;">Alien Registration</h1>

<form action="acknowledgeAlien" style="background-color: #222; padding: 20px; border-radius: 10px; display: inline-block; box-shadow: 0 0 10px #7fffd4;">

    <label for="alienId" style="display: block; margin: 10px 0; font-size: 18px;">
        Alien ID:
    </label>
    <input type="text" id="alienId" name="alienId" placeholder="Enter Alien ID"
           style="padding: 8px; width: 250px; border-radius: 5px; border: none; margin-bottom: 15px; text-align: center;">

    <br>

    <label for="alienName" style="display: block; margin: 10px 0; font-size: 18px;">
        Alien Name:
    </label>
    <input type="text" id="alienName" name="alienName" placeholder="Enter Alien Name"
           style="padding: 8px; width: 250px; border-radius: 5px; border: none; margin-bottom: 20px; text-align: center;">

    <br>

    <button type="submit"
            style="background-color: #7fffd4; color: #111; padding: 10px 20px; border: none; border-radius: 5px; font-weight: bold; cursor: pointer;">
        Submit
    </button>
</form>

</body>
</html>

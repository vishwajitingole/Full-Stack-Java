<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Dynamic</title>
    <style>
        body {
            background-color: cyan;
            font-family: Arial, sans-serif;
        }
        h1 {
            text-align: center;
            margin-top: 50px;
        }
        form {
            margin-top: 50px;
            border: 10px solid black;
            padding: 50px;
            max-width: 400px;
            margin-left: auto;
            margin-right: auto;
            background-color: white;
        }
        table {
            width: 100%;
        }
        td {
            padding: 10px;
        }
        input[type="text"] {
            width: 100%;
            padding: 5px;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: black;
            color: white;
            border: none;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #333;
        }
    </style>
</head>
<body>
    <h1>Welcome to our Dynamic Web Page</h1>
    <form method="post" action="./Register">
        <h2>Your Response has been recorded</h2>
        <a href="/"><button>Go Back</button></a>
    </form>
</body>
</html>

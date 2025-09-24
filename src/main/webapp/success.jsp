<html>
<%@ page isELIgnored="false" %>
<head>
    <title>Success</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 40px;
        }

        .success {
            color: green;
            font-size: 18px;
        }
    </style>
</head>
<body>
<h1 class="success">Success</h1>
<p><strong>Email:</strong> ${email}</p>
<p><strong>Password:</strong> ${password}</p>
<a href="save-request">Back to form</a>
</body>
</html>

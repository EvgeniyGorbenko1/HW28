<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.springcrud.model.User" %>
<!DOCTYPE html>
<html>
<head>
    <title>Редактирование пользователя</title>
    <style>
        .container {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
        }
        .form-group {
            margin-bottom: 15px;
        }
        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 8px;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }
        .btn {
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            text-decoration: none;
            display: inline-block;
        }
        .btn-primary {
            background-color: #007bff;
            color: white;
        }
        .btn-secondary {
            background-color: #6c757d;
            color: white;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Редактирование пользователя</h1>

    <%
        User user = (User) request.getAttribute("user");
    %>

    <form method="post" action="${pageContext.request.contextPath}/users/update/<%= user.getId() %>">
        <div class="form-group">
            <label for="userName">Имя пользователя:</label>
            <input type="text" id="userName" name="userName"
                   value="<%= user.getUserName() != null ? user.getUserName() : "" %>" required>
        </div>

        <div class="form-group">
            <label for="password">Пароль:</label>
            <input type="password" id="password" name="password"
                   placeholder="Введите новый пароль">
        </div>

        <div class="form-group">
            <label for="firstName">Имя:</label>
            <input type="text" id="firstName" name="firstName"
                   value="<%= user.getFirstName() != null ? user.getFirstName() : "" %>">
        </div>

        <div class="form-group">
            <label for="lastName">Фамилия:</label>
            <input type="text" id="lastName" name="lastName"
                   value="<%= user.getLastName() != null ? user.getLastName() : "" %>">
        </div>

        <div class="form-group">
            <button type="submit" class="btn btn-primary">Сохранить изменения</button>
            <a href="${pageContext.request.contextPath}/users" class="btn btn-secondary">Отмена</a>
        </div>
    </form>
</div>
</body>
</html>
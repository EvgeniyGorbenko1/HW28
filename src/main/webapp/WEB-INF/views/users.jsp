<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.springcrud.model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<!DOCTYPE html>
<html>
<head>
    <title>Список пользователей</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
            margin: 20px 0;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
            font-weight: bold;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        .no-users {
            text-align: center;
            color: #666;
            font-style: italic;
            margin: 20px 0;
        }
        .container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 20px;
        }
        .btn-delete {
            background-color: #ff4444;
            color: white;
            border: none;
            padding: 5px 10px;
            cursor: pointer;
            border-radius: 3px;
        }
        .btn-delete:hover {
            background-color: #cc0000;
        }
        .actions-cell {
            text-align: center;
            width: 100px;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Список пользователей</h1>

    <%
        List<User> users = (List<User>) request.getAttribute("usersKey");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    %>

    <% if (users == null || users.isEmpty()) { %>
    <div class="no-users">Пользователи не найдены</div>
    <% } else { %>
    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>Имя пользователя</th>
            <th>Имя</th>
            <th>Фамилия</th>
            <th>Дата создания</th>
            <th>Дата изменения</th>
            <th>Действия</th> <!-- Новая колонка для кнопок -->
        </tr>
        </thead>
        <tbody>
        <% for (User user : users) { %>
        <tr>
            <td><%= user.getId() %></td>
            <td><%= user.getUserName() != null ? user.getUserName() : "" %></td>
            <td><%= user.getFirstName() != null ? user.getFirstName() : "" %></td>
            <td><%= user.getLastName() != null ? user.getLastName() : "" %></td>
            <td>
                <% if (user.getCreatedAt() != null) { %>
                <%= user.getCreatedAt().format(formatter) %>
                <% } %>
            </td>
            <td>
                <% if (user.getUpdatedAt() != null) { %>
                <%= user.getUpdatedAt().format(formatter) %>
                <% } %>
            </td>
        <td class="actions-cell">
            <!-- Кнопка редактирования -->
            <a href="${pageContext.request.contextPath}/users/edit/<%= user.getId() %>"
               class="btn-edit" style="margin-right: 10px;">
                Редактировать
            </a>

            <!-- Кнопка удаления -->
            <form method="post"
                  action="${pageContext.request.contextPath}/users/delete/<%= user.getId() %>"
                  style="display: inline;">
                <button type="submit"
                        class="btn-delete"
                        onclick="return confirm('Удалить пользователя <%= user.getUserName() %>?')">
                    Удалить
                </button>
            </form>
        </td>
        <% } %>
        </tbody>
    </table>

    <div><strong>Всего пользователей: <%= users.size() %></strong></div>
    <% } %>
</div>
</body>
</html>
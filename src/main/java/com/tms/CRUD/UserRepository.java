package com.tms.CRUD;

import com.tms.pattern.decorator.model.Circle;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class UserRepository {
    private static final String INSERT_USER = "INSERT INTO users(id, username, password, first_name, last_name, created_at, updated_at) VALUES (DEFAULT,?,?,?,?,?,?)";
    private static final String UPDATE_USER = "UPDATE users SET username = ?, password = ?, first_name = ?, last_name = ?, updated_at = CURRENT_TIMESTAMP WHERE id = ? ";

    public void addUser(User user) {
        try (Connection connection = DataBaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER)) {
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassWord());
            preparedStatement.setString(3, user.getFirstName());
            preparedStatement.setString(4, user.getLastName());
            preparedStatement.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
            preparedStatement.setTimestamp(6, new Timestamp(System.currentTimeMillis()));

            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList();
        try (Connection connection = DataBaseConnection.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id, username, password, first_name, last_name, created_at, updated_at FROM users")) {
            while (rs.next()) {
                int id = rs.getInt(1);
                String userName = rs.getString(2);
                String passWord = rs.getString(3);
                String firstName = rs.getString(4);
                String lastName = rs.getString(5);
                LocalDate createdAt = LocalDate.from(rs.getTimestamp(6).toLocalDateTime());
                LocalDate updatedAt = LocalDate.from(rs.getTimestamp(7).toLocalDateTime());
                users.add(new User(id, userName, passWord, firstName,lastName,createdAt,updatedAt));
            }
        } catch (SQLException | ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    public void updateUser(String newUserName, String newPassWord, String newFirstName, String newLastName, int id) {
        try (Connection connection = DataBaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER)) {
            preparedStatement.setString(1, newUserName);
            preparedStatement.setString(2, newPassWord);
            preparedStatement.setString(3, newFirstName);
            preparedStatement.setString(4, newLastName);
            preparedStatement.setInt(5, id);
            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteUser(int id) {
        try (Connection connection = DataBaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM users WHERE id = ?")) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}

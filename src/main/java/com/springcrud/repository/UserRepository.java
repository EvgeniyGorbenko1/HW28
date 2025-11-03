package com.springcrud.repository;


import org.springframework.stereotype.Repository;
import com.springcrud.model.User;

import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private static final String INSERT_USER = "INSERT INTO users(id, username, password, first_name, last_name, created_at, updated_at) VALUES (DEFAULT,?,?,?,?,?,?)";
    private static final String UPDATE_USER = "UPDATE users SET username = ?, password = ?, first_name = ?, last_name = ?, updated_at = CURRENT_TIMESTAMP WHERE id = ? ";
    private static final String ALL_USERS = "SELECT id, username, password, first_name, last_name, created_at, updated_at FROM users";
    private static final String DELETE_USERS = "DELETE FROM users WHERE id = ?";
    private static final String GET_USER = "SELECT * FROM users WHERE id = ?";

    public User findById(int id) {
        User user = new User();
        try (Connection connection = com.springcrud.repository.DataBaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_USER)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String userName = rs.getString(2);
                String passWord = rs.getString(3);
                String firstName = rs.getString(4);
                String lastName = rs.getString(5);
                LocalDate createdAt = LocalDate.from(rs.getTimestamp(6).toLocalDateTime());
                LocalDate updatedAt = LocalDate.from(rs.getTimestamp(7).toLocalDateTime());
                users.add(new User(id, userName, passWord, firstName, lastName, createdAt, updatedAt));
            }
        } catch (SQLException | ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }


    public int addUser(User user, String password) {
        try (Connection connection = com.springcrud.repository.DataBaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER)) {
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassWord());
            preparedStatement.setString(3, user.getFirstName());
            preparedStatement.setString(4, user.getLastName());
            preparedStatement.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
            preparedStatement.setTimestamp(6, new Timestamp(System.currentTimeMillis()));

            return preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList();
        try (Connection connection = com.springcrud.repository.DataBaseConnection.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(ALL_USERS)) {
            while (rs.next()) {
                int id = rs.getInt(1);
                String userName = rs.getString(2);
                String passWord = rs.getString(3);
                String firstName = rs.getString(4);
                String lastName = rs.getString(5);
                LocalDate createdAt = LocalDate.from(rs.getTimestamp(6).toLocalDateTime());
                LocalDate updatedAt = LocalDate.from(rs.getTimestamp(7).toLocalDateTime());
                users.add(new User(id, userName, passWord, firstName, lastName, createdAt, updatedAt));
            }
        } catch (SQLException | ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    public void updateUser(String newUserName, String newPassWord, String newFirstName, String newLastName, int id) {
        try (Connection connection = com.springcrud.repository.DataBaseConnection.getConnection();
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
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USERS)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package com.tms.CRUD;

import com.tms.pattern.decorator.model.Circle;

import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class UserRepository {
    private static final String INSERT_USER = "INSERT INTO users(id, username, password, first_name, last_name, created_at, updated_at) VALUES (DEFAULT,?,?,?,?,?,?)";

    public void addUser(User user) {
        try(Connection connection = DataBaseConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER)) {
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getFirst_name());
            preparedStatement.setString(4, user.getLast_name());
            preparedStatement.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
            preparedStatement.setTimestamp(6, new Timestamp(System.currentTimeMillis()));

            preparedStatement.executeUpdate();
        }catch (SQLException | ClassNotFoundException | IOException exception){
            throw new RuntimeException(exception);
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        try (Connection connection = DataBaseConnection.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("select * from users")) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                String created_at = String.valueOf(rs.getTimestamp("created_at"));
                String updated_at = String.valueOf(rs.getTimestamp("updated_at"));
                users.add(new User(id, username, password, first_name, last_name, created_at, updated_at));
            }
        } catch (SQLException | ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    public void deleteUser(int id) {
        try (Connection connection = DataBaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM users WHERE id = ?")){
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}

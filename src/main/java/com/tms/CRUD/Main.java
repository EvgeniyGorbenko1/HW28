package com.tms.CRUD;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

public class Main {
     public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException, SQLException, IOException {
        DataBaseConnection db = new DataBaseConnection();
      db.getConnection();
      UserRepository ur = new UserRepository();

    User user = new User(0, "Alex3", "Qwerty123", "Max", "Efremov", (LocalDate) null, null );
    User user1 = new User(0, "Alex4", "Qwerty123", "Max", "Efremov", (LocalDate) null, null );
   // ur.addUser(user);
    //ur.addUser(user1);
    System.out.println(ur.getAllUsers());
    System.out.println();
    ur.deleteUser(4);



}}

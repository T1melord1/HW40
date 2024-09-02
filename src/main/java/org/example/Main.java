package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/test";
        String dbName = "root";
        String password = "9939039vladqwer";

        Connection connection = DriverManager.getConnection(url,dbName,password);
        connection.setAutoCommit(false);
        Statement statement = connection.createStatement();

        List<Instructors> instructors = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery("SELECT * from instructors");

        while (resultSet.next()) {
            String name = resultSet.getString("name");
            int id = resultSet.getInt("id");
            int salary = resultSet.getInt("salary");
            int age = resultSet.getInt("age");
            instructors.add(new Instructors(name,id,salary,age));

        }
        instructors.forEach(System.out::println);
    }
    }

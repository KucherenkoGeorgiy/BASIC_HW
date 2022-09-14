package com.hillel.kucherenko.epx1;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DataBaseProcessor {

    public static void main(String[] args) throws SQLException, IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("db.properties"));


//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "Kucherenko2022!");
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", properties);
//
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery("select * from user");
//
//        while (resultSet.next()) {
//            String lastname = resultSet.getString("lastname");
//            int phone = resultSet.getInt("phone");
//            System.out.println("Name " + lastname + " phone " + phone);
//        }
//
//        System.out.println(resultSet);
//        statement.close();
//        connection.close();


        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", properties);
             Statement statement = connection.createStatement()) {

            PreparedStatement preparedStatement = connection.prepareStatement("insert into user(lastname, phone) values (?, ?)");

            preparedStatement.setString(1, "adsd");
            preparedStatement.setInt(2, 12354);

            PreparedStatement preparedStatement1 = connection.prepareStatement("UPDATE `user`.`user` SET `phone` = '99999' WHERE (`id` = '2')");
            int updated = preparedStatement.executeUpdate();
            System.out.println(updated);

            int updated2 = preparedStatement1.executeUpdate();
            System.out.println(updated2);

            ResultSet resultSet = statement.executeQuery("select * from user");

            while (resultSet.next()) {
                String lastname = resultSet.getString("lastname");
                int phone = resultSet.getInt("phone");
                System.out.println("Name " + lastname + " phone " + phone);
            }


            System.out.println(resultSet);


        } catch (SQLException e){
            e.printStackTrace();
            System.err.println("Error reading DB");
        }

    }

}

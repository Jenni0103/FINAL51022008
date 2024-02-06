/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinemafinalproject;

import java.security.Timestamp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;

public class Database implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public Database(String query) throws SQLException {
        connection = connect();
        preparedStatement = connection.prepareStatement(query);
    }

    public static Connection connect() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cinema?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String username = "root";
        String password = ""; 
        return DriverManager.getConnection(url, username, password);
    }
    
    public void setString(int parameterIndex, String value) throws SQLException {
        preparedStatement.setString(parameterIndex, value);
    }
    
    public void setBytes(int parameterIndex, byte[] value) throws SQLException {
        preparedStatement.setBytes(parameterIndex, value);
    }
    
    public int executeUpdate() throws SQLException {
        return preparedStatement.executeUpdate();
    }
    
    public ResultSet executeQuery() throws SQLException {
        return preparedStatement.executeQuery();
    }
    
    public ResultSet getResultSet() throws SQLException {
        return preparedStatement.executeQuery();
    }
    
    public boolean autentikasiPengguna(String username, String password) {
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next(); 
        } catch (SQLException e) {
            e.printStackTrace();
            return false; 
        }
    }
    @Override
    public void close() throws SQLException {
        if (preparedStatement != null) {
            preparedStatement.close();
        }
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
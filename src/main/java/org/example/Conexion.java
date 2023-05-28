package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static String link = "jdbc:mariadb://localhost/mensajes_app";
    private static String username = "blackshark";
    private static String password = "1234";

    public Connection get_connection() {
        Connection connection = null;

        try {

            connection = DriverManager.getConnection(link, username, password);
            if(connection != null) {
                System.out.println("Conexion Realizada!");
            }
        }catch (SQLException e) {
            System.out.println("Error de tipo:\n" + e.getMessage());

        }
        return  connection;
    }


}

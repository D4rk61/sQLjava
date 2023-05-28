package org.example;
import java.sql.*;

public class DBDemo {
    public static void main(String[] args) throws ClassNotFoundException {

        // cargando el driver

        Class.forName("org.mariadb.jdbc.Driver");
        System.out.println("Cargando driver");


        // Intentando conectarse

        try {

            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost/mensajes_app", "blackshark", "1234");

            System.out.println("conectado!");

            connection.close();

        } catch (Exception e) {
            System.out.println("Error de conexion:\n" + e.getMessage());

        }

    }
}

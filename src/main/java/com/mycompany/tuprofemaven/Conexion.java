/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuprofemaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Juan carlos
 */
public class Conexion {
    public static Connection getConexion() throws SQLException {
        Connection connect = DriverManager.getConnection(
                "jdbc:mysql://bzus6ux2vtvyb2bbkr7u-mysql.services.clever-cloud.com/bzus6ux2vtvyb2bbkr7u",
                "uzjrhp1lxp7jqbht",
                "htoBj1zlLN6R1psNMyCp"
        );
        System.out.println("Base de datos conectada");
        return connect;
    }
}

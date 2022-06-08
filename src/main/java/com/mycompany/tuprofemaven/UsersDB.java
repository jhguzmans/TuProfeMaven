/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuprofemaven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan carlos
 */
public class UsersDB {
    public static ResultSet inventarioUsuarios(String tipo) {
        ResultSet rs = null;
        try {
            Connection connect = Conexion.getConexion();
            PreparedStatement ps = connect.prepareStatement("SELECT * FROM users WHERE tipo=?");
            ps.setString(1, tipo);
            rs = ps.executeQuery();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocurrió un error al conectar con la base de datos",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
            System.exit(0);
        }
        return rs;
    }
    
    public static boolean validUser(UsuarioClass usuario, String tipo) {
        ResultSet rs = inventarioUsuarios(tipo);
        try {
            while (rs.next()) {
                UsuarioClass usuario2 = new UsuarioClass(rs.getString("usuario"), rs.getString("password"));
                if (usuario2.equals(usuario)) {
                    return true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocurrió un error al conectar con la base de datos",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
            System.exit(0);
        }
        return false;
    }
    
    public static void ingresarUsuario(UsuarioClass usuario, String tipo) {
        try {
            Connection connect = Conexion.getConexion();
            PreparedStatement ps = connect.prepareStatement(
                    "INSERT INTO users(usuario,password,tipo) VALUES(?,?,?)"
            );
            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getPassword());
            ps.setString(3, tipo);
            ps.executeUpdate();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocurrió un error al conectar con la base de datos",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
            System.exit(0);
        }
    }
}

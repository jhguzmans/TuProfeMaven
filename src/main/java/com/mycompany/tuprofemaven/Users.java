package com.mycompany.tuprofemaven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Users {
    public static ResultSet inventarioUsuarios(String tipo) {
        ResultSet rs = null;
        try {
            Connection connect = Conexion.getConexion();
            PreparedStatement ps = connect.prepareStatement("SELECT * FROM users WHERE tipo=?");
            ps.setString(1, tipo);
            rs = ps.executeQuery();
        } catch (SQLException e) {
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
        try{
        while (rs.next()) {
            UsuarioClass usuario2 = new UsuarioClass(rs.getString("usuario"),rs.getString("password"));
            if (usuario2.equals(usuario))
                return true;
        }
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
        return false;
    }
}

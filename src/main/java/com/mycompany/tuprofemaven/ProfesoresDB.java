/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuprofemaven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan carlos
 */
public class ProfesoresDB {
    public static void ingresarProfesor(ProfesorClass profesor) {
        try {
            Connection connect = Conexion.getConexion();
            PreparedStatement ps = connect.prepareStatement(
                    "INSERT INTO profesores (usuario,password,nombre,apellido,numIdent,materias,telefono,tipoIdent) VALUES (?,?,?,?,?,?,?,?)"
            );
            if (profesor.getMaterias() == null) {
                ps.setString(1, profesor.getUsername());
                ps.setString(2, profesor.getPassword());
                ps.setString(3, profesor.getNombre());
                ps.setString(4, profesor.getApellido());
                ps.setString(5, profesor.getNumero_Identificacion());
                ps.setString(6, "null");
                ps.setString(7, profesor.getTelefono());
                ps.setString(8, profesor.getTipo_Identificacion());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(
                    null,
                    "Profesor registrado con éxito",
                    "CONFIRMACIÓN",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
            else {
                for (String x:profesor.getMaterias()) {
                    ingresarProfesor(
                            profesor.getUsername(),
                            profesor.getPassword(),
                            profesor.getNombre(),
                            profesor.getApellido(),
                            profesor.getNumero_Identificacion(),
                            x,
                            profesor.getTelefono(),
                            profesor.getTipo_Identificacion()
                    );
                }
                JOptionPane.showMessageDialog(
                    null,
                    "Materias actualizadas con éxito",
                    "CONFIRMACIÓN",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
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
    }
    
    private static void ingresarProfesor(
            String usuario,
            String password,
            String nombre,
            String apellido,
            String numIdent,
            String materia,
            String telefono,
            String tipoIdent
    ) {
        try {
            Connection connect = Conexion.getConexion();
            PreparedStatement ps = connect.prepareStatement(
                    "INSERT INTO profesores (usuario,password,nombre,apellido,numIdent,materias,telefono,tipoIdent) VALUES (?,?,?,?,?,?,?,?)"
            );
            ps.setString(1, usuario);
            ps.setString(2, password);
            ps.setString(3, nombre);
            ps.setString(4, apellido);
            ps.setString(5, numIdent);
            ps.setString(6, materia);
            ps.setString(7, telefono);
            ps.setString(8, tipoIdent);
            ps.executeQuery();
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
    }
}

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
public class CursosDB {
    private static Connection connect = Conexion.getConexion();
    
    public static void ingresarCurso(CursoClass curso) {
        try {
            PreparedStatement ps = connect.prepareStatement(
                    "INSERT INTO cursos (id_profesor,id_estudiante,dia,horario,nombre) VALUES (?,?,?,?,?)"
            );
            ps.setInt(1, curso.getId_profesor());
            ps.setInt(2, curso.getId_estudiante());
            ps.setInt(3, curso.getDia());
            ps.setInt(4, curso.getHorario());
            ps.setString(5, curso.getNombre());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(
                    null,
                    "Curso inscrito con éxito",
                    "CONFIRMACIÓN",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
        catch (SQLException e) {
            System.out.println("I am here");
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

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
public class EstudiantesDB {
    public static void ingresarEstudiante(EstudianteClass estudiante) {
        try{
            Connection connect = Conexion.getConexion();
            PreparedStatement ps = connect.prepareStatement(
                    "INSERT INTO estudiantes (usuario,password,nombre,apellido,tipo_identificacion,numero_identificacion,telefono) VALUES (?,?,?,?,?,?,?)"
            );
            ps.setString(1, estudiante.getUsername());
            ps.setString(2, estudiante.getPassword());
            ps.setString(3, estudiante.getNombre());
            ps.setString(4, estudiante.getApellido());
            ps.setString(5, estudiante.getTipo_Identificacion());
            ps.setString(6, estudiante.getNumero_Identificacion());
            ps.setString(7, estudiante.getTelefono());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(
                    null,
                    "Estudiante registrado con éxito",
                    "CONFIRMACIÓN",
                    JOptionPane.INFORMATION_MESSAGE
            );
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

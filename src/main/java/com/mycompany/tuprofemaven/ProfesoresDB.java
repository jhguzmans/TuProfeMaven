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
public class ProfesoresDB {
    private static final Connection connect = Conexion.getConexion();
    
    public static void ingresarProfesor(ProfesorClass profesor) {
        try {
            PreparedStatement ps = connect.prepareStatement(
                    "INSERT INTO profesores (usuario,password,nombre,apellido,numIdent,telefono,tipoIdent,lunes,martes,miercoles,jueves,viernes,sabado,materias) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)"
            );
            ps.setString(1, profesor.getUsername());
            ps.setString(2, profesor.getPassword());
            ps.setString(3, profesor.getNombre());
            ps.setString(4, profesor.getApellido());
            ps.setString(5, profesor.getNumero_Identificacion());
            ps.setString(6, profesor.getTelefono());
            ps.setString(7, profesor.getTipo_Identificacion());
            ps.setInt(8, profesor.getHorarioLunes());
            ps.setInt(9, profesor.getHorarioMartes());
            ps.setInt(10, profesor.getHorarioMiercoles());
            ps.setInt(11, profesor.getHorarioJueves());
            ps.setInt(12, profesor.getHorarioViernes());
            ps.setInt(13, profesor.getHorarioSabado());
            ps.setInt(14, profesor.getMaterias());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(
                    null,
                    "Profesor registrado con éxito",
                    "CONFIRMACIÓN",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocurrió un error al conectar con la base de datos",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
            System.exit(0);
        }
    }
    
    public static int idProfesor(UsuarioClass usuario) {
        int id = 0;
        try {
            PreparedStatement ps = connect.prepareStatement(
                    "SELECT * FROM profesores WHERE usuario=?"
            );
           ps.setString(1, usuario.getUsername());
           ResultSet rs = ps.executeQuery();
           while (rs.next()) {
               id = rs.getInt("ID");
               break;
           }
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
        return id;
    }
    
    public static ResultSet getProfesor(int id_profesor) {
        ResultSet rs = null;
        try {
            PreparedStatement ps = connect.prepareStatement(
                    "SELECT * FROM profesores WHERE id=?"
            );
            ps.setInt(1, id_profesor);
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
    
    public static void modificarProfesor(int id_profesor, ProfesorClass profesor) {
        try {
            PreparedStatement ps = connect.prepareStatement(
                    "UPDATE profesores SET usuario=? , password=? , nombre=? , apellido=? , numIdent=? , telefono=? , tipoIdent=? , lunes=? , martes=? , miercoles=? , jueves=? , viernes=? , sabado=?, materias=? WHERE ID=?"
            );
            ps.setString(1, profesor.getUsername());
            ps.setString(2, profesor.getPassword());
            ps.setString(3, profesor.getNombre());
            ps.setString(4, profesor.getApellido());
            ps.setString(5, profesor.getNumero_Identificacion());
            ps.setString(6, profesor.getTelefono());
            ps.setString(7, profesor.getTipo_Identificacion());
            ps.setInt(8, profesor.getHorarioLunes());
            ps.setInt(9, profesor.getHorarioMartes());
            ps.setInt(10, profesor.getHorarioMiercoles());
            ps.setInt(11, profesor.getHorarioJueves());
            ps.setInt(12, profesor.getHorarioViernes());
            ps.setInt(13, profesor.getHorarioSabado());
            ps.setInt(14, profesor.getMaterias());
            ps.setInt(15, id_profesor);
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
    
    public static ResultSet inventarioProfesores() {
        ResultSet rs = null;
        try {
            PreparedStatement ps = connect.prepareStatement("SELECT * FROM profesores");
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
}

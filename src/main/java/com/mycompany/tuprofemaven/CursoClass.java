/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuprofemaven;

/**
 *
 * @author Juan carlos
 */
public class CursoClass {
    private String nombre;
    private int id_profesor;
    private int id_estudiante;
    private int dia;
    private int horario;
    
    public CursoClass() {
        nombre = "";
        id_profesor = 0;
        id_estudiante = 0;
        dia = 0;
        horario = 0;
    }
    
    public CursoClass(
            String nombre,
            int id_profesor,
            int id_estudiante,
            int dia,
            int horario
    ) {
        this.nombre = nombre;
        this.id_profesor = id_profesor;
        this.id_estudiante = id_estudiante;
        this.dia = dia;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    @Override
    public boolean equals (Object o) {
        if (this == o)
            return true;
        if (!(o instanceof CursoClass))
            return false;
        CursoClass that = (CursoClass) o;
        if (this.dia != that.getDia())
            return false;
        if (this.id_estudiante != that.getId_estudiante())
            return false;
        if (this.id_profesor != that.getId_profesor())
            return false;
        if (this.horario != that.getHorario())
            return false;
        if (!this.nombre.equals(that.getNombre()))
            return false;
        return true;
    }
}

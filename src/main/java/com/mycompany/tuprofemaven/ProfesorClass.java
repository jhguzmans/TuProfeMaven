/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuprofemaven;

import java.util.ArrayList;

/**
 *
 * @author Juan carlos
 */
public class ProfesorClass extends UsuarioClass {
    private String nombre;
    private String apellido;
    private String tipo_identificacion;
    private String numero_identificacion;
    private String telefono;
    private int horario_lunes = 0;
    private int horario_martes = 0;
    private int horario_miercoles = 0;
    private int horario_jueves = 0;
    private int horario_viernes = 0;
    private int horario_sabado = 0;
    private int materias = 0;
    
    public ProfesorClass() {
        super();
    }
    
    public ProfesorClass(
            String username,
            String password,
            String nombre,
            String apellido,
            String tipo_identificacion,
            String numero_identificacion,
            String telefono
    ) {
        super(username, password);
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo_identificacion = tipo_identificacion;
        this.numero_identificacion = numero_identificacion;
        this.telefono = telefono;
    }
    
    public ProfesorClass(
            String username,
            String password,
            String nombre,
            String apellido,
            String tipo_identificacion,
            String numero_identificacion,
            String telefono,
            int horario_lunes,
            int horario_martes,
            int horario_miercoles,
            int horario_jueves,
            int horario_viernes,
            int horario_sabado,
            int  materias
    ) {
        super(username, password);
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo_identificacion = tipo_identificacion;
        this.numero_identificacion = numero_identificacion;
        this.telefono = telefono;
        this.horario_lunes = horario_lunes;
        this.horario_martes = horario_martes;
        this.horario_miercoles = horario_miercoles;
        this.horario_jueves = horario_jueves;
        this.horario_viernes = horario_viernes;
        this.horario_sabado = horario_sabado;
        this.materias = materias;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getTipo_Identificacion() {
        return tipo_identificacion;
    }
    
    public void setTipo_Identificacion(String tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }
    
    public String getNumero_Identificacion() {
        return numero_identificacion;
    }
    
    public void setNumero_Identificacion(String numero_identificacion) {
        this.numero_identificacion = numero_identificacion;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public int getHorarioLunes() {
        return horario_lunes;
    }
    
    public void setHorarioLunes(int horario_lunes) {
        this.horario_lunes = horario_lunes;
    } 
    
    public int getHorarioMartes() {
        return horario_martes;
    }
    
    public void setHorarioMartes(int horario_martes) {
        this.horario_martes = horario_martes;
    }
    
    public int getHorarioMiercoles() {
        return horario_miercoles;
    }
    
    public void setHorarioMiercoles(int horario_miercoles) {
        this.horario_miercoles = horario_miercoles;
    }
    
    public int getHorarioJueves() {
        return horario_jueves;
    }
    
    public void setHorarioJueves(int horario_jueves) {
        this.horario_jueves = horario_jueves;
    }
    
    public int getHorarioViernes() {
        return horario_viernes;
    } 
    
    public void setHorarioViernes(int horario_viernes) {
        this.horario_viernes = horario_viernes;
    } 
    
    public int getHorarioSabado() {
        return horario_sabado;
    }
    
    public void setHorarioSabado(int horario_sabado) {
        this.horario_sabado = horario_sabado;
    }
    
    public int getMaterias() {
        return materias;
    }
    
    public void setMaterias(int materias) {
        this.materias = materias;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) 
            return true;
        if (!(o instanceof ProfesorClass))
            return false;
        ProfesorClass that = (ProfesorClass) o;
        if (this.username.compareTo(that.getUsername()) != 0)
            return false;
        if (this.password.compareTo(that.getPassword()) != 0)
            return false;
        if (this.nombre.compareTo(that.getNombre()) != 0)
            return false;
        if (this.apellido.compareTo(that.getApellido()) != 0)
            return false;
        if (this.tipo_identificacion.compareTo(that.getTipo_Identificacion()) != 0)
            return false;
        if (this.numero_identificacion.compareTo(that.getNumero_Identificacion()) != 0)
            return false;
        if (this.telefono.compareTo(that.getTelefono()) != 0)
            return false;
        return true;
    }
}

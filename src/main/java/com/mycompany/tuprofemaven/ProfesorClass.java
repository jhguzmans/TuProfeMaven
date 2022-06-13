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
    private ArrayList<String> materias;
    
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
            ArrayList<String> materias
    ) {
        super(username, password);
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo_identificacion = tipo_identificacion;
        this.numero_identificacion = numero_identificacion;
        this.telefono = telefono;
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
    
    public ArrayList<String> getMaterias() {
        return materias;
    }
    
    public void setMaterias(ArrayList<String> materias) {
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
        if (!this.materias.equals(that.getMaterias()))
            return false;
        return true;
    }
}

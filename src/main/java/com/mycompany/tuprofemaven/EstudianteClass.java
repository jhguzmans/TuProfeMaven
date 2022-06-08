/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuprofemaven;

/**
 *
 * @author Juan carlos
 */
public class EstudianteClass extends UsuarioClass{
    private String nombre;
    private String apellido;
    private String tipo_identificacion;
    private String numero_identificacion;
    private String telefono;
    
    public EstudianteClass() {
        super();
    }
    
    public EstudianteClass(
            String usuario,
            String password,
            String nombre,
            String apellido,
            String tipo_identificacion,
            String numero_identificacion,
            String telefono
    ) {
        super(usuario, password);
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo_identificacion = tipo_identificacion;
        this.numero_identificacion = numero_identificacion;
        this.telefono = telefono;
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
    
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EstudianteClass))
            return false;
        EstudianteClass that = (EstudianteClass) o;
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

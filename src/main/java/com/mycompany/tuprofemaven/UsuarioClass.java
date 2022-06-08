/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuprofemaven;

/**
 *
 * @author Juan carlos
 */
public class UsuarioClass {
    protected String username;
    protected String password;
    
    public UsuarioClass() {
        
    }
    
    public UsuarioClass(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UsuarioClass))
            return false;
        UsuarioClass that = (UsuarioClass) o;
        if (this.username.compareTo(that.getUsername()) != 0)
            return false;
        if (this.password.compareTo(that.getPassword()) != 0)
            return false;
        return true;
    }
}

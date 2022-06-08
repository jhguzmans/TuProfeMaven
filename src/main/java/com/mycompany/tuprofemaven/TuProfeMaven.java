package com.mycompany.tuprofemaven;

public class TuProfeMaven {

    public static void main(String[] args) {
        System.out.print("Lo estamos haciendo perro");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
            
        });
        
    }
}

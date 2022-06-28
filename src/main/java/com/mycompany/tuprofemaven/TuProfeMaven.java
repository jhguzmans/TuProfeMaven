package com.mycompany.tuprofemaven;

public class TuProfeMaven {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
            
        });
        
    }
}

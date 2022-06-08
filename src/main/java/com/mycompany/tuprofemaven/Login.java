package com.mycompany.tuprofemaven;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    public Login()  {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        Usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Ingresar = new javax.swing.JButton();
        TipoUsuario = new javax.swing.JComboBox<>();
        Registrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });

        jLabel3.setText("¿No tienes una cuenta?");

        Ingresar.setText("Ingresar");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });

        TipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Estudiante", "Profesor" }));
        TipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoUsuarioActionPerformed(evt);
            }
        });

        Registrarse.setText("Registrarse");
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Registrarse)
                    .addComponent(TipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ingresar)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(TipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ingresar)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Registrarse)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        String TipoDeUsuario=TipoUsuario.getSelectedItem().toString();
        System.out.println(TipoDeUsuario);
        UsuarioClass usuario = new UsuarioClass(
                Usuario.getText(), 
                String.valueOf(jPasswordField1.getPassword())
        );
        if ("Estudiante".equals(TipoDeUsuario) && !Users.validUser(usuario, TipoDeUsuario)){
            JOptionPane.showMessageDialog(
                    null,
                    "El usuario o la contraseña que digitó no es correcta",
                    "ERROR",
                    JOptionPane.WARNING_MESSAGE
            );
            this.dispose();
            new Login().setVisible(true);
        }
        else if("Estudiante".equals(TipoDeUsuario)){              
            new Estudiante().setVisible(true);
            this.dispose();
        }
        else if ("Profesor".equals(TipoDeUsuario) && !Users.validUser(usuario, TipoDeUsuario)){
            JOptionPane.showMessageDialog(
                    null,
                    "El usuario o la contraseña que digitó no es correcta",
                    "ERROR",
                    JOptionPane.WARNING_MESSAGE
            );
            this.dispose();
            new Login().setVisible(true);
        }
        else if("Profesor".equals(TipoDeUsuario)){
            new Profesor().setVisible(true);
            this.dispose();
        }
        else if ("Administrador".equals(TipoDeUsuario) && !Users.validUser(usuario, TipoDeUsuario)){
            JOptionPane.showMessageDialog(
                    null,
                    "El usuario o la contraseña que digitó no es correcta",
                    "ERROR",
                    JOptionPane.WARNING_MESSAGE
            );
            this.dispose();
            new Login().setVisible(true);
        }
        else{
            new Administrador().setVisible(true);
            this.dispose();                    
        }
    }//GEN-LAST:event_IngresarActionPerformed

    private void TipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoUsuarioActionPerformed

    
    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    private void RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseActionPerformed
        new Registro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegistrarseActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar;
    private javax.swing.JButton Registrarse;
    private javax.swing.JComboBox<String> TipoUsuario;
    private javax.swing.JTextField Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}

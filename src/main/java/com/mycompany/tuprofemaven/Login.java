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
        Rol = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Rol de usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 168, -1, -1));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 190, 136, -1));

        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 134, 182, -1));

        jLabel3.setText("¿No tienes una cuenta?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 267, -1, -1));

        Ingresar.setText("Ingresar");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        jPanel1.add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 218, -1, -1));

        TipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Estudiante", "Profesor" }));
        TipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(TipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 67, -1, -1));

        Registrarse.setText("Registrarse");
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 289, -1, -1));

        Rol.setText("Usuario");
        jPanel1.add(Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 115, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
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
        if ("Estudiante".equals(TipoDeUsuario) && !UsersDB.validUser(usuario, TipoDeUsuario)){
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
        else if ("Profesor".equals(TipoDeUsuario) && !UsersDB.validUser(usuario, TipoDeUsuario)){
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
            int id = ProfesoresDB.idProfesor(usuario);
            new Profesor(id).setVisible(true);
            this.dispose();
        }
        else if ("Administrador".equals(TipoDeUsuario) && !UsersDB.validUser(usuario, TipoDeUsuario)){
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
    private javax.swing.JLabel Rol;
    private javax.swing.JComboBox<String> TipoUsuario;
    private javax.swing.JTextField Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
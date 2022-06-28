package com.mycompany.tuprofemaven;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    public Login()  {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel4.setIcon(new ImageIcon("C:\\Users\\Juan carlos\\Documents\\NetBeansProjects\\TuProfeMaven-master\\src\\main\\java\\imagenes\\Fondo1.jpeg"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Rol = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        Usuario = new javax.swing.JTextField();
        Ingresar = new javax.swing.JButton();
        TipoUsuario = new javax.swing.JComboBox<>();
        Registrarse = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(70, 107, 63));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel1.setText("Rol de usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 65, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("¿No tienes una cuenta?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        Rol.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        Rol.setText("Usuario");
        jPanel1.add(Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 160, -1));

        Usuario.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 160, -1));

        Ingresar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Ingresar.setText("Ingresar");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        jPanel1.add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        TipoUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        TipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Profesor" }));
        TipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(TipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        Registrarse.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Registrarse.setText("Registrarse");
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
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
            int id = EstudiantesDB.idEstudiante(usuario);
            new Estudiante(id).setVisible(true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
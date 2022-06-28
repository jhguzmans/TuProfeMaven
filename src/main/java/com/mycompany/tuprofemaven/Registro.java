package com.mycompany.tuprofemaven;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel10.setIcon(new ImageIcon("C:\\Users\\Juan carlos\\Documents\\NetBeansProjects\\TuProfeMaven-master\\src\\main\\java\\imagenes\\Fondo4.jpeg"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TipoUsuario = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NombreText = new javax.swing.JTextField();
        ApellidoText = new javax.swing.JTextField();
        TipoDeIdentificacion = new javax.swing.JComboBox<>();
        NumeroText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CorreoText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TelefonoText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Terminar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PasswordText = new javax.swing.JPasswordField();
        ConPasswordText = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Tipo de usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        TipoUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        TipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Profesor" }));
        TipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(TipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Nombres");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Tipo de identificación");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Apellidos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        NombreText.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel1.add(NombreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 148, -1));

        ApellidoText.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel1.add(ApellidoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 148, -1));

        TipoDeIdentificacion.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        TipoDeIdentificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T.I.", "CC", "Pasaporte", "CE" }));
        jPanel1.add(TipoDeIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        NumeroText.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel1.add(NumeroText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 148, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Número");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        CorreoText.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        CorreoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoTextActionPerformed(evt);
            }
        });
        jPanel1.add(CorreoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 148, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("Correo electrónico");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        TelefonoText.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel1.add(TelefonoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 148, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("Teléfono");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        Terminar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Terminar.setText("Terminar");
        Terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerminarActionPerformed(evt);
            }
        });
        jPanel1.add(Terminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        Regresar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        jPanel1.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("Contraseña");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("Confirme su contraseña");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        PasswordText.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel1.add(PasswordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 148, -1));

        ConPasswordText.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        ConPasswordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConPasswordTextActionPerformed(evt);
            }
        });
        jPanel1.add(ConPasswordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 148, -1));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        new Login().setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_RegresarActionPerformed

    private void TerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerminarActionPerformed
        String TipoDeUsuario = TipoUsuario.getSelectedItem().toString();
        if (
                NombreText.getText().equals("") ||
                ApellidoText.getText().equals("") ||
                NumeroText.getText().equals("") ||
                CorreoText.getText().equals("") ||
                TelefonoText.getText().equals("") ||
                String.valueOf(PasswordText.getPassword()).equals("") ||
                String.valueOf(ConPasswordText.getPassword()).equals("")
                ) {
            JOptionPane.showMessageDialog(
                    null,
                    "Todos los campos son obligatorios",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
            this.dispose();
            new Registro().setVisible(true);
        }
        if (!String.valueOf(PasswordText.getPassword()).
                equals(String.valueOf(ConPasswordText.getPassword()))
                ) {
            JOptionPane.showMessageDialog(
                    null,
                    "La confirmación de la contraseña es incorrecta",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
            this.dispose();
            new Registro().setVisible(true);
        } 
        String nombre = NombreText.getText();
        String apellido = ApellidoText.getText();
        String numero_identificacion = NumeroText.getText();
        String usuario = CorreoText.getText();
        String telefono = TelefonoText.getText();
        String password = String.valueOf(PasswordText.getPassword());
        String tipo_identificacion = TipoDeIdentificacion.getSelectedItem().toString();
        if ("Estudiante".equals(TipoDeUsuario)) {
            EstudianteClass estudiante = new EstudianteClass(
                    usuario,
                    password,
                    nombre,
                    apellido,
                    tipo_identificacion,
                    numero_identificacion,
                    telefono
            );
            UsuarioClass nuevo_usuario = new UsuarioClass(usuario, password);
            UsersDB.ingresarUsuario(nuevo_usuario, "Estudiante");
            EstudiantesDB.ingresarEstudiante(estudiante);
        }
        else if ("Profesor".equals(TipoDeUsuario)) {
            ProfesorClass profesor = new ProfesorClass(
                    usuario,
                    password,
                    nombre,
                    apellido,
                    tipo_identificacion,
                    numero_identificacion,
                    telefono,
                    0,
                    0,
                    0,
                    0,
                    0,
                    0,
                    0
            );
            UsuarioClass nuevo_usuario = new UsuarioClass(usuario, password);
            UsersDB.ingresarUsuario(nuevo_usuario, "Profesor");
            ProfesoresDB.ingresarProfesor(profesor);
        }
    }//GEN-LAST:event_TerminarActionPerformed

    private void ConPasswordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConPasswordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConPasswordTextActionPerformed

    private void TipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoUsuarioActionPerformed

    private void CorreoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoText;
    private javax.swing.JPasswordField ConPasswordText;
    private javax.swing.JTextField CorreoText;
    private javax.swing.JTextField NombreText;
    private javax.swing.JTextField NumeroText;
    private javax.swing.JPasswordField PasswordText;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField TelefonoText;
    private javax.swing.JButton Terminar;
    private javax.swing.JComboBox<String> TipoDeIdentificacion;
    private javax.swing.JComboBox<String> TipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tuprofemaven;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan carlos
 */
public class AgregarMaterias extends javax.swing.JFrame {

    /**
     * Creates new form AgregarMaterias
     */
    private int id_profesor;
    
    private int materiasSeleccionadas() {
        int x = 0;
        if (diferencial.isSelected())
            x |= 1;
        if (integral.isSelected())
            x |= (1<<1);
        if (algebra.isSelected())
            x |= (1<<2);
        if (multivariado.isSelected())
            x |= (1<<3);
        if (ecuaciones.isSelected())
            x |= (1<<4);
        if (probabilidad.isSelected())
            x |= (1<<5);
        if (programacion.isSelected())
            x |= (1<<6);
        if (poo.isSelected())
            x |= (1<<7);
        if (estructuras.isSelected())
            x |= (1<<8);
        if (bases.isSelected())
            x |= (1<<9);
        if (algoritmos.isSelected())
            x |= (1<<10);
        if (analisis.isSelected())
            x |= (1<<11);
        if (inorganica.isSelected())
            x |= (1<<12);
        if (organica.isSelected())
            x |= (1<<13);
        if (calor.isSelected())
            x |= (1<<14);
        if (masa.isSelected())
            x |= (1<<15);
        if (mecanica.isSelected())
            x |= (1<<16);
        if (electromagnetismo.isSelected())
            x |= (1<<17);
        if (ondas.isSelected())
            x |= (1<<18);
        if (termodinamica.isSelected())
            x |= (1<<19);
        if (electrodinamica.isSelected())
            x |= (1<<20);
        if (ingles.isSelected())
            x |= (1<<21);
        if (frances.isSelected())
            x |= (1<<22);
        if (portugues.isSelected())
            x |= (1<<23);
        if (aleman.isSelected())
            x |= (1<<24);
        return x;
    }
    
    public AgregarMaterias(int id_profesor) {
        initComponents();
        jLabel1.setIcon(new ImageIcon("C:\\Users\\Juan carlos\\Documents\\NetBeansProjects\\TuProfeMaven-master\\src\\main\\java\\imagenes\\Fondo2.jpeg"));
        this.setLocationRelativeTo(null);
        diferencial.setOpaque(false);
        integral.setOpaque(false);
        algebra.setOpaque(false);
        ecuaciones.setOpaque(false);
        multivariado.setOpaque(false);
        probabilidad.setOpaque(false);
        programacion.setOpaque(false);
        poo.setOpaque(false);
        estructuras.setOpaque(false);
        bases.setOpaque(false);
        algoritmos.setOpaque(false);
        ingles.setOpaque(false);
        frances.setOpaque(false);
        portugues.setOpaque(false);
        aleman.setOpaque(false);
        mecanica.setOpaque(false);
        electromagnetismo.setOpaque(false);
        ondas.setOpaque(false);
        termodinamica.setOpaque(false);
        electrodinamica.setOpaque(false);
        analisis.setOpaque(false);
        inorganica.setOpaque(false);
        organica.setOpaque(false);
        calor.setOpaque(false);
        masa.setOpaque(false);
        this.id_profesor = id_profesor;
        ResultSet rs = ProfesoresDB.getProfesor(id_profesor);
        int materias = 0;
        try {
            while (rs.next()) {
                materias = rs.getInt("materias");
            }
            rs.close();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocurrió un error al conectar con la base de datos",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
            System.exit(0);
        }
        if ((materias&1) != 0)
            diferencial.setSelected(true);
        if ((materias&(1<<1)) != 0)
            integral.setSelected(true);
        if ((materias&(1<<2)) != 0)
            algebra.setSelected(true);
        if ((materias&(1<<3)) != 0) 
            multivariado.setSelected(true);
        if ((materias&(1<<4)) != 0)
            ecuaciones.setSelected(true);
        if ((materias&(1<<5)) != 0)
            probabilidad.setSelected(true);
        if ((materias&(1<<6)) != 0)
            programacion.setSelected(true);
        if ((materias&(1<<7)) != 0)
            poo.setSelected(true);
        if ((materias&(1<<8)) != 0)
            estructuras.setSelected(true);
        if ((materias&(1<<9)) != 0)
            bases.setSelected(true);
        if ((materias&(1<<10)) != 0)
            algoritmos.setSelected(true);
        if ((materias&(1<<11)) != 0)
            analisis.setSelected(true);
        if ((materias&(1<<12)) != 0)
            inorganica.setSelected(true);
        if ((materias&(1<<13)) != 0)
            organica.setSelected(true);
        if ((materias&(1<<14)) != 0)
            calor.setSelected(true);
        if ((materias&(1<<15)) != 0)
            masa.setSelected(true);
        if ((materias&(1<<16)) != 0)
            mecanica.setSelected(true);
        if ((materias&(1<<17)) != 0)
            electromagnetismo.setSelected(true);
        if ((materias&(1<<18)) != 0)
            ondas.setSelected(true);
        if ((materias&(1<<19)) != 0)
            termodinamica.setSelected(true);
        if ((materias&(1<<20)) != 0)
            electrodinamica.setSelected(true);
        if ((materias&(1<<21)) != 0)
            ingles.setSelected(true);
        if ((materias&(1<<22)) != 0)
            frances.setSelected(true);
        if ((materias&(1<<23)) != 0)
            portugues.setSelected(true);
        if ((materias&(1<<24)) != 0)
            aleman.setSelected(true);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        diferencial = new javax.swing.JRadioButton();
        integral = new javax.swing.JRadioButton();
        algebra = new javax.swing.JRadioButton();
        multivariado = new javax.swing.JRadioButton();
        ecuaciones = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        programacion = new javax.swing.JRadioButton();
        poo = new javax.swing.JRadioButton();
        estructuras = new javax.swing.JRadioButton();
        bases = new javax.swing.JRadioButton();
        probabilidad = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        analisis = new javax.swing.JRadioButton();
        inorganica = new javax.swing.JRadioButton();
        organica = new javax.swing.JRadioButton();
        calor = new javax.swing.JRadioButton();
        masa = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        mecanica = new javax.swing.JRadioButton();
        electromagnetismo = new javax.swing.JRadioButton();
        ondas = new javax.swing.JRadioButton();
        termodinamica = new javax.swing.JRadioButton();
        electrodinamica = new javax.swing.JRadioButton();
        algoritmos = new javax.swing.JRadioButton();
        confirmar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ingles = new javax.swing.JRadioButton();
        frances = new javax.swing.JRadioButton();
        portugues = new javax.swing.JRadioButton();
        aleman = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText("Matemáticas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, 20));

        diferencial.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        diferencial.setText("Calculo Diferecial");
        diferencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diferencialActionPerformed(evt);
            }
        });
        jPanel1.add(diferencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, 20));

        integral.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        integral.setText("Calculo Integral");
        jPanel1.add(integral, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, 20));

        algebra.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        algebra.setText("Algebra Lineal");
        jPanel1.add(algebra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, 20));

        multivariado.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        multivariado.setText("Calculo Multivariado");
        jPanel1.add(multivariado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, 20));

        ecuaciones.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ecuaciones.setText("Ecuaciones Diferenciales");
        jPanel1.add(ecuaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, 20));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("Programación");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        programacion.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        programacion.setText("Programacion");
        programacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programacionActionPerformed(evt);
            }
        });
        jPanel1.add(programacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        poo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        poo.setText("Programacion Orientada a Objetos");
        jPanel1.add(poo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        estructuras.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        estructuras.setText("Estructuras de Datos");
        jPanel1.add(estructuras, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        bases.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        bases.setText("Bases de Datos");
        jPanel1.add(bases, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        probabilidad.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        probabilidad.setText("Probabilidad y Estadisitca");
        jPanel1.add(probabilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, 20));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("Química");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        analisis.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        analisis.setText("Principios de Analisis Quimico");
        jPanel1.add(analisis, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        inorganica.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        inorganica.setText("Quimica Inorganica");
        jPanel1.add(inorganica, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, -1));

        organica.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        organica.setText("Quimica Organica");
        jPanel1.add(organica, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, -1));

        calor.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        calor.setText("Transferencia de Calor");
        jPanel1.add(calor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, -1, -1));

        masa.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        masa.setText("Transferencia de Masa");
        jPanel1.add(masa, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("Física");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        mecanica.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        mecanica.setText("Mecanica Newtoniana");
        jPanel1.add(mecanica, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        electromagnetismo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        electromagnetismo.setText("Electricidad y Magnetismo");
        jPanel1.add(electromagnetismo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        ondas.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ondas.setText("Oscilaciones y Ondas");
        jPanel1.add(ondas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, -1));

        termodinamica.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        termodinamica.setText("Termodinamica");
        jPanel1.add(termodinamica, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));

        electrodinamica.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        electrodinamica.setText("Electrodinamica");
        jPanel1.add(electrodinamica, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        algoritmos.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        algoritmos.setText("Algoritmos");
        jPanel1.add(algoritmos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        confirmar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });
        jPanel1.add(confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, -1, -1));

        regresar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 120, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("Idiomas");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, -1, -1));

        ingles.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ingles.setText("Ingles");
        jPanel1.add(ingles, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, -1, -1));

        frances.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        frances.setText("Frances");
        jPanel1.add(frances, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, -1, -1));

        portugues.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        portugues.setText("Portugues");
        portugues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portuguesActionPerformed(evt);
            }
        });
        jPanel1.add(portugues, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, -1, -1));

        aleman.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        aleman.setText("Aleman");
        jPanel1.add(aleman, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, -1, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Profesor(id_profesor).setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        // TODO add your handling code here:
        
        try {
            ResultSet rs = ProfesoresDB.getProfesor(id_profesor);
            ProfesorClass profesor = null;
            while (rs.next()) {                
                profesor = new ProfesorClass(
                        rs.getString("usuario"),
                        rs.getString("password"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("tipoIdent"),
                        rs.getString("numIdent"),
                        rs.getString("telefono"),
                        rs.getInt("lunes"),
                        rs.getInt("martes"),
                        rs.getInt("miercoles"),
                        rs.getInt("jueves"),
                        rs.getInt("viernes"),
                        rs.getInt("sabado"),
                        materiasSeleccionadas()
                );
                ProfesoresDB.modificarProfesor(id_profesor, profesor);
                JOptionPane.showMessageDialog(
                    null,
                    "Materias modificadas con éxito",
                    "CONFIRMACIÓN",
                    JOptionPane.INFORMATION_MESSAGE
            );                
            }   
            rs.close();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocurrió un error al conectar con la base de datos",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
            System.exit(0);
        }
    }//GEN-LAST:event_confirmarActionPerformed

    private void portuguesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portuguesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portuguesActionPerformed

    private void diferencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diferencialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diferencialActionPerformed

    private void programacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_programacionActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton aleman;
    private javax.swing.JRadioButton algebra;
    private javax.swing.JRadioButton algoritmos;
    private javax.swing.JRadioButton analisis;
    private javax.swing.JRadioButton bases;
    private javax.swing.JRadioButton calor;
    private javax.swing.JButton confirmar;
    private javax.swing.JRadioButton diferencial;
    private javax.swing.JRadioButton ecuaciones;
    private javax.swing.JRadioButton electrodinamica;
    private javax.swing.JRadioButton electromagnetismo;
    private javax.swing.JRadioButton estructuras;
    private javax.swing.JRadioButton frances;
    private javax.swing.JRadioButton ingles;
    private javax.swing.JRadioButton inorganica;
    private javax.swing.JRadioButton integral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton masa;
    private javax.swing.JRadioButton mecanica;
    private javax.swing.JRadioButton multivariado;
    private javax.swing.JRadioButton ondas;
    private javax.swing.JRadioButton organica;
    private javax.swing.JRadioButton poo;
    private javax.swing.JRadioButton portugues;
    private javax.swing.JRadioButton probabilidad;
    private javax.swing.JRadioButton programacion;
    private javax.swing.JButton regresar;
    private javax.swing.JRadioButton termodinamica;
    // End of variables declaration//GEN-END:variables
}

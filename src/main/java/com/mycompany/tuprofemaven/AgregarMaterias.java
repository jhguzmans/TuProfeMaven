/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tuprofemaven;

import java.sql.ResultSet;
import java.sql.SQLException;
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
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccione las materias que desea agregar");

        jLabel2.setText("Matemáticas");

        diferencial.setText("Calculo Diferecial");

        integral.setText("Calculo Integral");

        algebra.setText("Algebra Lineal");

        multivariado.setText("Calculo Multivariado");

        ecuaciones.setText("Ecuaciones Diferenciales");

        jLabel3.setText("Programación");

        programacion.setText("Programacion");

        poo.setText("Programacion Orientada a Objetos");

        estructuras.setText("Estructuras de Datos");

        bases.setText("Bases de Datos");

        probabilidad.setText("Probabilidad y Estadisitca");

        jLabel4.setText("Química");

        analisis.setText("Principios de Analisis Quimico");

        inorganica.setText("Quimica Inorganica");

        organica.setText("Quimica Organica");

        calor.setText("Transferencia de Calor");

        masa.setText("Transferencia de Masa");

        jLabel5.setText("Física");

        mecanica.setText("Mecanica Newtoniana");

        electromagnetismo.setText("Electricidad y Magnetismo");

        ondas.setText("Oscilaciones y Ondas");

        termodinamica.setText("Termodinamica");

        electrodinamica.setText("Electrodinamica");

        algoritmos.setText("Algoritmos");

        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        jLabel6.setText("Idiomas");

        ingles.setText("Ingles");

        frances.setText("Frances");

        portugues.setText("Portugues");

        aleman.setText("Aleman");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(integral)
                                    .addComponent(diferencial)
                                    .addComponent(algebra)
                                    .addComponent(multivariado)
                                    .addComponent(ecuaciones)
                                    .addComponent(probabilidad))))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(poo)
                                    .addComponent(programacion)
                                    .addComponent(estructuras)
                                    .addComponent(bases)
                                    .addComponent(algoritmos))))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inorganica)
                                    .addComponent(analisis)
                                    .addComponent(organica)
                                    .addComponent(calor)
                                    .addComponent(masa)))))
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(termodinamica)
                            .addComponent(electrodinamica)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(electromagnetismo)
                                    .addComponent(ondas)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(mecanica)
                                        .addGap(71, 71, 71)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(frances)
                                                    .addComponent(ingles)
                                                    .addComponent(portugues)
                                                    .addComponent(aleman))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(regresar)
                                    .addComponent(confirmar))
                                .addGap(107, 107, 107)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diferencial)
                    .addComponent(programacion)
                    .addComponent(analisis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(integral)
                    .addComponent(poo)
                    .addComponent(inorganica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(algebra)
                    .addComponent(estructuras)
                    .addComponent(organica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multivariado)
                    .addComponent(bases)
                    .addComponent(calor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ecuaciones)
                    .addComponent(masa)
                    .addComponent(algoritmos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(probabilidad)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mecanica)
                                    .addComponent(ingles)))
                            .addComponent(confirmar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(electromagnetismo)
                            .addComponent(frances))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ondas)
                            .addComponent(portugues)))
                    .addComponent(regresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(termodinamica)
                    .addComponent(aleman))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(electrodinamica)
                .addContainerGap(29, Short.MAX_VALUE))
        );

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

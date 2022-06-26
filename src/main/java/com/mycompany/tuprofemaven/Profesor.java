package com.mycompany.tuprofemaven;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Profesor extends javax.swing.JFrame {
    private int id_profesor;
    private static final String[] subjects = {
        "","Calculo Diferencial","Calculo Integral",
        "Algebra Lineal","Calculo Multivariado","Ecuaciones Diferenciales",
        "Probabilidad y Estadistica","Programacion",
        "Programacion Orientada a Objetos","Estructuras de Datos",
        "Bases de Datos","Algoritmos","Principios de Analisis Quimico",
        "Quimica Inorganica","Quimica Organica","Transferencia de Calor",
        "Transferencia de Masa","Mecanica Newtoniana","Electricidad y Magnetismo",
        "Oscilaciones y Ondas","Termodinamica","Electrodinamica","Ingles",
        "Frances","Portugues","Aleman"
    };
    
    public Profesor(int id_profesor) {
        initComponents();
        this.id_profesor = id_profesor;
        int materias = 0;
        ResultSet rs = ProfesoresDB.getProfesor(id_profesor);
        try {
            while (rs.next()) {
                MiNombre.setText(rs.getString("nombre"));
                MiUsuario.setText(rs.getString("usuario"));
                materias = rs.getInt("materias");
            }
            rs.close();    
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocurrió un error al conectar con la base de datos",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
            System.exit(0);
        }
        String aux = "";
        if (materias == 0)
            aux = "Aún no configuras las materias que puedes dictar";
        else
            for (int i=0;i<25;i++) {
                if ((materias&(1<<i)) != 0)
                    aux += subjects[i]+"\n";
            }
        materias_actuales.setText(aux);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MiNombre = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        configurar_horario = new javax.swing.JButton();
        MiUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        materias_actuales = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MiNombre.setText("MiNombre");

        agregar.setText("Agregar Materias");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        configurar_horario.setText("Configurar Horario");
        configurar_horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configurar_horarioActionPerformed(evt);
            }
        });

        MiUsuario.setText("MiUsuario");

        jLabel1.setText("Mi Perfil");

        materias_actuales.setEditable(false);
        materias_actuales.setColumns(20);
        materias_actuales.setRows(5);
        jScrollPane2.setViewportView(materias_actuales);

        jLabel2.setText("Mis Materias");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(configurar_horario)
                    .addComponent(agregar))
                .addGap(140, 140, 140))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MiNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MiUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(agregar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MiNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(MiUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(configurar_horario))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configurar_horarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configurar_horarioActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ConfigurarHorario(id_profesor).setVisible(true);
    }//GEN-LAST:event_configurar_horarioActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AgregarMaterias(id_profesor).setVisible(true);
    }//GEN-LAST:event_agregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MiNombre;
    private javax.swing.JLabel MiUsuario;
    private javax.swing.JButton agregar;
    private javax.swing.JButton configurar_horario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea materias_actuales;
    // End of variables declaration//GEN-END:variables
}

package com.mycompany.tuprofemaven;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Profesor extends javax.swing.JFrame {
    private int id_profesor;
    private static final String[] subjects = {
        "Calculo Diferencial","Calculo Integral",
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
        this.setLocationRelativeTo(null);
        jLabel3.setIcon(new ImageIcon("C:\\Users\\Juan carlos\\Documents\\NetBeansProjects\\TuProfeMaven-master\\src\\main\\java\\imagenes\\Fondo3.jpeg"));
        materias_actuales.setBorder(BorderFactory.createLineBorder(new  Color(16753828)));
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
            aux = "Aún no configuras\n las materias que\n puedes dictar";
        else
            for (int i=0;i<25;i++) {
                if ((materias&(1<<i)) != 0)
                    aux += subjects[i]+"\n";
            }
        materias_actuales.setText(aux);
        materias_actuales.setBackground(new Color(16753828));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        materias_actuales = new javax.swing.JTextArea();
        MiNombre = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        configurar_horario = new javax.swing.JButton();
        MiUsuario = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setPreferredSize(new java.awt.Dimension(313, 155));

        materias_actuales.setColumns(20);
        materias_actuales.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        materias_actuales.setRows(5);
        materias_actuales.setPreferredSize(new java.awt.Dimension(292, 155));
        materias_actuales.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(materias_actuales);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 220, 290));

        MiNombre.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        MiNombre.setText("MiNombre");
        jPanel1.add(MiNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 200, 19));

        agregar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        agregar.setText("Agregar Materias");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        configurar_horario.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        configurar_horario.setText("Configurar Horario");
        configurar_horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configurar_horarioActionPerformed(evt);
            }
        });
        jPanel1.add(configurar_horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

        MiUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        MiUsuario.setText("MiUsuario");
        jPanel1.add(MiUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 200, 22));

        regresar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MiNombre;
    private javax.swing.JLabel MiUsuario;
    private javax.swing.JButton agregar;
    private javax.swing.JButton configurar_horario;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea materias_actuales;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}

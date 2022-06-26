package com.mycompany.tuprofemaven;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Estudiante extends javax.swing.JFrame {
    
    private ArrayList<ProfesorClass> profesores;
    private ArrayList<String> materia_profesor;
    private int idx;
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
    

    public Estudiante() {
        initComponents();
        this.setLocationRelativeTo(null);
        siguiente.setVisible(false);
        inscribir.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        nombre_curso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        posibles_profesores = new javax.swing.JTextArea();
        regresar = new javax.swing.JButton();
        inscribir = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        anterior = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Buscador");

        jLabel3.setText("Mis cursos");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        posibles_profesores.setEditable(false);
        posibles_profesores.setColumns(20);
        posibles_profesores.setRows(5);
        jScrollPane2.setViewportView(posibles_profesores);

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        inscribir.setText("Inscribir");

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        anterior.setText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(132, 132, 132))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(122, 122, 122))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(regresar)
                                .addGap(146, 146, 146)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nombre_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(buscar)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(anterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(siguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inscribir)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inscribir)
                    .addComponent(siguiente)
                    .addComponent(anterior))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(regresar)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean profesorValido(ArrayList<Integer> arr, ProfesorClass profesor) {
        for (int i=0;i<arr.size();i++) 
            if ((profesor.getMaterias()&(1<<arr.get(i))) != 0)
                return true;
        return false;
    }
    
    private String posiblesMaterias(ArrayList<Integer> arr, ProfesorClass profesor) {
        String mat = "";
        for (int i=0;i<arr.size();i++) 
            if ((profesor.getMaterias()&(1<<arr.get(i))) != 0)
                mat += subjects[arr.get(i)] + " , ";
        return mat;
    }
    
    private String horarioLunes(ProfesorClass profesor) {
        String horario = "";
        int lunes = profesor.getHorarioLunes();
        boolean ban = true;
        for (int i=0;i<=15;i++) {
            if (ban) {
                if ((lunes&(1<<i)) != 0) {
                    horario += "   "+((i+6)>12?(i-6)+":00 p.m." : (i+6)==12? "12:00 m." : (i+6)+":00 a.m.");
                    ban = !ban;
                }
            }
            else {
                if ((lunes&(1<<i)) == 0) {
                    horario += "-"+((i+6)>12?(i-6)+":00 p.m." : (i+6)==12? "12:00 m." : (i+6)+":00 a.m.");
                    ban = !ban;
                }
            }
        }
        return horario;
    }
    
    private String horarioMartes(ProfesorClass profesor) {
        String horario = "";
        int martes = profesor.getHorarioMartes();
        boolean ban = true;
        for (int i=0;i<=15;i++) {
            if (ban) {
                if ((martes&(1<<i)) != 0) {
                    horario += "   "+((i+6)>12?(i-6)+":00 p.m." : (i+6)==12? "12:00 m." : (i+6)+":00 a.m.");
                    ban = !ban;
                }
            }
            else {
                if ((martes&(1<<i)) == 0) {
                    horario += "-"+((i+6)>12?(i-6)+":00 p.m." : (i+6)==12? "12:00 m." : (i+6)+":00 a.m.");
                    ban = !ban;
                }
            }
        }
        return horario;
    }
    
    private String horarioMiercoles(ProfesorClass profesor) {
        String horario = "";
        int miercoles = profesor.getHorarioMiercoles();
        boolean ban = true;
        for (int i=0;i<=15;i++) {
            if (ban) {
                if ((miercoles&(1<<i)) != 0) {
                    horario += "   "+((i+6)>12?(i-6)+":00 p.m." : (i+6)==12? "12:00 m." : (i+6)+":00 a.m.");
                    ban = !ban;
                }
            }
            else {
                if ((miercoles&(1<<i)) == 0) {
                    horario += "-"+((i+6)>12?(i-6)+":00 p.m." : (i+6)==12? "12:00 m." : (i+6)+":00 a.m.");
                    ban = !ban;
                }
            }
        }
        return horario;
    }
    
    private String horarioJueves(ProfesorClass profesor) {
        String horario = "";
        int jueves = profesor.getHorarioJueves();
        boolean ban = true;
        for (int i=0;i<=15;i++) {
            if (ban) {
                if ((jueves&(1<<i)) != 0) {
                    horario += "   "+((i+6)>12?(i-6)+":00 p.m." : (i+6)==12? "12:00 m." : (i+6)+":00 a.m.");
                    ban = !ban;
                }
            }
            else {
                if ((jueves&(1<<i)) == 0) {
                    horario += "-"+((i+6)>12?(i-6)+":00 p.m." : (i+6)==12? "12:00 m." : (i+6)+":00 a.m.");
                    ban = !ban;
                }
            }
        }
        return horario;
    }
    
    private String horarioViernes(ProfesorClass profesor) {
        String horario = "";
        int viernes = profesor.getHorarioViernes();
        boolean ban = true;
        for (int i=0;i<=15;i++) {
            if (ban) {
                if ((viernes&(1<<i)) != 0) {
                    horario += "   "+((i+6)>12?(i-6)+":00 p.m." : (i+6)==12? "12:00 m." : (i+6)+":00 a.m.");
                    ban = !ban;
                }
            }
            else {
                if ((viernes&(1<<i)) == 0) {
                    horario += "-"+((i+6)>12?(i-6)+":00 p.m." : (i+6)==12? "12:00 m." : (i+6)+":00 a.m.");
                    ban = !ban;
                }
            }
        }
        return horario;
    }
    
    private String horarioSabado(ProfesorClass profesor) {
        String horario = "";
        int sabado = profesor.getHorarioSabado();
        boolean ban = true;
        for (int i=0;i<=15;i++) {
            if (ban) {
                if ((sabado&(1<<i)) != 0) {
                    horario += "   "+((i+6)>12?(i-6)+":00 p.m." : (i+6)==12? "12:00 m." : (i+6)+":00 a.m.");
                    ban = !ban;
                }
            }
            else {
                if ((sabado&(1<<i)) == 0) {
                    horario += "-"+((i+6)>12?(i-6)+":00 p.m." : (i+6)==12? "12:00 m." : (i+6)+":00 a.m.");
                    ban = !ban;
                }
            }
        }
        return horario;
    }
    
    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        String materia = nombre_curso.getText();
        ArrayList<Integer> nums = new ArrayList<>();
        profesores = new ArrayList<>();
        materia_profesor  = new ArrayList<>();
        for (int i=0;i<25;i++)
            if (subjects[i].strip().toLowerCase().contains(materia.strip().toLowerCase()))
                nums.add(i);
        if (nums.isEmpty())
            posibles_profesores.setText("La materia que buscó no se encuentra disponible!");
        else {
            ResultSet rs = ProfesoresDB.inventarioProfesores();
            try {
                while (rs.next()) {
                    ProfesorClass profesor = new ProfesorClass(
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
                            rs.getInt("materias")
                    );
                    if (profesorValido(nums, profesor)) {
                        profesores.add(profesor);
                        materia_profesor.add(posiblesMaterias(nums, profesor));
                    }
                }
                rs.close();
                if (profesores.isEmpty())
                    posibles_profesores.setText("No hay profesores disponibles para esta materia en el momento");
                else {
                    inscribir.setVisible(true);
                    String aux = "Resultado:\n";
                    aux += "Nombre: "+profesores.get(0).getNombre()+"\n";
                    aux += "Apellido: "+profesores.get(0).getApellido()+"\n";
                    aux += "Correo: "+profesores.get(0).getUsername()+"\n";
                    aux += "Teléfono: "+profesores.get(0).getTelefono()+"\n";
                    aux += "Materias: "+materia_profesor.get(0)+"\n";
                    aux += "Horario:\n";
                    aux += "    Lunes: "+horarioLunes(profesores.get(0))+"\n";
                    aux += "    Martes: "+horarioMartes(profesores.get(0))+"\n";
                    aux += "    Miercoles: "+horarioMiercoles(profesores.get(0))+"\n";
                    aux += "    Jueves: "+horarioJueves(profesores.get(0))+"\n";
                    aux += "    Viernes: "+horarioViernes(profesores.get(0))+"\n";
                    aux += "    Sabado: "+horarioSabado(profesores.get(0))+"\n";
                    posibles_profesores.setText(aux);
                    idx = 0;
                    if (idx+1 == profesores.size()) 
                        siguiente.setVisible(false);
                    else
                        siguiente.setVisible(true);
                    anterior.setVisible(false);
                }
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
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        // TODO add your handling code here:
        idx++;
        String aux = "Resultado:\n";
        aux += "Nombre: " + profesores.get(idx).getNombre() + "\n";
        aux += "Apellido: " + profesores.get(idx).getApellido() + "\n";
        aux += "Correo: " + profesores.get(idx).getUsername() + "\n";
        aux += "Teléfono: " + profesores.get(idx).getTelefono() + "\n";
        aux += "Materias: " + materia_profesor.get(idx) + "\n";
        aux += "Horario:\n";
        aux += "    Lunes: " + horarioLunes(profesores.get(idx)) + "\n";
        aux += "    Martes: " + horarioMartes(profesores.get(idx)) + "\n";
        aux += "    Miercoles: " + horarioMiercoles(profesores.get(idx)) + "\n";
        aux += "    Jueves: " + horarioJueves(profesores.get(idx)) + "\n";
        aux += "    Viernes: " + horarioViernes(profesores.get(idx)) + "\n";
        aux += "    Sabado: " + horarioSabado(profesores.get(idx)) + "\n";
        posibles_profesores.setText(aux);
        if (idx+1 == profesores.size()) 
            siguiente.setVisible(false);
        anterior.setVisible(true);
    }//GEN-LAST:event_siguienteActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        // TODO add your handling code here:
        idx--;
        String aux = "Resultado:\n";
        aux += "Nombre: " + profesores.get(idx).getNombre() + "\n";
        aux += "Apellido: " + profesores.get(idx).getApellido() + "\n";
        aux += "Correo: " + profesores.get(idx).getUsername() + "\n";
        aux += "Teléfono: " + profesores.get(idx).getTelefono() + "\n";
        aux += "Materias: " + materia_profesor.get(idx) + "\n";
        aux += "Horario:\n";
        aux += "    Lunes: " + horarioLunes(profesores.get(idx)) + "\n";
        aux += "    Martes: " + horarioMartes(profesores.get(idx)) + "\n";
        aux += "    Miercoles: " + horarioMiercoles(profesores.get(idx)) + "\n";
        aux += "    Jueves: " + horarioJueves(profesores.get(idx)) + "\n";
        aux += "    Viernes: " + horarioViernes(profesores.get(idx)) + "\n";
        aux += "    Sabado: " + horarioSabado(profesores.get(idx)) + "\n";
        posibles_profesores.setText(aux);
        if (idx == 0)
            anterior.setVisible(false);
        siguiente.setVisible(true);
    }//GEN-LAST:event_anteriorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JButton buscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton inscribir;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombre_curso;
    private javax.swing.JTextArea posibles_profesores;
    private javax.swing.JButton regresar;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}

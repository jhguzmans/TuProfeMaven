package com.mycompany.tuprofemaven;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Estudiante extends javax.swing.JFrame {
    
    private ArrayList<ProfesorClass> profesores;
    private ArrayList<String> materia_profesor;
    private int idx;
    private int id_estudiante;
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
    

    public Estudiante(int id_estudiante) {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel3.setIcon(new ImageIcon("C:\\Users\\Juan carlos\\Documents\\NetBeansProjects\\TuProfeMaven-master\\src\\main\\java\\imagenes\\Fondo6.jpeg"));
        nombre_curso.setOpaque(false);
        siguiente.setVisible(false);
        inscribir.setVisible(false);
        anterior.setVisible(false);
        posibles_profesores.setBackground(new Color(16753828));
        this.id_estudiante = id_estudiante;
        String nombre = "";
        String correo = "";
        ResultSet rs = EstudiantesDB.getEstudiante(id_estudiante);
        try {
            while (rs.next()) {
                nombre = rs.getString("nombre");
                correo = rs.getString("usuario");
            }
            rs.close();
            mi_nombre.setText(nombre);
            mi_correo.setText(correo);
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        nombre_curso = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        posibles_profesores = new javax.swing.JTextArea();
        regresar = new javax.swing.JButton();
        inscribir = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        mi_nombre = new javax.swing.JLabel();
        mi_correo = new javax.swing.JLabel();
        ocultar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre_curso.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        nombre_curso.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(nombre_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 122, -1));

        buscar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        posibles_profesores.setEditable(false);
        posibles_profesores.setColumns(20);
        posibles_profesores.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        posibles_profesores.setRows(5);
        jScrollPane2.setViewportView(posibles_profesores);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 560, 280));

        regresar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        inscribir.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        inscribir.setText("Inscribir");
        inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscribirActionPerformed(evt);
            }
        });
        jPanel1.add(inscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, -1, -1));

        siguiente.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });
        jPanel1.add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, -1, -1));

        anterior.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        anterior.setText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });
        jPanel1.add(anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        mi_nombre.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        mi_nombre.setText("MiNombre");
        jPanel1.add(mi_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        mi_correo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        mi_correo.setText("MiCorreo");
        jPanel1.add(mi_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        ocultar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        ocultar.setText("Ocultar");
        ocultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocultarActionPerformed(evt);
            }
        });
        jPanel1.add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 780, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    String aux = "";aux += "Nombre: "+profesores.get(0).getNombre()+"\n";
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
                    aux += "    Sabado: "+horarioSabado(profesores.get(0));
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

    private void ocultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocultarActionPerformed
        // TODO add your handling code here:
        profesores = null;
        materia_profesor = null;
        siguiente.setVisible(false);
        anterior.setVisible(false);
        inscribir.setVisible(false);
        nombre_curso.setText("");
        posibles_profesores.setText("");
    }//GEN-LAST:event_ocultarActionPerformed

    private void inscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscribirActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(
                    null,
                    "Se envió un correo al profesor para que este se ponga en contacto con usted y agenden la tutoría",
                    "INSCRIPCIÓN DE MATERIA",
                    JOptionPane.INFORMATION_MESSAGE
            );
    }//GEN-LAST:event_inscribirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JButton buscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton inscribir;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mi_correo;
    private javax.swing.JLabel mi_nombre;
    private javax.swing.JTextField nombre_curso;
    private javax.swing.JButton ocultar;
    private javax.swing.JTextArea posibles_profesores;
    private javax.swing.JButton regresar;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}

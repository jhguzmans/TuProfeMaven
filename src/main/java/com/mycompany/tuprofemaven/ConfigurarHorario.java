/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tuprofemaven;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan carlos
 */
public class ConfigurarHorario extends javax.swing.JFrame {

    /**
     * Creates new form ConfigurarHorario
     */
    
    private final Color mycolor = new Color(10886193);
    private int id_profesor;
    private boolean[] lunes_selec = new boolean[15];
    private boolean[] martes_selec = new boolean[15];
    private boolean[] miercoles_selec = new boolean[15];
    private boolean[] jueves_selec = new boolean[15];
    private boolean[] viernes_selec = new boolean[15];
    private boolean[] sabado_selec = new boolean[15];
    
    private int horarioLunes() {
        int x = 0;
        for (int i=0;i<15;i++) 
            if (lunes_selec[i])
                x |= (1<<i);
        return x;
    }
    
    private int horarioMartes() {
        int x = 0;
        for (int i=0;i<15;i++) 
            if (martes_selec[i])
                x |= (1<<i);
        return x;
    }
    
    private int horarioMiercoles() {
        int x = 0;
        for (int i=0;i<15;i++) 
            if (miercoles_selec[i])
                x |= (1<<i);
        return x;
    }
    
    private int horarioJueves() {
        int x = 0;
        for (int i=0;i<15;i++) 
            if (jueves_selec[i])
                x |= (1<<i);
        return x;
    }
    
    private int horarioViernes() {
        int x = 0;
        for (int i=0;i<15;i++) 
            if (viernes_selec[i])
                x |= (1<<i);
        return x;
    }
    
    private int horarioSabado() {
        int x = 0;
        for (int i=0;i<15;i++)
            if (sabado_selec[i])
                x |= (1<<i);
        return x;
    }
    
    private void colorearBotones() {
        if (!lunes_selec[0])
            lunes1.setBackground(Color.WHITE);
        else
            lunes1.setBackground(mycolor);
        if (!lunes_selec[1])
            lunes2.setBackground(Color.WHITE);
        else
            lunes2.setBackground(mycolor);
        if (!lunes_selec[2])
            lunes3.setBackground(Color.WHITE);
        else
            lunes3.setBackground(mycolor);
        if (!lunes_selec[3])
            lunes4.setBackground(Color.WHITE);
        else
            lunes4.setBackground(mycolor);
        if (!lunes_selec[4])
            lunes5.setBackground(Color.WHITE);
        else
            lunes5.setBackground(mycolor);
        if (!lunes_selec[5])
            lunes6.setBackground(Color.WHITE);
        else
            lunes6.setBackground(mycolor);
        if (!lunes_selec[6])
            lunes7.setBackground(Color.WHITE);
        else
            lunes7.setBackground(mycolor);
        if (!lunes_selec[7])
            lunes8.setBackground(Color.WHITE);
        else
            lunes8.setBackground(mycolor);
        if (!lunes_selec[8])
            lunes9.setBackground(Color.WHITE);
        else
            lunes9.setBackground(mycolor);
        if (!lunes_selec[9])
            lunes10.setBackground(Color.WHITE);
        else
            lunes10.setBackground(mycolor);
        if (!lunes_selec[10])
            lunes11.setBackground(Color.WHITE);
        else
            lunes11.setBackground(mycolor);
        if (!lunes_selec[11])
            lunes12.setBackground(Color.WHITE);
        else
            lunes12.setBackground(mycolor);
        if (!lunes_selec[12])
            lunes13.setBackground(Color.WHITE);
        else
            lunes13.setBackground(mycolor);
        if (!lunes_selec[13])
            lunes14.setBackground(Color.WHITE);
        else
            lunes14.setBackground(mycolor);
        if (!lunes_selec[14])
            lunes15.setBackground(Color.WHITE);
        else
            lunes15.setBackground(mycolor);
        if (!martes_selec[0])
            martes1.setBackground(Color.WHITE);
        else
            martes1.setBackground(mycolor);
        if (!martes_selec[1])
            martes2.setBackground(Color.WHITE);
        else
            martes2.setBackground(mycolor);
        if (!martes_selec[2])
            martes3.setBackground(Color.WHITE);
        else
            martes3.setBackground(mycolor);
        if (!martes_selec[3])
            martes4.setBackground(Color.WHITE);
        else
            martes4.setBackground(mycolor);
        if (!martes_selec[4])
            martes5.setBackground(Color.WHITE);
        else
            martes5.setBackground(mycolor);
        if (!martes_selec[5])
            martes6.setBackground(Color.WHITE);
        else
            martes6.setBackground(mycolor);
        if (!martes_selec[6])
            martes7.setBackground(Color.WHITE);
        else
            martes7.setBackground(mycolor);
        if (!martes_selec[7])
            martes8.setBackground(Color.WHITE);
        else
            martes8.setBackground(mycolor);
        if (!martes_selec[8])
            martes9.setBackground(Color.WHITE);
        else
            martes9.setBackground(mycolor);
        if (!martes_selec[9])
            martes10.setBackground(Color.WHITE);
        else
            martes10.setBackground(mycolor);
        if (!martes_selec[10])
            martes11.setBackground(Color.WHITE);
        else
            martes11.setBackground(mycolor);
        if (!martes_selec[11])
            martes12.setBackground(Color.WHITE);
        else
            martes12.setBackground(mycolor);
        if (!martes_selec[12])
            martes13.setBackground(Color.WHITE);
        else
            martes13.setBackground(mycolor);
        if (!martes_selec[13])
            martes14.setBackground(Color.WHITE);
        else
            martes14.setBackground(mycolor);
        if (!martes_selec[14])
            martes15.setBackground(Color.WHITE);
        else
            martes15.setBackground(mycolor);
        if (!miercoles_selec[0])
            miercoles1.setBackground(Color.WHITE);
        else
            miercoles1.setBackground(mycolor);
        if (!miercoles_selec[1])
            miercoles2.setBackground(Color.WHITE);
        else
            miercoles2.setBackground(mycolor);
        if (!miercoles_selec[2])
            miercoles3.setBackground(Color.WHITE);
        else
            miercoles3.setBackground(mycolor);
        if (!miercoles_selec[3])
            miercoles4.setBackground(Color.WHITE);
        else
            miercoles4.setBackground(mycolor);
        if (!miercoles_selec[4])
            miercoles5.setBackground(Color.WHITE);
        else
            miercoles5.setBackground(mycolor);
        if (!miercoles_selec[5])
            miercoles6.setBackground(Color.WHITE);
        else
            miercoles6.setBackground(mycolor);
        if (!miercoles_selec[6])
            miercoles7.setBackground(Color.WHITE);
        else
            miercoles7.setBackground(mycolor);
        if (!miercoles_selec[7])
            miercoles8.setBackground(Color.WHITE);
        else
            miercoles8.setBackground(mycolor);
        if (!miercoles_selec[8])
            miercoles9.setBackground(Color.WHITE);
        else
            miercoles9.setBackground(mycolor);
        if (!miercoles_selec[9])
            miercoles10.setBackground(Color.WHITE);
        else
            miercoles10.setBackground(mycolor);
        if (!miercoles_selec[10])
            miercoles11.setBackground(Color.WHITE);
        else
            miercoles11.setBackground(mycolor);
        if (!miercoles_selec[11])
            miercoles12.setBackground(Color.WHITE);
        else
            miercoles12.setBackground(mycolor);
        if (!miercoles_selec[12])
            miercoles13.setBackground(Color.WHITE);
        else
            miercoles13.setBackground(mycolor);
        if (!miercoles_selec[13])
            miercoles14.setBackground(Color.WHITE);
        else
            miercoles14.setBackground(mycolor);
        if (!miercoles_selec[14])
            miercoles15.setBackground(Color.WHITE);
        else
            miercoles15.setBackground(mycolor);
        if (!jueves_selec[0])
            jueves1.setBackground(Color.WHITE);
        else
            jueves1.setBackground(mycolor);
        if (!jueves_selec[1])
            jueves2.setBackground(Color.WHITE);
        else
            jueves2.setBackground(mycolor);
        if (!jueves_selec[2])
            jueves3.setBackground(Color.WHITE);
        else
            jueves3.setBackground(mycolor);
        if (!jueves_selec[3])
            jueves4.setBackground(Color.WHITE);
        else
            jueves4.setBackground(mycolor);
        if (!jueves_selec[4])
            jueves5.setBackground(Color.WHITE);
        else
            jueves5.setBackground(mycolor);
        if (!jueves_selec[5])
            jueves6.setBackground(Color.WHITE);
        else
            jueves6.setBackground(mycolor);
        if (!jueves_selec[6])
            jueves7.setBackground(Color.WHITE);
        else
            jueves7.setBackground(mycolor);
        if (!jueves_selec[7])
            jueves8.setBackground(Color.WHITE);
        else
            jueves8.setBackground(mycolor);
        if (!jueves_selec[8])
            jueves9.setBackground(Color.WHITE);
        else
            jueves9.setBackground(mycolor);
        if (!jueves_selec[9])
            jueves10.setBackground(Color.WHITE);
        else
            jueves10.setBackground(mycolor);
        if (!jueves_selec[10])
            jueves11.setBackground(Color.WHITE);
        else
            jueves11.setBackground(mycolor);
        if (!jueves_selec[11])
            jueves12.setBackground(Color.WHITE);
        else
            jueves12.setBackground(mycolor);
        if (!jueves_selec[12])
            jueves13.setBackground(Color.WHITE);
        else
            jueves13.setBackground(mycolor);
        if (!jueves_selec[13])
            jueves14.setBackground(Color.WHITE);
        else
            jueves14.setBackground(mycolor);
        if (!jueves_selec[14])
            jueves15.setBackground(Color.WHITE);
        else
            jueves15.setBackground(mycolor);
        if (!viernes_selec[0])
            viernes1.setBackground(Color.WHITE);
        else
            viernes1.setBackground(mycolor);
        if (!viernes_selec[1])
            viernes2.setBackground(Color.WHITE);
        else
            viernes2.setBackground(mycolor);
        if (!viernes_selec[2])
            viernes3.setBackground(Color.WHITE);
        else
            viernes3.setBackground(mycolor);
        if (!viernes_selec[3])
            viernes4.setBackground(Color.WHITE);
        else
            viernes4.setBackground(mycolor);
        if (!viernes_selec[4])
            viernes5.setBackground(Color.WHITE);
        else
            viernes5.setBackground(mycolor);
        if (!viernes_selec[5])
            viernes6.setBackground(Color.WHITE);
        else
            viernes6.setBackground(mycolor);
        if (!viernes_selec[6])
            viernes7.setBackground(Color.WHITE);
        else
            viernes7.setBackground(mycolor);
        if (!viernes_selec[7])
            viernes8.setBackground(Color.WHITE);
        else
            viernes8.setBackground(mycolor);
        if (!viernes_selec[8])
            viernes9.setBackground(Color.WHITE);
        else
            viernes9.setBackground(mycolor);
        if (!viernes_selec[9])
            viernes10.setBackground(Color.WHITE);
        else
            viernes10.setBackground(mycolor);
        if (!viernes_selec[10])
            viernes11.setBackground(Color.WHITE);
        else
            viernes11.setBackground(mycolor);
        if (!viernes_selec[11])
            viernes12.setBackground(Color.WHITE);
        else
            viernes12.setBackground(mycolor);
        if (!viernes_selec[12])
            viernes13.setBackground(Color.WHITE);
        else
            viernes13.setBackground(mycolor);
        if (!viernes_selec[13])
            viernes14.setBackground(Color.WHITE);
        else
            viernes14.setBackground(mycolor);
        if (!viernes_selec[14])
            viernes15.setBackground(Color.WHITE);
        else
            viernes15.setBackground(mycolor);
        if (!sabado_selec[0])
            sabado1.setBackground(Color.WHITE);
        else
            sabado1.setBackground(mycolor);
        if (!sabado_selec[1])
            sabado2.setBackground(Color.WHITE);
        else
            sabado2.setBackground(mycolor);
        if (!sabado_selec[2])
            sabado3.setBackground(Color.WHITE);
        else
            sabado3.setBackground(mycolor);
        if (!sabado_selec[3])
            sabado4.setBackground(Color.WHITE);
        else
            sabado4.setBackground(mycolor);
        if (!sabado_selec[4])
            sabado5.setBackground(Color.WHITE);
        else
            sabado5.setBackground(mycolor);
        if (!sabado_selec[5])
            sabado6.setBackground(Color.WHITE);
        else
            sabado6.setBackground(mycolor);
        if (!sabado_selec[6])
            sabado7.setBackground(Color.WHITE);
        else
            sabado7.setBackground(mycolor);
        if (!sabado_selec[7])
            sabado8.setBackground(Color.WHITE);
        else
            sabado8.setBackground(mycolor);
        if (!sabado_selec[8])
            sabado9.setBackground(Color.WHITE);
        else
            sabado9.setBackground(mycolor);
        if (!sabado_selec[9])
            sabado10.setBackground(Color.WHITE);
        else
            sabado10.setBackground(mycolor);
        if (!sabado_selec[10])
            sabado11.setBackground(Color.WHITE);
        else
            sabado11.setBackground(mycolor);
        if (!sabado_selec[11])
            sabado12.setBackground(Color.WHITE);
        else
            sabado12.setBackground(mycolor);
        if (!sabado_selec[12])
            sabado13.setBackground(Color.WHITE);
        else
            sabado13.setBackground(mycolor);
        if (!sabado_selec[13])
            sabado14.setBackground(Color.WHITE);
        else
            sabado14.setBackground(mycolor);
        if (!sabado_selec[14])
            sabado15.setBackground(Color.WHITE);
        else
            sabado15.setBackground(mycolor);
    }
    
    public ConfigurarHorario(int id_profesor) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.id_profesor = id_profesor;     
        jLabel24.setIcon(new ImageIcon("C:\\Users\\Juan carlos\\Documents\\NetBeansProjects\\TuProfeMaven-master\\src\\main\\java\\imagenes\\Fondo5.jpeg"));
        int lunes = 0;
        int martes = 0;
        int miercoles = 0;
        int jueves = 0;
        int viernes = 0;
        int sabado = 0;
        
        try {
            ResultSet rs = ProfesoresDB.getProfesor(id_profesor);
            while (rs.next()) {
                lunes = rs.getInt("lunes");
                martes = rs.getInt("martes");
                miercoles = rs.getInt("miercoles");
                jueves = rs.getInt("jueves");
                viernes = rs.getInt("viernes");
                sabado = rs.getInt("sabado");
            }            
            rs.close();
            for (int i=0;i<15;i++) {
                if ((lunes&(1<<i)) != 0)
                    lunes_selec[i] = true;
                else 
                    lunes_selec[i] = false;
            }                
            for (int i=0;i<15;i++) {
                if ((martes&(1<<i)) != 0)
                    martes_selec[i] = true;
                else
                    martes_selec[i] = false;
            }
            for (int i=0;i<15;i++) {
                if ((miercoles&(1<<i)) != 0)
                    miercoles_selec[i] = true;
                else
                    miercoles_selec[i] = false;
            }
            for (int i=0;i<15;i++) {
                if ((jueves&(1<<i)) != 0)
                    jueves_selec[i] = true;
                else 
                    jueves_selec[i] = false;
            }
            for (int i=0;i<15;i++) { 
                if ((viernes&(1<<i)) != 0)
                    viernes_selec[i] = true;
                else
                    viernes_selec[i] = false;
            }
            for (int i=0;i<15;i++) {
                if ((sabado&(1<<i)) != 0)
                    sabado_selec[i] = true;
                else
                    sabado_selec[i] = false;
            }
            colorearBotones();
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
        jueves12 = new javax.swing.JButton();
        jueves13 = new javax.swing.JButton();
        sabado4 = new javax.swing.JButton();
        sabado5 = new javax.swing.JButton();
        sabado6 = new javax.swing.JButton();
        sabado7 = new javax.swing.JButton();
        sabado8 = new javax.swing.JButton();
        sabado9 = new javax.swing.JButton();
        sabado10 = new javax.swing.JButton();
        jueves14 = new javax.swing.JButton();
        sabado11 = new javax.swing.JButton();
        jueves15 = new javax.swing.JButton();
        sabado12 = new javax.swing.JButton();
        viernes1 = new javax.swing.JButton();
        sabado13 = new javax.swing.JButton();
        viernes2 = new javax.swing.JButton();
        viernes3 = new javax.swing.JButton();
        viernes4 = new javax.swing.JButton();
        viernes5 = new javax.swing.JButton();
        viernes6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        viernes7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        viernes8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        sabado14 = new javax.swing.JButton();
        sabado15 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lunes1 = new javax.swing.JButton();
        lunes2 = new javax.swing.JButton();
        lunes3 = new javax.swing.JButton();
        lunes4 = new javax.swing.JButton();
        lunes5 = new javax.swing.JButton();
        lunes6 = new javax.swing.JButton();
        lunes7 = new javax.swing.JButton();
        lunes8 = new javax.swing.JButton();
        lunes9 = new javax.swing.JButton();
        lunes10 = new javax.swing.JButton();
        lunes11 = new javax.swing.JButton();
        lunes12 = new javax.swing.JButton();
        lunes13 = new javax.swing.JButton();
        lunes14 = new javax.swing.JButton();
        lunes15 = new javax.swing.JButton();
        martes1 = new javax.swing.JButton();
        martes2 = new javax.swing.JButton();
        martes3 = new javax.swing.JButton();
        martes4 = new javax.swing.JButton();
        martes5 = new javax.swing.JButton();
        martes6 = new javax.swing.JButton();
        martes7 = new javax.swing.JButton();
        martes8 = new javax.swing.JButton();
        martes9 = new javax.swing.JButton();
        martes10 = new javax.swing.JButton();
        martes11 = new javax.swing.JButton();
        martes12 = new javax.swing.JButton();
        martes13 = new javax.swing.JButton();
        martes14 = new javax.swing.JButton();
        martes15 = new javax.swing.JButton();
        miercoles1 = new javax.swing.JButton();
        miercoles2 = new javax.swing.JButton();
        miercoles3 = new javax.swing.JButton();
        miercoles4 = new javax.swing.JButton();
        miercoles5 = new javax.swing.JButton();
        miercoles6 = new javax.swing.JButton();
        miercoles7 = new javax.swing.JButton();
        miercoles8 = new javax.swing.JButton();
        miercoles9 = new javax.swing.JButton();
        miercoles10 = new javax.swing.JButton();
        miercoles11 = new javax.swing.JButton();
        miercoles12 = new javax.swing.JButton();
        miercoles13 = new javax.swing.JButton();
        miercoles14 = new javax.swing.JButton();
        miercoles15 = new javax.swing.JButton();
        jueves1 = new javax.swing.JButton();
        jueves2 = new javax.swing.JButton();
        jueves3 = new javax.swing.JButton();
        viernes9 = new javax.swing.JButton();
        viernes10 = new javax.swing.JButton();
        viernes11 = new javax.swing.JButton();
        viernes12 = new javax.swing.JButton();
        viernes13 = new javax.swing.JButton();
        viernes14 = new javax.swing.JButton();
        viernes15 = new javax.swing.JButton();
        jueves4 = new javax.swing.JButton();
        sabado1 = new javax.swing.JButton();
        jueves5 = new javax.swing.JButton();
        sabado2 = new javax.swing.JButton();
        jueves6 = new javax.swing.JButton();
        sabado3 = new javax.swing.JButton();
        jueves7 = new javax.swing.JButton();
        jueves8 = new javax.swing.JButton();
        jueves9 = new javax.swing.JButton();
        jueves10 = new javax.swing.JButton();
        jueves11 = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(563, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jueves12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jueves12ActionPerformed(evt);
            }
        });
        jPanel1.add(jueves12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 60, 20));

        jueves13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jueves13ActionPerformed(evt);
            }
        });
        jPanel1.add(jueves13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 60, 20));

        sabado4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabado4ActionPerformed(evt);
            }
        });
        jPanel1.add(sabado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 60, 20));

        sabado5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabado5ActionPerformed(evt);
            }
        });
        jPanel1.add(sabado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 60, 20));

        sabado6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabado6ActionPerformed(evt);
            }
        });
        jPanel1.add(sabado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 60, 20));

        sabado7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabado7ActionPerformed(evt);
            }
        });
        jPanel1.add(sabado7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 60, 20));

        sabado8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabado8ActionPerformed(evt);
            }
        });
        jPanel1.add(sabado8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 60, 20));

        sabado9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabado9ActionPerformed(evt);
            }
        });
        jPanel1.add(sabado9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 60, 20));

        sabado10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabado10ActionPerformed(evt);
            }
        });
        jPanel1.add(sabado10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 60, 20));

        jueves14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jueves14ActionPerformed(evt);
            }
        });
        jPanel1.add(jueves14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 60, 20));

        sabado11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabado11ActionPerformed(evt);
            }
        });
        jPanel1.add(sabado11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 60, 20));

        jueves15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jueves15ActionPerformed(evt);
            }
        });
        jPanel1.add(jueves15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 60, 20));

        sabado12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabado12ActionPerformed(evt);
            }
        });
        jPanel1.add(sabado12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 60, 20));

        viernes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viernes1ActionPerformed(evt);
            }
        });
        jPanel1.add(viernes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 60, 21));

        sabado13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabado13ActionPerformed(evt);
            }
        });
        jPanel1.add(sabado13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 60, 20));

        viernes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viernes2ActionPerformed(evt);
            }
        });
        jPanel1.add(viernes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 60, 20));

        viernes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viernes3ActionPerformed(evt);
            }
        });
        jPanel1.add(viernes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 60, 20));

        viernes4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viernes4ActionPerformed(evt);
            }
        });
        jPanel1.add(viernes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 60, 20));

        viernes5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viernes5ActionPerformed(evt);
            }
        });
        jPanel1.add(viernes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 60, 20));

        viernes6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viernes6ActionPerformed(evt);
            }
        });
        jPanel1.add(viernes6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 60, 20));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Hora");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        viernes7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viernes7ActionPerformed(evt);
            }
        });
        jPanel1.add(viernes7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 60, 20));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("6:00 a.m.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        viernes8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viernes8ActionPerformed(evt);
            }
        });
        jPanel1.add(viernes8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 60, 20));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("7:00 a.m.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("8:00 a.m.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("9:00 a.m.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("10:00 a.m.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("11:00 a.m.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("12:00 p.m.");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setText("1:00 p.m.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setText("2:00 p.m.");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        sabado14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabado14ActionPerformed(evt);
            }
        });
        jPanel1.add(sabado14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 60, 20));

        sabado15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabado15ActionPerformed(evt);
            }
        });
        jPanel1.add(sabado15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 60, 20));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel12.setText("3:00 p.m.");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel13.setText("4:00 p.m.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel14.setText("5:00 p.m.");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel15.setText("6:00 p.m.");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel16.setText("7:00 p.m.");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel17.setText("8:00 p.m.");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel18.setText("Lunes");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel19.setText("Martes");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel20.setText("Miércoles");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel21.setText("Jueves");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel22.setText("Viernes");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel23.setText("Sábado");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        lunes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunes1ActionPerformed(evt);
            }
        });
        jPanel1.add(lunes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 60, 20));

        lunes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunes2ActionPerformed(evt);
            }
        });
        jPanel1.add(lunes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 60, 20));

        lunes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunes3ActionPerformed(evt);
            }
        });
        jPanel1.add(lunes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 60, 20));

        lunes4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunes4ActionPerformed(evt);
            }
        });
        jPanel1.add(lunes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 60, 20));

        lunes5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunes5ActionPerformed(evt);
            }
        });
        jPanel1.add(lunes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 60, 20));

        lunes6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunes6ActionPerformed(evt);
            }
        });
        jPanel1.add(lunes6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 60, 20));

        lunes7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunes7ActionPerformed(evt);
            }
        });
        jPanel1.add(lunes7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 60, 20));

        lunes8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunes8ActionPerformed(evt);
            }
        });
        jPanel1.add(lunes8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 60, 20));

        lunes9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunes9ActionPerformed(evt);
            }
        });
        jPanel1.add(lunes9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 60, 20));

        lunes10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunes10ActionPerformed(evt);
            }
        });
        jPanel1.add(lunes10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 60, 20));

        lunes11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunes11ActionPerformed(evt);
            }
        });
        jPanel1.add(lunes11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 60, 20));

        lunes12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunes12ActionPerformed(evt);
            }
        });
        jPanel1.add(lunes12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 60, 20));

        lunes13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunes13ActionPerformed(evt);
            }
        });
        jPanel1.add(lunes13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 60, 20));

        lunes14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunes14ActionPerformed(evt);
            }
        });
        jPanel1.add(lunes14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 60, 20));

        lunes15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lunes15ActionPerformed(evt);
            }
        });
        jPanel1.add(lunes15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 60, 20));

        martes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                martes1ActionPerformed(evt);
            }
        });
        jPanel1.add(martes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 60, 20));

        martes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                martes2ActionPerformed(evt);
            }
        });
        jPanel1.add(martes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 60, 20));

        martes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                martes3ActionPerformed(evt);
            }
        });
        jPanel1.add(martes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 60, 20));

        martes4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                martes4ActionPerformed(evt);
            }
        });
        jPanel1.add(martes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 60, 20));

        martes5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                martes5ActionPerformed(evt);
            }
        });
        jPanel1.add(martes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 60, 20));

        martes6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                martes6ActionPerformed(evt);
            }
        });
        jPanel1.add(martes6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 60, 20));

        martes7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                martes7ActionPerformed(evt);
            }
        });
        jPanel1.add(martes7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 60, 20));

        martes8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                martes8ActionPerformed(evt);
            }
        });
        jPanel1.add(martes8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 60, 20));

        martes9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                martes9ActionPerformed(evt);
            }
        });
        jPanel1.add(martes9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 60, 20));

        martes10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                martes10ActionPerformed(evt);
            }
        });
        jPanel1.add(martes10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 60, 20));

        martes11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                martes11ActionPerformed(evt);
            }
        });
        jPanel1.add(martes11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 60, 20));

        martes12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                martes12ActionPerformed(evt);
            }
        });
        jPanel1.add(martes12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 60, 20));

        martes13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                martes13ActionPerformed(evt);
            }
        });
        jPanel1.add(martes13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 60, 20));

        martes14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                martes14ActionPerformed(evt);
            }
        });
        jPanel1.add(martes14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 60, 20));

        martes15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                martes15ActionPerformed(evt);
            }
        });
        jPanel1.add(martes15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 60, 20));

        miercoles1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miercoles1ActionPerformed(evt);
            }
        });
        jPanel1.add(miercoles1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 60, 20));

        miercoles2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miercoles2ActionPerformed(evt);
            }
        });
        jPanel1.add(miercoles2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 60, 20));

        miercoles3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miercoles3ActionPerformed(evt);
            }
        });
        jPanel1.add(miercoles3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 60, 20));

        miercoles4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miercoles4ActionPerformed(evt);
            }
        });
        jPanel1.add(miercoles4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 60, 20));

        miercoles5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miercoles5ActionPerformed(evt);
            }
        });
        jPanel1.add(miercoles5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 60, 20));

        miercoles6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miercoles6ActionPerformed(evt);
            }
        });
        jPanel1.add(miercoles6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 60, 20));

        miercoles7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miercoles7ActionPerformed(evt);
            }
        });
        jPanel1.add(miercoles7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 60, 20));

        miercoles8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miercoles8ActionPerformed(evt);
            }
        });
        jPanel1.add(miercoles8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 60, 20));

        miercoles9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miercoles9ActionPerformed(evt);
            }
        });
        jPanel1.add(miercoles9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 60, 20));

        miercoles10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miercoles10ActionPerformed(evt);
            }
        });
        jPanel1.add(miercoles10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 60, 20));

        miercoles11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miercoles11ActionPerformed(evt);
            }
        });
        jPanel1.add(miercoles11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 60, 20));

        miercoles12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miercoles12ActionPerformed(evt);
            }
        });
        jPanel1.add(miercoles12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 60, 20));

        miercoles13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miercoles13ActionPerformed(evt);
            }
        });
        jPanel1.add(miercoles13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 60, 20));

        miercoles14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miercoles14ActionPerformed(evt);
            }
        });
        jPanel1.add(miercoles14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 60, 20));

        miercoles15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miercoles15ActionPerformed(evt);
            }
        });
        jPanel1.add(miercoles15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 60, 20));

        jueves1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jueves1ActionPerformed(evt);
            }
        });
        jPanel1.add(jueves1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 60, 20));

        jueves2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jueves2ActionPerformed(evt);
            }
        });
        jPanel1.add(jueves2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 60, 20));

        jueves3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jueves3ActionPerformed(evt);
            }
        });
        jPanel1.add(jueves3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 60, 20));

        viernes9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viernes9ActionPerformed(evt);
            }
        });
        jPanel1.add(viernes9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 60, 20));

        viernes10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viernes10ActionPerformed(evt);
            }
        });
        jPanel1.add(viernes10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 60, 20));

        viernes11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viernes11ActionPerformed(evt);
            }
        });
        jPanel1.add(viernes11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 60, 20));

        viernes12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viernes12ActionPerformed(evt);
            }
        });
        jPanel1.add(viernes12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 60, 20));

        viernes13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viernes13ActionPerformed(evt);
            }
        });
        jPanel1.add(viernes13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 60, 20));

        viernes14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viernes14ActionPerformed(evt);
            }
        });
        jPanel1.add(viernes14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 60, 20));

        viernes15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viernes15ActionPerformed(evt);
            }
        });
        jPanel1.add(viernes15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 60, 20));

        jueves4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jueves4ActionPerformed(evt);
            }
        });
        jPanel1.add(jueves4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 60, 20));

        sabado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabado1ActionPerformed(evt);
            }
        });
        jPanel1.add(sabado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 60, 21));

        jueves5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jueves5ActionPerformed(evt);
            }
        });
        jPanel1.add(jueves5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 60, 20));

        sabado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabado2ActionPerformed(evt);
            }
        });
        jPanel1.add(sabado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 60, 20));

        jueves6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jueves6ActionPerformed(evt);
            }
        });
        jPanel1.add(jueves6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 60, 20));

        sabado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabado3ActionPerformed(evt);
            }
        });
        jPanel1.add(sabado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 60, 20));

        jueves7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jueves7ActionPerformed(evt);
            }
        });
        jPanel1.add(jueves7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 60, 20));

        jueves8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jueves8ActionPerformed(evt);
            }
        });
        jPanel1.add(jueves8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 60, 20));

        jueves9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jueves9ActionPerformed(evt);
            }
        });
        jPanel1.add(jueves9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 60, 20));

        jueves10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jueves10ActionPerformed(evt);
            }
        });
        jPanel1.add(jueves10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 60, 20));

        jueves11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jueves11ActionPerformed(evt);
            }
        });
        jPanel1.add(jueves11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 60, 20));

        regresar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        confirmar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });
        jPanel1.add(confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, -1));
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 560, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lunes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunes1ActionPerformed
        // TODO add your handling code here:
        lunes_selec[0] = !lunes_selec[0];
        colorearBotones();        
    }//GEN-LAST:event_lunes1ActionPerformed

    private void lunes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunes2ActionPerformed
        // TODO add your handling code here:
        lunes_selec[1] = !lunes_selec[1];
        colorearBotones();
    }//GEN-LAST:event_lunes2ActionPerformed

    private void lunes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunes3ActionPerformed
        // TODO add your handling code here:
        lunes_selec[2] = !lunes_selec[2];
        colorearBotones();
    }//GEN-LAST:event_lunes3ActionPerformed

    private void lunes4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunes4ActionPerformed
        // TODO add your handling code here:
        lunes_selec[3] = !lunes_selec[3];
        colorearBotones();
    }//GEN-LAST:event_lunes4ActionPerformed

    private void lunes5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunes5ActionPerformed
        // TODO add your handling code here:
        lunes_selec[4] = !lunes_selec[4];
        colorearBotones();
    }//GEN-LAST:event_lunes5ActionPerformed

    private void lunes6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunes6ActionPerformed
        // TODO add your handling code here:
        lunes_selec[5] = !lunes_selec[5];
        colorearBotones();
    }//GEN-LAST:event_lunes6ActionPerformed

    private void lunes7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunes7ActionPerformed
        // TODO add your handling code here:
        lunes_selec[6] = !lunes_selec[6];
        colorearBotones();
    }//GEN-LAST:event_lunes7ActionPerformed

    private void lunes8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunes8ActionPerformed
        // TODO add your handling code here:
        lunes_selec[7] = !lunes_selec[7];
        colorearBotones();
    }//GEN-LAST:event_lunes8ActionPerformed

    private void lunes9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunes9ActionPerformed
        // TODO add your handling code here:
        lunes_selec[8] = !lunes_selec[8];
        colorearBotones();
    }//GEN-LAST:event_lunes9ActionPerformed

    private void lunes10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunes10ActionPerformed
        // TODO add your handling code here:
        lunes_selec[9] = !lunes_selec[9];
        colorearBotones();
    }//GEN-LAST:event_lunes10ActionPerformed

    private void lunes11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunes11ActionPerformed
        // TODO add your handling code here:
        lunes_selec[10] = !lunes_selec[10];
        colorearBotones();
    }//GEN-LAST:event_lunes11ActionPerformed

    private void lunes12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunes12ActionPerformed
        // TODO add your handling code here:
        lunes_selec[11] = !lunes_selec[11];
        colorearBotones();
    }//GEN-LAST:event_lunes12ActionPerformed

    private void lunes13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunes13ActionPerformed
        // TODO add your handling code here:
        lunes_selec[12] = !lunes_selec[12];
        colorearBotones();
    }//GEN-LAST:event_lunes13ActionPerformed

    private void lunes14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunes14ActionPerformed
        // TODO add your handling code here:
        lunes_selec[13] = !lunes_selec[13];
        colorearBotones();
    }//GEN-LAST:event_lunes14ActionPerformed

    private void lunes15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lunes15ActionPerformed
        // TODO add your handling code here:
        lunes_selec[14] = !lunes_selec[14];
        colorearBotones();
    }//GEN-LAST:event_lunes15ActionPerformed

    private void martes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_martes1ActionPerformed
        // TODO add your handling code here:
        martes_selec[0] = !martes_selec[0];
        colorearBotones();
    }//GEN-LAST:event_martes1ActionPerformed

    private void martes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_martes2ActionPerformed
        // TODO add your handling code here:
        martes_selec[1] = !martes_selec[1];
        colorearBotones();
    }//GEN-LAST:event_martes2ActionPerformed

    private void martes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_martes3ActionPerformed
        // TODO add your handling code here:
        martes_selec[2] = !martes_selec[2];
        colorearBotones();
    }//GEN-LAST:event_martes3ActionPerformed

    private void martes4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_martes4ActionPerformed
        // TODO add your handling code here:
        martes_selec[3] = !martes_selec[3];
        colorearBotones();
    }//GEN-LAST:event_martes4ActionPerformed

    private void martes5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_martes5ActionPerformed
        // TODO add your handling code here:
        martes_selec[4] = !martes_selec[4];
        colorearBotones();
    }//GEN-LAST:event_martes5ActionPerformed

    private void martes6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_martes6ActionPerformed
        // TODO add your handling code here:
        martes_selec[5] = !martes_selec[5];
        colorearBotones();
    }//GEN-LAST:event_martes6ActionPerformed

    private void martes7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_martes7ActionPerformed
        // TODO add your handling code here:
        martes_selec[6] = !martes_selec[6];
        colorearBotones();
    }//GEN-LAST:event_martes7ActionPerformed

    private void martes8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_martes8ActionPerformed
        // TODO add your handling code here:
        martes_selec[7] = !martes_selec[7];
        colorearBotones();
    }//GEN-LAST:event_martes8ActionPerformed

    private void martes9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_martes9ActionPerformed
        // TODO add your handling code here:
        martes_selec[8] = !martes_selec[8];
        colorearBotones();
    }//GEN-LAST:event_martes9ActionPerformed

    private void martes10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_martes10ActionPerformed
        // TODO add your handling code here:
        martes_selec[9] = !martes_selec[9];
        colorearBotones();
    }//GEN-LAST:event_martes10ActionPerformed

    private void martes11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_martes11ActionPerformed
        // TODO add your handling code here:
        martes_selec[10] = !martes_selec[10];
        colorearBotones();
    }//GEN-LAST:event_martes11ActionPerformed

    private void martes12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_martes12ActionPerformed
        // TODO add your handling code here:
        martes_selec[11] = !martes_selec[11];
        colorearBotones();
    }//GEN-LAST:event_martes12ActionPerformed

    private void martes13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_martes13ActionPerformed
        // TODO add your handling code here:
        martes_selec[12] = !martes_selec[12];
        colorearBotones();
    }//GEN-LAST:event_martes13ActionPerformed

    private void martes14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_martes14ActionPerformed
        // TODO add your handling code here:
        martes_selec[13] = !martes_selec[13];
        colorearBotones();
    }//GEN-LAST:event_martes14ActionPerformed

    private void martes15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_martes15ActionPerformed
        // TODO add your handling code here:
        martes_selec[14] = !martes_selec[14];
        colorearBotones();
    }//GEN-LAST:event_martes15ActionPerformed

    private void miercoles1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miercoles1ActionPerformed
        // TODO add your handling code here:
        miercoles_selec[0] = !miercoles_selec[0];
        colorearBotones();
    }//GEN-LAST:event_miercoles1ActionPerformed

    private void miercoles2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miercoles2ActionPerformed
        // TODO add your handling code here:
        miercoles_selec[1] = !miercoles_selec[1];
        colorearBotones();
    }//GEN-LAST:event_miercoles2ActionPerformed

    private void miercoles3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miercoles3ActionPerformed
        // TODO add your handling code here:
        miercoles_selec[2] = !miercoles_selec[2];
        colorearBotones();
    }//GEN-LAST:event_miercoles3ActionPerformed

    private void miercoles4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miercoles4ActionPerformed
        // TODO add your handling code here:
        miercoles_selec[3] = !miercoles_selec[3];
        colorearBotones();
    }//GEN-LAST:event_miercoles4ActionPerformed

    private void miercoles5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miercoles5ActionPerformed
        // TODO add your handling code here:
        miercoles_selec[4] = !miercoles_selec[4];
        colorearBotones();
    }//GEN-LAST:event_miercoles5ActionPerformed

    private void miercoles6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miercoles6ActionPerformed
        // TODO add your handling code here:
        miercoles_selec[5] = !miercoles_selec[5];
        colorearBotones();
    }//GEN-LAST:event_miercoles6ActionPerformed

    private void miercoles7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miercoles7ActionPerformed
        // TODO add your handling code here:
        miercoles_selec[6] = !miercoles_selec[6];
        colorearBotones();
    }//GEN-LAST:event_miercoles7ActionPerformed

    private void miercoles8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miercoles8ActionPerformed
        // TODO add your handling code here:
        miercoles_selec[7] = !miercoles_selec[7];
        colorearBotones();
    }//GEN-LAST:event_miercoles8ActionPerformed

    private void miercoles9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miercoles9ActionPerformed
        // TODO add your handling code here:
        miercoles_selec[8] = !miercoles_selec[8];
        colorearBotones();
    }//GEN-LAST:event_miercoles9ActionPerformed

    private void miercoles10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miercoles10ActionPerformed
        // TODO add your handling code here:
        miercoles_selec[9] = !miercoles_selec[9];
        colorearBotones();
    }//GEN-LAST:event_miercoles10ActionPerformed

    private void miercoles11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miercoles11ActionPerformed
        // TODO add your handling code here:
        miercoles_selec[10] = !miercoles_selec[10];
        colorearBotones();
    }//GEN-LAST:event_miercoles11ActionPerformed

    private void miercoles12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miercoles12ActionPerformed
        // TODO add your handling code here:
        miercoles_selec[11] = !miercoles_selec[11];
        colorearBotones();
    }//GEN-LAST:event_miercoles12ActionPerformed

    private void miercoles13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miercoles13ActionPerformed
        // TODO add your handling code here:
        miercoles_selec[12] = !miercoles_selec[12];
        colorearBotones();
    }//GEN-LAST:event_miercoles13ActionPerformed

    private void miercoles14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miercoles14ActionPerformed
        // TODO add your handling code here:
        miercoles_selec[13] = !miercoles_selec[13];
        colorearBotones();
    }//GEN-LAST:event_miercoles14ActionPerformed

    private void miercoles15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miercoles15ActionPerformed
        // TODO add your handling code here:
        miercoles_selec[14] = !miercoles_selec[14];
        colorearBotones();
    }//GEN-LAST:event_miercoles15ActionPerformed

    private void jueves1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jueves1ActionPerformed
        // TODO add your handling code here:
        jueves_selec[0] = !jueves_selec[0];
        colorearBotones();
    }//GEN-LAST:event_jueves1ActionPerformed

    private void jueves2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jueves2ActionPerformed
        // TODO add your handling code here:
        jueves_selec[1] = !jueves_selec[1];
        colorearBotones();
    }//GEN-LAST:event_jueves2ActionPerformed

    private void jueves3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jueves3ActionPerformed
        // TODO add your handling code here:
        jueves_selec[2] = !jueves_selec[2];
        colorearBotones();
    }//GEN-LAST:event_jueves3ActionPerformed

    private void jueves4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jueves4ActionPerformed
        // TODO add your handling code here:
        jueves_selec[3] = !jueves_selec[3];
        colorearBotones();
    }//GEN-LAST:event_jueves4ActionPerformed

    private void jueves5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jueves5ActionPerformed
        // TODO add your handling code here:
        jueves_selec[4] = !jueves_selec[4];
        colorearBotones();
    }//GEN-LAST:event_jueves5ActionPerformed

    private void jueves6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jueves6ActionPerformed
        // TODO add your handling code here:
        jueves_selec[5] = !jueves_selec[5];
        colorearBotones();
    }//GEN-LAST:event_jueves6ActionPerformed

    private void jueves7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jueves7ActionPerformed
        // TODO add your handling code here:
        jueves_selec[6] = !jueves_selec[6];
        colorearBotones();
    }//GEN-LAST:event_jueves7ActionPerformed

    private void jueves8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jueves8ActionPerformed
        // TODO add your handling code here:
        jueves_selec[7] = !jueves_selec[7];
        colorearBotones();
    }//GEN-LAST:event_jueves8ActionPerformed

    private void jueves9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jueves9ActionPerformed
        // TODO add your handling code here:
        jueves_selec[8] = !jueves_selec[8];
        colorearBotones();
    }//GEN-LAST:event_jueves9ActionPerformed

    private void jueves10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jueves10ActionPerformed
        // TODO add your handling code here:
        jueves_selec[9] = !jueves_selec[9];
        colorearBotones();
    }//GEN-LAST:event_jueves10ActionPerformed

    private void jueves11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jueves11ActionPerformed
        // TODO add your handling code here:
        jueves_selec[10] = !jueves_selec[10];
        colorearBotones();
    }//GEN-LAST:event_jueves11ActionPerformed

    private void jueves12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jueves12ActionPerformed
        // TODO add your handling code here:
        jueves_selec[11] = !jueves_selec[11];
        colorearBotones();
    }//GEN-LAST:event_jueves12ActionPerformed

    private void jueves13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jueves13ActionPerformed
        // TODO add your handling code here:
        jueves_selec[12] = !jueves_selec[12];
        colorearBotones();
    }//GEN-LAST:event_jueves13ActionPerformed

    private void jueves14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jueves14ActionPerformed
        // TODO add your handling code here:
        jueves_selec[13] = !jueves_selec[13];
        colorearBotones();
    }//GEN-LAST:event_jueves14ActionPerformed

    private void jueves15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jueves15ActionPerformed
        // TODO add your handling code here:
        jueves_selec[14] = !jueves_selec[14];
        colorearBotones();
    }//GEN-LAST:event_jueves15ActionPerformed

    private void viernes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viernes1ActionPerformed
        // TODO add your handling code here:
        viernes_selec[0] = !viernes_selec[0];
        colorearBotones();
    }//GEN-LAST:event_viernes1ActionPerformed

    private void viernes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viernes2ActionPerformed
        // TODO add your handling code here:
        viernes_selec[1] = !viernes_selec[1];
        colorearBotones();
    }//GEN-LAST:event_viernes2ActionPerformed

    private void viernes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viernes3ActionPerformed
        // TODO add your handling code here:
        viernes_selec[2] = !viernes_selec[2];
        colorearBotones();
    }//GEN-LAST:event_viernes3ActionPerformed

    private void viernes4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viernes4ActionPerformed
        // TODO add your handling code here:
        viernes_selec[3] = !viernes_selec[3];
        colorearBotones();
    }//GEN-LAST:event_viernes4ActionPerformed

    private void viernes5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viernes5ActionPerformed
        // TODO add your handling code here:
        viernes_selec[4] = !viernes_selec[4];
        colorearBotones();
    }//GEN-LAST:event_viernes5ActionPerformed

    private void viernes6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viernes6ActionPerformed
        // TODO add your handling code here:
        viernes_selec[5] = !viernes_selec[5];
        colorearBotones();
    }//GEN-LAST:event_viernes6ActionPerformed

    private void viernes7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viernes7ActionPerformed
        // TODO add your handling code here:
        viernes_selec[6] = !viernes_selec[6];
        colorearBotones();
    }//GEN-LAST:event_viernes7ActionPerformed

    private void viernes8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viernes8ActionPerformed
        // TODO add your handling code here:
        viernes_selec[7] = !viernes_selec[7];
        colorearBotones();
    }//GEN-LAST:event_viernes8ActionPerformed

    private void viernes9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viernes9ActionPerformed
        // TODO add your handling code here:
        viernes_selec[8] = !viernes_selec[8];
        colorearBotones();
    }//GEN-LAST:event_viernes9ActionPerformed

    private void viernes10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viernes10ActionPerformed
        // TODO add your handling code here:
        viernes_selec[9] = !viernes_selec[9];
        colorearBotones();
    }//GEN-LAST:event_viernes10ActionPerformed

    private void viernes11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viernes11ActionPerformed
        // TODO add your handling code here:
        viernes_selec[10] = !viernes_selec[10];
        colorearBotones();
    }//GEN-LAST:event_viernes11ActionPerformed

    private void viernes12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viernes12ActionPerformed
        // TODO add your handling code here:
        viernes_selec[11] = !viernes_selec[11];
        colorearBotones();
    }//GEN-LAST:event_viernes12ActionPerformed

    private void viernes13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viernes13ActionPerformed
        // TODO add your handling code here:
        viernes_selec[12] = !viernes_selec[12];
        colorearBotones();
    }//GEN-LAST:event_viernes13ActionPerformed

    private void viernes14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viernes14ActionPerformed
        // TODO add your handling code here:
        viernes_selec[13] = !viernes_selec[13];
        colorearBotones();
    }//GEN-LAST:event_viernes14ActionPerformed

    private void viernes15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viernes15ActionPerformed
        // TODO add your handling code here:
        viernes_selec[14] = !viernes_selec[14];
        colorearBotones();
    }//GEN-LAST:event_viernes15ActionPerformed

    private void sabado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabado1ActionPerformed
        // TODO add your handling code here:
        sabado_selec[0] = !sabado_selec[0];
        colorearBotones();
    }//GEN-LAST:event_sabado1ActionPerformed

    private void sabado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabado2ActionPerformed
        // TODO add your handling code here:
        sabado_selec[1] = !sabado_selec[1];
        colorearBotones();
    }//GEN-LAST:event_sabado2ActionPerformed

    private void sabado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabado3ActionPerformed
        // TODO add your handling code here:
        sabado_selec[2] = !sabado_selec[2];
        colorearBotones();
    }//GEN-LAST:event_sabado3ActionPerformed

    private void sabado4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabado4ActionPerformed
        // TODO add your handling code here:
        sabado_selec[3] = !sabado_selec[3];
        colorearBotones();
        
    }//GEN-LAST:event_sabado4ActionPerformed

    private void sabado5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabado5ActionPerformed
        // TODO add your handling code here:
        sabado_selec[4] = !sabado_selec[4];
        colorearBotones();
    }//GEN-LAST:event_sabado5ActionPerformed

    private void sabado6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabado6ActionPerformed
        // TODO add your handling code here:
        sabado_selec[5] = !sabado_selec[5];
        colorearBotones();
    }//GEN-LAST:event_sabado6ActionPerformed

    private void sabado7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabado7ActionPerformed
        // TODO add your handling code here:
        sabado_selec[6] = !sabado_selec[6];
        colorearBotones();
    }//GEN-LAST:event_sabado7ActionPerformed

    private void sabado8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabado8ActionPerformed
        // TODO add your handling code here:
        sabado_selec[7] = !sabado_selec[7];
        colorearBotones();
    }//GEN-LAST:event_sabado8ActionPerformed

    private void sabado9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabado9ActionPerformed
        // TODO add your handling code here:
        sabado_selec[8] = !sabado_selec[8];
        colorearBotones();
    }//GEN-LAST:event_sabado9ActionPerformed

    private void sabado10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabado10ActionPerformed
        // TODO add your handling code here:
        sabado_selec[9] = !sabado_selec[9];
        colorearBotones();
    }//GEN-LAST:event_sabado10ActionPerformed

    private void sabado11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabado11ActionPerformed
        // TODO add your handling code here:
        sabado_selec[10] = !sabado_selec[10];
        colorearBotones();
    }//GEN-LAST:event_sabado11ActionPerformed

    private void sabado12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabado12ActionPerformed
        // TODO add your handling code here:
        sabado_selec[11] = !sabado_selec[11];
        colorearBotones();
    }//GEN-LAST:event_sabado12ActionPerformed

    private void sabado13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabado13ActionPerformed
        // TODO add your handling code here:
        sabado_selec[12] = !sabado_selec[12];
        colorearBotones();
    }//GEN-LAST:event_sabado13ActionPerformed

    private void sabado14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabado14ActionPerformed
        // TODO add your handling code here:
        sabado_selec[13] = !sabado_selec[13];
        colorearBotones();
    }//GEN-LAST:event_sabado14ActionPerformed

    private void sabado15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabado15ActionPerformed
        // TODO add your handling code here:
        sabado_selec[14] = !sabado_selec[14];
        colorearBotones();
    }//GEN-LAST:event_sabado15ActionPerformed

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
                        horarioLunes(),
                        horarioMartes(),
                        horarioMiercoles(),
                        horarioJueves(),
                        horarioViernes(),
                        horarioSabado(),
                        rs.getInt("materias")
                );
                ProfesoresDB.modificarProfesor(id_profesor, profesor);
                JOptionPane.showMessageDialog(
                    null,
                    "Horario modificado con éxito",
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

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Profesor(id_profesor).setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jueves1;
    private javax.swing.JButton jueves10;
    private javax.swing.JButton jueves11;
    private javax.swing.JButton jueves12;
    private javax.swing.JButton jueves13;
    private javax.swing.JButton jueves14;
    private javax.swing.JButton jueves15;
    private javax.swing.JButton jueves2;
    private javax.swing.JButton jueves3;
    private javax.swing.JButton jueves4;
    private javax.swing.JButton jueves5;
    private javax.swing.JButton jueves6;
    private javax.swing.JButton jueves7;
    private javax.swing.JButton jueves8;
    private javax.swing.JButton jueves9;
    private javax.swing.JButton lunes1;
    private javax.swing.JButton lunes10;
    private javax.swing.JButton lunes11;
    private javax.swing.JButton lunes12;
    private javax.swing.JButton lunes13;
    private javax.swing.JButton lunes14;
    private javax.swing.JButton lunes15;
    private javax.swing.JButton lunes2;
    private javax.swing.JButton lunes3;
    private javax.swing.JButton lunes4;
    private javax.swing.JButton lunes5;
    private javax.swing.JButton lunes6;
    private javax.swing.JButton lunes7;
    private javax.swing.JButton lunes8;
    private javax.swing.JButton lunes9;
    private javax.swing.JButton martes1;
    private javax.swing.JButton martes10;
    private javax.swing.JButton martes11;
    private javax.swing.JButton martes12;
    private javax.swing.JButton martes13;
    private javax.swing.JButton martes14;
    private javax.swing.JButton martes15;
    private javax.swing.JButton martes2;
    private javax.swing.JButton martes3;
    private javax.swing.JButton martes4;
    private javax.swing.JButton martes5;
    private javax.swing.JButton martes6;
    private javax.swing.JButton martes7;
    private javax.swing.JButton martes8;
    private javax.swing.JButton martes9;
    private javax.swing.JButton miercoles1;
    private javax.swing.JButton miercoles10;
    private javax.swing.JButton miercoles11;
    private javax.swing.JButton miercoles12;
    private javax.swing.JButton miercoles13;
    private javax.swing.JButton miercoles14;
    private javax.swing.JButton miercoles15;
    private javax.swing.JButton miercoles2;
    private javax.swing.JButton miercoles3;
    private javax.swing.JButton miercoles4;
    private javax.swing.JButton miercoles5;
    private javax.swing.JButton miercoles6;
    private javax.swing.JButton miercoles7;
    private javax.swing.JButton miercoles8;
    private javax.swing.JButton miercoles9;
    private javax.swing.JButton regresar;
    private javax.swing.JButton sabado1;
    private javax.swing.JButton sabado10;
    private javax.swing.JButton sabado11;
    private javax.swing.JButton sabado12;
    private javax.swing.JButton sabado13;
    private javax.swing.JButton sabado14;
    private javax.swing.JButton sabado15;
    private javax.swing.JButton sabado2;
    private javax.swing.JButton sabado3;
    private javax.swing.JButton sabado4;
    private javax.swing.JButton sabado5;
    private javax.swing.JButton sabado6;
    private javax.swing.JButton sabado7;
    private javax.swing.JButton sabado8;
    private javax.swing.JButton sabado9;
    private javax.swing.JButton viernes1;
    private javax.swing.JButton viernes10;
    private javax.swing.JButton viernes11;
    private javax.swing.JButton viernes12;
    private javax.swing.JButton viernes13;
    private javax.swing.JButton viernes14;
    private javax.swing.JButton viernes15;
    private javax.swing.JButton viernes2;
    private javax.swing.JButton viernes3;
    private javax.swing.JButton viernes4;
    private javax.swing.JButton viernes5;
    private javax.swing.JButton viernes6;
    private javax.swing.JButton viernes7;
    private javax.swing.JButton viernes8;
    private javax.swing.JButton viernes9;
    // End of variables declaration//GEN-END:variables
}

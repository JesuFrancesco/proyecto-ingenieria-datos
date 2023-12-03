package paq.ventanas;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import paq.clases.ConexionSQL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SEBASTIAN
 */
public class VentanaConexion extends javax.swing.JFrame {

    /**
     * Creates new form Ventana1
     */
    public VentanaConexion() {
        initComponents();
        setLocationRelativeTo(null);
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
        title = new javax.swing.JLabel();
        ipLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        campoIP = new javax.swing.JTextField();
        botonInicioSesion = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        campoUSER = new javax.swing.JTextField();
        botonSalir = new javax.swing.JButton();
        campoPASS = new javax.swing.JPasswordField();
        campoGIF = new javax.swing.JLabel();
        bgImgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Integrador | 2023-II");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Comic Sans MS", 1, 72)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("UL-VET-TECH");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, 600, 140));

        ipLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        ipLabel.setText("IP");
        jPanel1.add(ipLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        nameLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        nameLabel.setText("Nombre");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));

        passLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        passLabel.setText("Password");
        jPanel1.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));

        campoIP.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        campoIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIPActionPerformed(evt);
            }
        });
        jPanel1.add(campoIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 150, -1));

        botonInicioSesion.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        botonInicioSesion.setText("Log in");
        botonInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioSesionActionPerformed(evt);
            }
        });
        jPanel1.add(botonInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, 135, 33));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq/img/logovet.jpg"))); // NOI18N
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        campoUSER.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        campoUSER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUSERActionPerformed(evt);
            }
        });
        jPanel1.add(campoUSER, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 442, 150, -1));

        botonSalir.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 150, 33));
        jPanel1.add(campoPASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 150, -1));

        campoGIF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campoGIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq/img/ulimalogo.gif"))); // NOI18N
        campoGIF.setText(" ");
        jPanel1.add(campoGIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, 90, 90));

        bgImgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq/img/bg.jpg"))); // NOI18N
        jPanel1.add(bgImgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioSesionActionPerformed
        try {
            Connection c = ConexionSQL.conectar(campoIP.getText(), campoUSER.getText(), campoPASS.getText());
            if (c != null) {
                dispose();
                if(!campoUSER.getText().trim().equalsIgnoreCase("ingdata") && !campoUSER.getText().trim().equalsIgnoreCase("veterinario") && !campoUSER.getText().trim().equalsIgnoreCase("recepcionista")){ // XDDDDDD
                    try {
                        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su DNI", "Usuario detectado", JOptionPane.INFORMATION_MESSAGE));
                        new VentanaMainUsu(c, id).setVisible(true);
                    } catch (HeadlessException | NumberFormatException | SQLException e) { JOptionPane.showMessageDialog(null, "Algo salio mal:\n"+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); }
                } else {
                    new VentanaMain(c).setVisible(true);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonInicioSesionActionPerformed

    private void campoIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIPActionPerformed

    private void campoUSERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUSERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUSERActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
        //
    }//GEN-LAST:event_logoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImgLabel;
    private javax.swing.JButton botonInicioSesion;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel campoGIF;
    private javax.swing.JTextField campoIP;
    private javax.swing.JPasswordField campoPASS;
    private javax.swing.JTextField campoUSER;
    private javax.swing.JLabel ipLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}

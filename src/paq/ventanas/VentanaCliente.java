/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paq.ventanas;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesu
 */
public class VentanaCliente extends javax.swing.JFrame {

    /**
     * Creates new form frameCliente
     */
    private Connection conexionSQL;
    public VentanaCliente(Connection c) {
        this.conexionSQL = c;
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

        title = new javax.swing.JLabel();
        imgCliente = new javax.swing.JLabel();
        imgMascota = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoDNI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoNombresCl = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoApellidosCl = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        campoEspecie = new javax.swing.JTextField();
        campoRaza = new javax.swing.JTextField();
        campoNombreMa = new javax.swing.JTextField();
        botonSalir = new javax.swing.JButton();
        botonInsertCliente = new javax.swing.JButton();
        campoFecha = new com.toedter.calendar.JDateChooser();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 840));
        setPreferredSize(new java.awt.Dimension(800, 840));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Registro de cliente y mascota");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 110));

        imgCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq/img/Cliente.png"))); // NOI18N
        imgCliente.setText(" ");
        getContentPane().add(imgCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 200, 180));

        imgMascota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq/img/Mascota.png"))); // NOI18N
        imgMascota.setText(" ");
        getContentPane().add(imgMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 210, 210));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DNI");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, 20));

        campoDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDNIActionPerformed(evt);
            }
        });
        getContentPane().add(campoDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 170, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombres");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, 20));
        getContentPane().add(campoNombresCl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 170, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellidos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, 20));
        getContentPane().add(campoApellidosCl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 170, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teléfono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, -1, -1));
        getContentPane().add(campoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 170, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dirección");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, -1, 20));
        getContentPane().add(campoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, 170, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Correo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 660, -1, 20));
        getContentPane().add(campoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 660, 170, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nombre");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, 20));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Raza");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, -1, 20));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha de nacimiento");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 180, 20));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Especie");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, -1, 20));
        getContentPane().add(campoEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 200, -1));
        getContentPane().add(campoRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 200, -1));
        getContentPane().add(campoNombreMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 200, -1));

        botonSalir.setText("Cancelar");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 740, -1, -1));

        botonInsertCliente.setText("Crear cliente y mascota");
        botonInsertCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertClienteActionPerformed(evt);
            }
        });
        getContentPane().add(botonInsertCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 720, 210, 40));
        getContentPane().add(campoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, 140, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq/img/f2.jpg"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDNIActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonInsertClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertClienteActionPerformed
        try {                
            // Obtener siguiente ID
            String queryMaxID = "SELECT MAX(id_mascota) FROM Mascota";
            PreparedStatement preparedStatement = conexionSQL.prepareStatement(queryMaxID);
            ResultSet filaResultado = preparedStatement.executeQuery();

            int maxId = 0;

            if (filaResultado.next()) {
                maxId = filaResultado.getInt(1);
            }

            // Calcalo de ID próxima
            int nuevaID = maxId + 1;

            // Insertar fila de mascota
            String mascotaQuery = "INSERT INTO MASCOTA(ID_Mascota, Nombre, Raza, FechaNacimiento, Especie) VALUES(?, ?, ?, ?, ?)";
            preparedStatement = conexionSQL.prepareStatement(mascotaQuery);
            preparedStatement.setInt(1, nuevaID);
            preparedStatement.setString(2, campoNombreMa.getText());
            preparedStatement.setString(3, campoRaza.getText());
            preparedStatement.setTimestamp(4, new Timestamp(campoFecha.getDate().getTime()));
            preparedStatement.setString(5, campoEspecie.getText());

            int filaMascota = preparedStatement.executeUpdate();
            
            if (filaMascota > 0) {
                System.out.println("Mascota insertado: " + nuevaID);
            }
            
            // Insertar fila de cliente
            String clienteQuery = "INSERT INTO CLIENTE(DNI_Cliente, Nombres, Apellidos, Telefono, Direccion, Correo, ID_Mascota) VALUES(?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = conexionSQL.prepareStatement(clienteQuery);
            preparedStatement.setInt(1, Integer.parseInt(campoDNI.getText()));
            preparedStatement.setString(2, campoNombresCl.getText());
            preparedStatement.setString(3, campoApellidosCl.getText());
            preparedStatement.setString(4, campoTelefono.getText());
            preparedStatement.setString(5, campoDireccion.getText());
            preparedStatement.setString(6, campoCorreo.getText());
            preparedStatement.setInt(7, nuevaID);
            
            int filaCliente = preparedStatement.executeUpdate();
            
            if (filaCliente > 0) {
                System.out.println("Cliente insertado: " + campoDNI.getText());
            }

            JOptionPane.showMessageDialog(null, "Cliente y mascota registrados.", "INSERT realizado con exito", 1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algo salio mal:\n" + ex.getMessage(), "Error en query", 2);
        }
    }//GEN-LAST:event_botonInsertClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton botonInsertCliente;
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextField campoApellidosCl;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDNI;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoEspecie;
    private com.toedter.calendar.JDateChooser campoFecha;
    private javax.swing.JTextField campoNombreMa;
    private javax.swing.JTextField campoNombresCl;
    private javax.swing.JTextField campoRaza;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel imgCliente;
    private javax.swing.JLabel imgMascota;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}

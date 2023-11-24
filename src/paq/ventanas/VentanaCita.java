/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paq.ventanas;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesu
 */
public class VentanaCita extends javax.swing.JFrame {

    /**
     * Creates new form frameCliente
     */
    private Connection conexionSQL;
    private int id_mascota, id_veterinario;
    
    public VentanaCita(Connection c) throws SQLException {
        this.conexionSQL = c;
        initComponents();
        setLocationRelativeTo(null);
        obtenerVeterinarios();
        
    }
    
    void obtenerVeterinarios() throws SQLException{
        Statement statement = conexionSQL.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM VETERINARIO"); // Llamada de query
        String[] veterinarios = new String[resultSet.getFetchSize()];

        // Llenar tabla con información
        int i = 0;
        while (resultSet.next()) {
            veterinarios[i] = resultSet.getString("Nombres") + " " + resultSet.getString("Apellidos"); 
            i++; 
        }
    
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(veterinarios);
        comboBoxVeterinario.setModel(model);
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
        botonSalir = new javax.swing.JButton();
        botonAgendar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        comboBoxMascota = new javax.swing.JComboBox<>();
        imgMascota1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoCalendario = new com.toedter.calendar.JCalendar();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoRazonCita = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        comboBoxVeterinario = new javax.swing.JComboBox<>();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Proyecto Integrador | 2023-II");
        setMinimumSize(new java.awt.Dimension(800, 840));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Agendar cita");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 110));

        imgCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq/img/Cliente.png"))); // NOI18N
        imgCliente.setText(" ");
        getContentPane().add(imgCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 200, 180));

        imgMascota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq/img/Mascota.png"))); // NOI18N
        imgMascota.setText(" ");
        getContentPane().add(imgMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 210, 210));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DNI");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, 20));

        campoDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDNIActionPerformed(evt);
            }
        });
        campoDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoDNIKeyReleased(evt);
            }
        });
        getContentPane().add(campoDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 190, -1));

        botonSalir.setText("Cancelar");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 740, -1, -1));

        botonAgendar.setText("Agendar cita");
        botonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 720, 310, 40));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Razón de cita");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, 20));

        comboBoxMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        comboBoxMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMascotaActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 220, 30));

        imgMascota1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgMascota1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq/img/Veterinario.png"))); // NOI18N
        imgMascota1.setText(" ");
        getContentPane().add(imgMascota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 100, 210, 210));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Veterinario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 360, -1, -1));
        getContentPane().add(campoCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 190, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de cita");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, 20));

        campoRazonCita.setColumns(20);
        campoRazonCita.setRows(5);
        jScrollPane1.setViewportView(campoRazonCita);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 220, 150));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mascota");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, 20));

        comboBoxVeterinario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        comboBoxVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxVeterinarioActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxVeterinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 360, 150, 30));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq/img/f2.jpg"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDNIActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgendarActionPerformed
        try {                
            hallarID_mascota(); hallarDNI_veterinario();
            // Obtener siguiente ID
            String queryMaxID = "SELECT MAX(ID) FROM CITA";
            PreparedStatement preparedStatement = conexionSQL.prepareStatement(queryMaxID);
            ResultSet filaResultado = preparedStatement.executeQuery();

            int maxId = 0;
            if (filaResultado.next()) maxId = filaResultado.getInt(1);

            // Calcalo de ID próxima
            int nuevaID = maxId + 1;

            // Insertar fila de cita
            String citaQuery = "INSERT INTO CITA(ID, FechaRegistro, RazonCita, ID_CLIENTE, ID_MASCOTA, ID_VETERINARIO) VALUES(?, ?, ?, ?, ?, ?)";
            preparedStatement = conexionSQL.prepareStatement(citaQuery);
            preparedStatement.setInt(1, nuevaID);
            preparedStatement.setTimestamp(2, new Timestamp(campoCalendario.getDate().getTime()));
            preparedStatement.setString(3, campoRazonCita.getText());
            // ID de cliente
            preparedStatement.setInt(4, Integer.parseInt(campoDNI.getText()));
            // ID de cliente
            preparedStatement.setInt(5, id_mascota);
            // ID de cliente
            preparedStatement.setInt(6, id_veterinario);
            

            int filaMascota = preparedStatement.executeUpdate();
            if (filaMascota > 0) System.out.println("Cita agendada con éxito en fila " + nuevaID);
            
            
            JOptionPane.showMessageDialog(null, "Operación realizada con éxito.", "INSERT's realizados con éxito", 1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algo salio mal:\n" + ex.getMessage(), "Error en query", 2);
        }
    }//GEN-LAST:event_botonAgendarActionPerformed

    private void campoDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDNIKeyReleased
        try {
            String dni = campoDNI.getText();
            if (dni.length() < 7) return;
            Statement statement = conexionSQL.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM CLIENTE_MASCOTA INNER JOIN MASCOTA ON CLIENTE_MASCOTA.ID_MASCOTA = MASCOTA.ID WHERE ID_CLIENTE = " + dni); // Llamada de query
            String[] mascotas = new String[resultSet.getFetchSize()];
            
            // Llenar tabla con información
            int i = 0;
            while (resultSet.next()) {
                mascotas[i] = resultSet.getString("Nombre"); 
                i++;
            }
            
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(mascotas);
            comboBoxMascota.setModel(model);
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_campoDNIKeyReleased

    private void comboBoxMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMascotaActionPerformed
        hallarID_mascota();
    }//GEN-LAST:event_comboBoxMascotaActionPerformed
    
    void hallarID_mascota(){
        try {
            String dni = campoDNI.getText();
            Statement statement = conexionSQL.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT ID FROM CLIENTE_MASCOTA INNER JOIN MASCOTA ON CLIENTE_MASCOTA.ID_MASCOTA = MASCOTA.ID WHERE ID_CLIENTE = '" + dni +
                    "' AND MASCOTA.NOMBRE = '" + comboBoxMascota.getSelectedItem().toString() + "'"); // Llamada de query
            
            // Obtener id
            if (resultSet.next()) this.id_mascota = resultSet.getInt("ID");
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
    
    void hallarDNI_veterinario(){
        try {
            String[] nombreApellido = comboBoxVeterinario.getSelectedItem().toString().split(" ");
            Statement statement = conexionSQL.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT DNI FROM VETERINARIO WHERE NOMBRES = '" + nombreApellido[0] + "' AND APELLIDOS = '" + nombreApellido[1] + "'");
            
            // Obtener id
            if (resultSet.next()) this.id_veterinario = resultSet.getInt("DNI");
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
    
    private void comboBoxVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxVeterinarioActionPerformed
        hallarDNI_veterinario();
    }//GEN-LAST:event_comboBoxVeterinarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton botonAgendar;
    private javax.swing.JButton botonSalir;
    private com.toedter.calendar.JCalendar campoCalendario;
    private javax.swing.JTextField campoDNI;
    private javax.swing.JTextArea campoRazonCita;
    private javax.swing.JComboBox<String> comboBoxMascota;
    private javax.swing.JComboBox<String> comboBoxVeterinario;
    private javax.swing.JLabel imgCliente;
    private javax.swing.JLabel imgMascota;
    private javax.swing.JLabel imgMascota1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}

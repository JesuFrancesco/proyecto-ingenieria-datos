/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paq.ventanas;
import java.sql.*;
import javax.swing.JOptionPane;
import paq.clases.SentenciaPLSQL;

/**
 *
 * @author Jesu
 */
public class VentanaReporte extends javax.swing.JFrame {

    /**
     * Creates new form frameReporte
     */
    // Enable DBMS_OUTPUT
    
    
    private Connection conexionSQL;
    private CallableStatement activarLlamada, desactivarLlamada;;
    public VentanaReporte(Connection c) throws SQLException {
        this.conexionSQL = c;
        this.activarLlamada = conexionSQL.prepareCall("begin dbms_output.enable(NULL); end;"); 
        this.desactivarLlamada = conexionSQL.prepareCall("begin dbms_output.disable(); end;"); 
        
        initComponents();
        setLocationRelativeTo(null);
        campoResultado.setEditable(false);
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
        botonEficVet = new javax.swing.JButton();
        botonGastoInstrumento = new javax.swing.JButton();
        botonFrCitas = new javax.swing.JButton();
        botonIngresoTotal = new javax.swing.JButton();
        botonGanancias = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoResultado = new javax.swing.JTextArea();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 680));
        setPreferredSize(new java.awt.Dimension(1280, 660));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonEficVet.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        botonEficVet.setText("Ver eficiencia de veterinarios");
        botonEficVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEficVetActionPerformed(evt);
            }
        });
        jPanel1.add(botonEficVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        botonGastoInstrumento.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        botonGastoInstrumento.setText("Ver gastos en instrumentos");
        botonGastoInstrumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGastoInstrumentoActionPerformed(evt);
            }
        });
        jPanel1.add(botonGastoInstrumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 210, -1));

        botonFrCitas.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        botonFrCitas.setText("Ver frecuencia de citas");
        botonFrCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFrCitasActionPerformed(evt);
            }
        });
        jPanel1.add(botonFrCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 210, -1));

        botonIngresoTotal.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        botonIngresoTotal.setText("Calcular ingresos totales");
        botonIngresoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresoTotalActionPerformed(evt);
            }
        });
        jPanel1.add(botonIngresoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 240, -1, -1));

        botonGanancias.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        botonGanancias.setText("Calcular ganancias");
        botonGanancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGananciasActionPerformed(evt);
            }
        });
        jPanel1.add(botonGanancias, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 370, 180, -1));

        jButton6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButton6.setText("funcion3");
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 500, 180, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Reporte de estadísticos");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 2, 1280, 150));

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 600, -1, -1));

        campoResultado.setColumns(20);
        campoResultado.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        campoResultado.setRows(5);
        jScrollPane1.setViewportView(campoResultado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 630, 440));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paq/img/f4.jpg"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonFrCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFrCitasActionPerformed
        try {
            // Activar DBMS
            activarLlamada.executeUpdate();

            // Llamada a DBMS
            mostrarResultado(SentenciaPLSQL.CALC_1);
            
            // Desactivar DBMS
            desactivarLlamada.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algo salio mal:\n" + ex.getMessage());
        }
    }//GEN-LAST:event_botonFrCitasActionPerformed

    private void botonEficVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEficVetActionPerformed
        try {
            // Activar DBMS
            activarLlamada.executeUpdate();

            // Llamada a DBMS
            mostrarResultado(SentenciaPLSQL.CALC_2);
            
            // Desactivar DBMS
            desactivarLlamada.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algo salio mal:\n" + ex.getMessage());
        }
    }//GEN-LAST:event_botonEficVetActionPerformed

    private void botonGastoInstrumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGastoInstrumentoActionPerformed
        try {
            // Activar DBMS
            activarLlamada.executeUpdate();

            // Llamada a DBMS
            mostrarResultado(SentenciaPLSQL.CALC_3);
            
            // Desactivar DBMS
            desactivarLlamada.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algo salio mal:\n" + ex.getMessage());
        }
    }//GEN-LAST:event_botonGastoInstrumentoActionPerformed

    private void botonIngresoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresoTotalActionPerformed
        try {
            // Activar DBMS
            activarLlamada.executeUpdate();

            CallableStatement llamada = conexionSQL.prepareCall(SentenciaPLSQL.CALC_4);
            llamada.registerOutParameter(1, Types.DOUBLE); // Retorna double
            llamada.execute();
            double returnValue = llamada.getDouble(1);
            campoResultado.setText("Total de ingresos: " + returnValue);
            
            // Desactivar DBMS
            desactivarLlamada.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algo salio mal:\n" + ex.getMessage());
        }
    }//GEN-LAST:event_botonIngresoTotalActionPerformed

    private void botonGananciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGananciasActionPerformed

        try (CallableStatement call = conexionSQL.prepareCall(
            "begin " +
            "  dbms_output.enable(1000000);" +
            SentenciaPLSQL.CALC_5 +
            "  dbms_output.get_lines(?, ?);" +
            "  dbms_output.disable();" +
            "end;")) {
            call.registerOutParameter(1, Types.NUMERIC);
            call.registerOutParameter(2, Types.ARRAY, "DBMSOUTPUT_LINESARRAY");
            call.setInt(3, 1000);
            call.execute();

            // Retrieve and print the DBMS output
            Array array = call.getArray(2);
            Object[] output = (Object[]) array.getArray();
            String resultadoDBMS = "";
            for (Object line : output) {
                resultadoDBMS += line + "\n";
            }
            
            campoResultado.setText(resultadoDBMS);
            call.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algo salio mal:\n" + ex.getMessage() + "\n" + ex.getSQLState());
        }
    }//GEN-LAST:event_botonGananciasActionPerformed

    private void mostrarResultado(String sentencia) throws SQLException{
        // Preparar la llamada de la sentencia enviada
        CallableStatement userCall = conexionSQL.prepareCall(sentencia);
        userCall.execute();

        // Obtener el output
        CallableStatement lecturaDeLineas = conexionSQL.prepareCall("begin dbms_output.get_lines(?, ?); end;");
        lecturaDeLineas.registerOutParameter(1, Types.ARRAY, "DBMSOUTPUT_LINESARRAY");
        lecturaDeLineas.registerOutParameter(2, Types.INTEGER, "INTEGER");
        lecturaDeLineas.setInt(2, 1000); // Set the number of lines to fetch
        lecturaDeLineas.execute();

        // Procesado
        Array array = lecturaDeLineas.getArray(1);
        String output[] = (String[]) array.getArray(), resultado = "";
        for (String line : output) {
            // Cada linea del DBMS
//            System.out.println(line);
            if (!resultado.equalsIgnoreCase("null"))
            resultado += line + "\n";
        }

        // Mostrar resultado
        campoResultado.setText(resultado);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton botonEficVet;
    private javax.swing.JButton botonFrCitas;
    private javax.swing.JButton botonGanancias;
    private javax.swing.JButton botonGastoInstrumento;
    private javax.swing.JButton botonIngresoTotal;
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextArea campoResultado;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

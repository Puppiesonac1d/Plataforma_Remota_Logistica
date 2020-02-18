
import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/*
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author The_S
 */
public class Inventarios extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conecta();

    public Inventarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInventarios = new javax.swing.JLayeredPane();
        jPanel3 = new javax.swing.JPanel();
        btnListadoBodegas = new javax.swing.JButton();
        btnInventarioPorBodega = new javax.swing.JButton();
        btnSalirInventarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 740));
        setMinimumSize(new java.awt.Dimension(1280, 740));
        setResizable(false);

        panelInventarios.setMaximumSize(new java.awt.Dimension(1280, 740));
        panelInventarios.setMinimumSize(new java.awt.Dimension(1280, 740));
        panelInventarios.setName(""); // NOI18N

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        btnListadoBodegas.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnListadoBodegas.setText("Listado de Bodegas");
        btnListadoBodegas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoBodegasActionPerformed(evt);
            }
        });
        jPanel3.add(btnListadoBodegas);

        btnInventarioPorBodega.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnInventarioPorBodega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/578bc5a79c(2).png"))); // NOI18N
        btnInventarioPorBodega.setText("Inventario por Bodega");
        btnInventarioPorBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioPorBodegaActionPerformed(evt);
            }
        });
        jPanel3.add(btnInventarioPorBodega);

        btnSalirInventarios.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnSalirInventarios.setText("Volver");
        btnSalirInventarios.setToolTipText("");
        btnSalirInventarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirInventariosActionPerformed(evt);
            }
        });
        jPanel3.add(btnSalirInventarios);

        panelInventarios.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelInventariosLayout = new javax.swing.GroupLayout(panelInventarios);
        panelInventarios.setLayout(panelInventariosLayout);
        panelInventariosLayout.setHorizontalGroup(
            panelInventariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInventariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1260, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelInventariosLayout.setVerticalGroup(
            panelInventariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInventariosLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInventarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInventarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListadoBodegasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoBodegasActionPerformed
        try {
            //this.dispose();
            ListadoBodegas listado = new ListadoBodegas();
            listado.setVisible(true);
            String query = "Select idBodega as 'ID de Bodega', nombreBodega as 'Nombre de Bodega' from bodega group by nombreBodega";
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            listado.tblListadoBodegas.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            Logger.getLogger(Login.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnListadoBodegasActionPerformed

    private void btnInventarioPorBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioPorBodegaActionPerformed
        try {
            InventarioPorBodega inventario = new InventarioPorBodega();
            inventario.setVisible(true);

            String query = "Select idProducto as 'ID producto', SKU, categoria as 'Categoría', nombreProducto as 'Producto', descripcion as 'Descripción',\n"
                    + "Concat('$',precioVenta )as 'Precio Venta', precioCosto as 'Precio Costo', d.nombreDistribuidor as 'Nombre de Distribuidor', regiones as 'Regiones',\n"
                    + "CondicionDespacho as 'Condición de Despacho', diasHabiles as 'Días Hábiles', StatusProducto as 'Estado', stock as 'Stock'\n"
                    + "FROM inventario r left join distribuidor d on r.IDDISTRIBUIDOR = d.idDistribuidor;";
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            inventario.tblProductoInventarioBodega.setModel(DbUtils.resultSetToTableModel(rs));

            String query2 = "select nombreBodega,seccion from bodega";
            PreparedStatement pst2 = cn.prepareStatement(query2);
            ResultSet rs2 = pst2.executeQuery();
            while (rs2.next()) {
                inventario.cmbBodega2.addItem(rs2.getString(1));
                inventario.cmbSeccionBodega1.addItem(rs2.getString(2));
            }

            String query3 = "select nombreConvenio FROM acimabasededatos.conveniomarco order by codigoConvenio desc;";
            PreparedStatement pst3 = cn.prepareStatement(query3);
            ResultSet rs3 = pst3.executeQuery();
            while (rs3.next()) {
                inventario.cmbConvenioMarco.addItem(rs3.getString(1));
            }

            String query4 = "select nombreDistribuidor from distribuidor order by idDistribuidor;";
            PreparedStatement pst4 = cn.prepareStatement(query4);
            ResultSet rs4 = pst4.executeQuery();
            while (rs4.next()) {
                inventario.cmbDistribuidor.addItem(rs4.getString(1));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_btnInventarioPorBodegaActionPerformed

    private void btnSalirInventariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirInventariosActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirInventariosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInventarioPorBodega;
    private javax.swing.JButton btnListadoBodegas;
    private javax.swing.JButton btnSalirInventarios;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLayeredPane panelInventarios;
    // End of variables declaration//GEN-END:variables
}

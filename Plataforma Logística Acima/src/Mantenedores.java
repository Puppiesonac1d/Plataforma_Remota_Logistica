
import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author The_S
 */
public class Mantenedores extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conecta();

    public Mantenedores() {
        initComponents();
    }

    private void seleccionarComuna(JComboBox cmR, JComboBox cmC) {

        switch (cmR.getSelectedItem().toString()) {
            case "I de Tarapaca":
                cmC.removeAllItems();
                cmC.setEnabled(true);
                try {
                    String query = "select NombreComuna,idComuna,idRegion from comuna where IDRegion=1 ORDER BY NombreComuna";
                    PreparedStatement pst = cn.prepareStatement(query);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        cmC.addItem(rs.getString(1));
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;
            case "II de Antofagasta":
                cmC.setEnabled(true);
                cmC.removeAllItems();
                try {
                    String query = "select NombreComuna,idComuna,idRegion from comuna where IDRegion=2 ORDER BY NombreComuna";
                    PreparedStatement pst = cn.prepareStatement(query);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        cmC.addItem(rs.getString(1));

                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;
            case "III de Atacama":
                cmC.setEnabled(true);
                cmC.removeAllItems();
                try {
                    String query = "select NombreComuna,idComuna,idRegion from comuna where IDRegion=3 ORDER BY NombreComuna";
                    PreparedStatement pst = cn.prepareStatement(query);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        cmC.addItem(rs.getString(1));

                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;
            case "IV de Coquimbo":
                cmC.setEnabled(true);
                cmC.removeAllItems();
                try {
                    String query = "select NombreComuna,idComuna,idRegion from comuna where IDRegion=4 ORDER BY NombreComuna";
                    PreparedStatement pst = cn.prepareStatement(query);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        cmC.addItem(rs.getString(1));

                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;
            case "V de Valparaiso":
                cmC.setEnabled(true);
                cmC.removeAllItems();
                try {
                    String query = "select NombreComuna,idComuna,idRegion from comuna where IDRegion=5 ORDER BY NombreComuna";
                    PreparedStatement pst = cn.prepareStatement(query);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        cmC.addItem(rs.getString(1));

                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;
            case "VI del Libertador General Bernardo O’Higgins":
                cmC.setEnabled(true);
                cmC.removeAllItems();
                try {
                    String query = "select NombreComuna,idComuna,idRegion from comuna where IDRegion=6 ORDER BY NombreComuna";
                    PreparedStatement pst = cn.prepareStatement(query);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        cmC.addItem(rs.getString(1));

                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;
            case "VII del Maule":
                cmC.setEnabled(true);
                cmC.removeAllItems();
                try {
                    String query = "select NombreComuna,idComuna,idRegion from comuna where IDRegion=7 ORDER BY NombreComuna";
                    PreparedStatement pst = cn.prepareStatement(query);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        cmC.addItem(rs.getString(1));

                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;
            case "VIII de Concepcion":
                cmC.setEnabled(true);
                cmC.removeAllItems();
                try {
                    String query = "select NombreComuna,idComuna,idRegion from comuna where IDRegion=8 ORDER BY NombreComuna";
                    PreparedStatement pst = cn.prepareStatement(query);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        cmC.addItem(rs.getString(1));

                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;
            case "IX de la Araucania":
                cmC.setEnabled(true);
                cmC.removeAllItems();
                try {
                    String query = "select NombreComuna,idComuna,idRegion from comuna where IDRegion=9 ORDER BY NombreComuna";
                    PreparedStatement pst = cn.prepareStatement(query);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        cmC.addItem(rs.getString(1));

                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;
            case "X de Los Lagos":
                cmC.setEnabled(true);
                cmC.removeAllItems();
                try {
                    String query = "select NombreComuna,idComuna,idRegion from comuna where IDRegion=10 ORDER BY NombreComuna";
                    PreparedStatement pst = cn.prepareStatement(query);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        cmC.addItem(rs.getString(1));

                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;
            case "XI de Aysen del General Carlos Ibañez del Campo":
                cmC.setEnabled(true);
                cmC.removeAllItems();
                try {
                    String query = "select NombreComuna,idComuna,idRegion from comuna where IDRegion=11 ORDER BY NombreComuna";
                    PreparedStatement pst = cn.prepareStatement(query);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        cmC.addItem(rs.getString(1));

                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;
            case "XII de Magallanes y Antártica Chilena":
                cmC.setEnabled(true);
                cmC.removeAllItems();
                try {
                    String query = "select NombreComuna,idComuna,idRegion from comuna where IDRegion=12 ORDER BY NombreComuna";
                    PreparedStatement pst = cn.prepareStatement(query);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        cmC.addItem(rs.getString(1));
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;
            case "Región Metropolitana de Santiago":
                cmC.setEnabled(true);
                cmC.removeAllItems();
                try {
                    String query = "select NombreComuna,idComuna,idRegion from comuna where IDRegion=13 ORDER BY NombreComuna";
                    PreparedStatement pst = cn.prepareStatement(query);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {

                        cmC.addItem(rs.getString(1));

                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;
            case "XIV de Los Ríos":
                cmC.setEnabled(true);
                cmC.removeAllItems();
                try {
                    String query = "select NombreComuna,idComuna,idRegion from comuna where IDRegion=14 ORDER BY NombreComuna";
                    PreparedStatement pst = cn.prepareStatement(query);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {

                        cmC.addItem(rs.getString(1));

                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;
            case "XV de Arica y Parinacota":
                cmC.setEnabled(true);
                cmC.removeAllItems();
                try {
                    String query = "select NombreComuna,idComuna,idRegion from comuna where IDRegion=15 ORDER BY NombreComuna";
                    PreparedStatement pst = cn.prepareStatement(query);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {

                        cmC.addItem(rs.getString(1));
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;
            case "XVI del Ñuble":
                cmC.setEnabled(true);
                cmC.removeAllItems();
                try {
                    String query = "select NombreComuna,idComuna,idRegion from comuna where IDRegion=16 ORDER BY NombreComuna";
                    PreparedStatement pst = cn.prepareStatement(query);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        cmC.addItem(rs.getString(1));
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;
            default:
                break;
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

        jLayeredPane11 = new javax.swing.JLayeredPane();
        jPanel8 = new javax.swing.JPanel();
        btnMantenedorBodegas1 = new javax.swing.JButton();
        btnMantenedorProductos = new javax.swing.JButton();
        btnMantenedorCM = new javax.swing.JButton();
        btnVolverMenu2 = new javax.swing.JButton();
        lblMantenedoresFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jLayeredPane11.setMaximumSize(new java.awt.Dimension(1280, 720));
        jLayeredPane11.setMinimumSize(new java.awt.Dimension(1280, 720));

        jPanel8.setBackground(new java.awt.Color(0, 153, 153));
        jPanel8.setForeground(new java.awt.Color(0, 204, 204));
        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        btnMantenedorBodegas1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnMantenedorBodegas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/578bc5a79c(2).png"))); // NOI18N
        btnMantenedorBodegas1.setText("Registrar Bodega");
        btnMantenedorBodegas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenedorBodegas1ActionPerformed(evt);
            }
        });
        jPanel8.add(btnMantenedorBodegas1);

        btnMantenedorProductos.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnMantenedorProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/7af6ee279c(1).png"))); // NOI18N
        btnMantenedorProductos.setText("Ingresar Productos a Merma");
        btnMantenedorProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenedorProductosActionPerformed(evt);
            }
        });
        jPanel8.add(btnMantenedorProductos);

        btnMantenedorCM.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnMantenedorCM.setIcon(new javax.swing.ImageIcon("D:\\Plataforma Logística Acima_11-06-2019\\Plataforma Logística Acima\\src\\imagenes\\7e27801d8b(1).png")); // NOI18N
        btnMantenedorCM.setText("Registrar Convenio Marco");
        btnMantenedorCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenedorCMActionPerformed(evt);
            }
        });
        jPanel8.add(btnMantenedorCM);

        btnVolverMenu2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnVolverMenu2.setIcon(new javax.swing.ImageIcon("D:\\Plataforma Logística Acima_11-06-2019\\Plataforma Logística Acima\\src\\imagenes\\exit_icon-icons.com_70975.png")); // NOI18N
        btnVolverMenu2.setText("Volver");
        btnVolverMenu2.setToolTipText("");
        btnVolverMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenu2ActionPerformed(evt);
            }
        });
        jPanel8.add(btnVolverMenu2);

        lblMantenedoresFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuTest.png"))); // NOI18N

        javax.swing.GroupLayout jLayeredPane11Layout = new javax.swing.GroupLayout(jLayeredPane11);
        jLayeredPane11.setLayout(jLayeredPane11Layout);
        jLayeredPane11Layout.setHorizontalGroup(
            jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMantenedoresFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jLayeredPane11Layout.setVerticalGroup(
            jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMantenedoresFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane11Layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane11.setLayer(jPanel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(lblMantenedoresFondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMantenedorBodegas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenedorBodegas1ActionPerformed
        try {
            this.dispose();
            MantenedorBodega bodega = new MantenedorBodega();
            bodega.setVisible(true);
            seleccionarComuna(bodega.cmbRegionBodega, bodega.cmbComunaBodega);
            String query = "Select idBodega as 'ID de Bodega', nombreBodega as 'Nombre de Bodega', seccion as 'Sección' from bodega";
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            bodega.tblBodegas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnMantenedorBodegas1ActionPerformed

    private void btnMantenedorProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenedorProductosActionPerformed
        try {
            this.dispose();
            MantenedorProductos productos = new MantenedorProductos();
            productos.setVisible(true);
            String queryProducto = "Select inv.idProducto as 'ID producto', inv.SKU, inv.categoria as 'Categoría', inv.nombreProducto as 'Producto',\n"
                    + "inv.descripcion as 'Descripción' ,inv.StatusProducto as 'Estado', inv.stock as 'Stock en la bodega', b.nombreBodega as 'Nombre de Bodega'\n"
                    + "FROM inventario inv join bodega b on inv.idBodega = b.idBodega\n"
                    + "join ingreso ing on ing.idBodega = inv.idBodega";
            PreparedStatement pstProducto = cn.prepareStatement(queryProducto);
            ResultSet rsProducto = pstProducto.executeQuery();
            productos.tblMantenedorProductos.setModel(DbUtils.resultSetToTableModel(rsProducto));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnMantenedorProductosActionPerformed

    private void btnMantenedorCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenedorCMActionPerformed
        try {
            this.dispose();
            MantenedorCM cm = new MantenedorCM();
            cm.setVisible(true);
            this.setTitle("Mantenedor de Convenio Marco");
            String query = "Select * from convenioMarco";
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            cm.tblConvenios.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnMantenedorCMActionPerformed

    private void btnVolverMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenu2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverMenu2ActionPerformed

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
            java.util.logging.Logger.getLogger(Mantenedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mantenedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mantenedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mantenedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mantenedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMantenedorBodegas1;
    private javax.swing.JButton btnMantenedorCM;
    private javax.swing.JButton btnMantenedorProductos;
    private javax.swing.JButton btnVolverMenu2;
    private javax.swing.JLayeredPane jLayeredPane11;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblMantenedoresFondo;
    // End of variables declaration//GEN-END:variables
}

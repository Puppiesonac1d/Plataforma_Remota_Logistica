
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnMantenedorBodegas1 = new javax.swing.JButton();
        btnMantenedorCM = new javax.swing.JButton();
        btnVolverMenu2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(252, 252, 252));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acima-logo-200p.png"))); // NOI18N

        jPanel8.setBackground(new java.awt.Color(252, 252, 252));
        jPanel8.setForeground(new java.awt.Color(252, 252, 252));
        jPanel8.setLayout(new java.awt.GridLayout(2, 0));

        btnMantenedorBodegas1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnMantenedorBodegas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/578bc5a79c(2).png"))); // NOI18N
        btnMantenedorBodegas1.setText("Registrar Bodega");
        btnMantenedorBodegas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenedorBodegas1ActionPerformed(evt);
            }
        });
        jPanel8.add(btnMantenedorBodegas1);

        btnMantenedorCM.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnMantenedorCM.setText("Registrar Convenio Marco");
        btnMantenedorCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenedorCMActionPerformed(evt);
            }
        });
        jPanel8.add(btnMantenedorCM);

        btnVolverMenu2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnVolverMenu2.setText("Volver");
        btnVolverMenu2.setToolTipText("");
        btnVolverMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenu2ActionPerformed(evt);
            }
        });
        jPanel8.add(btnVolverMenu2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
    private javax.swing.JButton btnVolverMenu2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}

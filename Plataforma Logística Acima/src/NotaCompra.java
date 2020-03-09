
import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author The_S
 */
public class NotaCompra extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conecta();

    public NotaCompra() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel11 = new javax.swing.JPanel();
        btnSalir3 = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        tblNC = new javax.swing.JTable();
        btnReiniciarFiltros = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        cmbDistribuidor = new javax.swing.JComboBox();
        jPanel7 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        txtCodigoOrdenCompra = new javax.swing.JTextField();
        btnBuscarOC = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumNV = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCotizacion = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSalir3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnSalir3.setText("Volver");
        btnSalir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir3ActionPerformed(evt);
            }
        });

        tblNC = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int celIndex){
                return false;
            }
        };
        tblNC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblNC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNCMouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(tblNC);

        btnReiniciarFiltros.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnReiniciarFiltros.setText("Reiniciar Filtros");
        btnReiniciarFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarFiltrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReiniciarFiltros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(btnSalir3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btnReiniciarFiltros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cmbDistribuidor.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cmbDistribuidor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acima Global SPA", "Acima Soluciones", "Importadora Vive Mas" }));
        cmbDistribuidor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDistribuidorItemStateChanged(evt);
            }
        });
        cmbDistribuidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDistribuidorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbDistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(669, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbDistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buscar por ACIMA GLOBAL / ACIMA SOLUCIONES / Vive Más", jPanel3);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel27.setText("Código de Orden de Compra:");

        txtCodigoOrdenCompra.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        btnBuscarOC.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnBuscarOC.setText("Buscar");
        btnBuscarOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarOCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoOrdenCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarOC)
                .addContainerGap(367, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtCodigoOrdenCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarOC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buscar por Código de Orden de Compra", jPanel7);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("N° de nota de venta:");

        txtNumNV.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumNV, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(567, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buscar por N° de nota de venta", jPanel1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("N° de Cotización:");

        txtCotizacion.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(531, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buscar por N° de Cotización", jPanel2);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acima-logo-200p.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalir3ActionPerformed

    private void btnReiniciarFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarFiltrosActionPerformed
        try {
            String queryActualizar = "SELECT \n"
                    + "    a.numeroCotizacion AS 'OC de Proveedor',\n"
                    + "    da.idOrden AS 'N° de nota de venta',\n"
                    + "    a.codigoOrdenCompra AS 'Código de Orden de Compra',\n"
                    + "    a.distribuidor AS 'Distribuidor',\n"
                    + "    CONCAT(SUBSTRING(a.fecha, 9, 2),\n"
                    + "            '-',\n"
                    + "            SUBSTRING(a.fecha, 6, 2),\n"
                    + "            '-',\n"
                    + "            SUBSTRING(a.fecha, 1, 4)) AS 'Fecha de cotización' , "
                    + "    a.proveedor AS 'Proveedor',\n"
                    + "    a.estado AS 'Estado'\n"
                    + "FROM\n"
                    + "    abastecimiento a\n"
                    + "        LEFT JOIN\n"
                    + "    detalle_abastecimiento da ON a.codigoOrdenCompra = da.codigoOrdenCompra\n"
                    + "WHERE\n"
                    + "    a.estado IN ('Comprado' , 'Nota de compra ingresada con productos faltantes',\n"
                    + "        'Enviado a Proveedor')\n"
                    + "GROUP BY a.numeroCotizacion;";
            PreparedStatement pst = cn.prepareStatement(queryActualizar);
            ResultSet rs = pst.executeQuery();
            tblNC.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnReiniciarFiltrosActionPerformed

    private void cmbDistribuidorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDistribuidorItemStateChanged
        try {
            String query = "SELECT \n"
                    + "    a.numeroCotizacion AS 'OC de Proveedor',\n"
                    + "    da.idOrden AS 'N° de nota de venta',\n"
                    + "    a.codigoOrdenCompra AS 'Código de Orden de Compra',\n"
                    + "    a.distribuidor AS 'Distribuidor',\n"
                    + "    CONCAT(SUBSTRING(a.fecha, 9, 2),\n"
                    + "            '-',\n"
                    + "            SUBSTRING(a.fecha, 6, 2),\n"
                    + "            '-',\n"
                    + "            SUBSTRING(a.fecha, 1, 4)) AS 'Fecha de cotización' , "
                    + "    a.proveedor AS 'Proveedor',\n"
                    + "    a.estado AS 'Estado'\n"
                    + "FROM\n"
                    + "    abastecimiento a\n"
                    + "        LEFT JOIN\n"
                    + "    detalle_abastecimiento da ON a.codigoOrdenCompra = da.codigoOrdenCompra\n"
                    + "WHERE\n"
                    + "    a.estado IN ('Comprado' , 'Nota de compra ingresada con productos faltantes',\n"
                    + "        'Enviado a Proveedor') and a.distribuidor RLIKE ?\n"
                    + "GROUP BY a.numeroCotizacion;";
            PreparedStatement pst;
            pst = cn.prepareStatement(query);
            pst.setString(1, cmbDistribuidor.getSelectedItem().toString());
            ResultSet rs = pst.executeQuery();
            tblNC.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            Logger.getLogger(Seguimiento.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbDistribuidorItemStateChanged

    private void btnBuscarOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarOCActionPerformed
        try {
            String query = "SELECT \n"
                    + "    a.numeroCotizacion AS 'OC de Proveedor',\n"
                    + "    da.idOrden AS 'N° de nota de venta',\n"
                    + "    a.codigoOrdenCompra AS 'Código de Orden de Compra',\n"
                    + "    a.distribuidor AS 'Distribuidor',\n"
                    + "    CONCAT(SUBSTRING(a.fecha, 9, 2),\n"
                    + "            '-',\n"
                    + "            SUBSTRING(a.fecha, 6, 2),\n"
                    + "            '-',\n"
                    + "            SUBSTRING(a.fecha, 1, 4)) AS 'Fecha de cotización' , "
                    + "    a.proveedor AS 'Proveedor',\n"
                    + "    a.estado AS 'Estado'\n"
                    + "FROM\n"
                    + "    abastecimiento a\n"
                    + "        LEFT JOIN\n"
                    + "    detalle_abastecimiento da ON a.codigoOrdenCompra = da.codigoOrdenCompra\n"
                    + "WHERE\n"
                    + "    a.estado IN ('Comprado' , 'Nota de compra ingresada con productos faltantes',\n"
                    + "        'Enviado a Proveedor') and a.codigoOrdenCompra RLIKE ? \n"
                    + "GROUP BY a.numeroCotizacion;";
            PreparedStatement pst;
            pst = cn.prepareStatement(query);
            pst.setString(1, txtCodigoOrdenCompra.getText());
            ResultSet rs = pst.executeQuery();
            tblNC.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            Logger.getLogger(Seguimiento.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarOCActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String query = "SELECT \n"
                    + "    a.numeroCotizacion AS 'OC de Proveedor',\n"
                    + "    da.idOrden AS 'N° de nota de venta',\n"
                    + "    a.codigoOrdenCompra AS 'Código de Orden de Compra',\n"
                    + "    a.distribuidor AS 'Distribuidor',\n"
                    + "    CONCAT(SUBSTRING(a.fecha, 9, 2),\n"
                    + "            '-',\n"
                    + "            SUBSTRING(a.fecha, 6, 2),\n"
                    + "            '-',\n"
                    + "            SUBSTRING(a.fecha, 1, 4)) AS 'Fecha de cotización' , "
                    + "    a.proveedor AS 'Proveedor',\n"
                    + "    a.estado AS 'Estado'\n"
                    + "FROM\n"
                    + "    abastecimiento a\n"
                    + "        LEFT JOIN\n"
                    + "    detalle_abastecimiento da ON a.codigoOrdenCompra = da.codigoOrdenCompra\n"
                    + "WHERE\n"
                    + "    a.estado IN ('Comprado' , 'Nota de compra ingresada con productos faltantes',\n"
                    + "        'Enviado a Proveedor') and da.idOrden RLIKE ? \n"
                    + "GROUP BY a.numeroCotizacion;\n";
            PreparedStatement pst;
            pst = cn.prepareStatement(query);
            pst.setInt(1, Integer.parseInt(txtNumNV.getText()));
            ResultSet rs = pst.executeQuery();
            tblNC.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(Seguimiento.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblNCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNCMouseClicked
        try {
            Ingreso ingreso = new Ingreso();
            String query = "select nombreBodega,seccion from bodega";
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ingreso.cmbBodega.addItem(rs.getString(1));
                ingreso.cmbSeccionBodega.addItem(rs.getString(2));
            }
            int index = tblNC.getSelectedRow();
            //seleccionarComuna(jComboBox1, jComboBox1);
            ingreso.txtNC.setText(tblNC.getValueAt(index, 0).toString());
            ingreso.lblNC.setText(tblNC.getValueAt(index, 1).toString());
            ingreso.lblEmpresa.setText(tblNC.getValueAt(index, 3).toString());
            ingreso.lblOC.setText(tblNC.getValueAt(index, 2).toString());
            ingreso.setVisible(true);
            ingreso.jButton6.doClick();
            this.dispose();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error " + ex);
        }
    }//GEN-LAST:event_tblNCMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            String query = "SELECT \n"
                    + "    a.numeroCotizacion AS 'OC de Proveedor',\n"
                    + "    da.idOrden AS 'N° de nota de venta',\n"
                    + "    a.codigoOrdenCompra AS 'Código de Orden de Compra',\n"
                    + "    a.distribuidor AS 'Distribuidor',\n"
                    + "    CONCAT(SUBSTRING(a.fecha, 9, 2),\n"
                    + "            '-',\n"
                    + "            SUBSTRING(a.fecha, 6, 2),\n"
                    + "            '-',\n"
                    + "            SUBSTRING(a.fecha, 1, 4)) AS 'Fecha de cotización' , "
                    + "    a.proveedor AS 'Proveedor',\n"
                    + "    a.estado AS 'Estado'\n"
                    + "FROM\n"
                    + "    abastecimiento a\n"
                    + "        LEFT JOIN\n"
                    + "    detalle_abastecimiento da ON a.codigoOrdenCompra = da.codigoOrdenCompra\n"
                    + "WHERE\n"
                    + "    a.estado IN ('Comprado' , 'Nota de compra ingresada con productos faltantes',\n"
                    + "        'Enviado a Proveedor') and a.numeroCotizacion RLIKE ?\n"
                    + "GROUP BY a.numeroCotizacion;";
            PreparedStatement pst;
            pst = cn.prepareStatement(query);
            pst.setInt(1, Integer.parseInt(txtCotizacion.getText()));
            ResultSet rs = pst.executeQuery();
            tblNC.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(Seguimiento.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cmbDistribuidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDistribuidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDistribuidorActionPerformed

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
            java.util.logging.Logger.getLogger(NotaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotaCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarOC;
    private javax.swing.JButton btnReiniciarFiltros;
    private javax.swing.JButton btnSalir3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbDistribuidor;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable tblNC;
    private javax.swing.JTextField txtCodigoOrdenCompra;
    private javax.swing.JTextField txtCotizacion;
    private javax.swing.JTextField txtNumNV;
    // End of variables declaration//GEN-END:variables
}

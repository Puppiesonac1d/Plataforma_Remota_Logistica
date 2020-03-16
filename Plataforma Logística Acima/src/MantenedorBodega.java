
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
public class MantenedorBodega extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conecta();

    public MantenedorBodega() {
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

        jLayeredPane14 = new javax.swing.JLayeredPane();
        jPanel50 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tblBodegas = new javax.swing.JTable();
        jTabbedPane10 = new javax.swing.JTabbedPane();
        jPanel27 = new javax.swing.JPanel();
        txtNombreBodega = new javax.swing.JTextField();
        jLabel137 = new javax.swing.JLabel();
        btnIngresarBodega = new javax.swing.JButton();
        cmbComunaBodega = new javax.swing.JComboBox<>();
        cmbRegionBodega = new javax.swing.JComboBox<>();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel140 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        txtSeccion = new javax.swing.JTextField();
        btnVolver8 = new javax.swing.JButton();
        lblMantenedorBodega = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jLayeredPane14.setPreferredSize(new java.awt.Dimension(1280, 720));

        tblBodegas = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int celIndex){
                return false;
            }
        };
        tblBodegas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane16.setViewportView(tblBodegas);

        jTabbedPane10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        jPanel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNombreBodega.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        jLabel137.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel137.setText("Nombre de Bodega:");

        btnIngresarBodega.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnIngresarBodega.setText("Ingresar Bodega");
        btnIngresarBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarBodegaActionPerformed(evt);
            }
        });

        cmbComunaBodega.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cmbComunaBodega.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Comuna" }));

        cmbRegionBodega.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cmbRegionBodega.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Región" }));
        cmbRegionBodega.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRegionBodegaItemStateChanged(evt);
            }
        });

        jLabel138.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel138.setText("Dirección:");

        jLabel139.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel139.setText("Región:");

        txtDireccion.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        jLabel140.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel140.setText("Comuna:");

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel60.setText("Sección:");

        txtSeccion.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel137))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel60))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel138)
                            .addComponent(jLabel139))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbRegionBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 526, Short.MAX_VALUE)
                        .addComponent(btnIngresarBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSeccion, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(txtNombreBodega))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel140)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbComunaBodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreBodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel137)
                    .addComponent(cmbComunaBodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel140))
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(txtSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel138)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel139)
                            .addComponent(cmbRegionBodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(btnIngresarBodega)
                        .addContainerGap())))
        );

        jTabbedPane10.addTab("Ingresar Bodega", jPanel27);

        btnVolver8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnVolver8.setText("Volver");
        btnVolver8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addComponent(jScrollPane16)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addComponent(jTabbedPane10)
                        .addGap(9, 9, 9))
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addGap(1100, 1100, 1100)
                        .addComponent(btnVolver8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jTabbedPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnVolver8)
                .addContainerGap())
        );

        lblMantenedorBodega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuTest.png"))); // NOI18N

        jLayeredPane14.setLayer(jPanel50, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane14.setLayer(lblMantenedorBodega, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane14Layout = new javax.swing.GroupLayout(jLayeredPane14);
        jLayeredPane14.setLayout(jLayeredPane14Layout);
        jLayeredPane14Layout.setHorizontalGroup(
            jLayeredPane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane14Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addComponent(lblMantenedorBodega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane14Layout.setVerticalGroup(
            jLayeredPane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane14Layout.createSequentialGroup()
                .addComponent(lblMantenedorBodega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
            .addGroup(jLayeredPane14Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarBodegaActionPerformed
        try {
            String query2 = "select idRegion,idComuna from comuna where nombreComuna=?";
            String param = cmbComunaBodega.getSelectedItem().toString();
            PreparedStatement pst2 = cn.prepareStatement(query2);
            pst2.setString(1, param);
            ResultSet rs2 = pst2.executeQuery();
            int comuna = 0;
            while (rs2.next()) {
                comuna = rs2.getInt("idComuna");
            }
            String query3 = "INSERT INTO bodega(`nombreBodega`,`Seccion`, `Direccion`,`idComuna`,`idRegion`) VALUES (?,?,?,?,?)";
            PreparedStatement pst3 = cn.prepareStatement(query3);
            pst3.setString(1, txtNombreBodega.getText());
            pst3.setString(2, txtSeccion.getText());
            pst3.setString(3, txtDireccion.getText());
            pst3.setInt(4, comuna);
            pst3.setInt(5, cmbRegionBodega.getSelectedIndex());
            int up = pst3.executeUpdate();
            JOptionPane.showMessageDialog(null, "Bodega Ingresada: " + txtNombreBodega.getText());
            /*
             Query que permite actualizar los id de cliente
             SET @count = 0;
             UPDATE `cliente` SET `cliente`.`id` = @count:= @count + 1;
             */
            //Poner contador de ID en 0
            String query = "SET @count = 0";
            PreparedStatement count = cn.prepareStatement(query);
            int s = count.executeUpdate();
            //Acualizar
            query = "UPDATE `bodega` SET `bodega`.`idBodega` = @count:= @count + 1";
            PreparedStatement update = cn.prepareStatement(query);
            int u = update.executeUpdate();
            String query5 = "select  idBodega as 'ID de Bodega', nombreBodega as 'Nombre de Bodega', seccion as 'Sección' from bodega";
            PreparedStatement pst = cn.prepareStatement(query5);
            ResultSet rs = pst.executeQuery();
            tblBodegas.setModel(DbUtils.resultSetToTableModel(rs));

            txtNombreBodega.setText("");
            txtSeccion.setText("");
            txtDireccion.setText("");
            cmbRegionBodega.setSelectedIndex(0);
            cmbComunaBodega.setSelectedIndex(0);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnIngresarBodegaActionPerformed

    private void cmbRegionBodegaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRegionBodegaItemStateChanged
        seleccionarComuna(cmbRegionBodega, cmbComunaBodega);
    }//GEN-LAST:event_cmbRegionBodegaItemStateChanged

    private void btnVolver8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver8ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolver8ActionPerformed

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
            java.util.logging.Logger.getLogger(MantenedorBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenedorBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenedorBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenedorBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenedorBodega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarBodega;
    private javax.swing.JButton btnVolver8;
    public javax.swing.JComboBox<String> cmbComunaBodega;
    public javax.swing.JComboBox<String> cmbRegionBodega;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLayeredPane jLayeredPane14;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JLabel lblMantenedorBodega;
    public javax.swing.JTable tblBodegas;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombreBodega;
    private javax.swing.JTextField txtSeccion;
    // End of variables declaration//GEN-END:variables
}

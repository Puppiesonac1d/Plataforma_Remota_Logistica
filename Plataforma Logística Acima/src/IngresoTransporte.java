
import clases.Conexion;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author The_S
 */
public class IngresoTransporte extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conecta();

    public IngresoTransporte() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        btnVolver3 = new javax.swing.JButton();
        jPanel46 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtTransporte = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtDireccionCarga = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        txtProvincia = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        btnTransporte = new javax.swing.JButton();
        jLabel81 = new javax.swing.JLabel();
        cmbZona = new javax.swing.JComboBox<>();
        txtRegion = new javax.swing.JTextField();
        txtComuna = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        btnVolverSalidas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane25 = new javax.swing.JScrollPane();
        tblTransportes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));

        btnVolver3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnVolver3.setText("Volver");
        btnVolver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver3ActionPerformed(evt);
            }
        });

        jPanel46.setBackground(new java.awt.Color(252, 252, 252));
        jPanel46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel43.setText("Transporte:");

        txtContacto.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel44.setText("Contacto:");

        txtTransporte.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransporteActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel45.setText("Telefono:");

        txtTelefono.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel46.setText("Correo:");
        jLabel46.setToolTipText("");

        txtCorreo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel47.setText("Dirección de Carga:");

        txtDireccionCarga.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel49.setText("Provincia");

        txtProvincia.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel57.setText("Región:");

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel58.setText("Comuna:");

        btnTransporte.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnTransporte.setText("Registrar Transporte");
        btnTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransporteActionPerformed(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel81.setText("Zona:");

        cmbZona.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cmbZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Zona", "Zona Norte", "Zona Centro", "Zona Sur" }));

        txtRegion.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtRegion.setEnabled(false);

        txtComuna.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtComuna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtComunaKeyPressed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel48.setText("Ciudad:");

        txtCiudad.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        btnVolverSalidas.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnVolverSalidas.setText("Volver a salidas pendientes");
        btnVolverSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverSalidasActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setText("Exportar a excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTransporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jLabel46)
                            .addComponent(jLabel45)
                            .addComponent(jLabel44)
                            .addComponent(jLabel43)
                            .addComponent(jLabel48)
                            .addComponent(jLabel58)
                            .addComponent(jLabel57)
                            .addComponent(jLabel49)
                            .addComponent(jLabel81))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbZona, 0, 274, Short.MAX_VALUE)
                            .addComponent(txtProvincia)
                            .addComponent(txtRegion)
                            .addComponent(txtComuna)
                            .addComponent(txtCiudad)
                            .addComponent(txtTransporte)
                            .addComponent(txtContacto)
                            .addComponent(txtTelefono)
                            .addComponent(txtCorreo)
                            .addComponent(txtDireccionCarga)))
                    .addComponent(btnVolverSalidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDireccionCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTransporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolverSalidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(43, 43, 43))
        );

        tblTransportes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int celIndex){
                return false;
            }
        };
        tblTransportes.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTransportes.getTableHeader().setReorderingAllowed(false);
        jScrollPane25.setViewportView(tblTransportes);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acima-logo-200p.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnVolver3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolver3ActionPerformed

    private void btnVolverSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverSalidasActionPerformed
        SalidasPendientes salidas = new SalidasPendientes();
        salidas.setVisible(true);

        // this.dispose();
        try {
            String query = "Select s.idSalida as 'Número de Salida',s.idOrden as 'Número de Nota de Venta',s.codigoOrdenCompra as 'Codigo de Orden de Compra',\n"
                    + "s.tipoTransporte as 'Transporte',s.netoTransporte as 'Neto',s.ivaTransporte as 'IVA',s.totalTransporte as 'Total',b.nombreBodega as 'Nombre de Bodega',\n"
                    + "s.seccion as 'Sección',bu.codigoBulto as 'Bulto de Salida', s.fechaSalida as 'Fecha de Solicitud',ordenTransporte as 'Orden de Transporte'\n"
                    + "from salida s join bodega b on s.idBodega=b.idBodega\n"
                    + "join bulto bu on s.codigoOrdenCompra = bu.codigoOrdenCompra\n"
                    + "where s.tipoTransporte='Pendiente';";
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            salidas.tblSalidasPendientes.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        try {

            String query = "SELECT \n"
                    + "    idTransporte AS 'ID',\n"
                    + "    transporte AS 'Transporte',\n"
                    + "    DIRECCIONCARGA AS 'Dirección de Carga',\n"
                    + "    NomComuna AS 'Nombre de Comuna',\n"
                    + "    PROVINCIA AS 'Provincia',\n"
                    + "    NOMREGION AS 'Nombre de Región'\n"
                    + "FROM\n"
                    + "TRANSPORTE;";
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            tblTransportes.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnVolverSalidasActionPerformed

    private void txtTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransporteActionPerformed

    private void btnTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransporteActionPerformed
        try {

            String query = "insert into transporte(`Transporte`, `Contacto`, `Telefono`, `correo`, `DireccionCarga`,ciudad, `nomComuna`, `Provincia`, `nomRegion`, `Zona`) "
                    + "values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setString(1, txtTransporte.getText());
            pst.setString(2, txtContacto.getText());
            pst.setString(3, txtTelefono.getText());
            pst.setString(4, txtCorreo.getText());
            pst.setString(5, txtDireccionCarga.getText());
            pst.setString(6, txtCiudad.getText());
            pst.setString(7, txtComuna.getText());
            pst.setString(8, txtProvincia.getText());
            pst.setString(9, txtRegion.getText());
            pst.setString(10, cmbZona.getSelectedItem().toString());
            int up = pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Transporte Registrado");

            int resp = JOptionPane.showConfirmDialog(null, "¿Desea agregar más destinos?", "La información previa se conservará", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                try {
                    String queryTransportes = "Select * from transporte";
                    PreparedStatement pst3 = cn.prepareStatement(queryTransportes);
                    ResultSet rs3 = pst3.executeQuery();
                    tblTransportes.setModel(DbUtils.resultSetToTableModel(rs3));
                    // JOptionPane.showMessageDialog(null, "LISTO");
                    cmbZona.setSelectedIndex(0);
                    txtComuna.setText("");
                    txtRegion.setText("");
                    txtProvincia.setText("");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            } else {
                try {
                    String queryTransportes = "Select * from transporte";
                    PreparedStatement pst3 = cn.prepareStatement(queryTransportes);
                    ResultSet rs3 = pst3.executeQuery();
                    tblTransportes.setModel(DbUtils.resultSetToTableModel(rs3));
                    // JOptionPane.showMessageDialog(null, "LISTO");
                    txtTransporte.setText("");
                    txtContacto.setText("");
                    txtTelefono.setText("");
                    txtCorreo.setText("");
                    txtDireccionCarga.setText("");
                    cmbZona.setSelectedIndex(0);
                    txtComuna.setText("");
                    txtRegion.setText("");
                    txtProvincia.setText("");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                JOptionPane.showMessageDialog(null, "Se ha finalizado de registrar Transportes");
            }
            txtTransporte.setText("");
            txtContacto.setText("");
            txtTelefono.setText("");
            txtCorreo.setText("");
            txtDireccionCarga.setText("");
            txtCiudad.setText("");
            txtComuna.setText("");
            txtProvincia.setText("");
            txtRegion.setText("");
            cmbZona.setSelectedIndex(0);
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnTransporteActionPerformed

    private void txtComunaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComunaKeyPressed
        try {
            String sql = "SELECT nombreRegion FROM acimabasededatos.comuna c join region r on c.idRegion = r.idRegion where nombrecomuna like ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, txtComuna.getText());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                txtRegion.setText(rs.getString(1));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_txtComunaKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            String ruta = "";

            JFileChooser dlg = new JFileChooser();
            dlg.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            int option = dlg.showOpenDialog(this);

            if (option == JFileChooser.APPROVE_OPTION) {
                File f = dlg.getSelectedFile();
                ruta = f.toString();
            }

            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Transportes");

            Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerFont.setFontHeightInPoints((short) 14);
            headerFont.setColor(IndexedColors.RED.getIndex());

            CellStyle headerCellStyle = workbook.createCellStyle();
            headerCellStyle.setFont(headerFont);

            // Create a Row
            Row headerRow = sheet.createRow(0);

            for (int i = 0; i < tblTransportes.getColumnCount(); i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(tblTransportes.getColumnName(i));
                cell.setCellStyle(headerCellStyle);
            }

            // Create Other rows and cells with contacts data
            int rowNum = 1;

            for (int i = 0; i < tblTransportes.getRowCount(); i++) {
                Row row = sheet.createRow(rowNum++);
                if (tblTransportes.getValueAt(i, 0).toString().isEmpty()) {
                    row.createCell(0).setCellValue("-");
                } else {
                    row.createCell(0).setCellValue(tblTransportes.getValueAt(i, 0).toString());
                }

                if (tblTransportes.getValueAt(i, 1).toString().isEmpty()) {
                    row.createCell(1).setCellValue("-");
                } else {
                    row.createCell(1).setCellValue(tblTransportes.getValueAt(i, 1).toString());
                }

                if (tblTransportes.getValueAt(i, 2).toString().isEmpty()) {
                    row.createCell(2).setCellValue("-");
                } else {
                    row.createCell(2).setCellValue(tblTransportes.getValueAt(i, 2).toString());
                }

                if (tblTransportes.getValueAt(i, 3).toString().isEmpty()) {
                    row.createCell(3).setCellValue("-");
                } else {
                    row.createCell(3).setCellValue(tblTransportes.getValueAt(i, 3).toString());
                }

                if (tblTransportes.getValueAt(i, 4).toString().isEmpty()) {
                    row.createCell(4).setCellValue("-");
                } else {
                    row.createCell(4).setCellValue(tblTransportes.getValueAt(i, 4).toString());
                }

                if (tblTransportes.getValueAt(i, 5).toString().isEmpty()) {
                    row.createCell(5).setCellValue("-");
                } else {
                    row.createCell(5).setCellValue(tblTransportes.getValueAt(i, 5).toString());
                }

                if (tblTransportes.getValueAt(i, 6).toString().isEmpty()) {
                    row.createCell(6).setCellValue("-");
                } else {
                    row.createCell(6).setCellValue(tblTransportes.getValueAt(i, 6).toString());
                }

                if (tblTransportes.getValueAt(i, 7).toString().isEmpty()) {
                    row.createCell(7).setCellValue("-");
                } else {
                    row.createCell(7).setCellValue(tblTransportes.getValueAt(i, 7).toString());
                }

                if (tblTransportes.getValueAt(i, 8).toString().isEmpty()) {
                    row.createCell(8).setCellValue("-");
                } else {
                    row.createCell(8).setCellValue(tblTransportes.getValueAt(i, 8).toString());
                }

                if (tblTransportes.getValueAt(i, 9).toString().isEmpty()) {
                    row.createCell(9).setCellValue("-");
                } else {
                    row.createCell(9).setCellValue(tblTransportes.getValueAt(i, 9).toString());
                }

            }

            // Resize all columns to fit the content size
            for (int i = 0; i < tblTransportes.getColumnCount(); i++) {
                sheet.autoSizeColumn(i);
            }

            try ( // Write the output to a file
                    FileOutputStream fileOut = new FileOutputStream(ruta + "\\" + "transportes.xlsx")) {
                workbook.write(fileOut);
            }
            JOptionPane.showMessageDialog(null, "Documento Creado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: Hay valores vacíos en la tabla..." + ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(IngresoTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoTransporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTransporte;
    private javax.swing.JButton btnVolver3;
    private javax.swing.JButton btnVolverSalidas;
    private javax.swing.JComboBox<String> cmbZona;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane25;
    public javax.swing.JTable tblTransportes;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtComuna;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccionCarga;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtRegion;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTransporte;
    // End of variables declaration//GEN-END:variables
}

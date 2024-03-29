
import clases.Conexion;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author The_S
 */
public class Rendiciones extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conecta();
    LocalDate sistFecha = LocalDate.now();

    public Rendiciones() {
        initComponents();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY", Locale.ENGLISH);
        lbllFecha.setText(sistFecha.getDayOfMonth() + "/" + sistFecha.getMonthValue() + "/" + sistFecha.getYear());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abonarFrame = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblMontoReferencia = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbllFecha = new javax.swing.JLabel();
        btnIngresarAbono = new javax.swing.JButton();
        btnCerrarAbono = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRendicionesHistoricas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAbonar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblMontoCajaChica = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnExportarExcel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtOrdenCompra = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JFormattedTextField();
        btnBuscarFecha = new javax.swing.JButton();

        abonarFrame.setMinimumSize(new java.awt.Dimension(659, 188));
        abonarFrame.setResizable(false);
        abonarFrame.setSize(new java.awt.Dimension(659, 188));

        jLabel5.setText("Monto en caja chica:");

        lblMontoReferencia.setText("0");

        jLabel4.setText("Ingrese Monto:");

        jLabel3.setText("Fecha:");

        lbllFecha.setText("dd-MM-YYYY");

        btnIngresarAbono.setText("Guardar");
        btnIngresarAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAbonoActionPerformed(evt);
            }
        });

        btnCerrarAbono.setText("Cerrar");
        btnCerrarAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarAbonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIngresarAbono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbllFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                            .addComponent(txtMonto)
                            .addComponent(lblMontoReferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCerrarAbono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblMontoReferencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllFecha)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIngresarAbono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarAbono)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abonarFrameLayout = new javax.swing.GroupLayout(abonarFrame.getContentPane());
        abonarFrame.getContentPane().setLayout(abonarFrameLayout);
        abonarFrameLayout.setHorizontalGroup(
            abonarFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abonarFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        abonarFrameLayout.setVerticalGroup(
            abonarFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abonarFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblRendicionesHistoricas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblRendicionesHistoricas);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rendiciones Históricas");

        btnAbonar.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnAbonar.setText("Abonar");
        btnAbonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbonarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Caja Chica:");

        lblMontoCajaChica.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblMontoCajaChica.setText("0");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setText("Rendiciones");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnExportarExcel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnExportarExcel.setText("Exportar Rendiciones a Excel");
        btnExportarExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarExcelActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acima-logo-200p.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("Código de Orden de Compra:");

        txtOrdenCompra.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOrdenCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addContainerGap(482, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtOrdenCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Filtrar por Orden de Compra", jPanel2);

        jLabel8.setText("Fecha:");

        try {
            txtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnBuscarFecha.setText("Buscar");
        btnBuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarFecha)
                .addContainerGap(788, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarFecha))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Filtrar por Fecha", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMontoCajaChica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnAbonar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExportarExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblMontoCajaChica))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbonar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExportarExcel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAbonoActionPerformed
        try {
            int montoAnterior = 0;
            int montoNuevo = 0;
            String queryMaximo = "SELECT monto FROM cajachica ORDER BY idMonto DESC LIMIT 1;";
            PreparedStatement pstMax = cn.prepareStatement(queryMaximo);
            ResultSet rsMax = pstMax.executeQuery();
            while (rsMax.next()) {
                montoAnterior = rsMax.getInt(1);
            }

            montoNuevo = montoAnterior + Integer.parseInt(txtMonto.getText());

            String query = "INSERT INTO cajaChica (monto,movimiento,razon) VALUES (?,?,?)";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setInt(1, montoNuevo);
            pst.setInt(2, Integer.parseInt(txtMonto.getText()));
            pst.setString(3, "Abono");
            int up = pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Abono Ingresado");

            int recargarMonto = 0;
            String queryRefresh = "SELECT monto FROM cajachica ORDER BY idMonto DESC LIMIT 1;";
            PreparedStatement pstRefresh = cn.prepareStatement(queryRefresh);
            ResultSet rsRefresh = pstRefresh.executeQuery();
            while (rsRefresh.next()) {
                recargarMonto = rsRefresh.getInt(1);
            }
            DecimalFormat formatea = new DecimalFormat("###,###.##");

            lblMontoCajaChica.setText("$" + formatea.format(recargarMonto));
            txtMonto.setText("");
            abonarFrame.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Rendiciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIngresarAbonoActionPerformed

    private void btnAbonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbonarActionPerformed
        try {
            abonarFrame.setVisible(true);
            int montoAnterior = 0;
            String queryMaximo = "SELECT monto FROM cajachica ORDER BY idMonto DESC LIMIT 1;";
            PreparedStatement pstMax = cn.prepareStatement(queryMaximo);
            ResultSet rsMax = pstMax.executeQuery();
            while (rsMax.next()) {
                montoAnterior = rsMax.getInt(1);
            }
            DecimalFormat formatea = new DecimalFormat("###,###.##");

            lblMontoReferencia.setText("$" + formatea.format(montoAnterior));
        } catch (SQLException ex) {
            Logger.getLogger(Rendiciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAbonarActionPerformed

    private void btnCerrarAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarAbonoActionPerformed
        try {
            int recargarMonto = 0;
            String queryRefresh = "SELECT monto FROM cajachica ORDER BY idMonto DESC LIMIT 1;";
            PreparedStatement pstRefresh = cn.prepareStatement(queryRefresh);
            ResultSet rsRefresh = pstRefresh.executeQuery();
            while (rsRefresh.next()) {
                recargarMonto = rsRefresh.getInt(1);
            }
            DecimalFormat formatea = new DecimalFormat("###,###.##");

            lblMontoCajaChica.setText("$" + formatea.format(recargarMonto));
            abonarFrame.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Rendiciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCerrarAbonoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        formularioRendicion rendicion = new formularioRendicion();
        rendicion.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            //Cargar las rendiciones...
            String queryRendiciones = "SELECT ordenCompra AS 'ORDEN DE COMPRA', nombreRendicion as 'RENDICIÓN', documento as 'TIPO DE DOCUMENTO',numeroDocumento as 'NÚMERO DE DOCUMENTO', fecha as 'FECHA',\n"
                    + "OBSERVACION AS 'OBSERVACIONES', total as 'GASTO TOTAL' FROM rendicion WHERE ordenCompra RLIKE = ?;";
            PreparedStatement pstRendiciones = cn.prepareStatement(queryRendiciones);
            pstRendiciones.setString(1, txtOrdenCompra.getText());
            ResultSet rsRendiciones = pstRendiciones.executeQuery();
            tblRendicionesHistoricas.setModel(DbUtils.resultSetToTableModel(rsRendiciones));
        } catch (SQLException ex) {
            Logger.getLogger(Rendiciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFechaActionPerformed
        try {
            //Cargar las rendiciones...
            String queryRendiciones = "SELECT ordenCompra AS 'ORDEN DE COMPRA', nombreRendicion as 'RENDICIÓN', documento as 'TIPO DE DOCUMENTO',numeroDocumento as 'NÚMERO DE DOCUMENTO', fecha as 'FECHA',\n"
                    + "OBSERVACION AS 'OBSERVACIONES', total as 'GASTO TOTAL' FROM rendicion WHERE fecha RLIKE = ?;";
            PreparedStatement pstRendiciones = cn.prepareStatement(queryRendiciones);
            pstRendiciones.setString(1, txtFecha.getText());
            ResultSet rsRendiciones = pstRendiciones.executeQuery();
            tblRendicionesHistoricas.setModel(DbUtils.resultSetToTableModel(rsRendiciones));
        } catch (SQLException ex) {
            Logger.getLogger(Rendiciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarFechaActionPerformed

    private void btnExportarExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarExcelActionPerformed
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
            Sheet sheet = workbook.createSheet("Rendiciones Historicas");

            Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerFont.setFontHeightInPoints((short) 14);
            headerFont.setColor(IndexedColors.RED.getIndex());

            CellStyle headerCellStyle = workbook.createCellStyle();
            headerCellStyle.setFont(headerFont);

            // Create a Row
            Row headerRow = sheet.createRow(0);

            for (int i = 0; i < tblRendicionesHistoricas.getColumnCount(); i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(tblRendicionesHistoricas.getColumnName(i));
                cell.setCellStyle(headerCellStyle);
            }

            // Create Other rows and cells with contacts data
            int rowNum = 1;

            for (int i = 0; i < tblRendicionesHistoricas.getRowCount(); i++) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(tblRendicionesHistoricas.getValueAt(i, 0).toString());
                row.createCell(1).setCellValue(tblRendicionesHistoricas.getValueAt(i, 1).toString());
                row.createCell(2).setCellValue(tblRendicionesHistoricas.getValueAt(i, 2).toString());
                row.createCell(3).setCellValue(tblRendicionesHistoricas.getValueAt(i, 3).toString());
                row.createCell(4).setCellValue(tblRendicionesHistoricas.getValueAt(i, 4).toString());
                row.createCell(5).setCellValue(tblRendicionesHistoricas.getValueAt(i, 5).toString());
                row.createCell(6).setCellValue(tblRendicionesHistoricas.getValueAt(i, 6).toString());
            }

            // Resize all columns to fit the content size
            for (int i = 0; i < tblRendicionesHistoricas.getColumnCount(); i++) {
                sheet.autoSizeColumn(i);
            }

            Sheet sheet2 = workbook.createSheet("Caja Chica");
            JTable tablaCajaChica = new JTable();

            //SELECT IDMONTO AS 'ID',MONTO AS 'MONTO',MOVIMIENTO AS 'MOVIMIENTO',RAZON AS 'TIPO DE MOVIMIENTO',FECHAMOFIMIENTO AS 'FECHA DE MOVIMIENTO' FROM CAJACHICA;
            String query = "SELECT IDMONTO AS 'ID',MONTO AS 'MONTO',MOVIMIENTO AS 'MOVIMIENTO',RAZON AS 'TIPO DE MOVIMIENTO',FECHAMOVIMIENTO AS 'FECHA DE MOVIMIENTO' FROM CAJACHICA;";
            PreparedStatement pst;
            pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            tablaCajaChica.setModel(DbUtils.resultSetToTableModel(rs));

            Font headerFont2 = workbook.createFont();
            headerFont2.setBold(true);
            headerFont2.setFontHeightInPoints((short) 14);
            headerFont2.setColor(IndexedColors.RED.getIndex());

            CellStyle headerCellStyle2 = workbook.createCellStyle();
            headerCellStyle2.setFont(headerFont2);

            // Create a Row
            Row headerRow2 = sheet2.createRow(0);

            for (int i = 0; i < tablaCajaChica.getColumnCount(); i++) {
                Cell cell = headerRow2.createCell(i);
                cell.setCellValue(tablaCajaChica.getColumnName(i));
                cell.setCellStyle(headerCellStyle2);
            }

            // Create Other rows and cells with contacts data
            int rowNum2 = 1;

            for (int i = 0; i < tablaCajaChica.getRowCount(); i++) {
                Row row = sheet2.createRow(rowNum2++);
                row.createCell(0).setCellValue(tablaCajaChica.getValueAt(i, 0).toString());
                row.createCell(1).setCellValue(tablaCajaChica.getValueAt(i, 1).toString());
                row.createCell(2).setCellValue(tablaCajaChica.getValueAt(i, 2).toString());
                row.createCell(3).setCellValue(tablaCajaChica.getValueAt(i, 3).toString());
                row.createCell(4).setCellValue(tablaCajaChica.getValueAt(i, 4).toString());

            }

            // Resize all columns to fit the content size
            for (int i = 0; i < tablaCajaChica.getColumnCount(); i++) {
                sheet2.autoSizeColumn(i);
            }

            try ( // Write the output to a file
                    FileOutputStream fileOut = new FileOutputStream(ruta + "\\" + "rendiciones_historicas_caja_chica_historica.xlsx")) {
                workbook.write(fileOut);
            }
            JOptionPane.showMessageDialog(null, "Documento Creado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + ex);
        }
    }//GEN-LAST:event_btnExportarExcelActionPerformed

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
            java.util.logging.Logger.getLogger(Rendiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rendiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rendiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rendiciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rendiciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame abonarFrame;
    private javax.swing.JButton btnAbonar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarFecha;
    private javax.swing.JButton btnCerrarAbono;
    private javax.swing.JButton btnExportarExcel;
    private javax.swing.JButton btnIngresarAbono;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JLabel lblMontoCajaChica;
    private javax.swing.JLabel lblMontoReferencia;
    private javax.swing.JLabel lbllFecha;
    public javax.swing.JTable tblRendicionesHistoricas;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtOrdenCompra;
    // End of variables declaration//GEN-END:variables
}

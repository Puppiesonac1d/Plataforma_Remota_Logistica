
import clases.Conexion;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilderFactory;
import net.proteanit.sql.DbUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author The_S
 */
public class HistorialNV extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conecta();

    public HistorialNV() {
        initComponents();

        TableColorCellRenderer renderer = new TableColorCellRenderer();
        tblHistorialNV.setDefaultRenderer(Object.class, renderer);
        this.repaint();
    }

    public class TableColorCellRenderer implements TableCellRenderer {

        private final TableCellRenderer RENDERER = new DefaultTableCellRenderer();

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            int index = tblHistorialNV.getSelectedRow();

            if (row == index) {
                c.setBackground(new Color(57, 105, 138));
                c.setForeground(Color.WHITE);
            } else if (row % 2 == 0) {
                c.setBackground(Color.WHITE);
                c.setForeground(Color.BLACK);
                if (column != 3) {
                    c.setBackground(Color.WHITE);
                    c.setForeground(Color.BLACK);
                }
                if (column
                        == 3) {
                    if (tblHistorialNV.getValueAt(row, 3).toString().equals("1.- DISPONIBLE PARA DESPACHO")) {
                        c.setBackground(Color.cyan);
                        c.setForeground(Color.BLACK);
                    }
                    if (tblHistorialNV.getValueAt(row, 3).toString().equals("2.- DESPACHO INCOMPLETO")) {
                        c.setBackground(Color.YELLOW);
                        c.setForeground(Color.BLACK);

                    }
                    if (tblHistorialNV.getValueAt(row, 3).toString().equals("3.- NO DISPONIBLE PARA DESPACHO")) {
                        c.setBackground(Color.RED);
                        c.setForeground(Color.BLACK);

                    }
                    if (tblHistorialNV.getValueAt(row, 3).toString().equals("4.- DESPACHO FINALIZADO")) {
                        c.setBackground(Color.green);
                        c.setForeground(Color.BLACK);

                    }
                }
            } else {
                c.setBackground(new Color(242, 242, 242));
                c.setForeground(Color.BLACK);
                if (column != 3) {
                    c.setBackground(Color.WHITE);
                    c.setForeground(Color.BLACK);

                }
                if (column
                        == 3) {
                    if (tblHistorialNV.getValueAt(row, 3).toString().equals("1.- DISPONIBLE PARA DESPACHO")) {
                        c.setBackground(Color.cyan);
                        c.setForeground(Color.BLACK);
                    }
                    if (tblHistorialNV.getValueAt(row, 3).toString().equals("2.- DESPACHO INCOMPLETO")) {
                        c.setBackground(Color.YELLOW);
                        c.setForeground(Color.BLACK);

                    }
                    if (tblHistorialNV.getValueAt(row, 3).toString().equals("3.- NO DISPONIBLE PARA DESPACHO")) {
                        c.setBackground(Color.RED);
                        c.setForeground(Color.BLACK);

                    }
                    if (tblHistorialNV.getValueAt(row, 3).toString().equals("4.- DESPACHO FINALIZADO")) {
                        c.setBackground(Color.green);
                        c.setForeground(Color.BLACK);

                    }
                }
            }

            return c;
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNV = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoOC = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        txtFechaOC = new javax.swing.JFormattedTextField();
        jPanel43 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        tblHistorialNV = new javax.swing.JTable();
        btnVolverMenu9 = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        lblIDUsuario = new javax.swing.JLabel();
        btnGenerarPDFNV = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOC = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBDD = new javax.swing.JTable();
        btnRendiciones = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(247, 247, 247));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Número de Nota de Venta:");

        txtNV.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNV, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addContainerGap(472, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buscar por N° de Nota de Venta", jPanel3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Código de OC:");

        txtCodigoOC.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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
                .addComponent(txtCodigoOC, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(483, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Filtrar por Código de OC", jPanel1);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Fecha de envío de OC:");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        try {
            txtFechaOC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFechaOC.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaOC, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(486, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFechaOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Filtrar por Fecha", jPanel2);

        tblHistorialNV = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int celIndex){
                return false;
            }
        };
        tblHistorialNV.setModel(new javax.swing.table.DefaultTableModel(
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
        tblHistorialNV.getTableHeader().setReorderingAllowed(false);
        tblHistorialNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHistorialNVMouseClicked(evt);
            }
        });
        jScrollPane19.setViewportView(tblHistorialNV);

        btnVolverMenu9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnVolverMenu9.setText("Volver");
        btnVolverMenu9.setMaximumSize(new java.awt.Dimension(238, 35));
        btnVolverMenu9.setMinimumSize(new java.awt.Dimension(238, 35));
        btnVolverMenu9.setPreferredSize(new java.awt.Dimension(238, 35));
        btnVolverMenu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenu9ActionPerformed(evt);
            }
        });

        lblCodigo.setVisible(false);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton6.setText("Reiniciar Filtros");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btnSalida.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnSalida.setText("Salidas Pendientes");
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });

        lblIDUsuario.setVisible(false);
        lblIDUsuario.setText("-");

        btnGenerarPDFNV.setVisible(false);
        btnGenerarPDFNV.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnGenerarPDFNV.setText("Imprimir OC / NV");
        btnGenerarPDFNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFNVActionPerformed(evt);
            }
        });

        jScrollPane1.setVisible(false);

        tblOC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código / ID licitación CM", "Producto", "Cantidad", "Especificación de Comprador", "Especificación de Proveedor", "Moneda", "Precio Unitario", "Descuento", "Cargos", "Valor Total"
            }
        ));
        tblOC.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblOC);

        jScrollPane2.setVisible(false);

        tblBDD.setVisible(true);
        tblBDD.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblBDD);

        btnRendiciones.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnRendiciones.setText("Rendiciones");
        btnRendiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRendicionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jScrollPane19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnRendiciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenerarPDFNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolverMenu9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(8, 8, 8)
                        .addComponent(btnSalida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRendiciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGenerarPDFNV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVolverMenu9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIDUsuario)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCodigo)
                .addContainerGap())
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acima-logo-200p.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMenu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenu9ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverMenu9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            String query = "SELECT \n"
                    + "    dot.idOrden AS 'Número de Nota de Venta',\n"
                    + "    CONCAT(SUBSTRING(ot.fechaEnvioOC, 9, 2),\n"
                    + "            '-',\n"
                    + "            SUBSTRING(ot.fechaEnvioOC, 6, 2),\n"
                    + "            '-',\n"
                    + "            SUBSTRING(ot.fechaEnvioOC, 1, 4)) AS 'Fecha de Envío de OC',\n"
                    + "    dot.codigoOrdenCompra AS 'Código de Orden de Compra',\n"
                    + "    CASE\n"
                    + "        WHEN\n"
                    + "            SUM(DOT.CANTIDAD) = (SELECT \n"
                    + "                    SUM(stockrestado)\n"
                    + "                FROM\n"
                    + "                    detallesalida ds\n"
                    + "                WHERE\n"
                    + "                    ds.idorden = dot.idorden)\n"
                    + "        THEN\n"
                    + "            '4.- DESPACHO FINALIZADO'\n"
                    + "        WHEN\n"
                    + "            SUM(DOT.CANTIDAD) > (SELECT \n"
                    + "                    SUM(stockrestado)\n"
                    + "                FROM\n"
                    + "                    detallesalida ds\n"
                    + "                WHERE\n"
                    + "                    ds.idorden = dot.idorden)\n"
                    + "        THEN\n"
                    + "            '2.- DESPACHO INCOMPLETO'\n"
                    + "        WHEN\n"
                    + "            COUNT(DOT.DISPONIBILIDAD) = COUNT(DOT.CODIGOPRODUCTO)\n"
                    + "                AND DOT.DISPONIBILIDAD = 'Producto Ingresado'\n"
                    + "        THEN\n"
                    + "            '1.- DISPONIBLE PARA DESPACHO'\n"
                    + "        ELSE '3.- NO DISPONIBLE PARA DESPACHO'\n"
                    + "    END 'Estado'\n"
                    + "FROM\n"
                    + "    detalleordentrabajo dot\n"
                    + "        LEFT JOIN\n"
                    + "    ordenTrabajo ot ON ot.idOrden = dot.idOrden \n"
                    + "WHERE ot.codigoOrdenCompra = ?\n"
                    + "GROUP BY DOT.IDORDEN\n"
                    + "ORDER BY ESTADO ASC, ot.fechaenviooc asc;\n";
            PreparedStatement pst;
            pst = cn.prepareStatement(query);
            pst.setString(1, txtCodigoOC.getText());
            ResultSet rs = pst.executeQuery();
            tblHistorialNV.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //SELECT * FROM acimabasededatos.ordentrabajo where LEFT(fechaEnvioOC, 10) RLIKE 
        try {
            String dia = txtFechaOC.getText().substring(0, 2);
            String mes = txtFechaOC.getText().substring(3, 5);
            String anio = txtFechaOC.getText().substring(6, 10);
            String fecha = anio + "-" + mes + "-" + dia;
            System.out.println(fecha);
            String query = "SELECT \n"
                    + "    dot.idOrden AS 'Número de Nota de Venta',\n"
                    + "    CONCAT(SUBSTRING(ot.fechaEnvioOC, 9, 2),\n"
                    + "            '-',\n"
                    + "            SUBSTRING(ot.fechaEnvioOC, 6, 2),\n"
                    + "            '-',\n"
                    + "            SUBSTRING(ot.fechaEnvioOC, 1, 4)) AS 'Fecha de Envío de OC',\n"
                    + "    dot.codigoOrdenCompra AS 'Código de Orden de Compra',\n"
                    + "    CASE\n"
                    + "        WHEN\n"
                    + "            SUM(DOT.CANTIDAD) = (SELECT \n"
                    + "                    SUM(stockrestado)\n"
                    + "                FROM\n"
                    + "                    detallesalida ds\n"
                    + "                WHERE\n"
                    + "                    ds.idorden = dot.idorden)\n"
                    + "        THEN\n"
                    + "            '4.- DESPACHO FINALIZADO'\n"
                    + "        WHEN\n"
                    + "            SUM(DOT.CANTIDAD) > (SELECT \n"
                    + "                    SUM(stockrestado)\n"
                    + "                FROM\n"
                    + "                    detallesalida ds\n"
                    + "                WHERE\n"
                    + "                    ds.idorden = dot.idorden)\n"
                    + "        THEN\n"
                    + "            '2.- DESPACHO INCOMPLETO'\n"
                    + "        WHEN\n"
                    + "            COUNT(DOT.DISPONIBILIDAD) = COUNT(DOT.CODIGOPRODUCTO)\n"
                    + "                AND DOT.DISPONIBILIDAD = 'Producto Ingresado'\n"
                    + "        THEN\n"
                    + "            '1.- DISPONIBLE PARA DESPACHO'\n"
                    + "        ELSE '3.- NO DISPONIBLE PARA DESPACHO'\n"
                    + "    END 'Estado'\n"
                    + "FROM\n"
                    + "    detalleordentrabajo dot\n"
                    + "        LEFT JOIN\n"
                    + "    ordenTrabajo ot ON ot.idOrden = dot.idOrden\n"
                    + "WHERE LEFT(ot.fechaEnvioOC, 10) RLIKE ? "
                    + "GROUP BY DOT.IDORDEN\n"
                    + "ORDER BY ESTADO ASC, ot.fechaenviooc asc;";
            PreparedStatement pst;
            pst = cn.prepareStatement(query);
            pst.setString(1, fecha);
            ResultSet rs = pst.executeQuery();
            tblHistorialNV.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            String query = "SELECT \n"
                    + "    dot.idOrden AS 'Número de Nota de Venta',\n"
                    + "    CONCAT(SUBSTRING(ot.fechaEnvioOC, 9, 2),\n"
                    + "            '-',\n"
                    + "            SUBSTRING(ot.fechaEnvioOC, 6, 2),\n"
                    + "            '-',\n"
                    + "            SUBSTRING(ot.fechaEnvioOC, 1, 4)) AS 'Fecha de Envío de OC',\n"
                    + "    dot.codigoOrdenCompra AS 'Código de Orden de Compra',\n"
                    + "    CASE\n"
                    + "        WHEN\n"
                    + "            SUM(DOT.CANTIDAD) = (SELECT \n"
                    + "                    SUM(stockrestado)\n"
                    + "                FROM\n"
                    + "                    detallesalida ds\n"
                    + "                WHERE\n"
                    + "                    ds.idorden = dot.idorden)\n"
                    + "        THEN\n"
                    + "            '4.- DESPACHO FINALIZADO'\n"
                    + "        WHEN\n"
                    + "            SUM(DOT.CANTIDAD) > (SELECT \n"
                    + "                    SUM(stockrestado)\n"
                    + "                FROM\n"
                    + "                    detallesalida ds\n"
                    + "                WHERE\n"
                    + "                    ds.idorden = dot.idorden)\n"
                    + "        THEN\n"
                    + "            '2.- DESPACHO INCOMPLETO'\n"
                    + "        WHEN\n"
                    + "            COUNT(DOT.DISPONIBILIDAD) = COUNT(DOT.CODIGOPRODUCTO)\n"
                    + "                AND DOT.DISPONIBILIDAD = 'Producto Ingresado'\n"
                    + "        THEN\n"
                    + "            '1.- DISPONIBLE PARA DESPACHO'\n"
                    + "        ELSE '3.- NO DISPONIBLE PARA DESPACHO'\n"
                    + "    END 'Estado'\n"
                    + "FROM\n"
                    + "    detalleordentrabajo dot\n"
                    + "        LEFT JOIN\n"
                    + "    ordenTrabajo ot ON ot.idOrden = dot.idOrden\n"
                    + "GROUP BY DOT.IDORDEN\n"
                    + "ORDER BY ESTADO ASC, ot.fechaenviooc asc;";
            PreparedStatement pst;
            pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            tblHistorialNV.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tblHistorialNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHistorialNVMouseClicked
        TableColorCellRenderer renderer = new TableColorCellRenderer();
        tblHistorialNV.setDefaultRenderer(Object.class, renderer);
        this.repaint();

        String[] options = new String[]{"Salida de Mercadería", "Imprimir Nota de Venta", "Cancelar"};
        int resp = JOptionPane.showOptionDialog(null, "Elija una operación", null,
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);
        switch (resp) {
            case 0:
                try {
                    int index = tblHistorialNV.getSelectedRow();
                    String nv = tblHistorialNV.getValueAt(index, 0).toString();
                    String oc = tblHistorialNV.getValueAt(index, 2).toString();
                    Salida salida = new Salida();
                    salida.txtCodigoOTSalida.setText(nv);
                    salida.lblOC.setText(oc);
                    salida.setVisible(true);
                    String queryBodega = "select nombreBodega from bodega ORDER BY nombreBodega";
                    PreparedStatement pstBodega = cn.prepareStatement(queryBodega);
                    ResultSet rsBodega = pstBodega.executeQuery();
                    while (rsBodega.next()) {
                        salida.cmbBodegaSalida.addItem(rsBodega.getString(1));
                    }
                    salida.btnBuscarOTSalida.doClick();
                    salida.lblID.setText(lblIDUsuario.getText());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No hay una nota seleccionada" + ex.getMessage());
                }
                break;
            case 1:
                btnGenerarPDFNV.doClick();
                break;
            default:
                JOptionPane.showMessageDialog(null, "No se realizará una acción");
                break;
        }

    }//GEN-LAST:event_tblHistorialNVMouseClicked

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        SalidasPendientes salidas = new SalidasPendientes();
        salidas.setVisible(true);

        // this.dispose();
        try {
            String query = "SELECT \n"
                    + "    s.idSalida AS 'Número de Salida',\n"
                    + "    s.idOrden AS 'Número de Nota de Venta',\n"
                    + "    s.codigoOrdenCompra AS 'Codigo de Orden de Compra',\n"
                    + "    s.tipoTransporte AS 'Transporte',\n"
                    + "    s.netoTransporte AS 'Neto',\n"
                    + "    s.ivaTransporte AS 'IVA',\n"
                    + "    s.totalTransporte AS 'Total',\n"
                    + "    b.nombreBodega AS 'Nombre de Bodega',\n"
                    + "    s.seccion AS 'Sección',\n"
                    + "    bu.codigoBulto AS 'Bulto de Salida',\n"
                    + "    s.fechaSalida AS 'Fecha de Solicitud',\n"
                    + "    ordenTransporte AS 'Orden de Transporte'\n"
                    + "FROM\n"
                    + "    salida s\n"
                    + "        LEFT JOIN\n"
                    + "    bodega b ON s.idBodega = b.idBodega\n"
                    + "        LEFT JOIN\n"
                    + "    bulto bu ON s.codigoOrdenCompra = bu.codigoOrdenCompra\n"
                    + "WHERE\n"
                    + "    s.tipoTransporte = 'Pendiente'\n"
                    + "    group by s.idOrden;";
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
            salidas.tblTransportes.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnSalidaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            String query = "SELECT \n"
                    + "    dot.idOrden AS 'Número de Nota de Venta',\n"
                    + "    CONCAT(SUBSTRING(ot.fechaEnvioOC, 9, 2),\n"
                    + "            '-',\n"
                    + "            SUBSTRING(ot.fechaEnvioOC, 6, 2),\n"
                    + "            '-',\n"
                    + "            SUBSTRING(ot.fechaEnvioOC, 1, 4)) AS 'Fecha de Envío de OC',\n"
                    + "    dot.codigoOrdenCompra AS 'Código de Orden de Compra',\n"
                    + "    CASE\n"
                    + "        WHEN\n"
                    + "            SUM(DOT.CANTIDAD) = (SELECT \n"
                    + "                    SUM(stockrestado)\n"
                    + "                FROM\n"
                    + "                    detallesalida ds\n"
                    + "                WHERE\n"
                    + "                    ds.idorden = dot.idorden)\n"
                    + "        THEN\n"
                    + "            '4.- DESPACHO FINALIZADO'\n"
                    + "        WHEN\n"
                    + "            SUM(DOT.CANTIDAD) > (SELECT \n"
                    + "                    SUM(stockrestado)\n"
                    + "                FROM\n"
                    + "                    detallesalida ds\n"
                    + "                WHERE\n"
                    + "                    ds.idorden = dot.idorden)\n"
                    + "        THEN\n"
                    + "            '2.- DESPACHO INCOMPLETO'\n"
                    + "        WHEN\n"
                    + "            COUNT(DOT.DISPONIBILIDAD) = COUNT(DOT.CODIGOPRODUCTO)\n"
                    + "                AND DOT.DISPONIBILIDAD = 'Producto Ingresado'\n"
                    + "        THEN\n"
                    + "            '1.- DISPONIBLE PARA DESPACHO'\n"
                    + "        ELSE '3.- NO DISPONIBLE PARA DESPACHO'\n"
                    + "    END 'Estado'\n"
                    + "FROM\n"
                    + "    detalleordentrabajo dot\n"
                    + "        LEFT JOIN\n"
                    + "    ordenTrabajo ot ON ot.idOrden = dot.idOrden\n"
                    + "WHERE ot.idOrden = ? \n"
                    + "GROUP BY DOT.IDORDEN\n"
                    + "ORDER BY ESTADO ASC, ot.fechaenviooc asc;";
            PreparedStatement pst;
            pst = cn.prepareStatement(query);
            pst.setString(1, txtNV.getText());
            ResultSet rs = pst.executeQuery();
            tblHistorialNV.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGenerarPDFNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFNVActionPerformed
        try {
            int index = tblHistorialNV.getSelectedRow();
            String oc = tblHistorialNV.getValueAt(index, 2).toString();
            if (index != 0 && oc != null) {
                //código de orden de compra

                //Variables
                String notaVenta = tblHistorialNV.getValueAt(index, 0).toString();
                String fechaEnvioOC = "";
                String estadoOC = "";
                String unidadCompra = "";
                String rutComprador = "";
                String direccionDemandante = "";
                String demandante = "";
                String telefonoDemandante = "";
                String emailContacto = "";
                String nombreProveedor = "";
                String direccionProveedor = "";
                String rutProveedor = "";
                String nombreContactoProveedor = "";
                String fonoProveedor = "";
                String fechaAceptacion = "";
                String nombreOC = "";
                String direccionDespacho = "";
                String direccionEnvioFactura = "";
                String metodoDespacho = "";
                String contactoPago = "";
                String formaPago = "";
                String contactoOC = "";
                String netoOC = "";
                String dctoOC = "";
                String cargosOC = "";
                String subTotalOC = "";
                String ivaOC = "";
                String impuestoEspecificoOC = "";
                String totalOC = "";
                String observacionOC = "";

                //En esta sección se ingresa el Request para que la "API", digamosle así xd y posteriormente entrega el resultado del mismo.
                String format = "xml";
                String url = "http://api.mercadopublico.cl/servicios/v1/publico/ordenesdecompra.xml?codigo=" + oc + "&ticket=210555F9-8B7E-48ED-93ED-2504CAD3B155";
                System.out.println(url);
                //Se crea un obj de tipo url con el cual se realizará el request
                URL obj;

                obj = new URL(url);

                HttpURLConnection con;

                con = (HttpURLConnection) obj.openConnection();

                int responseCode;

                responseCode = con.getResponseCode();

                //Por motivos de Debug, se necesita el codigo de respuesta
                System.out.println("Código de Respuesta : " + responseCode);
                StringBuffer response = null;
                try (BufferedReader in = new BufferedReader(
                        new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8))) {
                    String inputLine;
                    response = new StringBuffer();
                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);

                    }
                } catch (IOException ex) {
                    Logger.getLogger(HistorialOC.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
                //print in String
                // System.out.println(response.toString());
                org.w3c.dom.Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(response.toString())));
                //Aqui segun el TAG del XML va a poder obtener los elementos...
                //Obedeciendo el orden del documento, los tags son los siguientes...

                NodeList ordenes = doc.getElementsByTagName("Ordenes");
                if (ordenes.getLength() > 0) {
                    Element err = (Element) ordenes.item(0);
                    fechaEnvioOC = err.getElementsByTagName("FechaCreacion").item(0).getTextContent();
                    estadoOC = err.getElementsByTagName("Estado").item(0).getTextContent();
                    unidadCompra = err.getElementsByTagName("NombreUnidad").item(0).getTextContent();

                } else {
                    // success
                }

                NodeList comprador = doc.getElementsByTagName("Comprador");
                if (comprador.getLength() > 0) {
                    Element err = (Element) comprador.item(0);
                    rutComprador = err.getElementsByTagName("RutUnidad").item(0).getTextContent();
                    direccionDemandante = err.getElementsByTagName("DireccionUnidad").item(0).getTextContent();
                    demandante = err.getElementsByTagName("NombreOrganismo").item(0).getTextContent();
                    telefonoDemandante = err.getElementsByTagName("FonoContacto").item(0).getTextContent();
                    emailContacto = err.getElementsByTagName("MailContacto").item(0).getTextContent();
                } else {
                    // success
                }

                NodeList proveedor = doc.getElementsByTagName("Proveedor");
                if (proveedor.getLength() > 0) {
                    Element err = (Element) proveedor.item(0);
                    nombreProveedor = err.getElementsByTagName("Nombre").item(0).getTextContent();
                    direccionProveedor = err.getElementsByTagName("Direccion").item(0).getTextContent();
                    rutProveedor = err.getElementsByTagName("RutSucursal").item(0).getTextContent();
                    nombreContactoProveedor = err.getElementsByTagName("NombreContacto").item(0).getTextContent();
                    fonoProveedor = err.getElementsByTagName("FonoContacto").item(0).getTextContent();
                } else {
                    // success
                }

                NodeList fechas = doc.getElementsByTagName("Fechas");
                if (fechas.getLength() > 0) {
                    Element err = (Element) fechas.item(0);
                    fechaEnvioOC = err.getElementsByTagName("FechaCreacion").item(0).getTextContent();
                    fechaAceptacion = err.getElementsByTagName("FechaAceptacion").item(0).getTextContent();
                } else {
                    // success
                }

                NodeList detalleOrden = doc.getElementsByTagName("OrdenCompra");
                if (detalleOrden.getLength() > 0) {
                    Element err = (Element) detalleOrden.item(0);
                    nombreOC = (err.getElementsByTagName("Nombre").item(0).getTextContent());
                    direccionDespacho = (err.getElementsByTagName("DireccionUnidad").item(0).getTextContent() + " "
                            + err.getElementsByTagName("ComunaUnidad").item(0).getTextContent() + " " + err.getElementsByTagName("RegionUnidad").item(0).getTextContent());
                    direccionEnvioFactura = err.getElementsByTagName("DireccionUnidad").item(0).getTextContent() + " "
                            + err.getElementsByTagName("ComunaUnidad").item(0).getTextContent() + " "
                            + err.getElementsByTagName("RegionUnidad").item(0).getTextContent();
                    metodoDespacho = err.getElementsByTagName("TipoDespacho").item(0).getTextContent();
                    contactoPago = err.getElementsByTagName("NombreContacto").item(0).getTextContent() + " "
                            + err.getElementsByTagName("FonoContacto").item(0).getTextContent() + " "
                            + err.getElementsByTagName("MailContacto").item(0).getTextContent();
                    formaPago = err.getElementsByTagName("FormaPago").item(0).getTextContent();
                    contactoOC = err.getElementsByTagName("NombreContacto").item(0).getTextContent();
                } else {
                    // success
                }

                NodeList flowList0 = doc.getElementsByTagName("Listado");
                Element err1 = (Element) flowList0.item(0);
                int num = Integer.parseInt(err1.getElementsByTagName("Cantidad").item(0).getTextContent());
                System.out.println(num + "");
                NodeList flowList1 = doc.getElementsByTagName("Listado");
                DefaultTableModel modelo = (DefaultTableModel) tblOC.getModel();

                for (int m = 0; m < tblOC.getRowCount(); m++) {
                    modelo.removeRow(m);
                }
                modelo.setRowCount(num);
                try {
                    for (int x = 0; x < num; x++) {
                        System.out.println("Listado " + flowList1.getLength());

                        NodeList flowList = doc.getElementsByTagName("Item");
                        for (int i = 0; i < flowList.getLength(); i++) {
                            Element err = (Element) flowList.item(x);

                            String str = err.getElementsByTagName("EspecificacionComprador").item(0).getTextContent();
                            if (str.contains("(") && str.contains(")")) {
                                //Contiene o no
                                String answer = str.substring(str.indexOf("(") + 1, str.indexOf(")"));
                                modelo.setValueAt(answer, x, 0);
                            } else {
                                modelo.setValueAt("-", x, 0);
                            }

                            modelo.setValueAt(err.getElementsByTagName("EspecificacionComprador").item(0).getTextContent(), x, 1);
                            modelo.setValueAt(err.getElementsByTagName("Cantidad").item(0).getTextContent(), x, 2);
                            modelo.setValueAt(err.getElementsByTagName("Moneda").item(0).getTextContent(), x, 3);
                            modelo.setValueAt(err.getElementsByTagName("PrecioNeto").item(0).getTextContent(), x, 4);
                            modelo.setValueAt(err.getElementsByTagName("TotalDescuentos").item(0).getTextContent(), x, 5);
                            modelo.setValueAt(err.getElementsByTagName("TotalCargos").item(0).getTextContent(), x, 6);
                            modelo.setValueAt(err.getElementsByTagName("Total").item(0).getTextContent(), x, 7);
                        }
                    }
                } catch (Exception ex) {
                    System.out.println("Error cargando tabla: " + ex);
                }

                NodeList detalleMontos = doc.getElementsByTagName("OrdenCompra");

                if (detalleMontos.getLength()
                        > 0) {
                    Element err = (Element) detalleMontos.item(0);
                    netoOC = ("$" + err.getElementsByTagName("TotalNeto").item(0).getTextContent());
                    dctoOC = ("$" + err.getElementsByTagName("Descuentos").item(0).getTextContent());
                    cargosOC = ("$" + err.getElementsByTagName("Cargos").item(0).getTextContent());
                    subTotalOC = Double.toString((Double.parseDouble(netoOC.substring(1).replace(",", ".")) - Double.parseDouble(dctoOC.substring(1).replace(",", "."))));
                    ivaOC = ("$" + err.getElementsByTagName("Impuestos").item(0).getTextContent());
                    impuestoEspecificoOC = ("$" + err.getElementsByTagName("TotalImpuestos").item(0).getTextContent());
                    totalOC = ("$" + err.getElementsByTagName("Total").item(0).getTextContent());

                } else {
                    // success
                }
                NodeList descripcion = doc.getElementsByTagName("OrdenCompra");

                if (descripcion.getLength()
                        > 0) {
                    Element err = (Element) descripcion.item(0);
                    observacionOC = (err.getElementsByTagName("Descripcion").item(0).getTextContent());
                } else {
                    // success
                }
                System.out.println("La consulta fue realizada con éxito");

                //Consultar Tabla de notas de venta a partir de la OC
                try {
                    String query = "Select idOrden as 'N° de NV', \n"
                            + "codigoOrdenCompra as 'Código Orden Compra',\n"
                            + "codigoProducto as 'Código / ID licitación',\n"
                            + "nombreProducto as 'Producto',\n"
                            + "cantidad as 'Cantidad',\n"
                            + "moneda as 'Moneda',\n"
                            + "precioUnitario as 'Precio Unitario',\n"
                            + "descuento as 'Descuento',\n"
                            + "cargos as 'Cargos',\n"
                            + "valorTotal as 'Total'\n"
                            + "from detalleordentrabajo\n"
                            + "where codigoOrdenCompra = ?;";
                    String param = oc;
                    PreparedStatement pst = cn.prepareStatement(query);
                    pst.setString(1, param);
                    java.sql.ResultSet rs = pst.executeQuery();
                    tblBDD.setModel(DbUtils.resultSetToTableModel(rs));

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + ex);
                }

                //Documento
                String ruta = "";

                JFileChooser dlg = new JFileChooser();
                dlg.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

                int option = dlg.showOpenDialog(this);

                if (option == JFileChooser.APPROVE_OPTION) {
                    File f = dlg.getSelectedFile();
                    ruta = f.toString();
                }

                //Fecha
                Date sistFecha = new Date();
                SimpleDateFormat formato = new SimpleDateFormat("dd-MMM-YYYY");
                //Crear PDF
                try {

                    Document docPDF = new Document(PageSize.A4);

                    Date sistHora = new Date();
                    String pmAm = "hh:mm a";
                    SimpleDateFormat format2 = new SimpleDateFormat(pmAm);
                    Calendar hoy = Calendar.getInstance();
                    String hora = (String.format(format2.format(sistHora), hoy));
                    hora = hora.replace(":", "-");
                    PdfWriter writer = PdfWriter.getInstance(docPDF, new FileOutputStream(ruta + "\\" + notaVenta + "_Fecha_" + formato.format(sistFecha) + "_hora_" + hora + "_Nota_de_Venta_" + ".pdf"));

                    //Separador
                    PdfPTable myTable = new PdfPTable(1);
                    myTable.setWidthPercentage(100.0f);
                    PdfPCell myCell = new PdfPCell(new Paragraph(""));
                    myCell.setBorder(Rectangle.BOTTOM);
                    myTable.addCell(myCell);
                    myTable.setSpacingAfter(10f);
                    myTable.setSpacingBefore(10f);

                    docPDF.open();

                    //Añadir la imagen
                    try {
                        //Establecer imagen y escala
                        Image logoAcima = Image.getInstance("src\\Imagenes\\acima-logo-200p.png");
                        logoAcima.scaleAbsolute(126, 67);
                        logoAcima.setAlignment(Paragraph.ALIGN_RIGHT);
                        //Establecer párrafo
                        Paragraph nro = new Paragraph(nombreProveedor + "\n"
                                + rutProveedor + "\n"
                                + "AV. 5 de abril 4454, Oficina 31, Estación Central - Santiago de Chile \n"
                                + "Venta de articulos al por menor \n"
                                + "Fono: 232107900 \n"
                                + "www.acima.cl", FontFactory
                                        .getFont(FontFactory.HELVETICA, 9, com.itextpdf.text.Font.NORMAL, null)
                        );
                        nro.setAlignment(Paragraph.ALIGN_JUSTIFIED);

                        //Crear Tabla
                        PdfPTable tableHeader = new PdfPTable(2);
                        tableHeader.setWidthPercentage(100);

                        PdfPCell cell1 = new PdfPCell(logoAcima, false);
                        cell1.setBorder(Rectangle.NO_BORDER);
                        cell1.setBackgroundColor(BaseColor.WHITE);
                        cell1.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_RIGHT);

                        PdfPCell cell2 = new PdfPCell(nro);
                        cell2.setBorder(Rectangle.NO_BORDER);
                        cell2.setBackgroundColor(BaseColor.WHITE);
                        cell2.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_JUSTIFIED);

                        tableHeader.addCell(cell2);
                        tableHeader.addCell(cell1);
                        docPDF.add(tableHeader);

                        docPDF.add(myTable);

                    } catch (BadElementException ex) {
                        Logger.getLogger(OrdenTrabajo.class
                                .getName()).log(Level.SEVERE, null, ex);

                    } catch (IOException ex) {
                        Logger.getLogger(OrdenTrabajo.class
                                .getName()).log(Level.SEVERE, null, ex);
                    }

                    Paragraph ordenCompra = new Paragraph("Código de Orden de Compra: " + oc, FontFactory.getFont(FontFactory.TIMES, 12, com.itextpdf.text.Font.BOLD, null));
                    ordenCompra.setAlignment(Paragraph.ALIGN_CENTER);
                    docPDF.add(ordenCompra);

                    docPDF.add(myTable);

                    Paragraph titulo = new Paragraph("Información del demandante", FontFactory.getFont(FontFactory.TIMES, 12, com.itextpdf.text.Font.BOLD, null));
                    docPDF.add(titulo);

                    PdfPTable tableDatos = new PdfPTable(2);
                    tableDatos.setWidthPercentage(100);
                    tableDatos.addCell(new Phrase("Rut del Demandante: " + rutComprador, FontFactory.getFont(FontFactory.TIMES, 12)));
                    tableDatos.addCell(new Phrase("Demandante: " + demandante, FontFactory.getFont(FontFactory.TIMES, 12)));
                    tableDatos.addCell(new Phrase("Dirección del Demandante: " + direccionDemandante, FontFactory.getFont(FontFactory.TIMES, 12)));
                    tableDatos.addCell(new Phrase("Unidad de Compra: " + unidadCompra, FontFactory.getFont(FontFactory.TIMES, 12)));
                    tableDatos.addCell(new Phrase("Teléfono del Demandante: " + telefonoDemandante, FontFactory.getFont(FontFactory.TIMES, 12)));
                    tableDatos.addCell(new Phrase("Fecha de Envío de Nota de OC: " + fechaEnvioOC, FontFactory.getFont(FontFactory.TIMES, 12)));
                    tableDatos.setSpacingBefore(15f);
                    tableDatos.setWidthPercentage(100);
                    Paragraph alineaDatos = new Paragraph();
                    alineaDatos.add(tableDatos);
                    docPDF.add(alineaDatos);

                    docPDF.add(myTable);

                    Paragraph titulo2 = new Paragraph("Información de la empresa", FontFactory.getFont(FontFactory.TIMES, 12, com.itextpdf.text.Font.BOLD, null));
                    docPDF.add(titulo2);

                    Paragraph proveedor2 = new Paragraph("Proveedor: " + nombreProveedor, FontFactory.getFont(FontFactory.TIMES, 12, com.itextpdf.text.Font.NORMAL, null));
                    proveedor2.setAlignment(Paragraph.ALIGN_LEFT);
                    docPDF.add(proveedor2);

                    docPDF.add(myTable);

                    Paragraph titulo3 = new Paragraph("Información de orden", FontFactory.getFont(FontFactory.TIMES, 12, com.itextpdf.text.Font.NORMAL, null));
                    docPDF.add(titulo);

                    try {
                        PdfPTable tableDatos2 = new PdfPTable(2);
                        tableDatos2.setWidthPercentage(100);
                        tableDatos2.addCell(new Phrase("Nombre de la Orden de Compra: " + nombreOC, FontFactory.getFont(FontFactory.TIMES, 12)));
                        tableDatos2.addCell(new Phrase("Metodo de Despacho: " + metodoDespacho, FontFactory.getFont(FontFactory.TIMES, 12)));
                        tableDatos2.addCell(new Phrase("Fecha de aceptación: " + fechaAceptacion, FontFactory.getFont(FontFactory.TIMES, 12)));
                        tableDatos2.addCell(new Phrase("Forma de Pago: " + formaPago, FontFactory.getFont(FontFactory.TIMES, 12)));
                        tableDatos2.addCell(new Phrase("Direcciones de despacho: " + direccionDespacho, FontFactory.getFont(FontFactory.TIMES, 12)));
                        tableDatos2.addCell(new Phrase("Contacto de pago: " + contactoPago, FontFactory.getFont(FontFactory.TIMES, 12)));
                        tableDatos2.addCell(new Phrase("Direcciones de envio de factura: " + direccionEnvioFactura, FontFactory.getFont(FontFactory.TIMES, 12)));
                        tableDatos2.addCell(new Phrase("Contacto de OC: " + contactoOC, FontFactory.getFont(FontFactory.TIMES, 12)));
                        tableDatos2.addCell(new Phrase("Mail de Envío de Factura: " + emailContacto, FontFactory.getFont(FontFactory.TIMES, 12)));
                        tableDatos2.setSpacingBefore(15f);
                        tableDatos2.setWidthPercentage(100);
                        Paragraph alineaDatos2 = new Paragraph();
                        alineaDatos2.add(tableDatos2);
                        docPDF.add(alineaDatos2);
                    } catch (Exception ex) {
                        System.out.println("Excepcion añadiendo información de cliente");
                    }

                    // doc.setPageSize(PageSize.A4.rotate());
                    //doc.newPage();
                    Paragraph tablas = new Paragraph("Información de productos en la orden ", FontFactory.getFont(FontFactory.TIMES, 12, com.itextpdf.text.Font.BOLD, null));
                    docPDF.add(tablas);
                    PdfPTable pdfTable = new PdfPTable(8);
                    pdfTable.setSpacingBefore(15f);
                    pdfTable.setWidthPercentage(100);

                    try {
                        PdfPCell cellP0 = new PdfPCell(new Phrase(tblOC.getModel().getColumnName(0), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                        cellP0.setUseBorderPadding(true);
                        // Setting cell's background color
                        cellP0.setBackgroundColor(BaseColor.ORANGE);

                        PdfPCell cellP1 = new PdfPCell(new Phrase(tblOC.getModel().getColumnName(1), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                        cellP1.setUseBorderPadding(true);
                        // Setting cell's background color
                        cellP1.setBackgroundColor(BaseColor.ORANGE);

                        PdfPCell cellP2 = new PdfPCell(new Phrase(tblOC.getModel().getColumnName(2), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                        cellP2.setUseBorderPadding(true);
                        // Setting cell's background color
                        cellP2.setBackgroundColor(BaseColor.ORANGE);

                        PdfPCell cellP3 = new PdfPCell(new Phrase(tblOC.getModel().getColumnName(3), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                        cellP3.setUseBorderPadding(true);
                        // Setting cell's background color
                        cellP3.setBackgroundColor(BaseColor.ORANGE);

                        PdfPCell cellP4 = new PdfPCell(new Phrase(tblOC.getModel().getColumnName(4), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                        cellP4.setUseBorderPadding(true);
                        // Setting cell's background color
                        cellP4.setBackgroundColor(BaseColor.ORANGE);

                        PdfPCell cellP5 = new PdfPCell(new Phrase(tblOC.getModel().getColumnName(5), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                        cellP5.setUseBorderPadding(true);
                        // Setting cell's background color
                        cellP5.setBackgroundColor(BaseColor.ORANGE);

                        PdfPCell cellP6 = new PdfPCell(new Phrase(tblOC.getModel().getColumnName(6), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                        cellP6.setUseBorderPadding(true);
                        // Setting cell's background color
                        cellP6.setBackgroundColor(BaseColor.ORANGE);

                        PdfPCell cellP7 = new PdfPCell(new Phrase(tblOC.getModel().getColumnName(7), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                        cellP7.setUseBorderPadding(true);
                        // Setting cell's background color
                        cellP7.setBackgroundColor(BaseColor.ORANGE);
                        /*
                PdfPCell cellP8 = new PdfPCell(new Phrase(tblOC.getModel().getColumnName(8), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                cellP8.setUseBorderPadding(true);
                // Setting cell's background color
                cellP8.setBackgroundColor(BaseColor.ORANGE);
               
                PdfPCell cellP9 = new PdfPCell(new Phrase(tblOC.getModel().getColumnName(9), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                cellP9.setUseBorderPadding(true);
                // Setting cell's background color
                cellP9.setBackgroundColor(BaseColor.ORANGE);
                         */
                        pdfTable.addCell(cellP0);
                        pdfTable.addCell(cellP1);
                        pdfTable.addCell(cellP2);
                        pdfTable.addCell(cellP3);
                        pdfTable.addCell(cellP4);
                        pdfTable.addCell(cellP5);
                        pdfTable.addCell(cellP6);
                        pdfTable.addCell(cellP7);
                        //pdfTable.addCell(cellP8);
                        //pdfTable.addCell(cellP9);
                    } catch (Exception ex) {
                        System.out.println("Error en tabla 1(creando celdas): " + ex);
                    }

                    try {
                        for (int rows = 0; rows < tblOC.getRowCount(); rows++) {
                            pdfTable.addCell(new Phrase(tblOC.getModel().getValueAt(rows, 0).toString(), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                            pdfTable.addCell(new Phrase(tblOC.getModel().getValueAt(rows, 1).toString(), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                            pdfTable.addCell(new Phrase(tblOC.getModel().getValueAt(rows, 2).toString(), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                            pdfTable.addCell(new Phrase(tblOC.getModel().getValueAt(rows, 3).toString(), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                            pdfTable.addCell(new Phrase(tblOC.getModel().getValueAt(rows, 4).toString(), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                            pdfTable.addCell(new Phrase(tblOC.getModel().getValueAt(rows, 5).toString(), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                            pdfTable.addCell(new Phrase(tblOC.getModel().getValueAt(rows, 6).toString(), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                            pdfTable.addCell(new Phrase(tblOC.getModel().getValueAt(rows, 7).toString(), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                            //pdfTable.addCell(new Phrase(tblOC.getModel().getValueAt(rows, 8).toString(), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                            //pdfTable.addCell(new Phrase(tblOC.getModel().getValueAt(rows, 9).toString(), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                        }
                        pdfTable.setWidths(new int[]{1, 2, 1, 1, 1, 1, 1, 1});
                        docPDF.add(pdfTable);
                    } catch (Exception ex) {
                        System.out.println("Error en tabla 1:" + ex);
                    }

                    DecimalFormat formatea = new DecimalFormat("###,###.##");
                    double neto_format = Double.parseDouble(netoOC.replace("$", "").replace(".", "").replace(",", "."));
                    double iva_format = Double.parseDouble(ivaOC.replace("$", "").replace(".", "").replace(",", "."));
                    double total_format = Double.parseDouble(totalOC.replace("$", "").replace(".", "").replace(",", "."));

                    Paragraph neto = new Paragraph("Neto: $" + formatea.format(neto_format), FontFactory.getFont(FontFactory.TIMES, 12, com.itextpdf.text.Font.NORMAL, null));
                    neto.setAlignment(Paragraph.ALIGN_RIGHT);
                    Paragraph iva = new Paragraph("IVA: $" + formatea.format(iva_format), FontFactory.getFont(FontFactory.TIMES, 12, com.itextpdf.text.Font.NORMAL, null));
                    iva.setAlignment(Paragraph.ALIGN_RIGHT);
                    Paragraph total = new Paragraph("Total: $" + formatea.format(total_format), FontFactory.getFont(FontFactory.TIMES, 12, com.itextpdf.text.Font.NORMAL, null));
                    total.setAlignment(Paragraph.ALIGN_RIGHT);
                    docPDF.add(neto);
                    docPDF.add(iva);
                    docPDF.add(total);

                    docPDF.add(myTable);

                    //doc.newPage();
                    //Para las notas de venta
                    Paragraph tablas2 = new Paragraph("Información de productos en notas de venta ", FontFactory.getFont(FontFactory.TIMES, 12, com.itextpdf.text.Font.BOLD, null));
                    docPDF.add(tablas2);
                    PdfPTable pdfTable2 = new PdfPTable(10);
                    pdfTable2.setSpacingBefore(15f);
                    pdfTable2.setWidthPercentage(100);

                    try {
                        PdfPCell cell0 = new PdfPCell(new Phrase(tblBDD.getColumnName(0), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                        cell0.setUseBorderPadding(true);
                        // Setting cell's background color
                        cell0.setBackgroundColor(BaseColor.ORANGE);

                        PdfPCell cell1 = new PdfPCell(new Phrase(tblBDD.getColumnName(1), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                        cell1.setUseBorderPadding(true);
                        // Setting cell's background color
                        cell1.setBackgroundColor(BaseColor.ORANGE);

                        PdfPCell cell2 = new PdfPCell(new Phrase(tblBDD.getColumnName(2), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                        cell2.setUseBorderPadding(true);
                        // Setting cell's background color
                        cell2.setBackgroundColor(BaseColor.ORANGE);

                        PdfPCell cell3 = new PdfPCell(new Phrase(tblBDD.getColumnName(3), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                        cell3.setUseBorderPadding(true);
                        // Setting cell's background color
                        cell3.setBackgroundColor(BaseColor.ORANGE);

                        PdfPCell cell4 = new PdfPCell(new Phrase(tblBDD.getColumnName(4), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                        cell4.setUseBorderPadding(true);
                        // Setting cell's background color
                        cell4.setBackgroundColor(BaseColor.ORANGE);

                        PdfPCell cell5 = new PdfPCell(new Phrase(tblBDD.getColumnName(5), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                        cell5.setUseBorderPadding(true);
                        // Setting cell's background color
                        cell5.setBackgroundColor(BaseColor.ORANGE);

                        PdfPCell cell6 = new PdfPCell(new Phrase(tblBDD.getColumnName(6), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                        cell6.setUseBorderPadding(true);
                        // Setting cell's background color
                        cell6.setBackgroundColor(BaseColor.ORANGE);

                        PdfPCell cell7 = new PdfPCell(new Phrase(tblBDD.getColumnName(7), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                        cell7.setUseBorderPadding(true);
                        // Setting cell's background color
                        cell7.setBackgroundColor(BaseColor.ORANGE);

                        PdfPCell cell8 = new PdfPCell(new Phrase(tblBDD.getColumnName(8), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                        cell8.setUseBorderPadding(true);
                        // Setting cell's background color
                        cell8.setBackgroundColor(BaseColor.ORANGE);

                        PdfPCell cell9 = new PdfPCell(new Phrase(tblBDD.getColumnName(9), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                        cell9.setUseBorderPadding(true);
                        // Setting cell's background color
                        cell9.setBackgroundColor(BaseColor.ORANGE);

                        pdfTable2.addCell(cell0);
                        pdfTable2.addCell(cell1);
                        pdfTable2.addCell(cell2);
                        pdfTable2.addCell(cell3);
                        pdfTable2.addCell(cell4);
                        pdfTable2.addCell(cell5);
                        pdfTable2.addCell(cell6);
                        pdfTable2.addCell(cell7);
                        pdfTable2.addCell(cell8);
                        pdfTable2.addCell(cell9);
                    } catch (Exception ex) {
                        System.out.println("Error en tabla 2(Creando celdas): " + ex);
                    }

                    try {
                        for (int rows = 0; rows < tblBDD.getRowCount(); rows++) {
                            pdfTable2.addCell(new Phrase(tblBDD.getModel().getValueAt(rows, 0).toString(), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                            pdfTable2.addCell(new Phrase(tblBDD.getModel().getValueAt(rows, 1).toString(), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                            pdfTable2.addCell(new Phrase(tblBDD.getModel().getValueAt(rows, 2).toString(), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                            pdfTable2.addCell(new Phrase(tblBDD.getModel().getValueAt(rows, 3).toString(), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                            pdfTable2.addCell(new Phrase(tblBDD.getModel().getValueAt(rows, 4).toString(), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                            pdfTable2.addCell(new Phrase(tblBDD.getModel().getValueAt(rows, 5).toString(), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                            pdfTable2.addCell(new Phrase(tblBDD.getModel().getValueAt(rows, 6).toString(), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                            pdfTable2.addCell(new Phrase(tblBDD.getModel().getValueAt(rows, 7).toString(), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                            pdfTable2.addCell(new Phrase(tblBDD.getModel().getValueAt(rows, 8).toString(), FontFactory.getFont(FontFactory.HELVETICA, 8)));
                            pdfTable2.addCell(new Phrase(tblBDD.getModel().getValueAt(rows, 9).toString(), FontFactory.getFont(FontFactory.HELVETICA, 8)));

                        }

                        pdfTable2.setWidths(new int[]{1, 1, 1, 2, 1, 1, 1, 1, 1, 1});
                        docPDF.add(pdfTable2);

                    } catch (Exception ex) {
                        System.out.println("Error en tabla 2" + ex);
                    }

                    docPDF.add(myTable);
                    //Iconos
                    try {
                        PdfPTable table = new PdfPTable(2);
                        table.setWidths(new int[]{1, 12});
                        table.getDefaultCell().setBorder(Rectangle.NO_BORDER);
                        //D:\Plataforma Operaciones\src\imagenes\465892689e(1).png
                        Image img1 = Image.getInstance("src\\Imagenes\\phone-icon-11-64.png");
                        Image img2 = Image.getInstance("src\\Imagenes\\mail-64.png");

                        PdfPCell imagen1 = new PdfPCell(img1, false);
                        imagen1.setBorder(Rectangle.NO_BORDER);
                        imagen1.setBackgroundColor(BaseColor.WHITE);
                        imagen1.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_RIGHT);

                        PdfPCell imagen2 = new PdfPCell(img2, false);
                        imagen2.setBorder(Rectangle.NO_BORDER);
                        imagen2.setBackgroundColor(BaseColor.WHITE);
                        imagen2.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_RIGHT);

                        table.addCell(imagen1);
                        table.addCell(new Phrase("Central telefónica: +56-232 107 900", FontFactory.getFont(FontFactory.TIMES, 12)));
                        table.addCell(imagen2);
                        table.addCell(new Phrase("ventas@acima.cl - comercial@acima.cl - gerencia@acima.cl", FontFactory.getFont(FontFactory.TIMES, 12)));
                        Paragraph tableFooter = new Paragraph();
                        tableFooter.add(table);
                        tableFooter.setSpacingBefore(15f);
                        tableFooter.setSpacingBefore(15f);
                        tableFooter.setAlignment(Paragraph.ALIGN_RIGHT);
                        docPDF.add(tableFooter);

                        docPDF.close();
                        JOptionPane.showMessageDialog(null, "PDF Generado Correctamente");

                    } catch (BadElementException | IOException ex) {
                        Logger.getLogger(OrdenTrabajo.class
                                .getName()).log(Level.SEVERE, null, ex);

                    }
                } catch (DocumentException ex) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error: sss" + ex.getMessage());

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(OrdenTrabajo.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay una nota de venta seleccionada");

            }

        } catch (IOException ex) {
            Logger.getLogger(HistorialOC.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(HistorialOC.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (SAXException ex) {
            Logger.getLogger(HistorialOC.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnGenerarPDFNVActionPerformed

    private void btnRendicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRendicionesActionPerformed
        try {
            Rendiciones rendicion = new Rendiciones();
            rendicion.setVisible(true);
            int montoAnterior = 0;
            String queryMaximo = "SELECT monto FROM cajachica ORDER BY idMonto DESC LIMIT 1;";
            PreparedStatement pstMax = cn.prepareStatement(queryMaximo);
            ResultSet rsMax = pstMax.executeQuery();
            while (rsMax.next()) {
                montoAnterior = rsMax.getInt(1);
            }
            DecimalFormat formatea = new DecimalFormat("###,###.##");

            rendicion.lblMontoCajaChica.setText("$" + formatea.format(montoAnterior));

            //Cargar las rendiciones...
            String queryRendiciones = "SELECT ordenCompra AS 'ORDEN DE COMPRA', nombreRendicion as 'RENDICIÓN', documento as 'TIPO DE DOCUMENTO',numeroDocumento as 'NÚMERO DE DOCUMENTO', fecha as 'FECHA',\n"
                    + "OBSERVACION AS 'OBSERVACIONES', total as 'GASTO TOTAL' FROM rendicion;";
            PreparedStatement pstRendiciones = cn.prepareStatement(queryRendiciones);
            ResultSet rsRendiciones = pstRendiciones.executeQuery();
            rendicion.tblRendicionesHistoricas.setModel(DbUtils.resultSetToTableModel(rsRendiciones));

        } catch (SQLException ex) {
            Logger.getLogger(HistorialNV.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRendicionesActionPerformed

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
            java.util.logging.Logger.getLogger(HistorialNV.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorialNV.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorialNV.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorialNV.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistorialNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGenerarPDFNV;
    private javax.swing.JButton btnRendiciones;
    private javax.swing.JButton btnSalida;
    private javax.swing.JButton btnVolverMenu9;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JLabel lblCodigo;
    public javax.swing.JLabel lblIDUsuario;
    private javax.swing.JTable tblBDD;
    public javax.swing.JTable tblHistorialNV;
    private javax.swing.JTable tblOC;
    private javax.swing.JTextField txtCodigoOC;
    private javax.swing.JFormattedTextField txtFechaOC;
    private javax.swing.JTextField txtNV;
    // End of variables declaration//GEN-END:variables
}


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
import javax.swing.JTable;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
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
public class InventarioPorBodega extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conecta();

    public InventarioPorBodega() {
        initComponents();
        try {

            cmbBodega2.removeAllItems();
            cmbSeccionBodega1.removeAllItems();
            String query2 = "select nombreBodega,seccion from bodega";
            PreparedStatement pst2 = cn.prepareStatement(query2);
            ResultSet rs2 = pst2.executeQuery();
            while (rs2.next()) {
                cmbBodega2.addItem(rs2.getString(1));
                cmbSeccionBodega1.addItem(rs2.getString(2));
            }
            cmbConvenioMarco.removeAllItems();
            String query3 = "select nombreConvenio FROM acimabasededatos.conveniomarco order by codigoConvenio desc;";
            PreparedStatement pst3 = cn.prepareStatement(query3);
            ResultSet rs3 = pst3.executeQuery();
            while (rs3.next()) {
                cmbConvenioMarco.addItem(rs3.getString(1));
            }

            cmbDistribuidorStock0.removeAllItems();
            String query4 = "select nombreDistribuidor from distribuidor order by idDistribuidor;";
            PreparedStatement pst4 = cn.prepareStatement(query4);
            ResultSet rs4 = pst4.executeQuery();
            while (rs4.next()) {
                cmbDistribuidorStock0.addItem(rs4.getString(1));
            }

            cmbCM.removeAllItems();
            String queryCM = "select subcategoria from categoria;";
            PreparedStatement pstCM = cn.prepareStatement(queryCM);
            ResultSet rsCM = pstCM.executeQuery();
            while (rsCM.next()) {
                cmbCM.addItem(rsCM.getString(1));
            }

            cmbMaterial.removeAllItems();
            String queryMat = "select material from material;";
            PreparedStatement pstMat = cn.prepareStatement(queryMat);
            ResultSet rsMat = pstMat.executeQuery();
            while (rsMat.next()) {
                cmbMaterial.addItem(rsMat.getString(1));
            }
            cmbTalla.removeAllItems();
            String queryTa = "select talla from talla;";
            PreparedStatement pstTa = cn.prepareStatement(queryTa);
            ResultSet rsTa = pstTa.executeQuery();
            while (rsTa.next()) {
                cmbTalla.addItem(rsTa.getString(1));
            }

            int idProducto = 0;
            String queryprod = "SELECT \n"
                    + "    CASE\n"
                    + "        WHEN ID IS NULL THEN 1\n"
                    + "        WHEN ID IS NOT NULL THEN MAX(ID)+1\n"
                    + "    END\n"
                    + "FROM\n"
                    + "    acimabasededatos.inventario;";
            PreparedStatement pstProd = cn.prepareStatement(queryprod);

            ResultSet rsProd = pstProd.executeQuery();
            while (rsProd.next()) {
                idProducto = rsProd.getInt("CASE\n"
                        + "        WHEN ID IS NULL THEN 1\n"
                        + "        WHEN ID IS NOT NULL THEN MAX(ID)+1\n"
                        + "    END");
            }

            txtID.setText(Integer.toString(idProducto));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    private void ReiniciarTablaProductos(JTable tblProducto) {
        try {
            String queryProducto = "Select idProducto as 'ID producto', SKU, categoria as 'Categoría', nombreProducto as 'Producto', descripcion as 'Descripción',\n"
                    + "FORMAT( precioVenta, 'es_CL')as 'Precio Venta', FORMAT( precioCosto,'es_CL') as 'Precio Costo', d.nombreDistribuidor as 'Nombre de Distribuidor', regiones as 'Regiones',\n"
                    + "CondicionDespacho as 'Condición de Despacho', diasHabiles as 'Días Hábiles', StatusProducto as 'Estado', stock as 'Stock'\n"
                    + "FROM inventario r left join distribuidor d on r.IDDISTRIBUIDOR = d.idDistribuidor;";
            PreparedStatement pstProducto = cn.prepareStatement(queryProducto);
            ResultSet rsProducto = pstProducto.executeQuery();
            tblProducto.setModel(DbUtils.resultSetToTableModel(rsProducto));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel48 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane24 = new javax.swing.JScrollPane();
        panelIngresoProducto1 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        txtIDproductoIngreso1 = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        txtStockIngresado1 = new javax.swing.JTextField();
        jLabel124 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        txtNombreProductoIngreso1 = new javax.swing.JTextField();
        txtPrecioVentaIngreso1 = new javax.swing.JTextField();
        txtPrecioCostoIngreso1 = new javax.swing.JTextField();
        txtDescripcionIngreso1 = new javax.swing.JTextField();
        txtRegionesIngreso1 = new javax.swing.JTextField();
        txtCondicionDespachoIngreso1 = new javax.swing.JTextField();
        txtDiasHabilesIngreso1 = new javax.swing.JTextField();
        cmbStatusProdIngreso1 = new javax.swing.JComboBox();
        jLabel148 = new javax.swing.JLabel();
        btnConfirmarInfoProd1 = new javax.swing.JButton();
        cmbTransporte1 = new javax.swing.JComboBox<>();
        cmbBodega2 = new javax.swing.JComboBox<>();
        jLabel146 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        cmbSeccionBodega1 = new javax.swing.JComboBox();
        cmbDistribuidorStock0 = new javax.swing.JComboBox();
        cmbConvenioMarco = new javax.swing.JComboBox();
        cmbCM = new javax.swing.JComboBox<>();
        cmbMaterial = new javax.swing.JComboBox<>();
        cmbTalla = new javax.swing.JComboBox<>();
        txtID = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel17 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        txtFiltrarNombreInventario = new javax.swing.JTextField();
        btnBuscarNombre2 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        txtSKUInventarioBodega = new javax.swing.JTextField();
        btnBuscarSKU2 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        cmbStatusFiltrarInventario = new javax.swing.JComboBox<>();
        btnBuscarStatus1 = new javax.swing.JButton();
        btnReiniciarTablaProducto5 = new javax.swing.JButton();
        btnDetalleProductoInventarioBodega = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblProductoInventarioBodega = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnVolverMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 740));
        setPreferredSize(new java.awt.Dimension(1280, 740));

        jPanel48.setBackground(new java.awt.Color(252, 252, 252));
        jPanel48.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panelIngresoProducto1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelIngresoProducto1.setEnabled(true);
        panelIngresoProducto1.setMaximumSize(new java.awt.Dimension(1280, 740));
        panelIngresoProducto1.setMinimumSize(new java.awt.Dimension(1280, 740));

        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel95.setText("ID de Producto:");

        txtIDproductoIngreso1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtIDproductoIngreso1.setText("-");

        jLabel123.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel123.setText("Stock a Ingresar:");

        txtStockIngresado1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtStockIngresado1.setText("0");
        txtStockIngresado1.setEnabled(false);

        jLabel124.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel124.setText("SKU:");

        jLabel126.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel126.setText("Nombre de Producto:");

        jLabel127.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel127.setText("Categoría:");

        jLabel128.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel128.setText("Precio de Venta(Unitario):");

        jLabel129.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel129.setText("Precio Costo:");

        jLabel132.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel132.setText("Descripción:");

        jLabel133.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel133.setText("Distribuidor:");

        jLabel134.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel134.setText("Regiones:");

        jLabel135.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel135.setText("Condición de Despacho:");

        jLabel136.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel136.setText("Días Hábiles:");

        jLabel141.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel141.setText("Status del Producto:");

        txtNombreProductoIngreso1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtNombreProductoIngreso1.setText("-");

        txtPrecioVentaIngreso1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtPrecioVentaIngreso1.setText("0");

        txtPrecioCostoIngreso1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtPrecioCostoIngreso1.setText("0");

        txtDescripcionIngreso1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtDescripcionIngreso1.setText("-");
        txtDescripcionIngreso1.setEnabled(false);

        txtRegionesIngreso1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtRegionesIngreso1.setText("-");
        txtRegionesIngreso1.setEnabled(false);

        txtCondicionDespachoIngreso1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtCondicionDespachoIngreso1.setText("-");
        txtCondicionDespachoIngreso1.setEnabled(false);

        txtDiasHabilesIngreso1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtDiasHabilesIngreso1.setText("-");
        txtDiasHabilesIngreso1.setEnabled(false);

        cmbStatusProdIngreso1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cmbStatusProdIngreso1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sin Stock", "Habilitado" }));
        cmbStatusProdIngreso1.setEnabled(false);

        jLabel148.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel148.setText("Información del Producto:");

        btnConfirmarInfoProd1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnConfirmarInfoProd1.setText("Confirmar Información de Producto");
        btnConfirmarInfoProd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarInfoProd1ActionPerformed(evt);
            }
        });

        cmbTransporte1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cmbTransporte1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Transporte", "Acima", "Transporte Externo" }));

        cmbBodega2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        jLabel146.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel146.setText("Bodega:");

        jLabel149.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel149.setText("Transporte:");

        jLabel150.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel150.setText("Sección de Bodega:");

        cmbSeccionBodega1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        cmbDistribuidorStock0.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        cmbConvenioMarco.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cmbConvenioMarco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Convenio Marco" }));

        cmbCM.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cmbCM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Convenio Marco" }));

        cmbMaterial.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cmbMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Material" }));

        cmbTalla.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cmbTalla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Talla" }));

        txtID.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtID.setText("0");

        javax.swing.GroupLayout panelIngresoProducto1Layout = new javax.swing.GroupLayout(panelIngresoProducto1);
        panelIngresoProducto1.setLayout(panelIngresoProducto1Layout);
        panelIngresoProducto1Layout.setHorizontalGroup(
            panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoProducto1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIngresoProducto1Layout.createSequentialGroup()
                        .addGroup(panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel95)
                            .addComponent(jLabel124)
                            .addComponent(jLabel126)
                            .addComponent(jLabel127)
                            .addComponent(jLabel128)
                            .addComponent(jLabel129)
                            .addComponent(jLabel133)
                            .addComponent(jLabel132)
                            .addComponent(jLabel134)
                            .addComponent(jLabel135)
                            .addComponent(jLabel136)
                            .addComponent(jLabel141)
                            .addComponent(jLabel123)
                            .addComponent(jLabel146)
                            .addComponent(jLabel149))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreProductoIngreso1)
                            .addComponent(txtPrecioVentaIngreso1)
                            .addComponent(txtPrecioCostoIngreso1)
                            .addComponent(txtDescripcionIngreso1)
                            .addComponent(txtRegionesIngreso1)
                            .addComponent(txtCondicionDespachoIngreso1)
                            .addComponent(txtDiasHabilesIngreso1)
                            .addComponent(cmbStatusProdIngreso1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtStockIngresado1)
                            .addComponent(cmbDistribuidorStock0, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbConvenioMarco, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelIngresoProducto1Layout.createSequentialGroup()
                                .addGroup(panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panelIngresoProducto1Layout.createSequentialGroup()
                                            .addComponent(cmbBodega2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel150)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmbSeccionBodega1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(txtIDproductoIngreso1)
                                        .addComponent(cmbTransporte1, 0, 911, Short.MAX_VALUE))
                                    .addGroup(panelIngresoProducto1Layout.createSequentialGroup()
                                        .addComponent(cmbCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel148)
                    .addComponent(btnConfirmarInfoProd1))
                .addGap(349, 349, 349))
        );
        panelIngresoProducto1Layout.setVerticalGroup(
            panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoProducto1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel148)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTransporte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel149))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBodega2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel150)
                    .addComponent(cmbSeccionBodega1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel146))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDproductoIngreso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel95))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel124)
                    .addComponent(cmbCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel126)
                    .addComponent(txtNombreProductoIngreso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel127)
                    .addComponent(cmbConvenioMarco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel128)
                    .addComponent(txtPrecioVentaIngreso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel129)
                    .addComponent(txtPrecioCostoIngreso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel133)
                    .addComponent(cmbDistribuidorStock0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel132)
                    .addComponent(txtDescripcionIngreso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel134)
                    .addComponent(txtRegionesIngreso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCondicionDespachoIngreso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel135))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiasHabilesIngreso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel136))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel141)
                    .addComponent(cmbStatusProdIngreso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelIngresoProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel123)
                    .addComponent(txtStockIngresado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirmarInfoProd1)
                .addContainerGap())
        );

        jScrollPane24.setViewportView(panelIngresoProducto1);

        jTabbedPane2.addTab("Ingreso de Productos (Stock 0)", jScrollPane24);

        jPanel9.setBackground(new java.awt.Color(252, 252, 252));

        jTabbedPane7.setBackground(new java.awt.Color(0, 153, 153));
        jTabbedPane7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        jTabbedPane8.setBackground(new java.awt.Color(0, 153, 153));
        jTabbedPane8.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        jPanel17.setBackground(new java.awt.Color(252, 252, 252));

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel86.setText("Nombre Genérico:");
        jLabel86.setToolTipText("");

        txtFiltrarNombreInventario.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        btnBuscarNombre2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnBuscarNombre2.setText("Buscar");
        btnBuscarNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarNombre2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel86)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFiltrarNombreInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarNombre2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(txtFiltrarNombreInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarNombre2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane8.addTab("Busqueda de productos por Nombre", jPanel17);

        jPanel18.setBackground(new java.awt.Color(252, 252, 252));

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel87.setText("Buscar por SKU:");

        txtSKUInventarioBodega.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        btnBuscarSKU2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnBuscarSKU2.setText("Buscar");
        btnBuscarSKU2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarSKU2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSKUInventarioBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarSKU2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarSKU2)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSKUInventarioBodega)
                        .addComponent(jLabel87)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane8.addTab("Busqueda de productos por SKU", jPanel18);

        jPanel19.setBackground(new java.awt.Color(252, 252, 252));

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel88.setText("Busqueda por Status:");

        cmbStatusFiltrarInventario.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cmbStatusFiltrarInventario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Status", "Publicado", "Sin Stock", "Sin Información" }));

        btnBuscarStatus1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnBuscarStatus1.setText("Buscar");
        btnBuscarStatus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarStatus1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel88)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbStatusFiltrarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarStatus1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(cmbStatusFiltrarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarStatus1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane8.addTab("Busqueda de productos por Status", jPanel19);

        jTabbedPane7.addTab("Filtrar Productos", jTabbedPane8);

        btnReiniciarTablaProducto5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnReiniciarTablaProducto5.setText("Reiniciar Productos");
        btnReiniciarTablaProducto5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarTablaProducto5ActionPerformed(evt);
            }
        });

        btnDetalleProductoInventarioBodega.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnDetalleProductoInventarioBodega.setText("Detalle de Producto");
        btnDetalleProductoInventarioBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleProductoInventarioBodegaActionPerformed(evt);
            }
        });

        tblProductoInventarioBodega = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int celIndex){
                return false;
            }
        };
        tblProductoInventarioBodega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane12.setViewportView(tblProductoInventarioBodega);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setText("Exportar Inventario a Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReiniciarTablaProducto5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDetalleProductoInventarioBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1209, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReiniciarTablaProducto5)
                    .addComponent(btnDetalleProductoInventarioBodega)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Inventario de Productos", jPanel9);

        btnVolverMenu.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnVolverMenu.setText("Volver");
        btnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acima-logo-200p.png"))); // NOI18N

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnVolverMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNombre2ActionPerformed

        try {
            String queryProducto = "Select idProducto as 'ID producto', SKU, categoria as 'Categoría', nombreProducto as 'Producto', descripcion as 'Descripción',\n"
                    + "FORMAT( precioVenta, 'es_CL')as 'Precio Venta', FORMAT( precioCosto,'es_CL') as 'Precio Costo', d.nombreDistribuidor as 'Nombre de Distribuidor', regiones as 'Regiones',\n"
                    + "CondicionDespacho as 'Condición de Despacho', diasHabiles as 'Días Hábiles', StatusProducto as 'Estado', stock as 'Stock'\n"
                    + "FROM inventario r left join distribuidor d on r.IDDISTRIBUIDOR = d.idDistribuidor where r.nombreProducto RLIKE ? ";
            String param = txtFiltrarNombreInventario.getText();
            PreparedStatement pst = cn.prepareStatement(queryProducto);
            pst.setString(1, param);
            ResultSet rs = pst.executeQuery();
            tblProductoInventarioBodega.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarNombre2ActionPerformed

    private void btnBuscarSKU2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSKU2ActionPerformed

        try {
            String queryProducto = "SSelect idProducto as 'ID producto', SKU, categoria as 'Categoría', nombreProducto as 'Producto', descripcion as 'Descripción',\n"
                    + "FORMAT( precioVenta, 'es_CL')as 'Precio Venta', FORMAT( precioCosto,'es_CL') as 'Precio Costo', d.nombreDistribuidor as 'Nombre de Distribuidor', regiones as 'Regiones',\n"
                    + "CondicionDespacho as 'Condición de Despacho', diasHabiles as 'Días Hábiles', StatusProducto as 'Estado', stock as 'Stock'\n"
                    + "FROM inventario r left join distribuidor d on r.IDDISTRIBUIDOR = d.idDistribuidor where r.sku RLIKE ?";
            String param = txtSKUInventarioBodega.getText();
            PreparedStatement pst = cn.prepareStatement(queryProducto);
            pst.setString(1, param);
            ResultSet rs = pst.executeQuery();
            tblProductoInventarioBodega.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarSKU2ActionPerformed

    private void btnBuscarStatus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarStatus1ActionPerformed

        try {
            String queryProducto = "Select idProducto as 'ID producto', SKU, categoria as 'Categoría', nombreProducto as 'Producto', descripcion as 'Descripción',\n"
                    + "FORMAT( precioVenta, 'es_CL')as 'Precio Venta', FORMAT( precioCosto,'es_CL') as 'Precio Costo', d.nombreDistribuidor as 'Nombre de Distribuidor', regiones as 'Regiones',\n"
                    + "CondicionDespacho as 'Condición de Despacho', diasHabiles as 'Días Hábiles', StatusProducto as 'Estado', stock as 'Stock'\n"
                    + "FROM inventario r left join distribuidor d on r.IDDISTRIBUIDOR = d.idDistribuidor WHERE  r.statusproducto RLIKE ?";
            String param = cmbStatusFiltrarInventario.getSelectedItem().toString();
            PreparedStatement pst = cn.prepareStatement(queryProducto);
            pst.setString(1, param);
            ResultSet rs = pst.executeQuery();
            tblProductoInventarioBodega.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarStatus1ActionPerformed

    private void btnReiniciarTablaProducto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarTablaProducto5ActionPerformed
        ReiniciarTablaProductos(tblProductoInventarioBodega);
    }//GEN-LAST:event_btnReiniciarTablaProducto5ActionPerformed

    private void btnDetalleProductoInventarioBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleProductoInventarioBodegaActionPerformed
        try {
            int index = tblProductoInventarioBodega.getSelectedRow();
            TableModel model = tblProductoInventarioBodega.getModel();
            int seleccion = Integer.parseInt(model.getValueAt(index, 0).toString());
            Detalle detalle = new Detalle();
            detalle.setVisible(true);
            String query = "SELECT \n"
                    + "    r.idProducto AS 'ID producto',\n"
                    + "    r.SKU,\n"
                    + "    r.nombreProducto AS 'Producto',\n"
                    + "    r.categoria AS 'Categoría',\n"
                    + "    r.codigoConvenio AS 'CodigoConvenio',\n"
                    + "    r.diasHabiles AS 'Días Hábiles',\n"
                    + "    r.precioCosto AS 'Precio Costo',\n"
                    + "    r.precioVenta AS 'Precio Venta',\n"
                    + "    r.CondicionDespacho AS 'Condición de Despacho',\n"
                    + "    r.descripcion AS 'Descripción',\n"
                    + "    r.regiones AS 'Regiones',\n"
                    + "    d.nombreDistribuidor AS 'Nombre de Distribuidor',\n"
                    + "    r.stock AS 'Stock'\n"
                    + "FROM\n"
                    + "    inventario r\n"
                    + "        LEFT JOIN\n"
                    + "    distribuidor d ON r.IDDISTRIBUIDOR = d.idDistribuidor\n"
                    + "    where idProducto = ?;";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setInt(1, seleccion);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                detalle.lblIDProducto.setText(Integer.toString(rs.getInt(1)));
                detalle.lblSku.setText(Integer.toString(rs.getInt(2)));
                detalle.lblNombre.setText(rs.getString(3));
                detalle.lblCategoria.setText(rs.getString(4));
                detalle.lblCodigoConvenio.setText(rs.getString(5));
                detalle.lblDiasHabiles.setText(rs.getString(6));
                detalle.lblPrecioCosto.setText(Integer.toString(rs.getInt(7)));
                detalle.lblPrecioVenta.setText(Integer.toString(rs.getInt(8)));
                detalle.lblCondicionDespacho.setText(rs.getString(9));
                detalle.lblDescripcion.setText(rs.getString(10));
                detalle.lblRegiones.setText(rs.getString(11));
                detalle.lblDistribuidor.setText(rs.getString(12));
                detalle.lblStock.setText(Integer.toString(rs.getInt(13)));

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto");
        }
    }//GEN-LAST:event_btnDetalleProductoInventarioBodegaActionPerformed

    private void btnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverMenuActionPerformed

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
            Sheet sheet = workbook.createSheet("Inventario");

            Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerFont.setFontHeightInPoints((short) 14);
            headerFont.setColor(IndexedColors.RED.getIndex());

            CellStyle headerCellStyle = workbook.createCellStyle();
            headerCellStyle.setFont(headerFont);

            // Create a Row
            Row headerRow = sheet.createRow(0);

            for (int i = 0; i < tblProductoInventarioBodega.getColumnCount(); i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(tblProductoInventarioBodega.getColumnName(i));
                cell.setCellStyle(headerCellStyle);
            }

            // Create Other rows and cells with contacts data
            int rowNum = 1;

            for (int i = 0; i < tblProductoInventarioBodega.getRowCount(); i++) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(tblProductoInventarioBodega.getValueAt(i, 0).toString());
                row.createCell(1).setCellValue(tblProductoInventarioBodega.getValueAt(i, 1).toString());
                row.createCell(2).setCellValue(tblProductoInventarioBodega.getValueAt(i, 2).toString());
                row.createCell(3).setCellValue(tblProductoInventarioBodega.getValueAt(i, 3).toString());
                row.createCell(4).setCellValue(tblProductoInventarioBodega.getValueAt(i, 4).toString());
                row.createCell(5).setCellValue(tblProductoInventarioBodega.getValueAt(i, 5).toString());
                row.createCell(6).setCellValue(tblProductoInventarioBodega.getValueAt(i, 6).toString());
                row.createCell(7).setCellValue(tblProductoInventarioBodega.getValueAt(i, 7).toString());
                row.createCell(8).setCellValue(tblProductoInventarioBodega.getValueAt(i, 8).toString());
                row.createCell(9).setCellValue(tblProductoInventarioBodega.getValueAt(i, 9).toString());
                row.createCell(10).setCellValue(tblProductoInventarioBodega.getValueAt(i, 10).toString());
                row.createCell(11).setCellValue(tblProductoInventarioBodega.getValueAt(i, 11).toString());
                row.createCell(12).setCellValue(tblProductoInventarioBodega.getValueAt(i, 12).toString());

            }

            // Resize all columns to fit the content size
            for (int i = 0; i < tblProductoInventarioBodega.getColumnCount(); i++) {
                sheet.autoSizeColumn(i);
            }

            try ( // Write the output to a file
                    FileOutputStream fileOut = new FileOutputStream(ruta + "\\" + "inventario_productos.xlsx")) {
                workbook.write(fileOut);
            }
            JOptionPane.showMessageDialog(null, "Documento Creado");
        } catch (HeadlessException | IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnConfirmarInfoProd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarInfoProd1ActionPerformed
        try {
            int idBodega = 0;
            String cm = "";

            String query = "select * from bodega where nombreBodega = ?";
            PreparedStatement pst3 = cn.prepareStatement(query);
            pst3.setString(1, cmbBodega2.getSelectedItem().toString());
            ResultSet rs3 = pst3.executeQuery();
            while (rs3.next()) {
                idBodega = rs3.getInt("idBodega");
            }

            String queryCM = "select * from convenioMarco where nombreConvenio = ?";
            PreparedStatement pst4 = cn.prepareStatement(queryCM);
            pst4.setString(1, cmbConvenioMarco.getSelectedItem().toString());
            ResultSet rs4 = pst4.executeQuery();
            while (rs4.next()) {
                cm = rs4.getString("codigoConvenio");
            }

            int idMaterial = 0;
            String queryMaterial = "select idMaterial from material where material = ?";
            PreparedStatement pstMat = cn.prepareStatement(queryMaterial);
            pstMat.setString(1, cmbMaterial.getSelectedItem().toString());
            ResultSet rsMat = pstMat.executeQuery();
            while (rsMat.next()) {
                idMaterial = rsMat.getInt("idMaterial");
            }
            System.out.println("Id de material: " + idMaterial);

            int idTalla = 0;
            String queryTalla = "select id_talla from talla where talla = ?";
            PreparedStatement pstTalla = cn.prepareStatement(queryTalla);
            pstTalla.setString(1, cmbTalla.getSelectedItem().toString());
            ResultSet rsTalla = pstTalla.executeQuery();
            while (rsTalla.next()) {
                idTalla = rsTalla.getInt("id_talla");
            }
            System.out.println("Id de Talla: " + idTalla);

            int idCategoria = 0;
            String queryCategoria = "select id from categoria where subcategoria = ?";
            PreparedStatement pstCategoria = cn.prepareStatement(queryCategoria);
            pstCategoria.setString(1, cmbCM.getSelectedItem().toString());
            ResultSet rsCategoria = pstCategoria.executeQuery();
            while (rsCategoria.next()) {
                idCategoria = rsCategoria.getInt("id");
            }
            System.out.println("Id de Categoria: " + idCategoria);

            System.out.println(cmbDistribuidorStock0.getSelectedItem().toString());

            try {
                String queryINV = "INSERT INTO inventario(`idBodega`,`idProducto`,`sku`,`nombreProducto`,codigoConvenio,`categoria`,"
                        + "`precioventa`,`precioCosto`,`iddistribuidor`,`descripcion`,`regiones`,`condiciondespacho`,`diashabiles`,"
                        + "`statusproducto`,`stock`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
                PreparedStatement pstINV = cn.prepareStatement(queryINV);
                pstINV.setInt(1, cmbBodega2.getSelectedIndex());
                pstINV.setString(2, txtIDproductoIngreso1.getText());
                pstINV.setString(3, Integer.toString(idCategoria) + Integer.toString(idMaterial) + Integer.toString(idTalla) + txtID.getText());
                pstINV.setString(4, txtNombreProductoIngreso1.getText());
                pstINV.setString(5, cm);
                pstINV.setString(6, cmbConvenioMarco.getSelectedItem().toString());
                pstINV.setInt(7, Integer.parseInt(txtPrecioVentaIngreso1.getText()));
                pstINV.setInt(8, Integer.parseInt(txtPrecioCostoIngreso1.getText()));
                pstINV.setInt(9, cmbConvenioMarco.getSelectedIndex() + 1);
                pstINV.setString(10, txtDescripcionIngreso1.getText());
                pstINV.setString(11, txtRegionesIngreso1.getText());
                pstINV.setString(12, txtCondicionDespachoIngreso1.getText());
                pstINV.setString(13, txtDiasHabilesIngreso1.getText());
                pstINV.setString(14, cmbStatusProdIngreso1.getSelectedItem().toString());
                pstINV.setInt(15, Integer.parseInt(txtStockIngresado1.getText()));

                int upINV = pstINV.executeUpdate();

                JOptionPane.showMessageDialog(null, "Producto Ingresado");
                txtIDproductoIngreso1.setText("");
                //txtSKUIngreso1.setText("");
            } catch (SQLException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            cmbBodega2.setSelectedIndex(0);
            txtIDproductoIngreso1.setText("");
            //txtSKUIngreso1.setText("");
            txtNombreProductoIngreso1.setText("");
            cmbConvenioMarco.setSelectedIndex(0);
            txtPrecioVentaIngreso1.setText("");
            txtPrecioCostoIngreso1.setText("");

            txtDescripcionIngreso1.setText("");
            txtRegionesIngreso1.setText("");
            txtCondicionDespachoIngreso1.setText("");
            txtDiasHabilesIngreso1.setText("");
            cmbStatusProdIngreso1.setSelectedItem(0);
            txtStockIngresado1.setText("");

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnConfirmarInfoProd1ActionPerformed

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
            java.util.logging.Logger.getLogger(InventarioPorBodega.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventarioPorBodega.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventarioPorBodega.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventarioPorBodega.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventarioPorBodega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarNombre2;
    private javax.swing.JButton btnBuscarSKU2;
    private javax.swing.JButton btnBuscarStatus1;
    private javax.swing.JButton btnConfirmarInfoProd1;
    private javax.swing.JButton btnDetalleProductoInventarioBodega;
    private javax.swing.JButton btnReiniciarTablaProducto5;
    private javax.swing.JButton btnVolverMenu;
    public javax.swing.JComboBox<String> cmbBodega2;
    private javax.swing.JComboBox<String> cmbCM;
    public javax.swing.JComboBox cmbConvenioMarco;
    public javax.swing.JComboBox cmbDistribuidorStock0;
    private javax.swing.JComboBox<String> cmbMaterial;
    public javax.swing.JComboBox cmbSeccionBodega1;
    private javax.swing.JComboBox<String> cmbStatusFiltrarInventario;
    public javax.swing.JComboBox cmbStatusProdIngreso1;
    private javax.swing.JComboBox<String> cmbTalla;
    private javax.swing.JComboBox<String> cmbTransporte1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JPanel panelIngresoProducto1;
    public javax.swing.JTable tblProductoInventarioBodega;
    private javax.swing.JTextField txtCondicionDespachoIngreso1;
    private javax.swing.JTextField txtDescripcionIngreso1;
    private javax.swing.JTextField txtDiasHabilesIngreso1;
    private javax.swing.JTextField txtFiltrarNombreInventario;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDproductoIngreso1;
    private javax.swing.JTextField txtNombreProductoIngreso1;
    private javax.swing.JTextField txtPrecioCostoIngreso1;
    private javax.swing.JTextField txtPrecioVentaIngreso1;
    private javax.swing.JTextField txtRegionesIngreso1;
    private javax.swing.JTextField txtSKUInventarioBodega;
    private javax.swing.JTextField txtStockIngresado1;
    // End of variables declaration//GEN-END:variables
}

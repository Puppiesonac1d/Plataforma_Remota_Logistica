
import clases.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author The_S
 */
public class Menu extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conecta();
    LocalDate sistFecha = LocalDate.now();

    public Menu() {
        initComponents();
        //Fecha
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY", Locale.ENGLISH);
        menuFecha.setText(" Fecha: " + sistFecha.getDayOfMonth() + "/" + sistFecha.getMonthValue() + "/" + sistFecha.getYear());

        //Hora
        Timer tiempo = new Timer(100, (ActionListener) new Menu.horas());
        tiempo.start();
    }

    class horas implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Date sistHora = new Date();
            String pmAm = "hh:mm a";
            SimpleDateFormat format = new SimpleDateFormat(pmAm);
            Calendar hoy = Calendar.getInstance();
            menuHora.setText(" Hora: " + String.format(format.format(sistHora), hoy));
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

        contenedor = new javax.swing.JPanel();
        panelRojo = new javax.swing.JPanel();
        btnNotaCompra = new javax.swing.JButton();
        btnNotaVenta = new javax.swing.JButton();
        btnInventarioProductos = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnMantenedorBodegas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnSeguimiento = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUserName = new javax.swing.JMenu();
        menuHora = new javax.swing.JMenu();
        menuFecha = new javax.swing.JMenu();
        codigoAutorizacionMenuTag = new javax.swing.JMenu();
        contactoMenuTag = new javax.swing.JMenu();
        fonoMenuTag = new javax.swing.JMenu();
        idUsuarioMenuTag = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(252, 252, 252));
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        contenedor.setBackground(new java.awt.Color(252, 252, 252));

        panelRojo.setBackground(new java.awt.Color(252, 252, 252));
        panelRojo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelRojo.setAlignmentX(1.0F);
        panelRojo.setAlignmentY(1.0F);
        panelRojo.setLayout(new java.awt.GridLayout(3, 5, 5, 5));

        btnNotaCompra.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnNotaCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/4f49eabd611eb(1).png"))); // NOI18N
        btnNotaCompra.setText("Nota de Compra / Ingreso");
        btnNotaCompra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNotaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotaCompraActionPerformed(evt);
            }
        });
        panelRojo.add(btnNotaCompra);

        btnNotaVenta.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnNotaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/4f49eabd611eb(1).png"))); // NOI18N
        btnNotaVenta.setText("Nota de Venta / Salida");
        btnNotaVenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNotaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotaVentaActionPerformed(evt);
            }
        });
        panelRojo.add(btnNotaVenta);

        btnInventarioProductos.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnInventarioProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/7af6ee279c(1).png"))); // NOI18N
        btnInventarioProductos.setText("Inventarios");
        btnInventarioProductos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInventarioProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioProductosActionPerformed(evt);
            }
        });
        panelRojo.add(btnInventarioProductos);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delivery-truck(1).png"))); // NOI18N
        jButton7.setText("Ingresar Transporte");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panelRojo.add(jButton7);

        btnMantenedorBodegas.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnMantenedorBodegas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/578bc5a79c(2).png"))); // NOI18N
        btnMantenedorBodegas.setText("Agregar Bodegas / CM");
        btnMantenedorBodegas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMantenedorBodegas.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnMantenedorBodegas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenedorBodegasActionPerformed(evt);
            }
        });
        panelRojo.add(btnMantenedorBodegas);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setText("Ingresar Facturas");
        panelRojo.add(jButton1);

        btnSeguimiento.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnSeguimiento.setText("Seguimiento de OC");
        btnSeguimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguimientoActionPerformed(evt);
            }
        });
        panelRojo.add(btnSeguimiento);

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setToolTipText("");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panelRojo.add(btnSalir);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acima-logo-200p.png"))); // NOI18N

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panelRojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addComponent(panelRojo, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addGap(84, 84, 84))
        );

        menuUserName.setText(" Nombre de Usuario: No Conectado ");
        jMenuBar1.add(menuUserName);

        menuHora.setText(" Hora: ");
        jMenuBar1.add(menuHora);

        menuFecha.setText(" Fecha: ");
        jMenuBar1.add(menuFecha);

        codigoAutorizacionMenuTag.setVisible(false);
        jMenuBar1.add(codigoAutorizacionMenuTag);

        contactoMenuTag.setVisible(false);
        jMenuBar1.add(contactoMenuTag);

        fonoMenuTag.setVisible(false);
        jMenuBar1.add(fonoMenuTag);

        idUsuarioMenuTag.setVisible(false);
        jMenuBar1.add(idUsuarioMenuTag);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNotaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotaCompraActionPerformed
        try {
            NotaCompra nota = new NotaCompra();
            nota.setVisible(true);
            String queryActualizar = "SELECT \n"
                    + "    a.numeroCotizacion AS 'OC de Proveedor',\n"
                    + "    da.idOrden AS 'N° de nota de venta',\n"
                    + "    a.codigoOrdenCompra AS 'Código de Orden de Compra',\n"
                    + "    a.distribuidor AS 'Distribuidor',\n"
                    + "    CONCAT(SUBSTRING(a.fecha, 9, 2),\n"
                    + "            '-',\n"
                    + "            SUBSTRING(a.fecha, 6, 2),\n"
                    + "            '-',\n"
                    + "            SUBSTRING(a.fecha, 1, 4)) AS 'Fecha de cotización',\n"
                    + "    SUBSTRING(a.demoradespacho, 1, 2) AS 'Días Hábiles para arribo de mercadería',\n"
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
            nota.tblNC.setModel(DbUtils.resultSetToTableModel(rs));

            String query2 = "select nombreDistribuidor from distribuidor;";
            PreparedStatement pst2 = cn.prepareStatement(query2);
            ResultSet rs2 = pst2.executeQuery();
            while (rs2.next()) {
                nota.cmbDistribuidor.addItem(rs2.getString(1));
            }

            nota.btnReiniciarFiltros.doClick();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


    }//GEN-LAST:event_btnNotaCompraActionPerformed

    private void btnNotaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotaVentaActionPerformed
        try {
            //JOptionPane.showMessageDialog(null, "Cargando Información");
            HistorialNV nota = new HistorialNV();
            nota.setVisible(true);
            nota.lblCodigo.setText(codigoAutorizacionMenuTag.getText());

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
            nota.tblHistorialNV.setModel(DbUtils.resultSetToTableModel(rs));
            nota.lblIDUsuario.setText(idUsuarioMenuTag.getText());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnNotaVentaActionPerformed

    private void btnInventarioProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioProductosActionPerformed
        Inventarios inventarios = new Inventarios();
        inventarios.setVisible(true);
    }//GEN-LAST:event_btnInventarioProductosActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            IngresoTransporte transporte = new IngresoTransporte();
            transporte.setVisible(true);
            String query = "SELECT transporte as 'Nombre de Transporte',contacto as 'Contacto',telefono as 'Teléfono', correo as 'Correo',direccionCarga as 'Dirección de Carga',ciudad as 'Ciudad',nomComuna as 'Comuna',\n"
                    + "provincia as 'Provincia',nomRegion as 'Región',zona as 'Zona' FROM acimabasededatos.transporte;";
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            transporte.tblTransportes.setModel(DbUtils.resultSetToTableModel(rs));
            // JOptionPane.showMessageDialog(null, "LISTO");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnMantenedorBodegasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenedorBodegasActionPerformed
        Mantenedores mant = new Mantenedores();
        mant.setVisible(true);
    }//GEN-LAST:event_btnMantenedorBodegasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        try {
            String queryMovimiento = "UPDATE ACTIVIDAD SET ACCION2 = 'Cerrar Sesión', tiempoAccion2 = NOW() WHERE IDUSUARIO = ? and DATE(tiempoaccion) = ? and accion = 'Inicio de Sesión';";
            PreparedStatement pstMovimiento;
            pstMovimiento = cn.prepareStatement(queryMovimiento);
            pstMovimiento.setInt(1, Integer.parseInt(idUsuarioMenuTag.getText()));
            pstMovimiento.setString(2, sistFecha.getYear() + "-" + sistFecha.getMonthValue() + "-" + sistFecha.getDayOfMonth());
            int up = pstMovimiento.executeUpdate();
            System.exit(0);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSeguimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguimientoActionPerformed
        /*
         SELECT CODIGOORDENCOMPRA AS
         'Código de Orden de Compra'
         from ordenTrabajo;
         */
        try {
            Seguimiento seguimiento = new Seguimiento();

            seguimiento.setVisible(true);
            String query = "SELECT \n"
                    + "    ot.idOrden AS 'Nota de Venta',\n"
                    + "    ot.codigoOrdenCompra AS 'Código de Orden de Compra',\n"
                    + "    ot.nombre_proveedor AS 'Empresa',\n"
                    + "    CASE\n"
                    + "        WHEN\n"
                    + "            EXISTS( SELECT \n"
                    + "                    idOrden\n"
                    + "                FROM\n"
                    + "                    detalle_Abastecimiento\n"
                    + "                WHERE\n"
                    + "                    idOrden = ot.idOrden)\n"
                    + "        THEN\n"
                    + "            'NOTA DE COMPRA CREADA'\n"
                    + "        WHEN\n"
                    + "            NOT EXISTS( SELECT \n"
                    + "                    idOrden\n"
                    + "                FROM\n"
                    + "                    detalle_Abastecimiento\n"
                    + "                WHERE\n"
                    + "                    idOrden = ot.idOrden)\n"
                    + "        THEN\n"
                    + "            'NOTA DE COMPRA NO CREADA'\n"
                    + "    END 'NOTAS DE COMPRA',\n"
                    + "    IFNULL(a.estado, '-') AS 'ESTADO DE PAGO',\n"
                    + "    CASE\n"
                    + "        WHEN\n"
                    + "            EXISTS( SELECT \n"
                    + "                    notaVenta\n"
                    + "                FROM\n"
                    + "                   ingreso\n"
                    + "                WHERE\n"
                    + "                    notaVenta = ot.idOrden)\n"
                    + "        THEN\n"
                    + "            'MERCADERÍA INGRESADA'\n"
                    + "        WHEN\n"
                    + "            NOT EXISTS( SELECT \n"
                    + "                    notaVenta\n"
                    + "                FROM\n"
                    + "                   ingreso\n"
                    + "                WHERE\n"
                    + "                    notaVenta = ot.idOrden)\n"
                    + "        THEN\n"
                    + "            'MERCADERÍA NO INGRESADA'\n"
                    + "    END 'INGRESO DE MERCADERIA',\n"
                    + "    CASE\n"
                    + "        WHEN\n"
                    + "            EXISTS( SELECT \n"
                    + "                    idOrden\n"
                    + "                FROM\n"
                    + "                    salida\n"
                    + "                WHERE\n"
                    + "                    idOrden = ot.idOrden)\n"
                    + "        THEN\n"
                    + "            'SALIDA DE MERCADERÍA REALIZADA'\n"
                    + "        WHEN\n"
                    + "            NOT EXISTS( SELECT \n"
                    + "                    idOrden\n"
                    + "                FROM\n"
                    + "                    salida\n"
                    + "                WHERE\n"
                    + "                    idOrden = ot.idOrden)\n"
                    + "        THEN\n"
                    + "            'SALIDA DE MERCADERÍA NO REALIZADA'\n"
                    + "    END 'SALIDA DE MERCADERÍA',\n"
                    + "    IFNULL(sa.numFactura,\n"
                    + "            'NO SE HA ASIGNADO UNA FACTURA') AS 'FACTURA',\n"
                    + "    IFNULL(sa.ordenTransporte,\n"
                    + "            'NO SE HA ASIGNADO UNA ORDEN DE TRANSPORTE') AS 'ORDEN DE TRANSPORTE'\n"
                    + "FROM\n"
                    + "    ordenTrabajo ot\n"
                    + "        LEFT JOIN\n"
                    + "    salida sa ON sa.idOrden = ot.idOrden\n"
                    + "        LEFT JOIN\n"
                    + "    detalle_abastecimiento da ON da.idOrden = ot.idOrden\n"
                    + "        LEFT JOIN\n"
                    + "    abastecimiento a ON a.numeroCotizacion = da.numeroCotizacion\n"
                    + "GROUP BY ot.idOrden\n"
                    + "ORDER BY ot.idOrden ASC;\n";
            PreparedStatement pst;
            pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            seguimiento.tblNV.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + ex.getMessage()
            );
        }
    }//GEN-LAST:event_btnSeguimientoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInventarioProductos;
    private javax.swing.JButton btnMantenedorBodegas;
    private javax.swing.JButton btnNotaCompra;
    private javax.swing.JButton btnNotaVenta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeguimiento;
    public javax.swing.JMenu codigoAutorizacionMenuTag;
    public javax.swing.JMenu contactoMenuTag;
    private javax.swing.JPanel contenedor;
    public javax.swing.JMenu fonoMenuTag;
    public javax.swing.JMenu idUsuarioMenuTag;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuFecha;
    private javax.swing.JMenu menuHora;
    public javax.swing.JMenu menuUserName;
    private javax.swing.JPanel panelRojo;
    // End of variables declaration//GEN-END:variables
}


import clases.Conexion;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Diego González Román
 */
public class Login extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conecta();

    public Login() {
        initComponents();

        idUsuarioMenuTag.setVisible(false);
        fonoMenuTag.setVisible(false);
        codigoAutorizacionMenuTag.setVisible(false);
        contactoMenuTag.setVisible(false);
        this.setTitle("Iniciar Sesión");

        container.setBackground(new Color(0, 0, 0, 0));

        panelInvisible1.setBackground(new Color(0, 0, 0, 0));
        panelInvisible2.setBackground(new Color(0, 0, 0, 0));

        btnLogin1.setOpaque(false);
        btnLogin1.setContentAreaFilled(false);
        btnLogin1.setBorderPainted(false);

        loginFrame.setSize(1280, 720);
        //Fecha
        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MMM/YYYY");
        menuFecha.setText(" Fecha: " + formato.format(sistFecha));
        //Hora
        Timer tiempo = new Timer(100, (ActionListener) new Login.horas());
        tiempo.start();
        /*
         try {
         String query = "select descripcion from glosariotipodespacho";
         PreparedStatement pst = cn.prepareStatement(query);
         ResultSet rs = pst.executeQuery();
         while (rs.next()) {
         cmbTipoDespacho.addItem(rs.getString(1));
         }
         } catch (Exception ex) {
         JOptionPane.showMessageDialog(null, ex.getMessage());
         }
         */
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

    public void LoginUser() {

        String user = txtUsuario1.getText();
        String pass = String.valueOf(txtContrasena1.getPassword());
        String nombre = null;
        String credencial = null;
        try {
            String query = "select * from usuario where CorreoUsuario=? and Pass=?";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setString(1, txtUsuario1.getText());
            pst.setString(2, String.valueOf(txtContrasena1.getPassword()));
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                nombre = rs.getString("NombreUsuario");
                credencial = rs.getString("Credencial");
                idUsuarioMenuTag.setText(rs.getString("idUsuario"));
                codigoAutorizacionMenuTag.setText(rs.getString("codigo_autorizacion"));
                contactoMenuTag.setText(rs.getString("nombreusuario"));
                fonoMenuTag.setText(rs.getString("telefono"));
            }
            System.out.println(credencial);
            if (credencial.equals("Logistica") || credencial.equals("Administrador") || credencial.equals("Jefe de Estadística")) {
                this.dispose();
                Menu menu = new Menu();
                menu.setVisible(true);
                menu.menuUserName.setText(" Nombre de Usuario: " + nombre);
                menu.codigoAutorizacionMenuTag.setText(codigoAutorizacionMenuTag.getText());
                menu.contactoMenuTag.setText(contactoMenuTag.getText());
                menu.fonoMenuTag.setText(fonoMenuTag.getText());
                menu.idUsuarioMenuTag.setText(idUsuarioMenuTag.getText());

                String queryMovimiento = "INSERT INTO actividad (idUsuario,accion,tiempoAccion) "
                        + "VALUES(?,?,Now())";
                PreparedStatement pstMovimiento;
                pstMovimiento = cn.prepareStatement(queryMovimiento);
                pstMovimiento.setInt(1, Integer.parseInt(idUsuarioMenuTag.getText()));
                pstMovimiento.setString(2, "Inicio de Sesión");
                int up = pstMovimiento.executeUpdate();

            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña inválidos");
            }
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    //Metodos de Generación de QR
    public static void createQRCode(String qrCodeData, String filePath,
            String charset, Map hintMap, int qrCodeheight, int qrCodewidth)
            throws WriterException, IOException {
        BitMatrix matrix = new MultiFormatWriter().encode(
                new String(qrCodeData.getBytes(charset), charset),
                BarcodeFormat.QR_CODE, qrCodewidth, qrCodeheight, hintMap);
        MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath
                .lastIndexOf('.') + 1), new File(filePath));
    }

    public static String readQRCode(String filePath, String charset, Map hintMap)
            throws FileNotFoundException, IOException, NotFoundException {
        BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(
                new BufferedImageLuminanceSource(
                        ImageIO.read(new FileInputStream(filePath)))));
        Result qrCodeResult = new MultiFormatReader().decode(binaryBitmap,
                hintMap);
        return qrCodeResult.getText();
    }

    private static final String ALPHA_NUMERIC_STRING = "0123456789";

    public static String randomAlphaNumeric(int count) {

        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }

    private void ReiniciarTablaProductos(JTable tblProducto) {
        try {
            String queryProducto = "Select idProducto as 'ID producto', SKU, categoria as 'Categoría', nombreProducto as 'Producto', descripcion as 'Descripción',\n"
                    + "Concat('$',precioVenta )as 'Precio Venta', precioCosto as 'Precio Costo', distribuidor as 'Nombre de Distribuidor', regiones as 'Regiones',\n"
                    + "CondicionDespacho as 'Condición de Despacho', diasHabiles as 'Días Hábiles', StatusProducto as 'Estado', stock as 'Stock'\n"
                    + "FROM inventario r;";
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginFrame = new javax.swing.JInternalFrame();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        container = new javax.swing.JPanel();
        panelInvisible6 = new javax.swing.JPanel();
        panelInvisible5 = new javax.swing.JPanel();
        panelInvisible1 = new javax.swing.JPanel();
        panelInvisible8 = new javax.swing.JPanel();
        panelCampos = new javax.swing.JPanel();
        btnLogin1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuario1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblCredencial1 = new javax.swing.JLabel();
        txtContrasena1 = new javax.swing.JPasswordField();
        panelInvisible7 = new javax.swing.JPanel();
        panelInvisible2 = new javax.swing.JPanel();
        lblFondoLogin = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUserName = new javax.swing.JMenu();
        menuHora = new javax.swing.JMenu();
        menuFecha = new javax.swing.JMenu();
        codigoAutorizacionMenuTag = new javax.swing.JMenu();
        contactoMenuTag = new javax.swing.JMenu();
        fonoMenuTag = new javax.swing.JMenu();
        idUsuarioMenuTag = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 740));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 740));

        loginFrame.setMaximumSize(new java.awt.Dimension(1280, 740));
        loginFrame.setMinimumSize(new java.awt.Dimension(1280, 740));
        loginFrame.setPreferredSize(new java.awt.Dimension(1280, 740));
        loginFrame.setVisible(true);

        container.setLayout(new java.awt.GridLayout(3, 2, 2, 20));

        panelInvisible6.setBackground(new Color(0, 0, 0, 0));
        panelInvisible6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelInvisible6Layout = new javax.swing.GroupLayout(panelInvisible6);
        panelInvisible6.setLayout(panelInvisible6Layout);
        panelInvisible6Layout.setHorizontalGroup(
            panelInvisible6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelInvisible6Layout.setVerticalGroup(
            panelInvisible6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        container.add(panelInvisible6);

        panelInvisible5.setBackground(new Color(0, 0, 0, 0));
        panelInvisible5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelInvisible5Layout = new javax.swing.GroupLayout(panelInvisible5);
        panelInvisible5.setLayout(panelInvisible5Layout);
        panelInvisible5Layout.setHorizontalGroup(
            panelInvisible5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelInvisible5Layout.setVerticalGroup(
            panelInvisible5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        container.add(panelInvisible5);

        panelInvisible1.setBackground(new Color(0, 0, 0, 0));
        panelInvisible1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelInvisible1Layout = new javax.swing.GroupLayout(panelInvisible1);
        panelInvisible1.setLayout(panelInvisible1Layout);
        panelInvisible1Layout.setHorizontalGroup(
            panelInvisible1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        panelInvisible1Layout.setVerticalGroup(
            panelInvisible1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );

        container.add(panelInvisible1);

        panelInvisible8.setBackground(new Color(0, 0, 0, 0));
        panelInvisible8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panelCampos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelCampos.setAlignmentX(1.0F);
        panelCampos.setAlignmentY(1.0F);
        panelCampos.setAutoscrolls(true);

        btnLogin1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnLogin1.setText("Iniciar Sesión");
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Iniciar Sesión");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Correo:");

        txtUsuario1.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        txtUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Contraseña:");

        txtContrasena1.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        txtContrasena1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        txtContrasena1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelCamposLayout = new javax.swing.GroupLayout(panelCampos);
        panelCampos.setLayout(panelCamposLayout);
        panelCamposLayout.setHorizontalGroup(
            panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCamposLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCamposLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCamposLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(txtUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelCamposLayout.createSequentialGroup()
                        .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCredencial1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtContrasena1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCamposLayout.setVerticalGroup(
            panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCamposLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtContrasena1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin1)
                    .addComponent(lblCredencial1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelInvisible8Layout = new javax.swing.GroupLayout(panelInvisible8);
        panelInvisible8.setLayout(panelInvisible8Layout);
        panelInvisible8Layout.setHorizontalGroup(
            panelInvisible8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInvisible8Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(panelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        panelInvisible8Layout.setVerticalGroup(
            panelInvisible8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInvisible8Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(panelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        container.add(panelInvisible8);

        panelInvisible7.setBackground(new Color(0, 0, 0, 0));
        panelInvisible7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelInvisible7Layout = new javax.swing.GroupLayout(panelInvisible7);
        panelInvisible7.setLayout(panelInvisible7Layout);
        panelInvisible7Layout.setHorizontalGroup(
            panelInvisible7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelInvisible7Layout.setVerticalGroup(
            panelInvisible7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        container.add(panelInvisible7);

        panelInvisible2.setBackground(new Color(0, 0, 0, 0));
        panelInvisible2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelInvisible2Layout = new javax.swing.GroupLayout(panelInvisible2);
        panelInvisible2.setLayout(panelInvisible2Layout);
        panelInvisible2Layout.setHorizontalGroup(
            panelInvisible2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelInvisible2Layout.setVerticalGroup(
            panelInvisible2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        container.add(panelInvisible2);

        lblFondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Background.png"))); // NOI18N

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFondoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFondoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jLayeredPane1.setLayer(container, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblFondoLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout loginFrameLayout = new javax.swing.GroupLayout(loginFrame.getContentPane());
        loginFrame.getContentPane().setLayout(loginFrameLayout);
        loginFrameLayout.setHorizontalGroup(
            loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        loginFrameLayout.setVerticalGroup(
            loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFrameLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1)
                .addGap(0, 0, 0))
        );

        menuUserName.setText(" Nombre de Usuario: No Conectado ");
        jMenuBar1.add(menuUserName);

        menuHora.setText(" Hora: ");
        jMenuBar1.add(menuHora);

        menuFecha.setText(" Fecha: ");
        jMenuBar1.add(menuFecha);
        jMenuBar1.add(codigoAutorizacionMenuTag);
        jMenuBar1.add(contactoMenuTag);
        jMenuBar1.add(fonoMenuTag);
        jMenuBar1.add(idUsuarioMenuTag);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void txtContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyPressed
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                LoginUser();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña Inválidos");
        }
    }//GEN-LAST:event_txtContrasenaKeyPressed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                LoginUser();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña Inválidos");
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            LoginUser();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña Inválidos");
        }
    }//GEN-LAST:event_btnLoginActionPerformed
    public boolean ordenRegistrada(String codigoOC) {
        try {
            boolean registrada = false;
            String codOC = "";
            String query = "Select codigoOrdenCompra FROM ordendecompra where codigoOrdenCompra=?";
            PreparedStatement pst;
            pst = cn.prepareStatement(query);
            pst.setString(1, codigoOC);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                codOC = rs.getString("codigoOrdenCompra");
            }
            if (codigoOC.equals(codOC)) {
                registrada = true;
                return true;
            } else {
                registrada = false;
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return false;
    }

    private void selectRows(JTable table, int start, int end) {
        // Use this mode to demonstrate the following examples
        table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        // Needs to be set or rows cannot be selected
        table.setRowSelectionAllowed(true);
        // Select rows from start to end if start is 0 we change to 1 or leave it (used to preserve coloums headers)
        table.setRowSelectionInterval(start, end - 1);
        System.out.println("Se han seleccionado todas las rows");
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin1;
    private javax.swing.JMenu codigoAutorizacionMenuTag;
    private javax.swing.JMenu contactoMenuTag;
    private javax.swing.JPanel container;
    private javax.swing.JMenu fonoMenuTag;
    private javax.swing.JMenu idUsuarioMenuTag;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblCredencial1;
    private javax.swing.JLabel lblFondoLogin;
    private javax.swing.JInternalFrame loginFrame;
    private javax.swing.JMenu menuFecha;
    private javax.swing.JMenu menuHora;
    private javax.swing.JMenu menuUserName;
    private javax.swing.JPanel panelCampos;
    private javax.swing.JPanel panelInvisible1;
    private javax.swing.JPanel panelInvisible2;
    private javax.swing.JPanel panelInvisible5;
    private javax.swing.JPanel panelInvisible6;
    private javax.swing.JPanel panelInvisible7;
    private javax.swing.JPanel panelInvisible8;
    private javax.swing.JPasswordField txtContrasena1;
    private javax.swing.JTextField txtUsuario1;
    // End of variables declaration//GEN-END:variables
}

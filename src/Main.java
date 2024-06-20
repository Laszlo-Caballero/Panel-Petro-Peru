
import Funciones.FPdf;
import Funciones.Pages;
import Paneles.Login;
import java.awt.Color;


/**
 *
 * @author laszlo
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    Pages pages = new Pages();
    FPdf pdf = new FPdf();
    Login login;
    
    Color mouseEnterColor = new Color(0,0,0);
    Color mouseExitColor = new Color(51,51,51);
    public Main() {
        initComponents();
        pdf.generar();
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);
        //login = new Login(bg);
        //pages.ViewPages(login, bg);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBD = new javax.swing.ButtonGroup();
        grupoMotivoBD = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefonoACT = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        comboVia = new javax.swing.JComboBox<>();
        txtNomVia = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        radioNo = new javax.swing.JRadioButton();
        radioSi = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtNombreRE = new javax.swing.JTextField();
        txtApellidoRE = new javax.swing.JTextField();
        txtDniRE = new javax.swing.JTextField();
        txtEmailRE = new javax.swing.JTextField();
        txtTelefonoRE = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        comboViaRE = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        txtDepartamentoRE = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtNumeroRE = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtNomViaRE = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtEntradaRE = new javax.swing.JTextField();
        txtSalidaRE = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtNombreBD = new javax.swing.JTextField();
        txtApellidoBD = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        radioNoBD = new javax.swing.JRadioButton();
        radioSiBD = new javax.swing.JRadioButton();
        jLabel45 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        comboNomBD = new javax.swing.JComboBox<>();
        txtDatoBD = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        comboPeriodoBD = new javax.swing.JComboBox<>();
        jPanel25 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        comboMotivo = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        bttnFiltrarBD = new javax.swing.JButton();
        bttnBuscarBD = new javax.swing.JButton();
        bttnAsignar = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaE = new javax.swing.JTable();
        jLabel76 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        comboNomP = new javax.swing.JComboBox<>();
        txtDatoP = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        comboPeriodoP = new javax.swing.JComboBox<>();
        jPanel26 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        comboBuscarE = new javax.swing.JComboBox<>();
        jLabel84 = new javax.swing.JLabel();
        txtDatoE = new javax.swing.JTextField();
        jPanel29 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 10));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, 10));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("l");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Petro Peru");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 90));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(204, 0, 51));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/empleadoo.png"))); // NOI18N
        jLabel3.setText("   Empleados");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 260, 70));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pago.png"))); // NOI18N
        jLabel4.setText("   Pagos");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 260, 70));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Opciones");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 260, 70));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/asistencia.png"))); // NOI18N
        jLabel6.setText("   Asistencia");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 260, 70));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel10MouseExited(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/actualizacion.png"))); // NOI18N
        jLabel7.setText("   Actualización");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 260, 70));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Contratos.png"))); // NOI18N
        jLabel8.setText("   Contratos");
        jPanel11.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 260, 70));

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel12MouseExited(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BonDes.png"))); // NOI18N
        jLabel9.setText("   BonDes");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jPanel12.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 260, 70));

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel13MouseExited(evt);
            }
        });
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/registroo.png"))); // NOI18N
        jLabel10.setText("   Registros");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        jPanel13.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, -1));

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 70));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 260, 750));

        jPanel17.setBackground(new java.awt.Color(250, 250, 250));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellidos", "Dni", "Telefono", "Correo", "Dirección"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel17.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 810, 140));

        jLabel11.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 51));
        jLabel11.setText("Actualizar empleados");
        jPanel17.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Dni");
        jPanel17.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, 30));

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Apellido");
        jPanel17.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, 30));

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Información Vivienda");
        jPanel17.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Numero");
        jPanel17.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, -1, 30));

        jLabel18.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Tipo Via");
        jPanel17.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, 30));

        jLabel19.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Nombre");
        jPanel17.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, 30));

        jLabel20.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Telefono");
        jPanel17.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, 30));

        txtNombre.setEditable(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel17.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 220, 30));

        txtDni.setEditable(false);
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        jPanel17.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 220, 30));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel17.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 300, 30));

        txtTelefonoACT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoACTActionPerformed(evt);
            }
        });
        jPanel17.add(txtTelefonoACT, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 160, 30));

        jLabel21.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Información Personal");
        jPanel17.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        comboVia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avenida", "Calle", "Pasaje" }));
        jPanel17.add(comboVia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 170, 30));

        txtNomVia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomViaActionPerformed(evt);
            }
        });
        jPanel17.add(txtNomVia, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 160, 30));

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        jPanel17.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, 140, 30));

        txtApellido.setEditable(false);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel17.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 220, 30));

        jLabel22.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Nombre");
        jPanel17.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 30));

        jLabel23.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Email");
        jPanel17.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ActualizarLog.jpg"))); // NOI18N
        jPanel17.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, -20, -1, -1));

        jPanel18.setBackground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 890, 40));

        jPanel19.setBackground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jPanel20.setBackground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jPanel21.setBackground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 890, 40));

        jButton2.setText("ACTUALIZAR");
        jPanel17.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 540, 90, 40));

        jTabbedPane1.addTab("tab4", jPanel17);

        jPanel14.setBackground(new java.awt.Color(250, 250, 250));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 0, 51));
        jLabel17.setText("Registrar empleados");
        jPanel14.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel24.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Información Empresa");
        jPanel14.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jLabel25.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Telefono");
        jPanel14.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, 30));

        jLabel26.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("Nombre");
        jPanel14.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, 30));

        jLabel27.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("Apellidos");
        jPanel14.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 30));

        jLabel28.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("Dependiente");
        jPanel14.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, 30));

        jLabel29.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("Correo");
        jPanel14.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, 30));

        jLabel30.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setText("Dni");
        jPanel14.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, 30));

        radioNo.setText("No");
        jPanel14.add(radioNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        radioSi.setText("Si");
        jPanel14.add(radioSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        jLabel31.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Información Personal");
        jPanel14.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel32.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Información Vivienda");
        jPanel14.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        txtNombreRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreREActionPerformed(evt);
            }
        });
        jPanel14.add(txtNombreRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 220, 30));

        txtApellidoRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoREActionPerformed(evt);
            }
        });
        jPanel14.add(txtApellidoRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 220, 30));

        txtDniRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniREActionPerformed(evt);
            }
        });
        jPanel14.add(txtDniRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 220, 30));

        txtEmailRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailREActionPerformed(evt);
            }
        });
        jPanel14.add(txtEmailRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 300, 30));

        txtTelefonoRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoREActionPerformed(evt);
            }
        });
        jPanel14.add(txtTelefonoRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 160, 30));

        jLabel33.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));
        jLabel33.setText("Tipo Via");
        jPanel14.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, 30));

        comboViaRE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avenida", "Calle", "Pasaje" }));
        jPanel14.add(comboViaRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 170, 30));

        jLabel34.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setText("Salida");
        jPanel14.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, -1, 30));

        txtDepartamentoRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartamentoREActionPerformed(evt);
            }
        });
        jPanel14.add(txtDepartamentoRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 160, 30));

        jLabel35.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setText("Numero");
        jPanel14.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, -1, 30));

        txtNumeroRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroREActionPerformed(evt);
            }
        });
        jPanel14.add(txtNumeroRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, 140, 30));

        jLabel36.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 51, 51));
        jLabel36.setText("Nombre");
        jPanel14.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, 30));

        txtNomViaRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomViaREActionPerformed(evt);
            }
        });
        jPanel14.add(txtNomViaRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 160, 30));

        jLabel37.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 51, 51));
        jLabel37.setText("Departamento");
        jPanel14.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, 30));

        jLabel38.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("Entrada");
        jPanel14.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, -1, 30));

        txtEntradaRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntradaREActionPerformed(evt);
            }
        });
        jPanel14.add(txtEntradaRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, 140, 30));

        txtSalidaRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalidaREActionPerformed(evt);
            }
        });
        jPanel14.add(txtSalidaRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 140, 30));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RegistroLog.jpg"))); // NOI18N
        jPanel14.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, -1, -1));

        jPanel22.setBackground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 870, 40));

        jPanel23.setBackground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 680, 40));

        jPanel24.setBackground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 870, 40));

        jButton1.setText("REGISTRAR");
        jPanel14.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 100, 30));

        jTabbedPane1.addTab("tab1", jPanel14);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(204, 0, 51));
        jLabel40.setText("BonDes");
        jPanel16.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel41.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 51, 51));
        jLabel41.setText("Agregar un nuevo motivo");
        jPanel16.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, 30));

        jLabel42.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 51, 51));
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/busqueda.png"))); // NOI18N
        jPanel16.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, 30));

        jLabel43.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(51, 51, 51));
        jLabel43.setText("Apellido");
        jPanel16.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 30));

        txtNombreBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreBDActionPerformed(evt);
            }
        });
        jPanel16.add(txtNombreBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 220, 30));

        txtApellidoBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoBDActionPerformed(evt);
            }
        });
        jPanel16.add(txtApellidoBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 220, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel16.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 180, 30));

        jLabel44.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(51, 51, 51));
        jLabel44.setText("Motivo");
        jPanel16.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, 30));

        grupoMotivoBD.add(radioNoBD);
        radioNoBD.setText("No");
        jPanel16.add(radioNoBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, -1, -1));

        grupoMotivoBD.add(radioSiBD);
        radioSiBD.setText("Si");
        jPanel16.add(radioSiBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, -1, -1));

        jLabel45.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(51, 51, 51));
        jLabel45.setText("Nombre");
        jPanel16.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 30));

        grupoBD.add(jRadioButton1);
        jRadioButton1.setText("Descuento");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel16.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        grupoBD.add(jRadioButton2);
        jRadioButton2.setText("Bonificación");
        jPanel16.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Dni", "Salario", "Motivo", "Porcentaje", "Total", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel16.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 840, 210));

        jLabel46.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 51, 51));
        jLabel46.setText("Tipo de Asignación:");
        jPanel16.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, 30));

        jLabel47.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(51, 51, 51));
        jLabel47.setText("Dato:");
        jPanel16.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, 30));

        comboNomBD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellido", "Dni" }));
        jPanel16.add(comboNomBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 150, 30));

        txtDatoBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatoBDActionPerformed(evt);
            }
        });
        jPanel16.add(txtDatoBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 220, 30));

        jLabel49.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(51, 51, 51));
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/motivo.png"))); // NOI18N
        jPanel16.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        jLabel50.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(51, 51, 51));
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Filtro.png"))); // NOI18N
        jLabel50.setText("Filtros:");
        jPanel16.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, 30));

        jLabel51.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 51, 51));
        jLabel51.setText("Motivo");
        jPanel16.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, 30));

        comboPeriodoBD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre", " " }));
        jPanel16.add(comboPeriodoBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 150, 30));

        jPanel25.setBackground(new java.awt.Color(204, 0, 51));

        jLabel48.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Busqueda y Filtros");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel48)
                .addContainerGap(664, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addContainerGap())
        );

        jPanel16.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 850, 40));

        jLabel52.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 51, 51));
        jLabel52.setText("  Buscar por");
        jPanel16.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, 20));

        jLabel53.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(51, 51, 51));
        jLabel53.setText("Periodo");
        jPanel16.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, 30));

        comboMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel16.add(comboMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 150, 30));

        jLabel54.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 51, 51));
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BondesLog.jpg"))); // NOI18N
        jPanel16.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, 110));

        jLabel55.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 51, 51));
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calendario.png"))); // NOI18N
        jPanel16.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 30, 30));

        bttnFiltrarBD.setText("FILTRAR");
        jPanel16.add(bttnFiltrarBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 70, 30));

        bttnBuscarBD.setText("BUSCAR");
        jPanel16.add(bttnBuscarBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 70, 30));

        bttnAsignar.setText("ASIGNAR");
        jPanel16.add(bttnAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 70, 30));

        jTabbedPane1.addTab("tab3", jPanel16);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(204, 0, 51));
        jLabel56.setText("Empleados");
        jPanel15.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jPanel27.setBackground(new java.awt.Color(221, 221, 221));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 51, 51));
        jLabel57.setText("S/. XXXXXXXX");
        jPanel27.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, 30));

        jLabel58.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(51, 51, 51));
        jLabel58.setText("Descuentos");
        jPanel27.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, 30));

        jLabel59.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(51, 51, 51));
        jLabel59.setText("Total a Pagar por Periodo");
        jPanel27.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel60.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(51, 51, 51));
        jLabel60.setText("Detallado");
        jPanel27.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        jLabel61.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(51, 51, 51));
        jLabel61.setText("Bruto");
        jPanel27.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        jLabel62.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(51, 51, 51));
        jLabel62.setText("Beneficios");
        jPanel27.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, 30));

        jLabel63.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(51, 51, 51));
        jLabel63.setText("S/. XXXXXXXX");
        jPanel27.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, 30));

        jLabel64.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(51, 51, 51));
        jLabel64.setText("S/. XXXXXXXX");
        jPanel27.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        jLabel65.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(51, 51, 51));
        jLabel65.setText("S/. XXXXXXXX");
        jPanel27.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, 30));

        jPanel15.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 380, 190));

        jPanel28.setBackground(new java.awt.Color(204, 0, 51));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel66.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("S/. XXXXXXXX");
        jPanel28.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, 30));

        jLabel67.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Descuentos");
        jPanel28.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, 30));

        jLabel68.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Total Pagado el Año");
        jPanel28.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel69.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Detallado");
        jPanel28.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        jLabel70.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Bruto");
        jPanel28.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        jLabel71.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Beneficios");
        jPanel28.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, 30));

        jLabel72.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("S/. XXXXXXXX");
        jPanel28.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, 30));

        jLabel73.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("S/. XXXXXXXX");
        jPanel28.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        jLabel74.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("S/. XXXXXXXX");
        jPanel28.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, 30));

        jPanel15.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 380, 190));

        tablaE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Dni", "Departamento", "Salario", "Beneficios", "Descuentos", "Total"
            }
        ));
        jScrollPane3.setViewportView(tablaE);

        jPanel15.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 800, 210));

        jLabel76.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(204, 0, 51));
        jLabel76.setText("Pagos");
        jPanel15.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel79.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(51, 51, 51));
        jLabel79.setText("  Buscar por");
        jPanel15.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, 20));

        jLabel80.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(51, 51, 51));
        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Filtro.png"))); // NOI18N
        jPanel15.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, 30));

        comboNomP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellido", "Dni" }));
        jPanel15.add(comboNomP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 150, 30));

        txtDatoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatoPActionPerformed(evt);
            }
        });
        jPanel15.add(txtDatoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 220, 30));

        jLabel81.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(51, 51, 51));
        jLabel81.setText("Dato:");
        jPanel15.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, -1, 30));

        jLabel82.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(51, 51, 51));
        jLabel82.setText("Filtrar por periodo");
        jPanel15.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, 30));

        jLabel83.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(51, 51, 51));
        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/busqueda.png"))); // NOI18N
        jPanel15.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, 30));

        comboPeriodoP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre", " " }));
        jPanel15.add(comboPeriodoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 150, 30));

        jTabbedPane1.addTab("tab2", jPanel15);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel75.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(204, 0, 51));
        jLabel75.setText("Empleados");
        jPanel26.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Apellidos", "Dni", "Telefono", "Correo", "Direccion", "Departamento", "Estado"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jPanel26.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 900, 150));

        jLabel77.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(51, 51, 51));
        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/busqueda.png"))); // NOI18N
        jPanel26.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 30));

        jLabel78.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(51, 51, 51));
        jLabel78.setText("  Buscar por");
        jPanel26.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 20));

        comboBuscarE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellido", "Dni" }));
        jPanel26.add(comboBuscarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 150, 30));

        jLabel84.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(51, 51, 51));
        jLabel84.setText("Dato:");
        jPanel26.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, 30));

        txtDatoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatoEActionPerformed(evt);
            }
        });
        jPanel26.add(txtDatoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 220, 30));

        jTabbedPane1.addTab("tab5", jPanel26);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel85.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(204, 0, 51));
        jLabel85.setText("Empleados");
        jPanel29.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTabbedPane1.addTab("tab6", jPanel29);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 1110, 710));

        setBounds(0, 0, 1215, 740);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtTelefonoACTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoACTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoACTActionPerformed

    private void txtNomViaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomViaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomViaActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtNombreREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreREActionPerformed

    private void txtApellidoREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoREActionPerformed

    private void txtDniREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniREActionPerformed

    private void txtEmailREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailREActionPerformed

    private void txtTelefonoREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoREActionPerformed

    private void txtDepartamentoREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartamentoREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartamentoREActionPerformed

    private void txtNumeroREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroREActionPerformed

    private void txtNomViaREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomViaREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomViaREActionPerformed

    private void txtEntradaREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntradaREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntradaREActionPerformed

    private void txtSalidaREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalidaREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalidaREActionPerformed

    private void txtNombreBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreBDActionPerformed

    private void txtApellidoBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoBDActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void txtDatoBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatoBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatoBDActionPerformed

    private void txtDatoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatoPActionPerformed

    private void txtDatoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatoEActionPerformed

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
        jPanel13.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        // TODO add your handling code here:
        jPanel13.setBackground(mouseExitColor);
    }//GEN-LAST:event_jLabel10MouseExited

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jPanel13MouseClicked

    private void jPanel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseEntered
        // TODO add your handling code here:
        jPanel13.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jPanel13MouseEntered

    private void jPanel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseExited
        // TODO add your handling code here:
        jPanel13.setBackground(mouseExitColor);
    }//GEN-LAST:event_jPanel13MouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseEntered
        // TODO add your handling code here:
        jPanel10.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jPanel10MouseEntered

    private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseExited
        // TODO add your handling code here:
        jPanel10.setBackground(mouseExitColor);
    }//GEN-LAST:event_jPanel10MouseExited

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
        jPanel10.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
        jPanel10.setBackground(mouseExitColor);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jPanel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseEntered
        // TODO add your handling code here:
        jPanel12.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jPanel12MouseEntered

    private void jPanel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseExited
        // TODO add your handling code here:
        jPanel12.setBackground(mouseExitColor);
    }//GEN-LAST:event_jPanel12MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
        jPanel12.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
        jPanel12.setBackground(mouseExitColor);
    }//GEN-LAST:event_jLabel9MouseExited

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnAsignar;
    private javax.swing.JButton bttnBuscarBD;
    private javax.swing.JButton bttnFiltrarBD;
    private javax.swing.JComboBox<String> comboBuscarE;
    private javax.swing.JComboBox<String> comboMotivo;
    private javax.swing.JComboBox<String> comboNomBD;
    private javax.swing.JComboBox<String> comboNomP;
    private javax.swing.JComboBox<String> comboPeriodoBD;
    private javax.swing.JComboBox<String> comboPeriodoP;
    private javax.swing.JComboBox<String> comboVia;
    private javax.swing.JComboBox<String> comboViaRE;
    private javax.swing.ButtonGroup grupoBD;
    private javax.swing.ButtonGroup grupoMotivoBD;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JRadioButton radioNo;
    private javax.swing.JRadioButton radioNoBD;
    private javax.swing.JRadioButton radioSi;
    private javax.swing.JRadioButton radioSiBD;
    private javax.swing.JTable tablaE;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoBD;
    private javax.swing.JTextField txtApellidoRE;
    private javax.swing.JTextField txtDatoBD;
    private javax.swing.JTextField txtDatoE;
    private javax.swing.JTextField txtDatoP;
    private javax.swing.JTextField txtDepartamentoRE;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDniRE;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailRE;
    private javax.swing.JTextField txtEntradaRE;
    private javax.swing.JTextField txtNomVia;
    private javax.swing.JTextField txtNomViaRE;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreBD;
    private javax.swing.JTextField txtNombreRE;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumeroRE;
    private javax.swing.JTextField txtSalidaRE;
    private javax.swing.JTextField txtTelefonoACT;
    private javax.swing.JTextField txtTelefonoRE;
    // End of variables declaration//GEN-END:variables
}

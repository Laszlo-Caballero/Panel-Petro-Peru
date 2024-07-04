
import Database.Crud;
import Funciones.FPdf;
import Funciones.FTable;
import Funciones.Pages;
import Paneles.ActContrato;
import Paneles.ActEmpleado;
import Paneles.Login;
import Paneles.VerDependiente;

import java.awt.Color;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import static picocli.CommandLine.Help.Ansi.Style.bg;


/**
 *
 * @author laszlo
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    Pages pages = new Pages();
    FPdf pdf = new FPdf("01310691");
    Login login;
    String ruta_archivo = "";
    ActEmpleado pEmpleado = new ActEmpleado();
    ActContrato pContrato = new ActContrato();
    Crud crud = new Crud();
    FTable ftable = new FTable();

    int columna, row;
    
    Color mouseEnterColor = new Color(0,0,0);
    Color mouseExitColor = new Color(51,51,51);
    public Main() {
        initComponents();
        pdf.generar();
        this.setLocationRelativeTo(null);
        pdf.generar();
        //login = new Login(bg);
        //pages.ViewPages(login, bg);
        JButton BtnDependiente = new JButton("Ver Dependiente");
        BtnDependiente.setName("btn1");
        JButton[] botones = {BtnDependiente};
        String parametros[] = {};
        ResultSet datosE = crud.SelectCondition("Select E.Nombre, E.ApellidoPaterno + E.ApellidoMaterno As 'Apellidos', E.Dni, E.Telefono, U.email, C.TipoVia + C.Nombre + CAST(C.Numero as varchar) AS 'Direccion', D.Nombre as 'Departamento' from Empleado E inner join Usuario U on U.IdUsuario = E.IdUsuario inner join Direccion C on C.IdDireccion = E.IdDireccion inner join Departamento D on D.IdDepartamento = E.IdDepartamento", parametros);
        ftable.InsertarDatos(tablaEmp, datosE, botones);
        ResultSet datosC = crud.SelectCondition("Select E.Nombre, E.ApellidoPaterno + E.ApellidoMaterno As 'Apellidos', E.Dni, D.Nombre AS 'Departamento', c.Sede, c.Salario from Empleado E inner join Departamento D on D.IdDepartamento = E.IdDepartamento inner join Contrato C on c.IdContrato = e.IdEmpleado", parametros);
        ftable.InsertarDatos(tablaC, datosC);
        ResultSet datosBD = crud.SelectCondition("Select e.Nombre, E.ApellidoPaterno + e.ApellidoMaterno AS Apellidos, E.Dni, C.Salario, M.Motivo, M.Porcentaje, (M.Porcentaje) * C.Salario  AS Total, AB.Fecha from AsignacionBonificacion AB inner join Empleado E on E.IdEmpleado = AB.IdEmpleado inner join Contrato C on C.IdContrato = E.IdContrato inner join Bonificacion B on B.IdBonificacion = AB.IdBonificacion inner join Motivo M on M.IdMotivo = B.IdMotivo ", parametros);
        ftable.InsertarDatos(tablaBonDes, datosBD);
        ResultSet datosPG = crud.SelectCondition("SELECT E.Nombre, E.ApellidoPaterno + ' ' + E.ApellidoMaterno AS Apellidos, E.Dni, D.Nombre AS Departamento, C.Salario,(SELECT SUM(ROUND(M.Porcentaje * C.Salario, 0)) FROM AsignacionBonificacion AB INNER JOIN Contrato C ON C.IdContrato = E.IdContrato INNER JOIN Bonificacion B ON B.IdBonificacion = AB.IdBonificacion INNER JOIN Motivo M ON M.IdMotivo = B.IdMotivo WHERE AB.IdEmpleado = E.IdEmpleado) AS TotalBonificaciones, (SELECT SUM(ROUND(R.Porcentaje * C.Salario, 0))  FROM AsignacionDescuento AD INNER JOIN Contrato C ON C.IdContrato = E.IdContrato INNER JOIN Descuento D ON D.IdDescuento = AD.IdDescuento INNER JOIN Razon R ON R.IdRazon = D.IdRazon WHERE AD.IdEmpleado = E.IdEmpleado) AS TotalDescuentos, (C.Salario + ( SELECT SUM(ROUND(M.Porcentaje * C.Salario, 0)) FROM AsignacionBonificacion AB INNER JOIN Contrato C ON C.IdContrato = E.IdContrato INNER JOIN Bonificacion B ON B.IdBonificacion = AB.IdBonificacion INNER JOIN Motivo M ON M.IdMotivo = B.IdMotivo WHERE AB.IdEmpleado = E.IdEmpleado) ) - (SELECT SUM(ROUND(R.Porcentaje * C.Salario, 0)) FROM AsignacionDescuento AD INNER JOIN Contrato C ON C.IdContrato = E.IdContrato INNER JOIN Descuento D ON D.IdDescuento = AD.IdDescuento INNER JOIN Razon R ON R.IdRazon = D.IdRazon WHERE AD.IdEmpleado = E.IdEmpleado) AS PAGO FROM Empleado E inner join Contrato C on C.IdContrato = E.IdContrato inner join Departamento D ON D.IdDepartamento = E.IdDepartamento", parametros);
        ftable.InsertarDatos(tablaPG, datosPG);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBD = new javax.swing.ButtonGroup();
        grupoMotivoBD = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
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
        jPanel26 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaEmp = new javax.swing.JTable();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        comboBuscarE = new javax.swing.JComboBox<>();
        jLabel84 = new javax.swing.JLabel();
        txtDatoE = new javax.swing.JTextField();
        btnMostrar = new javax.swing.JButton();
        btnBuscarE = new javax.swing.JButton();
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
        jPanel17 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        bg = new javax.swing.JPanel();
        comboA = new javax.swing.JComboBox<>();
        btnSeleccionarAA = new javax.swing.JButton();
        btnActualizarA = new javax.swing.JButton();
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
        radioDes = new javax.swing.JRadioButton();
        radioBon = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaBonDes = new javax.swing.JTable();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        comboBuscarBD = new javax.swing.JComboBox<>();
        txtDatoBD = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        bttnBuscarBD = new javax.swing.JButton();
        bttnAsignar = new javax.swing.JButton();
        btnMostrarBD = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        txtDatoC = new javax.swing.JTextField();
        comboBuscarC = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaC = new javax.swing.JTable();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        btnSeleccionarC = new javax.swing.JButton();
        txtSede = new javax.swing.JTextField();
        txtNombreC = new javax.swing.JTextField();
        txtApellidosC = new javax.swing.JTextField();
        txtDniC = new javax.swing.JTextField();
        txtDepartamentoC = new javax.swing.JTextField();
        txtSedeC = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnBuscarC = new javax.swing.JButton();
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
        tablaPG = new javax.swing.JTable();
        jLabel76 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        comboNomP = new javax.swing.JComboBox<>();
        txtDatoP = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("l");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Grifo Paijan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 90));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(204, 0, 51));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/empleadoo.png"))); // NOI18N
        jLabel3.setText("   Empleados");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 260, 70));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pago.png"))); // NOI18N
        jLabel4.setText("   Pagos");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 260, 70));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Opciones");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 260, 70));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/asistencia.png"))); // NOI18N
        jLabel6.setText("   Asistencia");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 260, 70));

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

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 260, 70));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel11MouseExited(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Contratos.png"))); // NOI18N
        jLabel8.setText("   Contratos");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        jPanel11.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 260, 70));

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

        jPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 260, 70));

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

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 260, 70));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 260, 750));

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel75.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(204, 0, 51));
        jLabel75.setText("Empleados");
        jPanel26.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        tablaEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellidos", "Dni", "Telefono", "Correo", "Direccion", "Departamento", "Ver Dependientes"
            }
        ));
        tablaEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaEmp);

        jPanel26.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 900, 220));

        jLabel77.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(51, 51, 51));
        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/busqueda.png"))); // NOI18N
        jPanel26.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 30));

        jLabel78.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(51, 51, 51));
        jLabel78.setText("  Buscar por");
        jPanel26.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 20));

        comboBuscarE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellido", "Dni", "Departamento" }));
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

        btnMostrar.setText("MOSTRAR TODO");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel26.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 140, 30));

        btnBuscarE.setText("BUSCAR");
        btnBuscarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEActionPerformed(evt);
            }
        });
        jPanel26.add(btnBuscarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 80, 30));

        jTabbedPane1.addTab("tab5", jPanel26);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
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

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 51));
        jLabel11.setText("Actualización");
        jPanel17.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

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

        bg.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jPanel17.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 940, 560));

        comboA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleados", "Contratos" }));
        comboA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAActionPerformed(evt);
            }
        });
        jPanel17.add(comboA, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 180, 30));

        btnSeleccionarAA.setText("SELECCIONAR");
        btnSeleccionarAA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarAAActionPerformed(evt);
            }
        });
        jPanel17.add(btnSeleccionarAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 120, 30));

        btnActualizarA.setText("ACTUALIZAR");
        jPanel17.add(btnActualizarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 110, 30));

        jTabbedPane1.addTab("tab4", jPanel17);

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
        jPanel16.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 30));

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

        grupoBD.add(radioDes);
        radioDes.setText("Descuento");
        radioDes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioDesMouseClicked(evt);
            }
        });
        radioDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDesActionPerformed(evt);
            }
        });
        jPanel16.add(radioDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        grupoBD.add(radioBon);
        radioBon.setText("Bonificación");
        radioBon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioBonMouseClicked(evt);
            }
        });
        jPanel16.add(radioBon, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        tablaBonDes.setModel(new javax.swing.table.DefaultTableModel(
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
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaBonDes);

        jPanel16.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 840, 260));

        jLabel46.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 51, 51));
        jLabel46.setText("Tipo de Asignación:");
        jPanel16.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, 30));

        jLabel47.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(51, 51, 51));
        jLabel47.setText("Dato:");
        jPanel16.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, 30));

        comboBuscarBD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellido", "Dni", " " }));
        jPanel16.add(comboBuscarBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 150, 30));

        txtDatoBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatoBDActionPerformed(evt);
            }
        });
        jPanel16.add(txtDatoBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 190, 30));

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
        jPanel16.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 20));

        jLabel54.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 51, 51));
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BondesLog.jpg"))); // NOI18N
        jPanel16.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, 110));

        bttnBuscarBD.setText("BUSCAR");
        bttnBuscarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBuscarBDActionPerformed(evt);
            }
        });
        jPanel16.add(bttnBuscarBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 90, 30));

        bttnAsignar.setText("ASIGNAR");
        jPanel16.add(bttnAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, 90, 30));

        btnMostrarBD.setText("MOSTRAR");
        btnMostrarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarBDActionPerformed(evt);
            }
        });
        jPanel16.add(btnMostrarBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 90, 30));

        jTabbedPane1.addTab("tab3", jPanel16);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel85.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(204, 0, 51));
        jLabel85.setText("Contratos");
        jPanel29.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel49.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/busqueda.png"))); // NOI18N
        jPanel29.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel51.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel51.setText("Dato");
        jPanel29.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, 30));

        jLabel86.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel86.setText("Apellidos");
        jPanel29.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, 30));
        jPanel29.add(txtDatoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 190, -1));

        comboBuscarC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Dni", "Departamento" }));
        jPanel29.add(comboBuscarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 170, -1));

        tablaC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Dni", "Departamento", "Sede", "Salario"
            }
        ));
        jScrollPane5.setViewportView(tablaC);

        jPanel29.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 870, 220));

        jLabel87.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel87.setText("Buscar por:");
        jPanel29.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, 30));

        jLabel88.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel88.setText("Archivo");
        jPanel29.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, 30));

        jLabel89.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel89.setText("Nombre");
        jPanel29.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 30));

        jLabel91.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel91.setText("Dni");
        jPanel29.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, -1, 30));

        jLabel93.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel93.setText("Departamento");
        jPanel29.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, 30));

        jLabel94.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel94.setText("Sede");
        jPanel29.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, 30));

        jLabel95.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel95.setText("Salario");
        jPanel29.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, -1, 30));

        btnSeleccionarC.setText("Seleccionar...");
        btnSeleccionarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarCActionPerformed(evt);
            }
        });
        jPanel29.add(btnSeleccionarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 280, 30));
        jPanel29.add(txtSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 140, -1));
        jPanel29.add(txtNombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 150, -1));
        jPanel29.add(txtApellidosC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 200, -1));
        jPanel29.add(txtDniC, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 140, -1));
        jPanel29.add(txtDepartamentoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 140, -1));
        jPanel29.add(txtSedeC, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 140, -1));

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(890, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Información Personal");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        jPanel29.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 870, 40));

        jPanel4.setBackground(new java.awt.Color(204, 0, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(890, 40));

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Información Empresarial");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addContainerGap(621, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel29.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 870, 40));

        jButton2.setText("AGREGAR");
        jPanel29.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 90, 30));

        btnBuscarC.setText("BUSCAR");
        btnBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCActionPerformed(evt);
            }
        });
        jPanel29.add(btnBuscarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 80, 30));

        jTabbedPane1.addTab("tab6", jPanel29);

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

        tablaPG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Dni", "Departamento", "Salario", "Beneficios", "Descuentos", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaPG);

        jPanel15.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 800, 210));

        jLabel76.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(204, 0, 51));
        jLabel76.setText("Pagos");
        jPanel15.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel79.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(51, 51, 51));
        jLabel79.setText("  Buscar por");
        jPanel15.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, 20));

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

        jLabel83.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(51, 51, 51));
        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/busqueda.png"))); // NOI18N
        jPanel15.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, 30));

        jTabbedPane1.addTab("tab2", jPanel15);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 1110, 740));

        setBounds(0, 0, 1215, 740);
    }// </editor-fold>//GEN-END:initComponents

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

    private void radioDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDesActionPerformed

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
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
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
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
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

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        // TODO add your handling code here:
        jPanel7.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        jPanel7.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        // TODO add your handling code here:
        jPanel7.setBackground(mouseExitColor);
    }//GEN-LAST:event_jPanel7MouseExited

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        jPanel7.setBackground(mouseExitColor);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jPanel11MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jPanel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseEntered
        // TODO add your handling code here:
        jPanel11.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jPanel11MouseEntered

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
        jPanel11.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jPanel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseExited
        // TODO add your handling code here:
        jPanel11.setBackground(mouseExitColor);
    }//GEN-LAST:event_jPanel11MouseExited

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
        jPanel11.setBackground(mouseExitColor);
    }//GEN-LAST:event_jLabel8MouseExited

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        // TODO add your handling code here:
        jPanel9.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        jPanel9.setBackground(mouseEnterColor);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
        // TODO add your handling code here:
        jPanel9.setBackground(mouseExitColor);
    }//GEN-LAST:event_jPanel9MouseExited

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        jPanel9.setBackground(mouseExitColor);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        // TODO add your handling code here:
        jPanel6.setBackground(new Color(146,0,36));
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        // TODO add your handling code here:
        jPanel6.setBackground(new Color(204,0,51));
    }//GEN-LAST:event_jPanel6MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        jPanel6.setBackground(new Color(146,0,36));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        jPanel6.setBackground(new Color(146,0,36));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnSeleccionarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarCActionPerformed
        // TODO add your handling code here:
                JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fi = new FileNameExtensionFilter("pdf", "pdf");
        j.setFileFilter(fi);
        int se = j.showOpenDialog(this);
        if (se == 0) {
            this.btnSeleccionarC.setText("" + j.getSelectedFile().getName());
            ruta_archivo = j.getSelectedFile().getAbsolutePath();

        } else {
        }
    }//GEN-LAST:event_btnSeleccionarCActionPerformed

    private void comboAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAActionPerformed

    private void btnSeleccionarAAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarAAActionPerformed
        // TODO add your handling code here:
        String actualizar = comboA.getSelectedItem().toString();
        
        if(actualizar == "Empleados"){
            pages.ViewPages(pEmpleado, bg);
        }
        else if(actualizar == "Contratos"){
            pages.ViewPages(pContrato, bg);
        }
    }//GEN-LAST:event_btnSeleccionarAAActionPerformed

    private void radioBonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioBonMouseClicked
        // TODO add your handling code here:
        String parametros[] = {};
        ResultSet datosB = crud.SelectCondition("Select e.Nombre, E.ApellidoPaterno + e.ApellidoMaterno AS Apellidos, E.Dni, C.Salario, M.Motivo, M.Porcentaje, (M.Porcentaje) * C.Salario  AS Total, AB.Fecha from AsignacionBonificacion AB inner join Empleado E on E.IdEmpleado = AB.IdEmpleado inner join Contrato C on C.IdContrato = E.IdContrato inner join Bonificacion B on B.IdBonificacion = AB.IdBonificacion inner join Motivo M on M.IdMotivo = B.IdMotivo", parametros);
        ftable.InsertarDatos(tablaBonDes, datosB);
    }//GEN-LAST:event_radioBonMouseClicked

    private void radioDesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioDesMouseClicked
        // TODO add your handling code here:
        String parametros[] = {};
        ResultSet datosD = crud.SelectCondition("Select E.Nombre,E.ApellidoPaterno + e.ApellidoMaterno AS Apellidos, E.Dni, C.Salario, R.Razon, R.Porcentaje, ROUND((R.Porcentaje)* c.Salario,0) AS total, AD.Fecha from AsignacionDescuento AD inner join Empleado E on E.IdEmpleado = AD.IdEmpleado inner join Contrato C on C.IdContrato = E.IdContrato inner join Descuento D on D.IdDescuento = AD.IdDescuento inner join Razon R on R.IdRazon = D.IdRazon", parametros);
        ftable.InsertarDatos(tablaBonDes, datosD);
    }//GEN-LAST:event_radioDesMouseClicked

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        String parametros[] = {};
        ResultSet datosE = crud.SelectCondition("Select E.Nombre, E.ApellidoPaterno + E.ApellidoMaterno As 'Apellidos', E.Dni, E.Telefono, U.email, C.TipoVia + C.Nombre + CAST(C.Numero as varchar) AS 'Direccion', D.Nombre as 'Departamento' from Empleado E inner join Usuario U on U.IdUsuario = E.IdUsuario inner join Direccion C on C.IdDireccion = E.IdDireccion inner join Departamento D on D.IdDepartamento = E.IdDepartamento", parametros);
        ftable.InsertarDatos(tablaEmp, datosE);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnBuscarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEActionPerformed
        // TODO add your handling code here:
        String combo = comboBuscarE.getSelectedItem().toString(); 
            String buscar = txtDatoE.getText();
            String parametros[] = {buscar};
        switch (combo){
            case "Nombre" -> {
                ResultSet datosN = crud.SelectCondition("Select E.Nombre,E.ApellidoPaterno + E.ApellidoMaterno As 'Apellidos', E.Dni, E.Telefono, U.email, C.TipoVia + C.Nombre + CAST(C.Numero as varchar) AS 'Direccion', D.Nombre as 'Departamento' from Empleado E inner join Usuario U on U.IdUsuario = E.IdUsuario inner join Direccion C on C.IdDireccion = E.IdDireccion inner join Departamento D on D.IdDepartamento = E.IdDepartamento Where E.Nombre = ?", parametros);
                ftable.InsertarDatos(tablaEmp, datosN);
            }
            case "Apellido" -> {
                ResultSet datosA = crud.SelectCondition("Select E.Nombre,E.ApellidoPaterno + E.ApellidoMaterno As 'Apellidos', E.Dni, E.Telefono, U.email, C.TipoVia + C.Nombre + CAST(C.Numero as varchar) AS 'Direccion', D.Nombre as 'Departamento' from Empleado E inner join Usuario U on U.IdUsuario = E.IdUsuario inner join Direccion C on C.IdDireccion = E.IdDireccion inner join Departamento D on D.IdDepartamento = E.IdDepartamento	Where E.ApellidoPaterno = ?", parametros);
                ftable.InsertarDatos(tablaEmp, datosA);
            }
            case "Dni" -> {
                ResultSet datosD = crud.SelectCondition("Select E.Nombre,E.ApellidoPaterno + E.ApellidoMaterno As 'Apellidos', E.Dni, E.Telefono, U.email, C.TipoVia + C.Nombre + CAST(C.Numero as varchar) AS 'Direccion', D.Nombre as 'Departamento' from Empleado E inner join Usuario U on U.IdUsuario = E.IdUsuario inner join Direccion C on C.IdDireccion = E.IdDireccion inner join Departamento D on D.IdDepartamento = E.IdDepartamento	Where E.Dni = ?", parametros);
                ftable.InsertarDatos(tablaEmp, datosD);
            }
            case "Departamento" -> {
                ResultSet datosDE = crud.SelectCondition("Select E.Nombre,E.ApellidoPaterno + E.ApellidoMaterno As 'Apellidos', E.Dni, E.Telefono, U.email, C.TipoVia + C.Nombre + CAST(C.Numero as varchar) AS 'Direccion', D.Nombre as 'Departamento' from Empleado E inner join Usuario U on U.IdUsuario = E.IdUsuario inner join Direccion C on C.IdDireccion = E.IdDireccion inner join Departamento D on D.IdDepartamento = E.IdDepartamento Where D.Nombre = ?", parametros);
                ftable.InsertarDatos(tablaEmp, datosDE);
            }                
        }
    }//GEN-LAST:event_btnBuscarEActionPerformed

    private void bttnBuscarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBuscarBDActionPerformed
        // TODO add your handling code here:
        if(radioDes.isSelected()){
            String combo = comboBuscarBD.getSelectedItem().toString(); 
            String buscar = txtDatoBD.getText();
            String parametros[] = {buscar};
            switch (combo){
                case "Nombre" -> {
                    ResultSet datosN = crud.SelectCondition("Select E.Nombre,E.Apellido + e.ApellidoMaterno AS Apellidos, E.Dni, C.Salario, R.Razon, R.Porcentaje, ROUND((R.Porcentaje)* c.Salario,0) AS total, AD.Fecha from AsignacionDescuento AD inner join Empleado E on E.IdEmpleado = AD.IdEmpleado inner join Contrato C on C.IdContrato = E.IdContrato inner join Descuento D on D.IdDescuento = AD.IdDescuento inner join Razon R on R.IdRazon = D.IdRazon Where E.Nombre = ?", parametros);
                    ftable.InsertarDatos(tablaBonDes, datosN);
                }
                case "Apellido" -> {
                    ResultSet datosA = crud.SelectCondition("Select E.Nombre,E.ApellidoPaterno + e.ApellidoMaterno AS Apellidos, E.Dni, C.Salario, R.Razon, R.Porcentaje, ROUND((R.Porcentaje)* c.Salario,0) AS total, AD.Fecha from AsignacionDescuento AD inner join Empleado E on E.IdEmpleado = AD.IdEmpleado inner join Contrato C on C.IdContrato = E.IdContrato inner join Descuento D on D.IdDescuento = AD.IdDescuento inner join Razon R on R.IdRazon = D.IdRazon Where E.ApellidoPaterno = ?", parametros);
                    ftable.InsertarDatos(tablaBonDes, datosA);                    
                }
                case "Dni" -> {
                    ResultSet datosD = crud.SelectCondition("Select E.Nombre,E.ApellidoPaterno + e.ApellidoMaterno AS Apellidos, E.Dni, C.Salario, R.Razon, R.Porcentaje, ROUND((R.Porcentaje)* c.Salario,0) AS total, AD.Fecha from AsignacionDescuento AD inner join Empleado E on E.IdEmpleado = AD.IdEmpleado inner join Contrato C on C.IdContrato = E.IdContrato inner join Descuento D on D.IdDescuento = AD.IdDescuento inner join Razon R on R.IdRazon = D.IdRazon Where E.Dni = ?", parametros);
                    ftable.InsertarDatos(tablaBonDes, datosD); 
                }
            }
        }
        else if(radioBon.isSelected()){
            String combo = comboBuscarBD.getSelectedItem().toString(); 
            String buscar = txtDatoBD.getText();
            String parametros[] = {buscar};
                switch (combo){
                case "Nombre" -> {
                    ResultSet datosN = crud.SelectCondition("Select e.Nombre, E.ApellidoPaterno + e.ApellidoMaterno AS Apellidos,E.Dni, C.Salario, M.Motivo, M.Porcentaje, (M.Porcentaje) * C.Salario  AS Total, AB.Fecha from AsignacionBonificacion AB inner join Empleado E on E.IdEmpleado = AB.IdEmpleado inner join Contrato C on C.IdContrato = E.IdContrato inner join Bonificacion B on B.IdBonificacion = AB.IdBonificacion inner join Motivo M on M.IdMotivo = B.IdMotivo Where E.Nombre = ?", parametros);
                    ftable.InsertarDatos(tablaBonDes, datosN);
                }
                case "Apellido" -> {
                    ResultSet datosA = crud.SelectCondition("Select e.Nombre, E.ApellidoPaterno + e.ApellidoMaterno AS Apellidos,E.Dni, C.Salario, M.Motivo, M.Porcentaje, (M.Porcentaje) * C.Salario  AS Total, AB.Fecha from AsignacionBonificacion AB inner join Empleado E on E.IdEmpleado = AB.IdEmpleado inner join Contrato C on C.IdContrato = E.IdContrato inner join Bonificacion B on B.IdBonificacion = AB.IdBonificacion inner join Motivo M on M.IdMotivo = B.IdMotivo Where E.ApellidoPaterno = ?", parametros);
                    ftable.InsertarDatos(tablaBonDes, datosA);                    
                }
                case "Dni" -> {
                    ResultSet datosD = crud.SelectCondition("Select e.Nombre, E.ApellidoPaterno + e.ApellidoMaterno AS Apellidos,E.Dni, C.Salario, M.Motivo, M.Porcentaje, (M.Porcentaje) * C.Salario  AS Total, AB.Fecha from AsignacionBonificacion AB inner join Empleado E on E.IdEmpleado = AB.IdEmpleado inner join Contrato C on C.IdContrato = E.IdContrato inner join Bonificacion B on B.IdBonificacion = AB.IdBonificacion inner join Motivo M on M.IdMotivo = B.IdMotivo Where E.Dni = ?", parametros);
                    ftable.InsertarDatos(tablaBonDes, datosD); 
                }
            }
        }
    }//GEN-LAST:event_bttnBuscarBDActionPerformed

    private void btnMostrarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarBDActionPerformed
        // TODO add your handling code here:
        if(radioBon.isSelected()){
            String parametros[] = {};            
            ResultSet datosBD = crud.SelectCondition("Select e.Nombre, E.ApellidoPaterno + e.ApellidoMaterno AS Apellidos, E.Dni, C.Salario, M.Motivo, M.Porcentaje, (M.Porcentaje) * C.Salario  AS Total, AB.Fecha from AsignacionBonificacion AB inner join Empleado E on E.IdEmpleado = AB.IdEmpleado inner join Contrato C on C.IdContrato = E.IdContrato inner join Bonificacion B on B.IdBonificacion = AB.IdBonificacion inner join Motivo M on M.IdMotivo = B.IdMotivo ", parametros);
            ftable.InsertarDatos(tablaBonDes, datosBD);
        }
        else if (radioDes.isSelected()){
            String parametros[] = {};
            ResultSet datosD = crud.SelectCondition("Select E.Nombre,E.ApellidoPaterno + e.ApellidoMaterno AS Apellidos, E.Dni, C.Salario, R.Razon, R.Porcentaje, ROUND((R.Porcentaje)* c.Salario,0) AS total, AD.Fecha from AsignacionDescuento AD inner join Empleado E on E.IdEmpleado = AD.IdEmpleado inner join Contrato C on C.IdContrato = E.IdContrato inner join Descuento D on D.IdDescuento = AD.IdDescuento inner join Razon R on R.IdRazon = D.IdRazon", parametros);
            ftable.InsertarDatos(tablaBonDes, datosD);
        }
    }//GEN-LAST:event_btnMostrarBDActionPerformed

    private void btnBuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCActionPerformed
        // TODO add your handling code here:
         String combo = comboBuscarC.getSelectedItem().toString(); 
         String buscar = txtDatoC.getText();
         String parametros[] = {buscar};
            switch (combo){
            case "Nombre" -> {
                ResultSet datosN = crud.SelectCondition("Select E.Nombre, E.ApellidoPaterno + E.ApellidoMaterno As 'Apellidos', E.Dni, D.Nombre AS 'Departamento', c.Sede, c.Salario from Empleado E inner join Departamento D on D.IdDepartamento = E.IdDepartamento inner join Contrato C on c.IdContrato = e.IdEmpleado Where E.Nombre = ?", parametros);
                ftable.InsertarDatos(tablaC, datosN);
            }
            case "Dni" -> {
                ResultSet datosD = crud.SelectCondition("Select E.Nombre, E.ApellidoPaterno + E.ApellidoMaterno As 'Apellidos', E.Dni, D.Nombre AS 'Departamento', c.Sede, c.Salario from Empleado E inner join Departamento D on D.IdDepartamento = E.IdDepartamento inner join Contrato C on c.IdContrato = e.IdEmpleado Where E.Dni = ?", parametros);
                ftable.InsertarDatos(tablaC, datosD);
            }
            case "Departamento" -> {
                ResultSet datosDE = crud.SelectCondition("Select E.Nombre, E.ApellidoPaterno + E.ApellidoMaterno As 'Apellidos', E.Dni, D.Nombre AS 'Departamento', c.Sede, c.Salario from Empleado E inner join Departamento D on D.IdDepartamento = E.IdDepartamento inner join Contrato C on c.IdContrato = e.IdEmpleado Where D.Nombre = ?", parametros);
                ftable.InsertarDatos(tablaC, datosDE);
            }                
        }
    }//GEN-LAST:event_btnBuscarCActionPerformed

    private void tablaEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpMouseClicked
        columna = tablaEmp.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY()/tablaEmp.getRowHeight();
        if(columna <= tablaEmp.getColumnCount() && columna >=0 && row <= tablaEmp.getRowCount() && row >=0){
            Object objeto = tablaEmp.getValueAt(row, columna);
            if(objeto instanceof JButton){
                ((JButton)objeto).doClick();
                JButton boton = (JButton) objeto;
                if(boton.getName() == "btn1"){
                    Object dni = tablaEmp.getValueAt(row, 2);
                    System.out.println(dni.toString());
                    VerDependiente ver = new VerDependiente(dni.toString());
                    ver.setVisible(true);
                }
            }
        }

    }//GEN-LAST:event_tablaEmpMouseClicked

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
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnActualizarA;
    private javax.swing.JButton btnBuscarC;
    private javax.swing.JButton btnBuscarE;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnMostrarBD;
    private javax.swing.JButton btnSeleccionarAA;
    private javax.swing.JButton btnSeleccionarC;
    private javax.swing.JButton bttnAsignar;
    private javax.swing.JButton bttnBuscarBD;
    private javax.swing.JComboBox<String> comboA;
    private javax.swing.JComboBox<String> comboBuscarBD;
    private javax.swing.JComboBox<String> comboBuscarC;
    private javax.swing.JComboBox<String> comboBuscarE;
    private javax.swing.JComboBox<String> comboNomP;
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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
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
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton radioBon;
    private javax.swing.JRadioButton radioDes;
    private javax.swing.JRadioButton radioNo;
    private javax.swing.JRadioButton radioNoBD;
    private javax.swing.JRadioButton radioSi;
    private javax.swing.JRadioButton radioSiBD;
    private javax.swing.JTable tablaBonDes;
    private javax.swing.JTable tablaC;
    private javax.swing.JTable tablaEmp;
    private javax.swing.JTable tablaPG;
    private javax.swing.JTextField txtApellidoBD;
    private javax.swing.JTextField txtApellidoRE;
    private javax.swing.JTextField txtApellidosC;
    private javax.swing.JTextField txtDatoBD;
    private javax.swing.JTextField txtDatoC;
    private javax.swing.JTextField txtDatoE;
    private javax.swing.JTextField txtDatoP;
    private javax.swing.JTextField txtDepartamentoC;
    private javax.swing.JTextField txtDepartamentoRE;
    private javax.swing.JTextField txtDniC;
    private javax.swing.JTextField txtDniRE;
    private javax.swing.JTextField txtEmailRE;
    private javax.swing.JTextField txtEntradaRE;
    private javax.swing.JTextField txtNomViaRE;
    private javax.swing.JTextField txtNombreBD;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtNombreRE;
    private javax.swing.JTextField txtNumeroRE;
    private javax.swing.JTextField txtSalidaRE;
    private javax.swing.JTextField txtSede;
    private javax.swing.JTextField txtSedeC;
    private javax.swing.JTextField txtTelefonoRE;
    // End of variables declaration//GEN-END:variables
}

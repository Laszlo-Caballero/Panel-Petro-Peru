/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;

/**
 *
 * @author LUCIANA
 */
public class Registro extends javax.swing.JPanel {

     
    RegDependiente pDependiente = new RegDependiente();
    
    /**
     * Creates new form Registro
     */
    public Registro() {
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

        grupoEmp = new javax.swing.ButtonGroup();
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
        jLabel35 = new javax.swing.JLabel();
        txtNumeroRE = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtNomViaRE = new javax.swing.JTextField();
        CuentaSaldo = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        CuentaSaldo1 = new javax.swing.JLabel();
        txtAfp = new javax.swing.JTextField();
        comboDepaRE = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        grupoEmp.add(radioNo);
        radioNo.setText("No");
        jPanel14.add(radioNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        grupoEmp.add(radioSi);
        radioSi.setText("Si");
        radioSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioSiMouseClicked(evt);
            }
        });
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

        CuentaSaldo.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        CuentaSaldo.setForeground(new java.awt.Color(51, 51, 51));
        CuentaSaldo.setText("CuentaAfp");
        jPanel14.add(CuentaSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, -1, 30));

        jLabel38.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("Turno");
        jPanel14.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, -1, 30));

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
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 100, 40));

        jLabel40.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 51, 51));
        jLabel40.setText("Departamento");
        jPanel14.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, 30));

        txtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActionPerformed(evt);
            }
        });
        jPanel14.add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 160, 30));

        CuentaSaldo1.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        CuentaSaldo1.setForeground(new java.awt.Color(51, 51, 51));
        CuentaSaldo1.setText("CuentaSaldo");
        jPanel14.add(CuentaSaldo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, -1, 30));

        txtAfp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAfpActionPerformed(evt);
            }
        });
        jPanel14.add(txtAfp, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 160, 30));

        comboDepaRE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recursos Humanos", "Finanzas", "Marketing", "Ventas", "Tecnología", "Operaciones", "Servicio al Cliente", "Investigación", "Compras", "Legal" }));
        jPanel14.add(comboDepaRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 150, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mañana", "Tarde", "Noche" }));
        jPanel14.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 160, -1));

        add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 620));
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

    private void txtNumeroREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroREActionPerformed

    private void txtNomViaREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomViaREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomViaREActionPerformed

    private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoActionPerformed

    private void txtAfpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAfpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAfpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String departamento = comboDepaRE.getSelectedItem().toString();

        String nombre = txtNombreRE.getText();
        String[] apellidos = txtApellidoRE.getText().split(" ");
        String paterno = apellidos[0];
        String materno = apellidos[1];
        String dni = txtDniRE.getText();
        String telefono = txtTelefonoRE.getText();
        
        String via = comboViaRE.getSelectedItem().toString();
        String nomVia = txtNomViaRE.getText();
        String numero = txtNumeroRE.getText();
        
        String nomUser = nombre + paterno;
        String contraseña = dni;
        String correo = txtEmailRE.getText();
        String rol = "";
        
        if (departamento == "Recursos Humanos"){
            rol = "admin";
        } else{
            rol = "empleado";
        }

        String saldo = txtSaldo.getText();
        String afp = txtAfp.getText();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void radioSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioSiMouseClicked
        // TODO add your handling code here:
        pDependiente.setVisible(true);
        pDependiente.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);   
    }//GEN-LAST:event_radioSiMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CuentaSaldo;
    private javax.swing.JLabel CuentaSaldo1;
    private javax.swing.JComboBox<String> comboDepaRE;
    private javax.swing.JComboBox<String> comboViaRE;
    private javax.swing.ButtonGroup grupoEmp;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JRadioButton radioNo;
    private javax.swing.JRadioButton radioSi;
    private javax.swing.JTextField txtAfp;
    private javax.swing.JTextField txtApellidoRE;
    private javax.swing.JTextField txtDniRE;
    private javax.swing.JTextField txtEmailRE;
    private javax.swing.JTextField txtNomViaRE;
    private javax.swing.JTextField txtNombreRE;
    private javax.swing.JTextField txtNumeroRE;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTelefonoRE;
    // End of variables declaration//GEN-END:variables
}
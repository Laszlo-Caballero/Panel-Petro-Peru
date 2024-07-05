
import Database.Crud;
import Funciones.FPdf;
import Funciones.FTable;
import Funciones.Pages;
import Paneles.ActContrato;
import Paneles.ActEmpleado;
import Paneles.Actualizar;
import Paneles.BonDes;
import Paneles.Contratos;
import Paneles.Empleado;
import Paneles.Login;
import Paneles.Pagos;
import Paneles.Registro;
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
    Empleado pEmpelado = new Empleado();
    Contratos pContratos = new Contratos();
    BonDes pBonDes = new BonDes();
    Registro pRegistro = new Registro();
    Actualizar pActualizar = new Actualizar();
    Pagos pPagos = new Pagos();
    
    
    
    Crud crud = new Crud();
    FTable ftable = new FTable();

    public Main() {
        initComponents();
        pdf.generar();
        this.setLocationRelativeTo(null);
        pdf.generar();
        //login = new Login(bg);
        //pages.ViewPages(login, bg);
        
        
        pages.ViewPages(pEmpelado, bg); 
     
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
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnRegistros = new javax.swing.JButton();
        btnActualización = new javax.swing.JButton();
        btnContratos = new javax.swing.JButton();
        btnBon = new javax.swing.JButton();
        btnPagos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnRegistros1 = new javax.swing.JButton();
        bg = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("l");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Grifo Paijan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1370, 100));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Opciones");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 260, 70));

        btnRegistros.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        btnRegistros.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/registroo.png"))); // NOI18N
        btnRegistros.setText("Registros");
        btnRegistros.setBorderPainted(false);
        btnRegistros.setContentAreaFilled(false);
        btnRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrosActionPerformed(evt);
            }
        });
        jPanel5.add(btnRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 70));

        btnActualización.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        btnActualización.setForeground(new java.awt.Color(255, 255, 255));
        btnActualización.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/actualizacion.png"))); // NOI18N
        btnActualización.setText("Actualización");
        btnActualización.setBorderPainted(false);
        btnActualización.setContentAreaFilled(false);
        btnActualización.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizaciónActionPerformed(evt);
            }
        });
        jPanel5.add(btnActualización, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 260, 70));

        btnContratos.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        btnContratos.setForeground(new java.awt.Color(255, 255, 255));
        btnContratos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Contratos.png"))); // NOI18N
        btnContratos.setText("Contratos");
        btnContratos.setBorderPainted(false);
        btnContratos.setContentAreaFilled(false);
        btnContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratosActionPerformed(evt);
            }
        });
        jPanel5.add(btnContratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 70));

        btnBon.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        btnBon.setForeground(new java.awt.Color(255, 255, 255));
        btnBon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BonDes.png"))); // NOI18N
        btnBon.setText("BonDes");
        btnBon.setBorderPainted(false);
        btnBon.setContentAreaFilled(false);
        btnBon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBonMouseExited(evt);
            }
        });
        btnBon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBonActionPerformed(evt);
            }
        });
        jPanel5.add(btnBon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 260, 70));

        btnPagos.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        btnPagos.setForeground(new java.awt.Color(255, 255, 255));
        btnPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pago.png"))); // NOI18N
        btnPagos.setText("Pagos");
        btnPagos.setBorderPainted(false);
        btnPagos.setContentAreaFilled(false);
        btnPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagosActionPerformed(evt);
            }
        });
        jPanel5.add(btnPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 260, 70));

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));

        btnRegistros1.setBackground(new java.awt.Color(204, 0, 51));
        btnRegistros1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        btnRegistros1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistros1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/empleadoo.png"))); // NOI18N
        btnRegistros1.setText("Empleados");
        btnRegistros1.setBorderPainted(false);
        btnRegistros1.setContentAreaFilled(false);
        btnRegistros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistros1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegistros1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegistros1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 260, 70));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 260, 750));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 940, 610));

        setBounds(0, 0, 1215, 740);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrosActionPerformed
        // TODO add your handling code here:
        pages.ViewPages(pRegistro, bg);
    }//GEN-LAST:event_btnRegistrosActionPerformed

    private void btnActualizaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizaciónActionPerformed
        // TODO add your handling code here:
        pages.ViewPages(pActualizar, bg);
    }//GEN-LAST:event_btnActualizaciónActionPerformed

    private void btnContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratosActionPerformed
        // TODO add your handling code here:
        pages.ViewPages(pContratos, bg);
    }//GEN-LAST:event_btnContratosActionPerformed

    private void btnBonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBonMouseClicked

    private void btnBonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBonMouseEntered

    private void btnBonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBonMouseExited

    private void btnBonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBonActionPerformed
        // TODO add your handling code here:
        pages.ViewPages(pBonDes, bg);
    }//GEN-LAST:event_btnBonActionPerformed

    private void btnPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagosActionPerformed
        // TODO add your handling code here:
        pages.ViewPages(pPagos, bg);
    }//GEN-LAST:event_btnPagosActionPerformed

    private void btnRegistros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistros1ActionPerformed
        // TODO add your handling code here:
        pages.ViewPages(pEmpelado, bg);
    }//GEN-LAST:event_btnRegistros1ActionPerformed

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
    private javax.swing.JButton btnActualización;
    private javax.swing.JButton btnBon;
    private javax.swing.JButton btnContratos;
    private javax.swing.JButton btnPagos;
    private javax.swing.JButton btnRegistros;
    private javax.swing.JButton btnRegistros1;
    private javax.swing.ButtonGroup grupoBD;
    private javax.swing.ButtonGroup grupoMotivoBD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}

package raysproject;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.read.biff.BiffException;
public class DashBordForm extends javax.swing.JFrame {
    public DashBordForm() {
        initComponents();
         Image icon=Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/icon/repl_logo_(1)-small.png"));
        this.setIconImage(icon);
        setTitle("DashBoard");
        this.setLocationRelativeTo(null);
         
         Thread clock=new Thread(){
             @Override
             public void run(){
                 for(;;){
                    
                     try {
                          java.util.Date d=new java.util.Date();
                          lb.setText(DateFormat.getDateTimeInstance().format(d));
                          sleep(1000);
                     } catch (InterruptedException ex) {
                         Logger.getLogger(DashBordForm.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }
             }
         };
         clock.start();
        
           
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel55 = new javax.swing.JPanel();
        reg_ser = new javax.swing.JButton();
        adm_ser = new javax.swing.JButton();
        fee_bt = new javax.swing.JButton();
        jPanel56 = new javax.swing.JPanel();
        cert_bt = new javax.swing.JButton();
        chng_pass = new javax.swing.JButton();
        cor_tb = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rem_tb = new javax.swing.JButton();
        rec_cmb = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkEndColor(new java.awt.Color(18, 175, 140));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(18, 231, 175));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(700, 472));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 109, 136));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DASHBOARD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 11, 151, 48));

        lb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb.setForeground(new java.awt.Color(255, 255, 255));
        lb.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 200, 22));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout-sign.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 80, 30));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 70));

        reg_ser.setBackground(new java.awt.Color(0, 153, 153));
        reg_ser.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        reg_ser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/registration1.png"))); // NOI18N
        reg_ser.setText("Registration ");
        reg_ser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reg_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_serActionPerformed(evt);
            }
        });

        adm_ser.setBackground(new java.awt.Color(0, 153, 153));
        adm_ser.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        adm_ser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/admission1.png"))); // NOI18N
        adm_ser.setText("Admission ");
        adm_ser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adm_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adm_serActionPerformed(evt);
            }
        });

        fee_bt.setBackground(new java.awt.Color(0, 153, 153));
        fee_bt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fee_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fee (1).png"))); // NOI18N
        fee_bt.setText("Money Receipt");
        fee_bt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fee_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fee_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reg_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(adm_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(fee_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg_ser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adm_ser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fee_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        kGradientPanel1.add(jPanel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 850, -1));

        jPanel56.setBackground(new java.awt.Color(120, 179, 162));
        jPanel56.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cert_bt.setBackground(new java.awt.Color(204, 177, 238));
        cert_bt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cert_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/certificate.png"))); // NOI18N
        cert_bt.setText("Certificate details");
        cert_bt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cert_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cert_btActionPerformed(evt);
            }
        });
        jPanel56.add(cert_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 220, 40));

        chng_pass.setBackground(new java.awt.Color(204, 177, 238));
        chng_pass.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        chng_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/changepassword1.png"))); // NOI18N
        chng_pass.setText("Change Password");
        chng_pass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chng_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chng_passActionPerformed(evt);
            }
        });
        jPanel56.add(chng_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 220, 40));

        cor_tb.setBackground(new java.awt.Color(204, 177, 238));
        cor_tb.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cor_tb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/coursetb.png"))); // NOI18N
        cor_tb.setText("Course Details");
        cor_tb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cor_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cor_tbActionPerformed(evt);
            }
        });
        jPanel56.add(cor_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 220, 40));

        jButton1.setBackground(new java.awt.Color(204, 177, 238));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/branch1.png"))); // NOI18N
        jButton1.setText("BranchDetails");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel56.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 220, 40));

        jButton2.setBackground(new java.awt.Color(204, 177, 238));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/book1.png"))); // NOI18N
        jButton2.setText("BookDetails");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel56.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 220, 40));

        rem_tb.setBackground(new java.awt.Color(204, 177, 238));
        rem_tb.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rem_tb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/remainder1.png"))); // NOI18N
        rem_tb.setText("Cheack Installment");
        rem_tb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rem_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rem_tbActionPerformed(evt);
            }
        });
        jPanel56.add(rem_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 220, 40));

        rec_cmb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rec_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select anyOne For Recovery", "Registration", "Certificate", "Course", "Book_details", "signup", "state", "branch_details", "automatic", "admission", "money_receipt" }));
        rec_cmb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rec_cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rec_cmbActionPerformed(evt);
            }
        });
        jPanel56.add(rec_cmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 220, 40));

        kGradientPanel1.add(jPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 290, 490));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/dash1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 460, 490));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 530, 490));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rem_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rem_tbActionPerformed
         try {
            new RemainderForm ().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DashBordForm.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_rem_tbActionPerformed

    private void adm_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adm_serActionPerformed
        try {
            new AdmissionDetails().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DashBordForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_adm_serActionPerformed

    private void cor_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cor_tbActionPerformed
         try {
            new CourseMdiForm().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DashBordForm.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_cor_tbActionPerformed

    private void rec_cmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rec_cmbActionPerformed
        
        try {
            Recovery.recmethod(rec_cmb.getSelectedItem().toString());
        } catch (IOException ex) {
            Logger.getLogger(DashBordForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BiffException ex) {
            Logger.getLogger(DashBordForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DashBordForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rec_cmbActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          try {
            new BranchDetails().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DashBordForm.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          try {
            new BookEntSerForm().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DashBordForm.class.getName()).log(Level.SEVERE, null, ex);
        } 
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cert_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cert_btActionPerformed
        try {
            new CertificatePage().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DashBordForm.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_cert_btActionPerformed

    private void chng_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chng_passActionPerformed
         try {
            new ChangePassword().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DashBordForm.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_chng_passActionPerformed

    private void reg_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_serActionPerformed
        try {
            new regEntryForm().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DashBordForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reg_serActionPerformed

    private void fee_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fee_btActionPerformed
     try {
            new MONEYRECEIPT().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DashBordForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_fee_btActionPerformed

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
            java.util.logging.Logger.getLogger(DashBordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBordForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adm_ser;
    private javax.swing.JButton cert_bt;
    private javax.swing.JButton chng_pass;
    private javax.swing.JButton cor_tb;
    private javax.swing.JButton fee_bt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lb;
    private javax.swing.JComboBox<String> rec_cmb;
    private javax.swing.JButton reg_ser;
    private javax.swing.JButton rem_tb;
    // End of variables declaration//GEN-END:variables
}

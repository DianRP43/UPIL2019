package pbo.upil.views;

import java.awt.Frame;

/**
 *
 * @author Achapasya2109
 */
public class PemilihMasuk extends javax.swing.JFrame {

    /**
     * Creates new form Elector
     */
    public PemilihMasuk() {
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

        btnSelesai = new javax.swing.JButton();
        btnMasuk = new javax.swing.JButton();
        exit = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSelesai.setBackground(new java.awt.Color(49, 173, 226));
        btnSelesai.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnSelesai.setForeground(new java.awt.Color(250, 248, 240));
        btnSelesai.setText("Selesai");
        btnSelesai.setAlignmentY(0.0F);
        btnSelesai.setBorder(null);
        btnSelesai.setFocusable(false);
        btnSelesai.setOpaque(false);
        btnSelesai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSelesaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSelesaiMouseExited(evt);
            }
        });
        btnSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelesaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 235, 40));

        btnMasuk.setBackground(new java.awt.Color(49, 173, 226));
        btnMasuk.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnMasuk.setForeground(new java.awt.Color(255, 255, 255));
        btnMasuk.setText("Masuk");
        btnMasuk.setAlignmentY(1.0F);
        btnMasuk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        btnMasuk.setFocusable(false);
        btnMasuk.setOpaque(false);
        btnMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMasukMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMasukMouseExited(evt);
            }
        });
        btnMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasukActionPerformed(evt);
            }
        });
        getContentPane().add(btnMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 235, 40));

        exit.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(153, 153, 153));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("x");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, 30, -1));

        back.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        back.setForeground(new java.awt.Color(153, 153, 153));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("<");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 30, -1));

        minimize.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        minimize.setForeground(new java.awt.Color(153, 153, 153));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("_");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 30, -1));

        jLabel9.setFont(new java.awt.Font("Montserrat SemiBold", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(6, 62, 97));
        jLabel9.setText("NIM");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, -1));

        txtUsername.setFont(new java.awt.Font("Montserrat SemiBold", 0, 10)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(49, 173, 226));
        txtUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 230, 30));

        jSeparator1.setForeground(new java.awt.Color(49, 173, 226));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 230, 10));

        jLabel7.setFont(new java.awt.Font("Montserrat SemiBold", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(6, 62, 97));
        jLabel7.setText("Nama");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, -1, -1));

        txtPassword.setFont(new java.awt.Font("Montserrat SemiBold", 0, 10)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(49, 173, 226));
        txtPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 230, 30));

        jSeparator2.setForeground(new java.awt.Color(49, 173, 226));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 230, 10));

        bg.setBackground(new java.awt.Color(49, 173, 226));
        bg.setForeground(new java.awt.Color(250, 248, 240));
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbo/upil/media/login v.2.png"))); // NOI18N
        bg.setFocusable(false);
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelesaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelesaiMouseEntered
        // TODO add your handling code here:
        btnSelesai.setBackground(new java.awt.Color(6,62,97));
    }//GEN-LAST:event_btnSelesaiMouseEntered

    private void btnSelesaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelesaiMouseExited
        // TODO add your handling code here:
        btnSelesai.setBackground(new java.awt.Color(49,173,226));
    }//GEN-LAST:event_btnSelesaiMouseExited

    private void btnSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelesaiActionPerformed
        // TODO add your handling code here:
       TanyaPengguna tp = new TanyaPengguna();
        tp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSelesaiActionPerformed

    private void btnMasukMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMouseEntered
        btnMasuk.setBackground(new java.awt.Color(6,62,97));
    }//GEN-LAST:event_btnMasukMouseEntered

    private void btnMasukMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMouseExited
        btnMasuk.setBackground(new java.awt.Color(49,173,226));
    }//GEN-LAST:event_btnMasukMouseExited

    private void btnMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMasukActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        
        exit.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        
        exit.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_exitMouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
         back.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_backMouseExited

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_minimizeMouseExited

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(PemilihMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PemilihMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PemilihMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PemilihMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PemilihMasuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnMasuk;
    private javax.swing.JButton btnSelesai;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

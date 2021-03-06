/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.aruna.bookshop.views;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lk.aruna.bookshop.controller.LoginController;
import lk.aruna.bookshop.model.LoginInfo;

/**
 *
 * @author DELL
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();
        txt_emplyID.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_Name.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_Username.setBackground(new java.awt.Color(0, 0, 0, 1));
        
        jPanel1.setFocusable(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_cancle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_minimize = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Name = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txt_emplyID = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txt_Username = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btn_Apply = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_cancle.setBackground(new java.awt.Color(0, 51, 153));
        lbl_cancle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_cancle.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cancle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cancle.setText("X");
        lbl_cancle.setToolTipText("Cancel");
        lbl_cancle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_cancleMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_cancle, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 50, 40));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize.png"))); // NOI18N
        lbl_minimize.setToolTipText("Minimize");
        lbl_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_minimizeMouseClicked(evt);
            }
        });
        jPanel2.add(lbl_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 30, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 40));

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 230, 30));

        txt_Name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Name.setForeground(new java.awt.Color(255, 255, 255));
        txt_Name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_Name.setText("Enter your name");
        txt_Name.setBorder(null);
        txt_Name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_NameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_NameFocusLost(evt);
            }
        });
        jPanel1.add(txt_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 340, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 340, 10));

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Employee ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 230, 30));

        txt_emplyID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_emplyID.setForeground(new java.awt.Color(255, 255, 255));
        txt_emplyID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_emplyID.setText("Enter your employee ID");
        txt_emplyID.setBorder(null);
        txt_emplyID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_emplyIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_emplyIDFocusLost(evt);
            }
        });
        jPanel1.add(txt_emplyID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 340, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 340, 10));

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Username");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 230, 30));

        txt_Username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Username.setForeground(new java.awt.Color(255, 255, 255));
        txt_Username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_Username.setText("Enter a username");
        txt_Username.setBorder(null);
        txt_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_UsernameFocusLost(evt);
            }
        });
        jPanel1.add(txt_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 340, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 340, 10));

        btn_Apply.setBackground(new java.awt.Color(0, 0, 51));
        btn_Apply.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        btn_Apply.setForeground(new java.awt.Color(255, 255, 255));
        btn_Apply.setText("Apply");
        btn_Apply.setEnabled(false);
        btn_Apply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ApplyMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Apply, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 100, 30));

        btn_Cancel.setBackground(new java.awt.Color(0, 0, 51));
        btn_Cancel.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        btn_Cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_Cancel.setText("Cancel");
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 100, 30));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign Up");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 290, 60));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 330, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\Bookshop Project\\blur.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
         new Login().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btn_CancelActionPerformed

    private void lbl_cancleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cancleMouseClicked
        this.dispose();
    }//GEN-LAST:event_lbl_cancleMouseClicked

    private void lbl_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_minimizeMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lbl_minimizeMouseClicked

    private void txt_emplyIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emplyIDFocusGained
          if(txt_emplyID.getText().trim().equals("Enter your employee ID")){
            txt_emplyID.setText("");
    }
    }//GEN-LAST:event_txt_emplyIDFocusGained

    private void txt_emplyIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emplyIDFocusLost
         if(txt_emplyID.getText().trim().equals("")){
            txt_emplyID.setText("Enter your employee ID");
    }
    }//GEN-LAST:event_txt_emplyIDFocusLost

    private void txt_NameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NameFocusGained
          if(txt_Name.getText().trim().equals("Enter your name")){
            txt_Name.setText("");
    }
    }//GEN-LAST:event_txt_NameFocusGained

    private void txt_NameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NameFocusLost
         if(txt_Name.getText().trim().equals("")){
            txt_Name.setText("Enter your name");
    }
    }//GEN-LAST:event_txt_NameFocusLost

    private void txt_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_UsernameFocusGained
          if(txt_Username.getText().trim().equals("Enter a username")){
            txt_Username.setText("");
    }
    }//GEN-LAST:event_txt_UsernameFocusGained

    private void txt_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_UsernameFocusLost
          if(txt_Username.getText().trim().equals("")){
            txt_Username.setText("Enter a username");
    }
    }//GEN-LAST:event_txt_UsernameFocusLost

    private void btn_ApplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ApplyMouseClicked
        String enumber = txt_emplyID.getText();
        String name = txt_Name.getText();
        String username = txt_Username.getText();
        
        try {
            
            boolean isSaved = new LoginController().applyToLogin(new LoginInfo(enumber,name,username));
            
            if(isSaved){
                JOptionPane.showMessageDialog(this, "Continue");
                
            }else{
                JOptionPane.showMessageDialog(this, "Failed");
               
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        new SetPassword().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ApplyMouseClicked

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Apply;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lbl_cancle;
    private javax.swing.JLabel lbl_minimize;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_Username;
    private javax.swing.JTextField txt_emplyID;
    // End of variables declaration//GEN-END:variables
}

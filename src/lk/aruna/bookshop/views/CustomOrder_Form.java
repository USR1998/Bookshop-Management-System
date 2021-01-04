/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.aruna.bookshop.views;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class CustomOrder_Form extends javax.swing.JFrame {

    /**
     * Creates new form Books_Form
     */
    public CustomOrder_Form() {
        initComponents();
        txt_CustomerID.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_cust_NAME.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_cust_ADDRESS.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_cust_TP.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_BOOKNAME.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_BOOKID.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_QTY.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_ADVANCE.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_DATE.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_TIME.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_customOrderID.setBackground(new java.awt.Color(0, 0, 0, 1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_cancle = new javax.swing.JLabel();
        lbl_minimize = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_sold = new javax.swing.JButton();
        btn_placeOrder = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txt_TIME = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_cust_NAME = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txt_cust_ADDRESS = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txt_cust_TP = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txt_BOOKNAME = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        txt_BOOKID = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        txt_QTY = new javax.swing.JTextField();
        txt_ADVANCE = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        txt_customOrderID = new javax.swing.JTextField();
        txt_CustomerID = new javax.swing.JTextField();
        txt_DATE = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 153, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Custom Order");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 20));

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
        jPanel2.add(lbl_cancle, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 50, 40));

        lbl_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize.png"))); // NOI18N
        lbl_minimize.setToolTipText("Minimize");
        lbl_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_minimizeMouseClicked(evt);
            }
        });
        jPanel2.add(lbl_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 30, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 40));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Customer ID:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 110, 30));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Paid Advance");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 140, 30));

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Customer Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 140, 30));

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Customer Address");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 150, 30));

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Customer Mobile");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 150, 30));

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Qty");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 150, 30));

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Book ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 150, 30));

        btn_sold.setBackground(new java.awt.Color(0, 102, 153));
        btn_sold.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_sold.setText("SOLD");
        jPanel1.add(btn_sold, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 130, 40));

        btn_placeOrder.setBackground(new java.awt.Color(0, 102, 153));
        btn_placeOrder.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_placeOrder.setText("PLACE ORDER");
        jPanel1.add(btn_placeOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 130, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 860, 10));

        txt_TIME.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txt_TIME.setForeground(new java.awt.Color(255, 255, 255));
        txt_TIME.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_TIME.setBorder(null);
        txt_TIME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TIMEActionPerformed(evt);
            }
        });
        jPanel1.add(txt_TIME, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 130, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        jLabel2.setToolTipText("Search");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 30, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clock.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 30, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calender.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 30, 30));

        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Book Name");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 150, 30));

        txt_cust_NAME.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        txt_cust_NAME.setForeground(new java.awt.Color(255, 255, 255));
        txt_cust_NAME.setBorder(null);
        txt_cust_NAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cust_NAMEActionPerformed(evt);
            }
        });
        txt_cust_NAME.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cust_NAMEKeyPressed(evt);
            }
        });
        jPanel1.add(txt_cust_NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 350, 30));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 350, -1));

        txt_cust_ADDRESS.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txt_cust_ADDRESS.setForeground(new java.awt.Color(255, 255, 255));
        txt_cust_ADDRESS.setBorder(null);
        txt_cust_ADDRESS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cust_ADDRESSActionPerformed(evt);
            }
        });
        jPanel1.add(txt_cust_ADDRESS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 350, 30));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 350, -1));

        txt_cust_TP.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txt_cust_TP.setForeground(new java.awt.Color(255, 255, 255));
        txt_cust_TP.setBorder(null);
        txt_cust_TP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cust_TPActionPerformed(evt);
            }
        });
        jPanel1.add(txt_cust_TP, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 350, 30));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 350, -1));

        txt_BOOKNAME.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txt_BOOKNAME.setForeground(new java.awt.Color(255, 255, 255));
        txt_BOOKNAME.setBorder(null);
        txt_BOOKNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BOOKNAMEActionPerformed(evt);
            }
        });
        jPanel1.add(txt_BOOKNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 350, 30));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 350, -1));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 230, -1));

        txt_BOOKID.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txt_BOOKID.setForeground(new java.awt.Color(255, 255, 255));
        txt_BOOKID.setBorder(null);
        txt_BOOKID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BOOKIDActionPerformed(evt);
            }
        });
        jPanel1.add(txt_BOOKID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 230, 30));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 230, -1));

        txt_QTY.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txt_QTY.setForeground(new java.awt.Color(255, 255, 255));
        txt_QTY.setBorder(null);
        txt_QTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_QTYActionPerformed(evt);
            }
        });
        jPanel1.add(txt_QTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 230, 30));

        txt_ADVANCE.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txt_ADVANCE.setForeground(new java.awt.Color(255, 255, 255));
        txt_ADVANCE.setBorder(null);
        txt_ADVANCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ADVANCEActionPerformed(evt);
            }
        });
        jPanel1.add(txt_ADVANCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 230, 30));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 230, -1));

        txt_customOrderID.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txt_customOrderID.setForeground(new java.awt.Color(255, 255, 255));
        txt_customOrderID.setText(" C.order ID");
        txt_customOrderID.setBorder(null);
        txt_customOrderID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_customOrderIDActionPerformed(evt);
            }
        });
        jPanel1.add(txt_customOrderID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 160, 30));

        txt_CustomerID.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txt_CustomerID.setForeground(new java.awt.Color(255, 255, 255));
        txt_CustomerID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CustomerID.setBorder(null);
        txt_CustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CustomerIDActionPerformed(evt);
            }
        });
        jPanel1.add(txt_CustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 160, 30));

        txt_DATE.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txt_DATE.setForeground(new java.awt.Color(255, 255, 255));
        txt_DATE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_DATE.setBorder(null);
        txt_DATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DATEActionPerformed(evt);
            }
        });
        jPanel1.add(txt_DATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_cancleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cancleMouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_cancleMouseClicked

    private void txt_TIMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TIMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TIMEActionPerformed

    private void txt_cust_NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cust_NAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cust_NAMEActionPerformed

    private void txt_cust_ADDRESSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cust_ADDRESSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cust_ADDRESSActionPerformed

    private void txt_cust_TPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cust_TPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cust_TPActionPerformed

    private void txt_BOOKNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BOOKNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BOOKNAMEActionPerformed

    private void txt_BOOKIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BOOKIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BOOKIDActionPerformed

    private void txt_QTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_QTYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_QTYActionPerformed

    private void txt_ADVANCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ADVANCEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ADVANCEActionPerformed

    private void txt_customOrderIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_customOrderIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customOrderIDActionPerformed

    private void txt_CustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CustomerIDActionPerformed

    private void txt_DATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DATEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DATEActionPerformed

    private void lbl_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_minimizeMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lbl_minimizeMouseClicked

    private void txt_cust_NAMEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cust_NAMEKeyPressed
      
    }//GEN-LAST:event_txt_cust_NAMEKeyPressed

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
            java.util.logging.Logger.getLogger(CustomOrder_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomOrder_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomOrder_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomOrder_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomOrder_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_placeOrder;
    private javax.swing.JButton btn_sold;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbl_cancle;
    private javax.swing.JLabel lbl_minimize;
    private javax.swing.JTextField txt_ADVANCE;
    private javax.swing.JTextField txt_BOOKID;
    private javax.swing.JTextField txt_BOOKNAME;
    private javax.swing.JTextField txt_CustomerID;
    private javax.swing.JTextField txt_DATE;
    private javax.swing.JTextField txt_QTY;
    private javax.swing.JTextField txt_TIME;
    private javax.swing.JTextField txt_cust_ADDRESS;
    private javax.swing.JTextField txt_cust_NAME;
    private javax.swing.JTextField txt_cust_TP;
    private javax.swing.JTextField txt_customOrderID;
    // End of variables declaration//GEN-END:variables
}

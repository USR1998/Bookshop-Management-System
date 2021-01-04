/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.aruna.bookshop.views;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import lk.aruna.bookshop.controller.ReturnController;
import lk.aruna.bookshop.model.ReturnDetails;

/**
 *
 * @author DELL
 */
public class Return_Details extends javax.swing.JFrame {

    /**
     * Creates new form Return_Details
     */
    public Return_Details() {
        initComponents();
        txt_ORDERID.setBackground(new java.awt.Color(0, 0, 0, 1));
        loadAllReturnOrders();
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_cancle = new javax.swing.JLabel();
        lbl_minimize2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Return_Details = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        txt_ORDERID = new javax.swing.JTextField();

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
        jLabel1.setText("Return Details");
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
        jPanel2.add(lbl_cancle, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 50, 40));

        lbl_minimize2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize.png"))); // NOI18N
        lbl_minimize2.setToolTipText("Minimize");
        lbl_minimize2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_minimize2MouseClicked(evt);
            }
        });
        jPanel2.add(lbl_minimize2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 30, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 40));

        tbl_Return_Details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Customer ID", "Return Date", "R.Book ID", "R.Book Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_Return_Details);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 840, 230));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 230, -1));

        txt_ORDERID.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txt_ORDERID.setForeground(new java.awt.Color(255, 255, 255));
        txt_ORDERID.setText("Order ID");
        txt_ORDERID.setBorder(null);
        txt_ORDERID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_ORDERIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_ORDERIDFocusLost(evt);
            }
        });
        jPanel1.add(txt_ORDERID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_cancleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cancleMouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_cancleMouseClicked

    private void lbl_minimize2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_minimize2MouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lbl_minimize2MouseClicked

    private void txt_ORDERIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ORDERIDFocusGained
         if(txt_ORDERID.getText().trim().equals("Order ID")){
            txt_ORDERID.setText("");
    }
    }//GEN-LAST:event_txt_ORDERIDFocusGained

    private void txt_ORDERIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ORDERIDFocusLost
             if(txt_ORDERID.getText().trim().equals("")){
            txt_ORDERID.setText("Order ID");
    }
    }//GEN-LAST:event_txt_ORDERIDFocusLost

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
            java.util.logging.Logger.getLogger(Return_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Return_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Return_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Return_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Return_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_cancle;
    private javax.swing.JLabel lbl_minimize2;
    private javax.swing.JTable tbl_Return_Details;
    private javax.swing.JTextField txt_ORDERID;
    // End of variables declaration//GEN-END:variables

    private void loadAllReturnOrders() {
        try {
            
            
            List<ReturnDetails> list = new ReturnController().getAllReturns();
            DefaultTableModel tbl = (DefaultTableModel) tbl_Return_Details.getModel();
                for(ReturnDetails OBJ:list){
                tbl.addRow(new Object[]{
                OBJ.getRorder_ID(),
                OBJ.getRcustomer_ID(),
                OBJ.getReturn_date(),
                OBJ.getBook_ID(),
                OBJ.getBook_name()
                });
                }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Return_Details.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Return_Details.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
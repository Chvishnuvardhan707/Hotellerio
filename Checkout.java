/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotellerio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vishnu Vardhan CH
 */
public class Checkout extends javax.swing.JFrame {

    /**
     * Creates new form Checkout
     */
    public Checkout() {
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

        calculate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cust_id_02 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        calculate.setText("calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Customer ID");

        cust_id_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cust_id_02ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(calculate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55)
                        .addComponent(cust_id_02, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cust_id_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(calculate)
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
        int num = Integer.valueOf(cust_id_02.getText());
        System.out.println(num);    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/for_hotellerio";
            String user = "root";
            String pass = "1.414magiC";      
            Connection con = DriverManager.getConnection(url,user,pass);    
            String sql1 = "select c_name from customer_details where c_id=?";
            PreparedStatement ps1=con.prepareStatement(sql1);
            ps1.setInt(1, num);
            ResultSet rs1=ps1.executeQuery();
            String c_name=new String();
            while(rs1.next())
            {
                c_name=rs1.getString(1);
                System.out.println(c_name);
                
            }
        String sql = "select name_of_order from order_breakfast where cust_id =?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, num);
        ResultSet rs=ps.executeQuery();
        String name_of_order=new String();
            while(rs.next())
            {
                name_of_order=rs.getString(1);
                System.out.println(name_of_order);
                
            }
            String sql2 = "select Total_price from order_breakfast where cust_id =?";
        PreparedStatement ps2= con.prepareStatement(sql2);
        ps2.setInt(1, num);
        ResultSet rs2=ps2.executeQuery();
float tparice=0;
        while(rs2.next())
            {
                tparice=rs2.getFloat(1);
                System.out.println(tparice);
                
            }
            
            
        
        } catch (Exception e) {
            System.out.println(e);
        }
            
        
    }//GEN-LAST:event_calculateActionPerformed

    private void cust_id_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cust_id_02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cust_id_02ActionPerformed

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
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculate;
    private javax.swing.JTextField cust_id_02;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotellerio;
import java.sql.*;
import java.util.Random;
import javax.swing.JOptionPane;
//import java.util.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
/**
 *
 * @author Vishnu Vardhan CH
 */
public class customer_Details extends javax.swing.JFrame {
    /**
     * Creates new form customer_Details
     */
    public customer_Details() {
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

        c_name = new javax.swing.JTextField();
        c_age = new javax.swing.JTextField();
        c_address = new javax.swing.JTextField();
        c_ph_number = new javax.swing.JTextField();
        c_guest_numbers = new javax.swing.JTextField();
        submit_01 = new javax.swing.JButton();
        Reset_01 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cancel_01 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        c_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nameActionPerformed(evt);
            }
        });

        c_ph_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_ph_numberActionPerformed(evt);
            }
        });

        submit_01.setText("Submit");
        submit_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_01ActionPerformed(evt);
            }
        });

        Reset_01.setText("Reset");
        Reset_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_01ActionPerformed(evt);
            }
        });

        jLabel1.setText("Name :");

        jLabel2.setText("Age : ");

        jLabel3.setText("Address : ");

        jLabel4.setText("Phone Number : ");

        jLabel5.setText("Guest Numbers :");

        cancel_01.setText("Cancel");
        cancel_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_01ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c_age, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(c_name)
                            .addComponent(c_address)
                            .addComponent(c_ph_number)
                            .addComponent(c_guest_numbers)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(Reset_01)
                        .addGap(49, 49, 49)
                        .addComponent(submit_01)
                        .addGap(48, 48, 48)
                        .addComponent(cancel_01)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(c_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(c_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(c_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(c_ph_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(c_guest_numbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit_01)
                    .addComponent(Reset_01)
                    .addComponent(cancel_01))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nameActionPerformed

    private void c_ph_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_ph_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_ph_numberActionPerformed

    private void Reset_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_01ActionPerformed
            c_address.setText("");
            c_age.setText("");
            c_guest_numbers.setText("");
            c_name.setText("");
            c_ph_number.setText(""); 
    }//GEN-LAST:event_Reset_01ActionPerformed
    private void submit_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_01ActionPerformed
    long millis=System.currentTimeMillis();
    java.sql.Timestamp date ;
        date = new java.sql.Timestamp(millis);
    try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/hotellerio";
            String user = "root";
            String pass = "1.414magiC";
            Random rn=new Random();
            int db= rn.nextInt(1000000);
            
            try (Connection con = DriverManager.getConnection(url,user,pass)) {
                String sql = "insert into customer_details values(?,?,?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setString(1,String.valueOf(c_name.getText()));
                ps.setInt(2,Integer.valueOf(c_age.getText()));
                ps.setString(3,String.valueOf(c_address.getText()));
                ps.setDouble(4,Double.valueOf(c_ph_number.getText()));
                ps.setInt(5,Integer.valueOf(c_guest_numbers.getText()));
                ps.setTimestamp(6,date);
                ps.setInt(7,db);
                ps.executeUpdate();
                System.out.println("data inserted");
                JOptionPane.showMessageDialog(null,"the guest number is "+db);
            }
    }//GEN-LAST:event_submit_01ActionPerformed
/*
    private void cancel_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel_01ActionPerformed
    */
    catch(ClassNotFoundException | SQLException e)
    {
        System.out.println("data not inserted"+ e);
    }
   finally{
       //System.exit(2);
    }
    }
    private void cancel_01ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
                this.setVisible(false);

    }
    
    
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
            java.util.logging.Logger.getLogger(customer_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset_01;
    private javax.swing.JTextField c_address;
    private javax.swing.JTextField c_age;
    private javax.swing.JTextField c_guest_numbers;
    private javax.swing.JTextField c_name;
    private javax.swing.JTextField c_ph_number;
    private javax.swing.JButton cancel_01;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton submit_01;
    // End of variables declaration//GEN-END:variables
}
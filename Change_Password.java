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
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Vishnu Vardhan CH
 */
public class Change_Password extends javax.swing.JFrame {

    /**
     * Creates new form Change_Password
     */
    public Change_Password() {
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

        jLabel1 = new javax.swing.JLabel();
        oldpaswrd = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        npaswrd = new javax.swing.JPasswordField();
        phnum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cnwpswrd = new javax.swing.JPasswordField();
        confirm = new javax.swing.JButton();
        reset_06 = new javax.swing.JButton();
        cancel_06 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter old password");

        jLabel2.setText("Enter phone number");

        jLabel3.setText("Enter new password");

        jLabel4.setText("Confirm new password");

        confirm.setText("Confirm Change");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        reset_06.setText("Reset");
        reset_06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_06ActionPerformed(evt);
            }
        });

        cancel_06.setText("Cancel");
        cancel_06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_06ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(oldpaswrd)
                            .addComponent(phnum)
                            .addComponent(npaswrd)
                            .addComponent(cnwpswrd, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(cancel_06)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(reset_06)
                        .addGap(43, 43, 43)
                        .addComponent(confirm)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(oldpaswrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(phnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(npaswrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cnwpswrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm)
                    .addComponent(reset_06)
                    .addComponent(cancel_06))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reset_06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_06ActionPerformed
        // TODO add your handling code here:
        oldpaswrd.setText("");
        phnum.setText("");
        npaswrd.setText("");
        cnwpswrd.setText("");
    }//GEN-LAST:event_reset_06ActionPerformed

    private void cancel_06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_06ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_cancel_06ActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
        String nepass = String.valueOf(npaswrd.getPassword());
        String conpass = String.valueOf(cnwpswrd.getPassword());
        if(nepass!=conpass)
        {
            JOptionPane.showMessageDialog(null,"your new Paswords does not match with each other.Please enter again to cahnge","Display Message",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            Change_Password pass = new Change_Password();
            pass.setVisible(true);
        }
        else{
            try{
                      Class.forName("com.mysql.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/hotellerio";
			String user="root";
			String pass="1.414magiC";
                        String sql="select from employee_details set password_n=? where phone_n=?";                      
	               Connection conn =DriverManager.getConnection(url,user,pass);
                       PreparedStatement pst=conn.prepareStatement(sql);
                       pst.setString(1,String.valueOf(oldpaswrd.getPassword()));
                       pst.setDouble(2,Double.valueOf(phnum.getText()));
                       ResultSet rs=pst.executeQuery();
                       if(rs.next())
                       {
                           String sql1="update employee_details set password_n=? where phone_n=?";
                       PreparedStatement pst1=conn.prepareStatement(sql);
                       pst1.setString(1,String.valueOf(npaswrd.getPassword()));
                       pst1.setDouble(2,Double.valueOf(phnum.getText()));
                        pst.executeUpdate(sql);
                        conn.close();
                       }
                       else{
JOptionPane.showMessageDialog(null,"the password and phone number that you entered does not match.Please enter valid number and password","Display Message",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            Change_Password pass1 = new Change_Password();
            pass1.setVisible(true);
                       }

                       
                         
           }
       catch(Exception e) {
           System.out.println(e);
                      }
        }
    }//GEN-LAST:event_confirmActionPerformed

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
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Change_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_06;
    private javax.swing.JPasswordField cnwpswrd;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField npaswrd;
    private javax.swing.JPasswordField oldpaswrd;
    private javax.swing.JTextField phnum;
    private javax.swing.JButton reset_06;
    // End of variables declaration//GEN-END:variables
}

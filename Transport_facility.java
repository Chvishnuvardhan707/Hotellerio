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
import javax.swing.JOptionPane;

/**
 *
 * @author Vishnu Vardhan CH
 */
public class Transport_facility extends javax.swing.JFrame {

    /**
     * Creates new form Transport_facility
     */
    public Transport_facility() {
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
        jLabel2 = new javax.swing.JLabel();
        within_city = new javax.swing.JRadioButton();
        outstation = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        cancel_05 = new javax.swing.JButton();
        cust_Id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        vehicle_no = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("book your Transport here!!");

        jLabel2.setText("Customer ID");

        within_city.setText("Within City");
        within_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                within_cityActionPerformed(evt);
            }
        });

        outstation.setText("Out Station");
        outstation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outstationActionPerformed(evt);
            }
        });

        jLabel3.setText("Select one");

        confirm.setText("Confirm Booking");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        cancel_05.setText("Cancel");

        jLabel4.setText("Vehicle Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(75, 75, 75)
                                .addComponent(cust_Id))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(cancel_05))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(outstation)
                                    .addComponent(within_city)
                                    .addComponent(confirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vehicle_no))))
                        .addGap(95, 95, 95))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cust_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(within_city)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(outstation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(vehicle_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm)
                    .addComponent(cancel_05))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void outstationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outstationActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_outstationActionPerformed

    private void within_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_within_cityActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_within_cityActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
        if(within_city.isSelected())
        {
            try{
                      Class.forName("com.mysql.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/hotellerio";
			String user="root";
			String pass="1.414magiC";
	                Connection conn =DriverManager.getConnection(url,user,pass);
                        
                        String sql1="select price from transport_cost where id=?";
                        PreparedStatement ps1 = conn.prepareStatement(sql1);
                        int x=1;
                        ps1.setInt(1,x);
                        ResultSet rs1 = ps1.executeQuery();
                        float cost=0;
                        while(rs1.next())
                        {
                            cost=rs1.getFloat(1);
                        }
                        String str = within_city.getText();
                        String sql="insert into transport_table values(?,?,?,?)";                       
                       PreparedStatement pst=conn.prepareStatement(sql);
                       pst.setInt(1,Integer.valueOf(cust_Id.getText()));
                       pst.setString(2, str);
                       pst.setFloat(3,cost);
                       pst.setString(4, String.valueOf(vehicle_no.getText()));
                       pst.executeUpdate();
                       System.out.println(str);
                       
                       conn.close();
			
		
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
            java.util.logging.Logger.getLogger(Transport_facility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transport_facility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transport_facility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transport_facility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transport_facility().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_05;
    private javax.swing.JButton confirm;
    private javax.swing.JTextField cust_Id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton outstation;
    private javax.swing.JTextField vehicle_no;
    private javax.swing.JRadioButton within_city;
    // End of variables declaration//GEN-END:variables
}

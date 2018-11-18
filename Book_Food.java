/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotellerio;
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Praveen Chandanala
 */
public class Book_Food extends javax.swing.JFrame {

    /**
     * Creates new form Book_Food
     */
    public Book_Food() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon2.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        meal_list = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        cancel_03 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        meal_list.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BreakFast", "Lunch-Veg", "Lunch-Non-Veg", "Snacks", "Dinner-Veg", "Dinner-Non-Veg" }));
        meal_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meal_listActionPerformed(evt);
            }
        });

        jLabel1.setText("Select your meal");

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtable);

        cancel_03.setText("Cancel");
        cancel_03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_03ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotellerio/images/menu.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotellerio/images/menu.png"))); // NOI18N

        jLabel4.setText("Select Any Option To View Menu For Now !!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addComponent(meal_list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cancel_03)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(meal_list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancel_03)
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void meal_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meal_listActionPerformed
        String type = (String)meal_list.getSelectedItem( );
        System.out.println(type);
        if(type=="Dinner-Non-Veg")
        {
            try {
                try 
                {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Book_Food.class.getName()).log(Level.SEVERE, null, ex);
                }
                    String url = "jdbc:mysql://localhost:3306/hotellerio";
                    String user = "root";
                    String pass = "1.414magiC";
                    Connection con = DriverManager.getConnection(url,user,pass);
                        String sql1= "select * from lunch_non_veg_menu";
                    PreparedStatement ps1 = con.prepareStatement(sql1);
                    ResultSet rs1 = ps1.executeQuery();
                    jtable.setModel(DbUtils.resultSetToTableModel(rs1));
                } 
            catch (SQLException ex) 
            {
                Logger.getLogger(Book_Food.class.getName()).log(Level.SEVERE, null, ex);
            }     
        }
        if(type=="Dinner-Veg")
        {
             try {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Book_Food.class.getName()).log(Level.SEVERE, null, ex);
                }
            String url = "jdbc:mysql://localhost:3306/hotellerio";
            String user = "root";
            String pass = "1.414magiC";
            Connection con = DriverManager.getConnection(url,user,pass);
                        String sql1= "select * from lunch_menu";
                PreparedStatement ps1 = con.prepareStatement(sql1);
                ResultSet rs1 = ps1.executeQuery();
                jtable.setModel(DbUtils.resultSetToTableModel(rs1));
            } catch (SQLException ex) {
                Logger.getLogger(Book_Food.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            
        }
        if(type=="Snacks")
        {
            try {
                try 
                {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Book_Food.class.getName()).log(Level.SEVERE, null, ex);
                }
                    String url = "jdbc:mysql://localhost:3306/hotellerio";
                    String user = "root";
                    String pass = "1.414magiC";
                    Connection con = DriverManager.getConnection(url,user,pass);
                        String sql1= "select * from snacks_menu";
                    PreparedStatement ps1 = con.prepareStatement(sql1);
                    ResultSet rs1 = ps1.executeQuery();
                    jtable.setModel(DbUtils.resultSetToTableModel(rs1));
                } 
            catch (SQLException ex) 
            {
                Logger.getLogger(Book_Food.class.getName()).log(Level.SEVERE, null, ex);
            }     
        }
        if(type=="Lunch-Non-Veg")
        {
             try {
                try 
                {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Book_Food.class.getName()).log(Level.SEVERE, null, ex);
                }
                    String url = "jdbc:mysql://localhost:3306/hotellerio";
                    String user = "root";
                    String pass = "1.414magiC";
                    Connection con = DriverManager.getConnection(url,user,pass);
                        String sql1= "select * from lunch_non_veg_menu";
                    PreparedStatement ps1 = con.prepareStatement(sql1);
                    ResultSet rs1 = ps1.executeQuery();
                    jtable.setModel(DbUtils.resultSetToTableModel(rs1));
                } 
            catch (SQLException ex) 
            {
                Logger.getLogger(Book_Food.class.getName()).log(Level.SEVERE, null, ex);
            }     
        }
        if(type=="Lunch-Veg")
        {
             try {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Book_Food.class.getName()).log(Level.SEVERE, null, ex);
                }
            String url = "jdbc:mysql://localhost:3306/hotellerio";
            String user = "root";
            String pass = "1.414magiC";
            Connection con = DriverManager.getConnection(url,user,pass);
                        String sql1= "select * from lunch_menu";                        
                PreparedStatement ps1 = con.prepareStatement(sql1);
                ResultSet rs1 = ps1.executeQuery();
                jtable.setModel(DbUtils.resultSetToTableModel(rs1));
            } catch (SQLException ex) {
                Logger.getLogger(Book_Food.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            
        }
        if(type=="BreakFast")
        {
            try {
                try 
                {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Book_Food.class.getName()).log(Level.SEVERE, null, ex);
                }
                    String url = "jdbc:mysql://localhost:3306/hotellerio";
                    String user = "root";
                    String pass = "1.414magiC";
                    Connection con = DriverManager.getConnection(url,user,pass);
                        String sql1= "select * from breakfast_menu where item_type=?";
                        String dd="Veg";                       
                    PreparedStatement ps1 = con.prepareStatement(sql1);
                    ps1.setString(1, dd);
                    ResultSet rs1 = ps1.executeQuery();
                    jtable.setModel(DbUtils.resultSetToTableModel(rs1));
                } 
            catch (SQLException ex) 
            {
                Logger.getLogger(Book_Food.class.getName()).log(Level.SEVERE, null, ex);
            }     
        }
    }//GEN-LAST:event_meal_listActionPerformed

    private void cancel_03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_03ActionPerformed
this.setVisible(false);
//new Food_Section().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel_03ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Book_Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book_Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book_Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book_Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_Food().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_03;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable;
    private javax.swing.JComboBox<String> meal_list;
    // End of variables declaration//GEN-END:variables
}

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
import javax.swing.JOptionPane;

/**
 *
 * @author Vishnu Vardhan CH
 */
public class room_Allocate extends javax.swing.JFrame {

    /**
     * Creates new form room_Allocate
     */
    public room_Allocate() {
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
        jLabel4 = new javax.swing.JLabel();
        Single = new javax.swing.JTextField();
        Double = new javax.swing.JTextField();
        Douplex = new javax.swing.JTextField();
        Submit_02 = new javax.swing.JButton();
        Reset_02 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        customer_Name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Single");

        jLabel2.setText("Double");

        jLabel4.setText("Douplex");

        Single.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SingleActionPerformed(evt);
            }
        });

        Submit_02.setText("Submit");
        Submit_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_02ActionPerformed(evt);
            }
        });

        Reset_02.setText("Reset");
        Reset_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_02ActionPerformed(evt);
            }
        });

        jLabel5.setText("Customer ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(customer_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(Reset_02)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Submit_02))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Double)
                                    .addComponent(Single)
                                    .addComponent(Douplex, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))))
                        .addGap(193, 193, 193))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(customer_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Single, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Double, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Douplex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset_02)
                    .addComponent(Submit_02))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SingleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SingleActionPerformed

    private void Submit_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_02ActionPerformed
        //int yn = JOptionPane.showConfirmDialog(nul,"Do you want to Continue?", title, WIDTH, HEIGHT) ;
        long millis=System.currentTimeMillis();
    java.sql.Timestamp date ;
        date = new java.sql.Timestamp(millis);
        int sin = Integer.valueOf(Single.getText());
        int dou = Integer.valueOf(Double.getText());
        int doup = Integer.valueOf(Douplex.getText());
        int x=1;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/hotellerio";
            String user = "root";
            String pass = "1.414magiC";
            try (Connection con = DriverManager.getConnection(url,user,pass)) {
                
                String sql1 = "Select * from room_rent where ID=?";
                PreparedStatement ps1=con.prepareStatement(sql1);
                ps1.setInt(1, x);
                ResultSet rs=ps1.executeQuery();
                int s=0,db=0,dp=0;
                        while(rs.next()){
                             s=rs.getInt(2);
                             db=rs.getInt(3);
                             dp=rs.getInt(4);
                        }
                System.out.println("single"+s+"double"+db+"douplex"+dp);
                int cost_sing = sin*s;
                int cost_doub = dou*db;
                int cost_doup = doup*dp;
                System.out.println(cost_sing+" "+cost_doub+" "+cost_doup );
                
                
                String sql = "insert into room_details values(?,?,?,?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setInt(1,Integer.valueOf(customer_Name.getText()));
                ps.setInt(2,sin);
                ps.setInt(3,cost_sing);
                ps.setInt(4,dou);
                ps.setInt(5,cost_doub);
                ps.setInt(6,doup);
                ps.setInt(7,cost_doup);
                ps.setTimestamp(8,date);
                ps.executeUpdate();
                System.out.println("room records updated");
                updateRoom(sin,dou,doup);
            }
    }                                         
    catch(ClassNotFoundException | SQLException e)
    {
        System.out.println("data not inserted"+ e);
    }
    finally{
        //roomsLeft();
    //System.exit(5);
            System.out.println("hello");
       
    }

// TODO add your handling code here:
    }//GEN-LAST:event_Submit_02ActionPerformed

    private void Reset_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Reset_02ActionPerformed

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
            java.util.logging.Logger.getLogger(room_Allocate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(room_Allocate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(room_Allocate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(room_Allocate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new room_Allocate().setVisible(true);
            }
        });
    }
public void roomsLeft()
{
    try {
           // DBConnect dbc = new DBConnect();
           int single=0,douuble=0,triple=0,douplex=0;
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/for_hotellerio";
            String user = "root";
            String pass = "1.414magiC";
            Connection con = DriverManager.getConnection(url,user,pass);
            String sql = " select * from room_details order by date DESC LIMIT 1";
            PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
                        while(rs.next()){
                            //String cust_name = rs.getString(1) ;
                             single =  rs.getInt(2);
                             douuble = rs.getInt(3);
                             triple = rs.getInt(4);
                             douplex = rs.getInt(5);
                        }
            System.out.println(single+" "+douuble+" "+triple+" "+douplex);
            con.close();
        } 
        catch (ClassNotFoundException | SQLException e) {
            System.out.println("no result found "+e);
        }
}
 static void updateRoom(int a,int b,int d)
 {
     
     try  {
           // DBConnect dbc = new DBConnect();
           int SIngle=0,DOuuble=0,DOuplex=0;
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/hotellerio";
            String user = "root";
            String pass = "1.414magiC";
            Connection con = DriverManager.getConnection(url,user,pass);
            String sql = " select * from room_availability";
            PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
                        while(rs.next()){
                            //String cust_name = rs.getString(1) ;
                             SIngle =  rs.getInt(2);
                             DOuuble = rs.getInt(3);
                             DOuplex = rs.getInt(4);
                        }
//JOptionPane.showMessageDialog(null,"rooms left after booking will be "+SIngle+" single rooms, "+DOuuble+" double rooms, "+TRiple+" triple rooms, "+DOuplex+" douplex rooms","Display Message", JOptionPane.INFORMATION_MESSAGE);
            con.close();

            //System.out.println(SIngle+" "+DOuuble+" "+TRiple+" "+DOuplex);
//            int single2= Integer.valueOf(siNGle.getText());
//            int douuble2=Integer.valueOf(doUUble.getText());
//            int triple2=Integer.valueOf(trIPle.getText());
//            int douplex2=Integer.valueOf(doUPlex.getText());
            int a1 = SIngle-a;
            int b1= DOuuble-b;
            int d1=DOuplex-d;
            int e1=1;
//            if(a<=0 || b<=0 || c<=0 || d<=0)
//            {
//                JOptionPane.showMessageDialog(null,"Oops!!Your requested rooms cannot be booked as there are "+a+" single rooms, "+b+" double rooms, "+c+" triple rooms, "+d+" douplex rooms left!!","Display message", JOptionPane.INFORMATION_MESSAGE);
//            }else{
//                JOptionPane.showMessageDialog(null,"rooms left after booking will be "+a+" single rooms, "+b+" double rooms, "+c+" triple rooms, "+d+" douplex rooms","Display Message", JOptionPane.INFORMATION_MESSAGE);
//            }
            Connection con1 = DriverManager.getConnection(url,user,pass);
            String sql1 = "update room_availability set SIngle = ?, DOuuble=?,DOuplex=? where id=?";
            PreparedStatement ps1 = con1.prepareStatement(sql1);
            ps1.setInt(1,a1);
            ps1.setInt(2,b1);
            ps1.setInt(3,d1);
            ps1.setInt(4,e1);
            ps1.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null,"room records are updated","Display message", JOptionPane.INFORMATION_MESSAGE);

                      



        } 
        catch (ClassNotFoundException | SQLException e) {
            System.out.println("no result found "+e);
        }        // TODO add your handling code here:
 }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Double;
    private javax.swing.JTextField Douplex;
    private javax.swing.JButton Reset_02;
    private javax.swing.JTextField Single;
    private javax.swing.JButton Submit_02;
    private javax.swing.JTextField customer_Name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}

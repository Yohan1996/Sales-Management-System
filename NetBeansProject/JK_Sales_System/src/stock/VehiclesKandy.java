/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author user
 */
public class VehiclesKandy extends javax.swing.JFrame {

    /**
     * Creates new form VehiclesKandy
     */
    public VehiclesKandy() {
        initComponents();
        showTableData();
       
        autoID();
        
        
        jScrollPane1.getViewport().setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    Connection con;
    PreparedStatement pst;
    PreparedStatement pst2;
    ResultSet rs;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(882, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Kandy Branch Vehicles");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Vehicle ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 177, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Driver ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 224, -1, -1));

        jTextField1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 174, 140, -1));

        jTextField2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 221, 140, -1));

        jTextField3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 264, 140, -1));

        jTextField4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 307, 140, -1));

        jTextField5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 350, 140, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Driver TP");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Driver Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 267, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Vehicle Type");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 353, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 515, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 157, 644, 480));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 515, -1, -1));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 582, -1, -1));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 492, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setText("Availability");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 439, -1, -1));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton4.setText("Main Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(852, 108, 135, -1));

        jTextField6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextField6.setText("Kandy");
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 393, 140, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setText("Vehicle Own");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 393, -1, -1));

        jTextField7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 436, 140, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/z16.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 1000, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try {

            String VehicleID = jTextField1.getText();
            String DriverID = jTextField2.getText();
            String DriverName = jTextField3.getText();
            String DriverTP  = jTextField4.getText();
            String VehicleType= jTextField5.getText();
            String VehicleOwn= jTextField6.getText();
            String Availability= jTextField7.getText();
           
                    
            
            if(VehicleID.isEmpty() || DriverID.isEmpty() || DriverName.isEmpty() || DriverTP.isEmpty() || VehicleType.isEmpty() || VehicleOwn.isEmpty() || Availability.isEmpty())
            {
            
            JOptionPane.showMessageDialog(this, "Fill up the form properly", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {

            Class.forName("com.mysql.jdbc.Driver");
            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/JK_Sales_System", "root","");

            pst = (PreparedStatement) con.prepareStatement("insert into vehicles_details(VehicleID,DriverID,DriverName,DriverTP,VehicleType,VehicleOwn,Availability)values(?,?,?,?,?,?,?)");

            pst.setString(1, VehicleID);
            pst.setString(2, DriverID);
            pst.setString(3, DriverName);
            pst.setString(4, DriverTP);
            pst.setString(5, VehicleType);
            pst.setString(6, VehicleOwn);
            pst.setString(7, Availability);
           
            
            pst.executeUpdate();
            

            JOptionPane.showMessageDialog(this,"Registered");

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            
            jTextField7.setText("");
           autoID();
            
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        showTableData();   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectRowIndex = jTable1.getSelectedRow();
        
        jTextField1.setText(model.getValueAt(selectRowIndex, 1).toString());
        jTextField2.setText(model.getValueAt(selectRowIndex, 2).toString());
        jTextField3.setText(model.getValueAt(selectRowIndex, 3).toString());
        jTextField4.setText(model.getValueAt(selectRowIndex, 4).toString());
        jTextField5.setText(model.getValueAt(selectRowIndex, 5).toString());
        jTextField6.setText(model.getValueAt(selectRowIndex, 6).toString());
        jTextField7.setText(model.getValueAt(selectRowIndex, 7).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new KandyBranchHome().setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        try {
            
            
            String VehicleID = jTextField1.getText();
            String DriverID = jTextField2.getText();
            String DriverName = jTextField3.getText();
            String DriverTP  = jTextField4.getText();
            String VehicleType= jTextField5.getText();
            String VehicleOwn= jTextField6.getText();
            String Availability= jTextField7.getText();
            
            
            Class.forName("com.mysql.jdbc.Driver");
            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/JK_Sales_System", "root","");
            String sql= "UPDATE vehicles_details SET DriverID=?,DriverName=?,DriverTP=?,VehicleType=?,VehicleOwn=?,Availability=? WHERE VehicleID=?";
            pst=(PreparedStatement) con.prepareStatement(sql);
            
            pst.setString(7, VehicleID);
            pst.setString(1, DriverID);
            pst.setString(2, DriverName);
            pst.setString(3, DriverTP);
            pst.setString(4, VehicleType);
            pst.setString(5, VehicleOwn);
            pst.setString(6, Availability);

             pst.executeUpdate();
            

            JOptionPane.showMessageDialog(this,"Update Successfully");
            
            }
         catch(SQLException | HeadlessException ex)
        {
        JOptionPane.showMessageDialog(null, ex);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageBranches.class.getName()).log(Level.SEVERE, null, ex);
        }
        showTableData();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            try{
            
        String VehicleID = jTextField1.getText();
        
        
        con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/JK_Sales_System", "root","");

        pst = (PreparedStatement) con.prepareStatement("DELETE From vehicles_details WHERE VehicleID= ?");

        pst.setString(1, VehicleID);
               
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this,"Delete Successfully");

        }
        catch(SQLException | HeadlessException ex)
        {
        JOptionPane.showMessageDialog(null, ex);

        }
        showTableData();
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
     
            jTextField7.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public void autoID()
    {
    try{
        
    Class.forName("com.mysql.jdbc.Driver");
    con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/JK_Sales_System", "root","");
    Statement s= con.createStatement();
    
    ResultSet rs = s.executeQuery("select Max(VehicleID) from vehicles_details");
    rs.next();
    
    rs.getString("Max(VehicleID)");
    
    if(rs.getString("Max(VehicleID)")==null)
    {
    
    jTextField1.setText("V0001");
    }
    else
    {
    Long RequestID = Long.parseLong(rs.getString("Max(VehicleID)").substring(2,rs.getString("Max(VehicleID)").length()));
    RequestID++;
    jTextField1.setText("V0" + String.format("%03d", RequestID));
    }
    }catch (ClassNotFoundException ex) {
            Logger.getLogger(RequestStocks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RequestStocks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }       
    
    
     public void showTableData()
  {
  try{
    con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/JK_Sales_System", "root","");
  String sql = "Select * from vehicles_details where VehicleOwn='Kandy'";
  pst2 = (PreparedStatement) con.prepareStatement(sql);
  rs=pst2.executeQuery();
  jTable1.setModel(DbUtils.resultSetToTableModel(rs));
  
  
  }
  catch(Exception ex)
  {JOptionPane.showMessageDialog(null, ex);
  
  }
    
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
            java.util.logging.Logger.getLogger(VehiclesKandy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehiclesKandy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehiclesKandy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehiclesKandy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehiclesKandy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
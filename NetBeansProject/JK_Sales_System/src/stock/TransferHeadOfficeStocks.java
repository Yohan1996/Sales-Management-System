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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author user
 */
public class TransferHeadOfficeStocks extends javax.swing.JFrame {

    /**
     * Creates new form TransferProduct
     */
    public TransferHeadOfficeStocks() {
        initComponents();
        showTableData();
        date();
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
     Connection con2;
    PreparedStatement pst;
    PreparedStatement pst2;
    PreparedStatement update;
    ResultSet rs;
    
    public void autoID()
    {
    try{
        
    Class.forName("com.mysql.jdbc.Driver");
    con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/JK_Sales_System", "root","");
    Statement s= con.createStatement();
    
    ResultSet rs = s.executeQuery("select Max(TransferID) from transfer_details");
    rs.next();
    
    rs.getString("Max(TransferID)");
    
    if(rs.getString("Max(TransferID)")==null)
    {
    
    jTextField1.setText("T0001");
    }
    else
    {
    Long RequestID = Long.parseLong(rs.getString("Max(TransferID)").substring(2,rs.getString("Max(TransferID)").length()));
    RequestID++;
    jTextField1.setText("T0" + String.format("%03d", RequestID));
    }
    }catch (ClassNotFoundException ex) {
            Logger.getLogger(RequestStocks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RequestStocks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }       
    
    public void date()
    {
    
    DateTimeFormatter dtd=DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDateTime now =LocalDateTime.now();
    String date =dtd.format(now);
    
    
    jLabel10.setText(date);
   
    
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Transfer Product");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 117, 593, 410));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Trasfer ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 168, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Product ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 254, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Quantity");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 426, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Trasfer From");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 383, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Request Resived Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 466, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setText("Transfer To");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 340, -1, -1));

        jTextField1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 165, 182, -1));

        jTextField2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 208, 182, -1));

        jTextField3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 251, 182, -1));

        jTextField4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 294, 182, -1));

        jTextField5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 337, 182, -1));

        jTextField6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 380, 182, -1));

        jTextField7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 423, 182, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setText("Request ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 211, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Cancel Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 640, 177, 40));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton2.setText("Transfer Products");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, -1, 40));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setText("Transfer Date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 506, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 506, -1, -1));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel11.setText("Table Show All Stock Request to Head-Office");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 85, -1, -1));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton3.setText("Main Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 70, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel12.setText("Product Name");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 297, -1, -1));

        jTextField8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 463, 182, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Insert Transport Status");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel14.setText("Vehicle ID");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel15.setText("Driver ID");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, -1, -1));

        jTextField9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 182, -1));

        jTextField10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 600, 182, -1));

        jTextField11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextField11.setText("Accepted");
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 182, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel16.setText("Transport Status");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 590, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel17.setText("Insert Vehicle Details");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 640, 180, 40));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock/z16.jpg"))); // NOI18N
        jLabel18.setText("jLabel18");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 1060, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectRowIndex = jTable1.getSelectedRow();
        
        jTextField2.setText(model.getValueAt(selectRowIndex, 1).toString());
        jTextField3.setText(model.getValueAt(selectRowIndex, 2).toString());
        jTextField4.setText(model.getValueAt(selectRowIndex, 3).toString());
        jTextField5.setText(model.getValueAt(selectRowIndex, 4).toString());
        jTextField6.setText(model.getValueAt(selectRowIndex, 5).toString());
        jTextField7.setText(model.getValueAt(selectRowIndex, 6).toString());
        jTextField8.setText(model.getValueAt(selectRowIndex, 7).toString());
       
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Transfer Products
         try {

            String TransferID = jTextField1.getText();
            String RequestID = jTextField2.getText();
            String ProductID = jTextField3.getText();
            String ProductName = jTextField4.getText();
            String TransferTo  = jTextField5.getText();
            String TransferFrom= jTextField6.getText();
            String Quantity= jTextField7.getText();
            String RequestResivedDate = jTextField8.getText();
            String TransferDate = jLabel10.getText();
            String VehicleID = jTextField9.getText();
            String DriverID = jTextField10.getText();
            String TransferStatus = jTextField11.getText();
            
          //Update Stocks
            if("Galle".equals(TransferTo))
            {
            update =(PreparedStatement) con.prepareStatement("update products set StockInHead = StockInHead- ?,StockInGalle=StockInGalle+ ? where ProductID=?");
           
            update.setString(1, Quantity);
            update.setString(2, Quantity);
            update.setString(3, ProductID);

            update.executeUpdate();
            }
            else if("Matara".equals(TransferTo))
            {
            update =(PreparedStatement) con.prepareStatement("update products set StockInHead = StockInHead- ?,StockInMatara=StockInMatara+ ? where ProductID=?");
           
            update.setString(1, Quantity);
            update.setString(2, Quantity);
            update.setString(3, ProductID);

            update.executeUpdate();
            }
            
            else if("Kandy".equals(TransferTo))
            {
            update =(PreparedStatement) con.prepareStatement("update products set StockInHead = StockInHead- ?,StockInKandy=StockInKandy+ ? where ProductID=?");
           
            update.setString(1, Quantity);
            update.setString(2, Quantity);
            update.setString(3, ProductID);

            update.executeUpdate();
            }
                
          
          
            if(TransferID.isEmpty() || RequestID.isEmpty() || ProductID.isEmpty() || ProductName.isEmpty() ||Quantity.isEmpty() || TransferTo.isEmpty() || TransferFrom.isEmpty() || VehicleID.isEmpty() || DriverID.isEmpty() || RequestResivedDate.isEmpty())
            {
            
            JOptionPane.showMessageDialog(this, "Fill up the form properly", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {

            Class.forName("com.mysql.jdbc.Driver");
            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/JK_Sales_System", "root","");

            pst = (PreparedStatement) con.prepareStatement("insert into transfer_details(TransferID,RequestID,ProductID,ProductName,TransferTo,TransferFrom,Quantity,RequestResivedDate,TransferDate,VehicleID,DriverID,TransferStatus)values(?,?,?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, TransferID);
            pst.setString(2, RequestID);
            pst.setString(3, ProductID);
            pst.setString(4, ProductName);
            pst.setString(5, TransferTo);
            pst.setString(6, TransferFrom);
            pst.setString(7, Quantity);
            pst.setString(8, RequestResivedDate);
            pst.setString(9, TransferDate);
            pst.setString(10, VehicleID);
            pst.setString(11, DriverID);
            pst.setString(12, TransferStatus);
            
            
            pst.executeUpdate();
             try{

           

            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/JK_Sales_System", "root","");

            pst = (PreparedStatement) con.prepareStatement("DELETE From request_details WHERE RequestID = ?");

            pst.setString(1, RequestID);

            pst.executeUpdate();
           

        }
        catch(SQLException | HeadlessException ex)
        {
            JOptionPane.showMessageDialog(null, ex);

        }
                  
      
            JOptionPane.showMessageDialog(this,"Transfered, Sent Email, Stocks Updated");

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField9.setText("");
            jTextField10.setText("");
            
           
            
            
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        showTableData();  
        
        autoID();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         try{
            
        String RequestID = jTextField2.getText();
        
        
        con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/JK_Sales_System", "root","");

        pst = (PreparedStatement) con.prepareStatement("DELETE From products WHERE RequestID = ?");

        pst.setString(1, RequestID);
               
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this,"Cansel the Request");

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
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField9.setText("");
            jTextField10.setText("");
            
           autoID();
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         new HeadOfficeHome().setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        
        
        autoID();
    }//GEN-LAST:event_jButton4ActionPerformed

    
    
    
    
    
    public void showTableData()
  {
  try{
    con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/JK_Sales_System", "root","");
  String sql = "Select * from request_details where RequestTo='Head-Office'";
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
            java.util.logging.Logger.getLogger(TransferHeadOfficeStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferHeadOfficeStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferHeadOfficeStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferHeadOfficeStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferHeadOfficeStocks().setVisible(true);
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}

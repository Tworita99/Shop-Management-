/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author Megha
 */

public class Update_Tweens extends javax.swing.JFrame {

    /**
     * Creates new form Update_Kalyani
     */
    Connection con;
    ResultSet rs;
    PreparedStatement pst=null;
    Statement stmt;
    public Update_Tweens() {
        initComponents();
        java.util.Date dt=new java.util.Date();
        dateTF.setText("Date: "+dt);
        //con = connectDB.connDB(); 
        getcb.doClick();
        //  
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        snoLbl2 = new javax.swing.JLabel();
        snoTF2 = new javax.swing.JTextField();
        insertBtn2 = new javax.swing.JButton();
        snoLbl = new javax.swing.JLabel();
        snoTF = new javax.swing.JTextField();
        insertBtn = new javax.swing.JButton();
        snoLbl1 = new javax.swing.JLabel();
        sizeTF = new javax.swing.JTextField();
        updBtn = new javax.swing.JButton();
        snoLbl3 = new javax.swing.JLabel();
        cupTF = new javax.swing.JTextField();
        delBtn = new javax.swing.JButton();
        snoLbl4 = new javax.swing.JLabel();
        qtyTF = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        snoLbl5 = new javax.swing.JLabel();
        priceTF = new javax.swing.JTextField();
        CB1 = new javax.swing.JComboBox<>();
        getcb = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        dateTF = new javax.swing.JTextField();

        snoLbl2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        snoLbl2.setText("SNo.");

        snoTF2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        insertBtn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        insertBtn2.setText("INSERT");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        snoLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        snoLbl.setText("SNo.");

        snoTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        insertBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        insertBtn.setText("INSERT");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        snoLbl1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        snoLbl1.setText("SIZE");

        sizeTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        updBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        updBtn.setText("UPDATE");
        updBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updBtnActionPerformed(evt);
            }
        });

        snoLbl3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        snoLbl3.setText("CupSize");

        cupTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        delBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        delBtn.setText("DELETE");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        snoLbl4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        snoLbl4.setText("QTY");

        qtyTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        snoLbl5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        snoLbl5.setText("Price");

        priceTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        CB1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT ITEM" }));
        CB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB1ActionPerformed(evt);
            }
        });

        getcb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getcb.setText("GET CB");
        getcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getcbActionPerformed(evt);
            }
        });

        exitBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exitBtn.setText("EXIT");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        dateTF.setEditable(false);
        dateTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dateTF.setForeground(new java.awt.Color(51, 204, 0));
        dateTF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CB1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(snoLbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124)
                                .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(snoLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124)
                                .addComponent(qtyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(snoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(124, 124, 124)
                                    .addComponent(snoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(snoLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(snoLbl3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(124, 124, 124)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cupTF, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sizeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(168, 168, 168)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(insertBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(getcb, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(CB1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(snoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(snoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getcb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(snoLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sizeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(snoLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cupTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(snoLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(snoLbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(insertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(updBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(185, 185, 185))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
       
                 new Tweens().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
       
        try
        {
            Class.forName("java.sql.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_mgt","root","");
            stmt=con.createStatement();
            String sno=snoTF.getText();
            String sql="DELETE FROM tweens WHERE Sno="+sno+";";
            JOptionPane.showMessageDialog(null,"Suely want to Delete??");
            CB1.removeItem(sno);
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Record Deleted!!");
        }           
        catch(Exception e)
        {
                JOptionPane.showMessageDialog(null,e);
        }
        snoTF.setText("");
        sizeTF.setText("");   
        cupTF.setText("");
        qtyTF.setText("");
        priceTF.setText("");
        CB1.removeAllItems();
       // getcb.doClick();
    }//GEN-LAST:event_delBtnActionPerformed

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
            
                try
                 {
                    Class.forName("java.sql.Driver");
                    con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_mgt","root",""); 
                    stmt=con.createStatement();
                    String sql="INSERT INTO tweens(Sno,Size,CupSize,Qty,Price) VALUES (?,?,?,?,?);";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, snoTF.getText());
                    pst.setString(2, sizeTF.getText());
                    pst.setString(3, cupTF.getText());
                    pst.setString(4, qtyTF.getText());
                    pst.setString(5, priceTF.getText());
                    pst.execute();
                    JOptionPane.showMessageDialog(null,"Inserted sucessfully!!");
                    String sno=snoTF.getText(); 
                    CB1.addItem(sno);
                    snoTF.setText("");
                    sizeTF.setText("");
                    cupTF.setText("");
                    qtyTF.setText("");
                    priceTF.setText("");  
                    CB1.removeAllItems();
                 }     
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
            //    getcb.doClick();
    }//GEN-LAST:event_insertBtnActionPerformed

    private void CB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB1ActionPerformed
        CB1.setEditable(false);
        try
        {
            Class.forName("java.sql.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_mgt","root","");
            stmt=con.createStatement();
            String sql="SELECT Sno FROM tweens;";
            rs=stmt.executeQuery(sql);
            while(rs.next()) {
                String r;
                r=rs.getString("Sno");
                CB1.addItem(r);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        try
        {
            Class.forName("java.sql.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_mgt","root","");
            stmt=con.createStatement();
            String sql="SELECT * FROM tweens where Sno='" + CB1.getSelectedItem() +" ' ;";
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                String sno=rs.getString("Sno");
                snoTF.setText(""+sno);
                String size=rs.getString("Size");
                sizeTF.setText(""+size);
                String csize=rs.getString("CupSize");
                cupTF.setText(""+csize);
                String qty=rs.getString("Qty");
                qtyTF.setText(""+qty);
                String price=rs.getString("Price");
                priceTF.setText(""+price);
            }
          
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_CB1ActionPerformed

    private void getcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getcbActionPerformed
          CB1.removeAllItems();
         try
        {
            Class.forName("java.sql.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_mgt","root","");
            stmt=con.createStatement();
            String sql="SELECT Sno FROM tweens;";
            rs=stmt.executeQuery(sql);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
          
        }
    }//GEN-LAST:event_getcbActionPerformed
        
    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:     
        System.exit(0);
             
    }//GEN-LAST:event_exitBtnActionPerformed

    private void updBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updBtnActionPerformed
            try
                 {
                    String sno=snoTF.getText();
                    String size=sizeTF.getText();
                    String csize=cupTF.getText();
                    String qty=qtyTF.getText();
                    String price=priceTF.getText();
                    Class.forName("java.sql.Driver");
                    con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_mgt","root",""); 
                    stmt=con.createStatement();
                    String sql="UPDATE tweens SET Sno='"+ sno +"',Size='"+ size +"',CupSize='"+csize+"',Qty='"+qty+"',Price='"+ price +"' where Sno='"+snoTF.getText()+"' ;";       
                    int res=stmt.executeUpdate(sql);
                      if(res!=0)
                          JOptionPane.showMessageDialog(null, "updated record sucessfully!!");
                     else
                          JOptionPane.showMessageDialog(null, "Record can't be updated");
                    snoTF.setText("");
                    sizeTF.setText("");
                    cupTF.setText("");
                    qtyTF.setText("");
                    priceTF.setText("");  
                    CB1.removeAllItems();
                 }     
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
           
    }//GEN-LAST:event_updBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Tweens().setVisible(true);
                
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB1;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cupTF;
    private javax.swing.JTextField dateTF;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton getcb;
    private javax.swing.JButton insertBtn;
    private javax.swing.JButton insertBtn2;
    private javax.swing.JTextField priceTF;
    private javax.swing.JTextField qtyTF;
    private javax.swing.JTextField sizeTF;
    private javax.swing.JLabel snoLbl;
    private javax.swing.JLabel snoLbl1;
    private javax.swing.JLabel snoLbl2;
    private javax.swing.JLabel snoLbl3;
    private javax.swing.JLabel snoLbl4;
    private javax.swing.JLabel snoLbl5;
    private javax.swing.JTextField snoTF;
    private javax.swing.JTextField snoTF2;
    private javax.swing.JButton updBtn;
    // End of variables declaration//GEN-END:variables
}

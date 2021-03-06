/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWING;

import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
public class Warehouse_Frm extends javax.swing.JFrame {
Connection cn=null;
Statement st=null;
ResultSet rs=null;
PreparedStatement ps=null;
String insert_sql="insert into warehouse values(?,?,?,?)";
String delete_sql="delete from warehouse where wid=?";
String update_sql="update warehouse set wphno=? , wemail=? where wid=?";
String select_sql="select * from warehouse order by wid";
    /**
     * Creates new form Warehouse_Frm
     */
    public Warehouse_Frm() {
        initComponents();
    }
public void insertData()
  {
      try
      {
          ConnectionFactory con=new ConnectionFactory();
          cn=con.getConn();
          ps=cn.prepareStatement(insert_sql);
          ps.setString(1,wid_txt.getText());
          ps.setString(2,wname_txt.getText());
          ps.setString(3, wphno_txt.getText());
          ps.setString(4,wemail_txt.getText());
         
          ps.executeUpdate();
          cn.commit();
      }
      catch(SQLException se)
      {
          se.printStackTrace();
      }
      
  }
public void getData()
  {
      try
      {
          ConnectionFactory con=new ConnectionFactory();
          cn=con.getConn();
          st=cn.createStatement();
          rs=st.executeQuery(select_sql);
          warehouse_table.setModel(DbUtils.resultSetToTableModel(rs));
          
      }
      catch(SQLException se)
      {
          se.printStackTrace();
      }
      
  }
public void deleteData()
  {
      try
      {
          ConnectionFactory con=new ConnectionFactory();
          cn=con.getConn();
          ps=cn.prepareStatement(delete_sql);
          ps.setString(1,wid_txt.getText());
              ps.executeUpdate();
          cn.commit();
      }
      catch(SQLException se)
      {
          se.printStackTrace();
      }
      
  }
 public void updateData()
  {
      try
      {
          ConnectionFactory con=new ConnectionFactory();
          cn=con.getConn();
          ps=cn.prepareStatement(update_sql);
           ps.setString(1,wphno_txt.getText());
          ps.setString(2,wemail_txt.getText());
          ps.setString(3,wid_txt.getText());
          ps.executeUpdate();
          cn.commit();
      }
      catch(SQLException se)
      {
          se.printStackTrace();
      }
      
  }
 public void refreshData()
  {
      wid_txt.setText("");
      wname_txt.setText("");
      wphno_txt.setText("");
      wemail_txt.setText("");
 
  }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        warehouse_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        wid_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        wname_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        wphno_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        wemail_txt = new javax.swing.JTextField();
        save_button = new javax.swing.JButton();
        update_button = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();
        show_button = new javax.swing.JButton();
        close_button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("WAREHOUSE  DETAILS");

        warehouse_table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(warehouse_table);

        jLabel1.setText("WAREHOUSE ID");

        jLabel2.setText("WAREHOUSE NAME");

        jLabel3.setText("WAREHOUSE PHNO");

        jLabel4.setText("WAREHOUSE EMAIL");

        save_button.setText("SAVE");
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });

        update_button.setText("UPDATE");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });

        delete_button.setText("DELETE");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        show_button.setText("SHOW");
        show_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_buttonActionPerformed(evt);
            }
        });

        close_button.setText("CLOSE");
        close_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_buttonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel5.setText("ADD WAREHOUSE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(wid_txt)
                            .addComponent(wname_txt)
                            .addComponent(wphno_txt)
                            .addComponent(wemail_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(update_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(show_button)
                        .addGap(26, 26, 26)
                        .addComponent(close_button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(wid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(wname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(wphno_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(wemail_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save_button)
                    .addComponent(update_button)
                    .addComponent(delete_button)
                    .addComponent(show_button)
                    .addComponent(close_button))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        setBounds(0, 0, 975, 566);
    }// </editor-fold>//GEN-END:initComponents

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
        // TODO add your handling code here:
          if(wid_txt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"WAREHOUSE ID IS EMPTY");
        }
        else if(wname_txt.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(this,"WAREHOUSE NAME IS EMPTY");
        }
        else if(wphno_txt.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(this,"WAREHOUSE PHONE NO. IS EMPTY");
        }
        
        else if(wemail_txt.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(this,"WAREHOUSE EMAIL IS EMPTY");
        }
        else
        {
        this.insertData();
        this.refreshData();
        JOptionPane.showMessageDialog(this,"DATA INSERTED SUCCESSFULLY");
        this.getData();
        }
    }//GEN-LAST:event_save_buttonActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
        // TODO add your handling code here:
        
           if(wid_txt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"WAREHOUSE ID IS EMPTY");
        }
        else if(wname_txt.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(this,"WAREHOUSE NAME IS EMPTY");
        }
        else if(wphno_txt.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(this,"WAREHOUSE PHONE NO. IS EMPTY");
        }
        
        else if(wemail_txt.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(this,"WAREHOUSE EMAIL IS EMPTY");
        }
        else
        {
        this.updateData();
        this.refreshData();
        JOptionPane.showMessageDialog(this,"DATA UPDATED SUCCESSFULLY");
        this.getData();
        }
    }//GEN-LAST:event_update_buttonActionPerformed

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
        // TODO add your handling code here:
          if(wid_txt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"WAREHOUSE ID IS EMPTY");
        }
       else
       {
        this.deleteData();
        this.refreshData();
        JOptionPane.showMessageDialog(this,"DATA DELETED SUCCESSFULLY");
        this.getData();
       }
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void show_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_buttonActionPerformed
        // TODO add your handling code here:
        this.getData();
    }//GEN-LAST:event_show_buttonActionPerformed

    private void close_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_buttonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_close_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Warehouse_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Warehouse_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Warehouse_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Warehouse_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Warehouse_Frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close_button;
    private javax.swing.JButton delete_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton save_button;
    private javax.swing.JButton show_button;
    private javax.swing.JButton update_button;
    private javax.swing.JTable warehouse_table;
    private javax.swing.JTextField wemail_txt;
    private javax.swing.JTextField wid_txt;
    private javax.swing.JTextField wname_txt;
    private javax.swing.JTextField wphno_txt;
    // End of variables declaration//GEN-END:variables
}

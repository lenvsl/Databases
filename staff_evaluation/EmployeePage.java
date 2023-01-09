/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff_evaluation;

import static staff_evaluation.EvaluatorPage.jLabel3;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;  
import java.io.*; 
import java.awt.event.WindowEvent;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static staff_evaluation.ManagerPage.jLabel1_manager;
import static staff_evaluation.login_page.jTextField_Username;

public class EmployeePage extends javax.swing.JFrame {
 Border default_border = BorderFactory.createMatteBorder(1,0,1,0, new Color(46,49,49));
 Border yellow_border = BorderFactory.createMatteBorder(1,0,1,0, Color.YELLOW);
 JLabel[] menulabels = new JLabel[4];
 JPanel[] panels = new JPanel[2];

   
    public EmployeePage() {
        initComponents();
        this.setLocationRelativeTo(null);
        addActionToMenuLabels();
    }
     public EmployeePage(String username) {
        initComponents();
        jLabel1.setText(username);
        Border panelBorder = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white);
        jPanel1.setBorder(panelBorder);
       
        //populate the menuLabels array
        menulabels[0] =jLabelEMPLOYEE;
        menulabels[1] =jLabelcandicity;
        menulabels[2] =jLabelhistory;
        menulabels[3] =jLabelrequestappl ;
      
    
   
    }
          Border containerBorder = BorderFactory.createMatteBorder(1,1,1,1,new Color(46,49,49));
 public void setLabelBackground(JLabel label)
{
     
        // reset labels to their default design
        for (JLabel menuItem : menulabels)
        {
           // change the jlabel background color to white
           menuItem.setBackground(new Color(46,49,49));
           // change the jlabel Foreground color to blue
           menuItem.setForeground(Color.white); 
        }
        
        // change the jlabel background color to white
        label.setBackground(Color.white);
        // change the jlabel Foreground color to blue
        label.setForeground(Color.blue); 
}
     public void showPanel(JPanel panel)
    {
        // hide panels
        for (JPanel pnl : panels) 
        {
            pnl.setVisible(false);
        }
        
        // and show only this panel
        panel.setVisible(true);
    }
public void addActionToMenuLabels(){
 Component[] components = jPanel1.getComponents();
    
    for (Component component : components){
      if(component instanceof JLabel )
      {
          JLabel label = (JLabel) component ;
          label.addMouseListener(new MouseListener () {
              @Override
              public void mouseClicked(MouseEvent e) {
              }

              @Override
              public void mousePressed(MouseEvent e) {
             }

              @Override
              public void mouseReleased(MouseEvent e) {
              }

              @Override
              public void mouseEntered(MouseEvent e) {
                  label.setBorder(yellow_border);
              }

              @Override
              public void mouseExited(MouseEvent e) {
                  label.setBorder(default_border);
             }
          });


}}
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelEMPLOYEE = new javax.swing.JLabel();
        jLabelrequestappl = new javax.swing.JLabel();
        jLabelhistory = new javax.swing.JLabel();
        jLabelcandicity = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("X");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabelEMPLOYEE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEMPLOYEE.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEMPLOYEE.setText("SEE YOUR FILE");
        jLabelEMPLOYEE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEMPLOYEE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEMPLOYEEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelEMPLOYEEMouseEntered(evt);
            }
        });

        jLabelrequestappl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelrequestappl.setForeground(new java.awt.Color(255, 255, 255));
        jLabelrequestappl.setText("REQUEST FOR APPLICATION");
        jLabelrequestappl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelrequestappl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelrequestapplMouseClicked(evt);
            }
        });

        jLabelhistory.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelhistory.setForeground(new java.awt.Color(255, 255, 255));
        jLabelhistory.setText("SEE ALL OF YOUR APPLICATION");
        jLabelhistory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelhistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelhistoryMouseClicked(evt);
            }
        });

        jLabelcandicity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelcandicity.setForeground(new java.awt.Color(255, 255, 255));
        jLabelcandicity.setText("WITHDRAW A CANDICITY");
        jLabelcandicity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelcandicity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelcandicityMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelhistory)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelcandicity, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(221, 221, 221))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelrequestappl, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelEMPLOYEE, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(210, 210, 210)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelEMPLOYEE, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabelrequestappl, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabelhistory, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabelcandicity, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelEMPLOYEEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEMPLOYEEMouseClicked
       new Employee_Empl().setVisible(true);
       Employee_Empl.jTextField1.setText(jTextField_Username.getText());
       this.dispose();       
    }//GEN-LAST:event_jLabelEMPLOYEEMouseClicked

    private void jLabelrequestapplMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelrequestapplMouseClicked
      new Employee_Request().setVisible(true);
       Employee_Request.jLabel3.setText(jTextField_Username.getText());
       this.dispose(); 
    }//GEN-LAST:event_jLabelrequestapplMouseClicked

    private void jLabelhistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelhistoryMouseClicked
       new Employee_Application().setVisible(true);
       Employee_Application.jTextField1.setText(jTextField_Username.getText());
       this.dispose();      
    }//GEN-LAST:event_jLabelhistoryMouseClicked

    private void jLabelcandicityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcandicityMouseClicked
     new Employee_Candicity().setVisible(true);
     Employee_Candicity.jLabel5.setText(jTextField_Username.getText());
     this.dispose(); 
    }//GEN-LAST:event_jLabelcandicityMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabelEMPLOYEEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEMPLOYEEMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelEMPLOYEEMouseEntered

    
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
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelEMPLOYEE;
    private javax.swing.JLabel jLabelcandicity;
    private javax.swing.JLabel jLabelhistory;
    private javax.swing.JLabel jLabelrequestappl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

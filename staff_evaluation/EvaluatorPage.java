
package staff_evaluation;
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

public class EvaluatorPage extends javax.swing.JFrame {
 Border default_border = BorderFactory.createMatteBorder(1,0,1,0, new Color(46,49,49));
 Border yellow_border = BorderFactory.createMatteBorder(1,0,1,0, Color.YELLOW);
 JLabel[] menulabels = new JLabel[8];
 JPanel[] panels = new JPanel[2];
    
    public EvaluatorPage() {
        initComponents();
         this.setLocationRelativeTo(null);
         addActionToMenuLabels();
         String username_employee =jLabel3 .getText();
    }
    public EvaluatorPage(String username) {
        initComponents();
          jLabel3.setText(username);
          
        //set borders
        Border panelBorder = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white);
        jPanel1.setBorder(panelBorder);
       
        //populate the menuLabels array
        menulabels[0] =jLabeljobs;
        menulabels[1] =jLabelPOSITIONS;
        menulabels[2] =jLabelNUMBEROFAPP;
        menulabels[3] =jLabelinsertnewjob_ ;
        menulabels[4] =jLabelevaluator;
        menulabels[5] =jLabelRESULTSOFEVALUATIONS_ ;
        menulabels[6] =jLabelUPNEWJOBS;
     
   
   
   

        
        //populate the panels
       // panels[0] = jPanel_manager;
       // panels[1] = jPanel_comp;
        //panels[2] = jPanel_user;
        //panels[3] = jPanel_job;
        //panels[4] = jPanel_eval;
        //panels[5] = jPanel_average;
        //panels[6] = jPanel_empl;
        //panels[7] = jPanel_seempl;
      
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
    
// create a function to show the selected panel
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
      
      
      
      }
    
    
    }


}
          


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelevaluator = new javax.swing.JLabel();
        jLabeljobs = new javax.swing.JLabel();
        jLabelinsertnewjob_ = new javax.swing.JLabel();
        jLabelUPNEWJOBS = new javax.swing.JLabel();
        jLabelNUMBEROFAPP = new javax.swing.JLabel();
        jLabelRESULTSOFEVALUATIONS_ = new javax.swing.JLabel();
        jLabelPOSITIONS = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabelevaluator.setBackground(new java.awt.Color(0, 51, 51));
        jLabelevaluator.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelevaluator.setForeground(new java.awt.Color(255, 255, 255));
        jLabelevaluator.setText("Modify Data");
        jLabelevaluator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelevaluator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelevaluatorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelevaluatorMouseEntered(evt);
            }
        });

        jLabeljobs.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabeljobs.setForeground(new java.awt.Color(255, 255, 255));
        jLabeljobs.setText("See and Update Jobs ");
        jLabeljobs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabeljobs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabeljobsMouseClicked(evt);
            }
        });

        jLabelinsertnewjob_.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelinsertnewjob_.setForeground(new java.awt.Color(255, 255, 255));
        jLabelinsertnewjob_.setText("Insert New  Job");
        jLabelinsertnewjob_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelinsertnewjob_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelinsertnewjob_MouseClicked(evt);
            }
        });

        jLabelUPNEWJOBS.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelUPNEWJOBS.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUPNEWJOBS.setText("See and Update New Jobs");
        jLabelUPNEWJOBS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelUPNEWJOBS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUPNEWJOBSMouseClicked(evt);
            }
        });

        jLabelNUMBEROFAPP.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNUMBEROFAPP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNUMBEROFAPP.setText("Show All Applications");
        jLabelNUMBEROFAPP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelNUMBEROFAPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNUMBEROFAPPMouseClicked(evt);
            }
        });

        jLabelRESULTSOFEVALUATIONS_.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelRESULTSOFEVALUATIONS_.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRESULTSOFEVALUATIONS_.setText("See Results Of Evaluations");
        jLabelRESULTSOFEVALUATIONS_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRESULTSOFEVALUATIONS_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRESULTSOFEVALUATIONS_MouseClicked(evt);
            }
        });

        jLabelPOSITIONS.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPOSITIONS.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPOSITIONS.setText("View All Posted Positions  ");
        jLabelPOSITIONS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPOSITIONS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPOSITIONSMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPOSITIONSMouseEntered(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(363, 363, 363)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelevaluator, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeljobs, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelinsertnewjob_, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUPNEWJOBS, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNUMBEROFAPP, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRESULTSOFEVALUATIONS_)
                    .addComponent(jLabelPOSITIONS, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelevaluator, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabeljobs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelinsertnewjob_, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabelUPNEWJOBS, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNUMBEROFAPP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabelRESULTSOFEVALUATIONS_, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPOSITIONS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelevaluatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelevaluatorMouseClicked
       // String username_employee =jLabel3 .getText();
        
       new Evaluator_ModifyData().setVisible(true);
       Evaluator_ModifyData.jLabel3.setText( jTextField_Username.getText());
       this.dispose();
    }//GEN-LAST:event_jLabelevaluatorMouseClicked

    private void jLabeljobsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeljobsMouseClicked
       //String username_employee =jLabel3 .getText();
       new Evaluator_Job().setVisible(true);
       Evaluator_Job.jTextFieldNAME.setText( jTextField_Username.getText());
       this.dispose();
        
    }//GEN-LAST:event_jLabeljobsMouseClicked

    private void jLabelinsertnewjob_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelinsertnewjob_MouseClicked
       //String username_employee =jLabel3 .getText();
       new Evaluator_InsertJob().setVisible(true);
       Evaluator_InsertJob.jTextFieldNAME.setText(jTextField_Username.getText());
       //Evaluator_InsertJob.jLabel2.setText(jTextField_Username.getText());
       this.dispose();
    }//GEN-LAST:event_jLabelinsertnewjob_MouseClicked

    private void jLabelUPNEWJOBSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUPNEWJOBSMouseClicked
      //String username_employee =jLabel3 .getText();
      new Evaluator_UPNewJobs().setVisible(true);
      Evaluator_UPNewJobs.jTextFieldNAME.setText( jTextField_Username.getText());
       this.dispose();
    }//GEN-LAST:event_jLabelUPNEWJOBSMouseClicked

    private void jLabelNUMBEROFAPPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNUMBEROFAPPMouseClicked
       //String username_employee =jLabel3 .getText();
       new Evaluator_Applications().setVisible(true);
        Evaluator_Applications.jLabel2.setText(jTextField_Username.getText());
       this.dispose();
    }//GEN-LAST:event_jLabelNUMBEROFAPPMouseClicked

    private void jLabelRESULTSOFEVALUATIONS_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRESULTSOFEVALUATIONS_MouseClicked
       //String username_employee =jLabel3 .getText();
        new Evaluator_ResultsEvaluations().setVisible(true);
        Evaluator_ResultsEvaluations.jLabel1.setText( jTextField_Username.getText());
       this.dispose();
    }//GEN-LAST:event_jLabelRESULTSOFEVALUATIONS_MouseClicked

    private void jLabelPOSITIONSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPOSITIONSMouseClicked
     new Evaluator_Positions().setVisible(true);
       Evaluator_Positions.jLabel2.setText(jTextField_Username.getText());
       this.dispose();
    }//GEN-LAST:event_jLabelPOSITIONSMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
          System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabelevaluatorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelevaluatorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelevaluatorMouseEntered

    private void jLabelPOSITIONSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPOSITIONSMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelPOSITIONSMouseEntered

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
            java.util.logging.Logger.getLogger(EvaluatorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EvaluatorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EvaluatorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EvaluatorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EvaluatorPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    public static transient javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelNUMBEROFAPP;
    private javax.swing.JLabel jLabelPOSITIONS;
    private javax.swing.JLabel jLabelRESULTSOFEVALUATIONS_;
    private javax.swing.JLabel jLabelUPNEWJOBS;
    private javax.swing.JLabel jLabelevaluator;
    private javax.swing.JLabel jLabelinsertnewjob_;
    private javax.swing.JLabel jLabeljobs;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

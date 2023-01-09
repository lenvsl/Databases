/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff_evaluation;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.border.Border;
import static staff_evaluation.EmployeePage.jLabel1;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static staff_evaluation.login_page.jTextField_Username;

/**
 *
 * @author Αρχοντία
 */
public class ManagerPage extends javax.swing.JFrame {

  
   Border default_border = BorderFactory.createMatteBorder(1,0,1,0, new Color(46,49,49));
   Border yellow_border = BorderFactory.createMatteBorder(1,0,1,0, Color.YELLOW);
   JLabel[] menulabels = new JLabel[7];
   JPanel[] panels = new JPanel[8];
    //JPanel[] panels = new jPanel[7];*/
    public ManagerPage() {
        initComponents();
        //center this form 
        this.setLocationRelativeTo(null);
        //set borders
        Border panelBorder = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white);
        jLabel1_manager.setBorder(panelBorder);
     
        //populate the menuLabels array
        menulabels[0] = jLabel2_upcomp;
        menulabels[1] = jLabel3_upuser;
        menulabels[2] = jLabel4_upsal;
        menulabels[3] = jLabel5_seleval;
        menulabels[4] = jLabel6_average;
        menulabels[5] = jLabel7_upempl;
        menulabels[6] = jLabel8_seempl;
        
        //populate the panels
       // panels[0] = jPanel_manager;
       // panels[1] = jPanel_comp;
        //panels[2] = jPanel_user;
        //panels[3] = jPanel_job;
        //panels[4] = jPanel_eval;
        //panels[5] = jPanel_average;
        //panels[6] = jPanel_empl;
        //panels[7] = jPanel_seempl;
        addActionToLabels();
    }
    public ManagerPage(String username) {
       initComponents();
        jLabel1_manager.setText(username);
    }
    Border containerBorder = BorderFactory.createMatteBorder(1,1,1,1,new Color(46,49,49));
    //jPanel1.setBorder(containerBorder);
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


          
public void addActionToLabels()
{
    //get labels in jpanel3
    Component[] components = jPanel3.getComponents();
    for(Component component : components){
      if(component instanceof JLabel)
      {
          JLabel label = (JLabel) component;
          label.addMouseListener(new MouseListener() {
              @Override
              public void mouseClicked(MouseEvent e) {
                 //setLabelBackround(label);
                 //
                 switch(label.getText().trim())
                 {
                   case "Welcome ":
                                   //showPanel(jPanel_manager);
                                   break;
                                   
                            case "change data in your company":
                                   //showPanel(jPanel_comp);
                                    //jPanel_comp.setBackground(Color.orange);
                   
                                   break;
                             case "change password and email":
                                   //showPanel(jPanel_user);
                                    //jPanel_user.setBackground(Color.white);
                                   break;
                                   case "modify job salary":
                                   //showPanel(jPanel_job);
                                   // jPanel_job.setBackground(Color.pink);
                                   break;
                                   case "view result final evaluations":
                                   //showPanel(jPanel_eval);
                                    //jPanel_eval.setBackground(Color.blue);
                                   break;
                                   case "view average per evaluator":
                                   //showPanel(jPanel_average);
                                    //jPanel_average.setBackground(Color.white);
                                   break;
                                   case "view , update file of employee":
                                   //showPanel(jPanel_empl);
                                    //jPanel_empl.setBackground(Color.white);
                                   break;
                                   case "see information about employee":
                                   //showPanel(jPanel_seempl);
                                    //jPanel_seempl.setBackground(Color.yellow);
                                   break;
                 
                 }
                 }

              @Override
              public void mousePressed(MouseEvent e) {
             }

              @Override
              public void mouseReleased(MouseEvent e) {
             }

              @Override
              public void mouseEntered(MouseEvent e) {
                  //set the border to yellow
                  label.setBorder(yellow_border);
             }

              @Override
              public void mouseExited(MouseEvent e) {
                   //set the border to the default border
                  label.setBorder(default_border);
             }
          });
          
      }
    }


}


      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1_manager = new javax.swing.JLabel();
        jLabel2_upcomp = new javax.swing.JLabel();
        jLabel3_upuser = new javax.swing.JLabel();
        jLabel4_upsal = new javax.swing.JLabel();
        jLabel5_seleval = new javax.swing.JLabel();
        jLabel7_upempl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8_seempl = new javax.swing.JLabel();
        jLabel6_average = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jButton7.setText("jButton7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(46, 49, 49));

        jLabel1_manager.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1_manager.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1_manager.setText("WELCOME  ");

        jLabel2_upcomp.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2_upcomp.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel2_upcomp.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_upcomp.setText("change data in your company");
        jLabel2_upcomp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2_upcomp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2_upcompMouseClicked(evt);
            }
        });

        jLabel3_upuser.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel3_upuser.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3_upuser.setText("change password and email");
        jLabel3_upuser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3_upuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3_upuserMouseClicked(evt);
            }
        });

        jLabel4_upsal.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel4_upsal.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4_upsal.setText("modify job salary");
        jLabel4_upsal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4_upsal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4_upsalMouseClicked(evt);
            }
        });

        jLabel5_seleval.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel5_seleval.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5_seleval.setText("view result final evaluations");
        jLabel5_seleval.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5_seleval.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5_selevalMouseClicked(evt);
            }
        });

        jLabel7_upempl.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel7_upempl.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7_upempl.setText("view , update file of employee");
        jLabel7_upempl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7_upempl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7_upemplMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setForeground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        jLabel8_seempl.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel8_seempl.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8_seempl.setText("see information about employee");
        jLabel8_seempl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8_seempl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8_seemplMouseClicked(evt);
            }
        });

        jLabel6_average.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel6_average.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6_average.setText("view average per evaluator");
        jLabel6_average.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6_average.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6_averageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2_upcomp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4_upsal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5_seleval, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7_upempl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3_upuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6_average, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1_manager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8_seempl, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_manager, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2_upcomp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3_upuser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4_upsal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5_seleval, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel6_average, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7_upempl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8_seempl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(593, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2_upcompMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_upcompMouseClicked
       new Manager_Company().setVisible(true);
        Manager_Company.jTextFieldNAME.setText( jTextField_Username.getText());
       this.dispose();
    }//GEN-LAST:event_jLabel2_upcompMouseClicked

    private void jLabel3_upuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3_upuserMouseClicked
      new Manager_User().setVisible(true);
       Manager_User.jTextFieldNAME.setText( jTextField_Username.getText());
       this.dispose();
    }//GEN-LAST:event_jLabel3_upuserMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4_upsalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4_upsalMouseClicked
      new Manager_Salary().setVisible(true);
       Manager_Salary.jTextFieldName.setText( jTextField_Username.getText());
       this.dispose();
    }//GEN-LAST:event_jLabel4_upsalMouseClicked

    private void jLabel8_seemplMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8_seemplMouseClicked
        new Manager_Empl().setVisible(true);
         Manager_Empl.jTextField1.setText( jTextField_Username.getText());
        this.dispose();
    }//GEN-LAST:event_jLabel8_seemplMouseClicked

    private void jLabel5_selevalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5_selevalMouseClicked
       new Manager_Eval().setVisible(true);
      
      Manager_Eval.jTextFieldNAME.setText( jTextField_Username.getText());
       this.dispose();
    }//GEN-LAST:event_jLabel5_selevalMouseClicked

    private void jLabel7_upemplMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7_upemplMouseClicked
       new Manager_UpEvaluator().setVisible(true);
       Manager_UpEvaluator.jTextFieldNAME.setText( jTextField_Username.getText());
       this.dispose();
    }//GEN-LAST:event_jLabel7_upemplMouseClicked

    private void jLabel6_averageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6_averageMouseClicked
       new Manager_Average().setVisible(true);
       Manager_Average.jTextFieldNAME.setText( jTextField_Username.getText());
       this.dispose();
    }//GEN-LAST:event_jLabel6_averageMouseClicked
/**//**//**//**//**//*/*
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
            java.util.logging.Logger.getLogger(ManagerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerPage().setVisible(true);
            }
        });
    }
      


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    public static javax.swing.JLabel jLabel1_manager;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2_upcomp;
    private javax.swing.JLabel jLabel3_upuser;
    private javax.swing.JLabel jLabel4_upsal;
    private javax.swing.JLabel jLabel5_seleval;
    private javax.swing.JLabel jLabel6_average;
    private javax.swing.JLabel jLabel7_upempl;
    private javax.swing.JLabel jLabel8_seempl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables

   
}


package staff_evaluation;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import static staff_evaluation.EmployeePage.jLabel1;
import static staff_evaluation.login_page.jTextField_Username;

/**
 *
 * @author Αρχοντία
 */
public class AdminPage extends javax.swing.JFrame {
 Border default_border = BorderFactory.createMatteBorder(1,0,1,0, new Color(46,49,49));
 Border yellow_border = BorderFactory.createMatteBorder(1,0,1,0, Color.YELLOW);
 JLabel[] menulabels = new JLabel[4];
 JPanel[] panels = new JPanel[2];


  
    public AdminPage() {
        initComponents();
    }
     public AdminPage(String username) {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel1_Admin.setText(username);
        AdminPage ad = new AdminPage();
        ad.setVisible(true);
          initComponents();
        jLabel1.setText(username);
        Border panelBorder = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white);
        jPanel1.setBorder(panelBorder);
       
        //populate the menuLabels array
        menulabels[0] =jLabelCREATE;
        menulabels[1] =jLabellINSERT;
      
      
    
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
        jLabelCREATE = new javax.swing.JLabel();
        jLabellINSERT = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1_Admin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 153));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        jLabelCREATE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCREATE.setText("CREATE NEW ACCOUNTS ");
        jLabelCREATE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCREATE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCREATEMouseClicked(evt);
            }
        });

        jLabellINSERT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabellINSERT.setText("INSERT NEW COMPANIES");
        jLabellINSERT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabellINSERT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabellINSERTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCREATE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabellINSERT, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                .addGap(201, 201, 201))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelCREATE, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabellINSERT, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1_Admin.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabelCREATEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCREATEMouseClicked
       new ADMIN_CREATE().setVisible(true);
       ADMIN_CREATE.jLabelCREATE.setText( jTextField_Username.getText());
       this.dispose();
    }//GEN-LAST:event_jLabelCREATEMouseClicked

    private void jLabellINSERTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabellINSERTMouseClicked
       new ADMIN_INSERT().setVisible(true);
       ADMIN_INSERT.jLabel2.setText( jTextField_Username.getText());
       this.dispose();
    }//GEN-LAST:event_jLabellINSERTMouseClicked


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel1_Admin;
    private javax.swing.JLabel jLabelCREATE;
    private javax.swing.JLabel jLabellINSERT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

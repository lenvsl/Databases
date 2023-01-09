/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff_evaluation;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import java.awt.BorderLayout;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.math.BigInteger;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.sql.*;
import java.util.Vector;
import java.math.BigInteger;
import static staff_evaluation.Evaluator_Job.jTextFieldNAME;
public class Evaluator_InsertJob extends javax.swing.JFrame {

    /**
     * Creates new form Evaluator_InsertJob
     */
    public Evaluator_InsertJob() {
        initComponents();
        this.setLocationRelativeTo(null);
        DisplayTable();
        
    }
     private void DisplayTable()
    {
        java.sql.Connection myConn = null;
        PreparedStatement st = null;
        java.sql.ResultSet rs ;
         //create a select query to check if the username and the password exist in the database
       
        
		try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost/staffevaluation", "root" , "");
                      
                       String value3 = jTextFieldNAME.getText();
                        String query = "SELECT * FROM job  " ;
			st=myConn.prepareStatement(query);
                        rs = st.executeQuery();
                        jTableJOB.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            
                }catch (Exception exc) {
			exc.printStackTrace();
		}
        

         
                      
            
}

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldNAME = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabelIDSALARY = new javax.swing.JLabel();
        jLabelPOSITION = new javax.swing.JLabel();
        jLabelIDEDRA = new javax.swing.JLabel();
        jLabelSTARTDATE = new javax.swing.JLabel();
        jLabelEVALUATOR = new javax.swing.JLabel();
        jLabelAnnDate = new javax.swing.JLabel();
        jLabelSubDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableJOB = new javax.swing.JTable();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldSTART = new javax.swing.JTextField();
        jTextFieldsalary = new javax.swing.JTextField();
        jTextFieldPOSITION = new javax.swing.JTextField();
        jTextFieldedra = new javax.swing.JTextField();
        jTextFieldEVALUATOR = new javax.swing.JTextField();
        jTextFieldAnnDate = new javax.swing.JTextField();
        jTextFieldsUBDate = new javax.swing.JTextField();
        jButtonadd = new javax.swing.JButton();
        jButtonback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelID.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelID.setText("Id");

        jLabelIDSALARY.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelIDSALARY.setText("Salary");

        jLabelPOSITION.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPOSITION.setText("Position");

        jLabelIDEDRA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelIDEDRA.setText("Edra");

        jLabelSTARTDATE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelSTARTDATE.setText("Start Date ");

        jLabelEVALUATOR.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelEVALUATOR.setText("Evaluator");

        jLabelAnnDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelAnnDate.setText("Announce Date");

        jLabelSubDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelSubDate.setText("Submission Date");

        jTableJOB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableJOB);

        jButtonadd.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonadd.setText("ADD");
        jButtonadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaddActionPerformed(evt);
            }
        });

        jButtonback.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonback.setText("BACK");
        jButtonback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonadd, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIDSALARY, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPOSITION, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelIDEDRA, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEVALUATOR, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSTARTDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAnnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSubDate)
                            .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSTART, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPOSITION, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldedra, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEVALUATOR, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldAnnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldsUBDate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonback, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelID)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSTARTDATE)
                            .addComponent(jTextFieldSTART, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIDSALARY)
                            .addComponent(jTextFieldsalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPOSITION)
                            .addComponent(jTextFieldPOSITION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIDEDRA)
                            .addComponent(jTextFieldedra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEVALUATOR)
                            .addComponent(jTextFieldEVALUATOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAnnDate)
                            .addComponent(jTextFieldAnnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSubDate)
                            .addComponent(jTextFieldsUBDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonadd)
                    .addComponent(jButtonback))
                .addGap(29, 29, 29))
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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButtonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbackActionPerformed
       new EvaluatorPage().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButtonbackActionPerformed

    private void jButtonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddActionPerformed
    jTableJOB.setVisible(true);
          
           
      
        try {
           java.sql.Connection myConn = null;
          
           java.sql.ResultSet rs ;
           CallableStatement cs;
           myConn = DriverManager.getConnection("jdbc:mysql://localhost/staffevaluation", "root" , "");
             DefaultTableModel TblModel = (DefaultTableModel) jTableJOB.getModel();
              String value1 =jTextFieldEVALUATOR.getText();
           String value2 = jTextFieldID.getText();
           String value3 = jTextFieldNAME.getText();
           String value4 = jTextFieldsalary.getText();
           String value5=jTextFieldAnnDate.getText();
       
           String value6 = jTextFieldedra.getText();
           String value7 = jTextFieldPOSITION.getText();
           String value8 =jTextFieldsUBDate .getText();
           String value9 =jTextFieldSTART.getText();
           int ID = Integer.parseInt(value2);
           int SALARY = Integer.parseInt(value4);
          
            
         
String query = 
"INSERT INTO job(id,start_date,salary,position,edra,evaluator,announce_date,submission_date) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement st = myConn.prepareStatement(query);
        
            st.setString(1,value2);
            st.setString(2,value9);
            st.setString(3,value4);
            st.setString(4,value7);
            st.setString(5,value6);
            st.setString(6,value1);
            st.setString(7,value5);
            st.setString(8,value8);
            st.execute();
    
      
      
        JOptionPane.showMessageDialog(null, "Insert succesfully");
       
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, "Dont Insert succesfully");
        }
         DisplayTable();
                                             
    }//GEN-LAST:event_jButtonaddActionPerformed

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
            java.util.logging.Logger.getLogger(Evaluator_InsertJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Evaluator_InsertJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Evaluator_InsertJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Evaluator_InsertJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Evaluator_InsertJob().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonadd;
    private javax.swing.JButton jButtonback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAnnDate;
    private javax.swing.JLabel jLabelEVALUATOR;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelIDEDRA;
    private javax.swing.JLabel jLabelIDSALARY;
    private javax.swing.JLabel jLabelPOSITION;
    private javax.swing.JLabel jLabelSTARTDATE;
    private javax.swing.JLabel jLabelSubDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableJOB;
    private javax.swing.JTextField jTextFieldAnnDate;
    private javax.swing.JTextField jTextFieldEVALUATOR;
    private javax.swing.JTextField jTextFieldID;
    public static javax.swing.JTextField jTextFieldNAME;
    private javax.swing.JTextField jTextFieldPOSITION;
    private javax.swing.JTextField jTextFieldSTART;
    private javax.swing.JTextField jTextFieldedra;
    private javax.swing.JTextField jTextFieldsUBDate;
    private javax.swing.JTextField jTextFieldsalary;
    // End of variables declaration//GEN-END:variables
}

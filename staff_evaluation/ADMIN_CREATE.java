
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
import static staff_evaluation.Evaluator_InsertJob.jTextFieldNAME;
import static staff_evaluation.Evaluator_Job.jTextFieldNAME;

public class ADMIN_CREATE extends javax.swing.JFrame {

   
    public ADMIN_CREATE() {
        initComponents();
        this.setLocationRelativeTo(null);
        DisplayTableMANAGERS();
        DisplayTableEVALUATORS();
        DisplayTableemployee();
    }
 private void DisplayTableMANAGERS()
    {
        java.sql.Connection myConn = null;
        PreparedStatement st = null;
        java.sql.ResultSet rs ;
         //create a select query to check if the username and the password exist in the database
       
        
		try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost/staffevaluation", "root" , "");
                     
                        String query = "SELECT * FROM manager  " ;
			st=myConn.prepareStatement(query);
                        rs = st.executeQuery();
                        jTableManagers.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            
                }catch (Exception exc) {
			exc.printStackTrace();
		}
        

         
                      
            
}
  private void DisplayTableEVALUATORS()
    {
        java.sql.Connection myConn = null;
        PreparedStatement st = null;
        java.sql.ResultSet rs ;
         //create a select query to check if the username and the password exist in the database
       
        
		try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost/staffevaluation", "root" , "");
                      
                        String query = "SELECT * FROM evaluator " ;
			st=myConn.prepareStatement(query);
                        rs = st.executeQuery();
                         jTableEvaluators.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            
                }catch (Exception exc) {
			exc.printStackTrace();
		}
        

         
                      
            
}
  
  private void DisplayTableemployee()
    {
        java.sql.Connection myConn = null;
        PreparedStatement st = null;
        java.sql.ResultSet rs ;
         //create a select query to check if the username and the password exist in the database
       
        
		try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost/staffevaluation", "root" , "");
                     
                        String query = "SELECT * FROM employee  " ;
			st=myConn.prepareStatement(query);
                        rs = st.executeQuery();
                         jTableEMPLOYEE.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            
                }catch (Exception exc) {
			exc.printStackTrace();
		}
        

         
                      
            
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelCREATE = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonCREATEM = new javax.swing.JButton();
        jButtonCREATEV = new javax.swing.JButton();
        jButtonCREATEMPL = new javax.swing.JButton();
        jButtonBACK = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableManagers = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEvaluators = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableEMPLOYEE = new javax.swing.JTable();
        MANAGERSNAME = new javax.swing.JTextField();
        MANAGERSEXPYEARS = new javax.swing.JTextField();
        MANAGERSFIRM = new javax.swing.JTextField();
        jLabelEXPYEARS = new javax.swing.JLabel();
        jLabelUSRNM = new javax.swing.JLabel();
        jLabelFIRM = new javax.swing.JLabel();
        EVUSERNAME = new javax.swing.JTextField();
        EVNAME = new javax.swing.JTextField();
        EVSURNAME = new javax.swing.JTextField();
        EVEXPYEARS = new javax.swing.JTextField();
        EVFIRM = new javax.swing.JTextField();
        jLabelEVUSERNAME = new javax.swing.JLabel();
        jLabelEVNAME = new javax.swing.JLabel();
        jLabelEVSURNAME = new javax.swing.JLabel();
        jLabelEvexpyears = new javax.swing.JLabel();
        jLabelEvfirm = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        bio = new javax.swing.JTextField();
        sistatikes = new javax.swing.JTextField();
        certificates = new javax.swing.JTextField();
        awards = new javax.swing.JTextField();
        afmcompany = new javax.swing.JTextField();
        exp_years = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabelCREATE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jButtonCREATEM.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCREATEM.setText("Create Managers ");
        jButtonCREATEM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCREATEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCREATEMActionPerformed(evt);
            }
        });

        jButtonCREATEV.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCREATEV.setText("Create Evaluators");
        jButtonCREATEV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCREATEV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCREATEVActionPerformed(evt);
            }
        });

        jButtonCREATEMPL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCREATEMPL.setText("Create Employee");
        jButtonCREATEMPL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCREATEMPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCREATEMPLActionPerformed(evt);
            }
        });

        jButtonBACK.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonBACK.setText("Back");
        jButtonBACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBACKActionPerformed(evt);
            }
        });

        jTableManagers.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableManagers);

        jTableEvaluators.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableEvaluators);

        jTableEMPLOYEE.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTableEMPLOYEE);

        jLabelEXPYEARS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEXPYEARS.setText("Exp years");

        jLabelUSRNM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelUSRNM.setText("Username");

        jLabelFIRM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelFIRM.setText("Firm");

        jLabelEVUSERNAME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEVUSERNAME.setText("Username");

        jLabelEVNAME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEVNAME.setText("Name");

        jLabelEVSURNAME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEVSURNAME.setText("Surname");

        jLabelEvexpyears.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEvexpyears.setText("Exp Years");

        jLabelEvfirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEvfirm.setText("Firm");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("CERTIFICATES");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("USERNAME");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("BIO");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("AWARDS");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("SISTATIKES");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("AFM COMPANY");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("EXP YEARS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonBACK, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCREATEMPL, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(sistatikes, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel1)
                                        .addGap(51, 51, 51))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(certificates, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(awards, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(afmcompany, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(71, 71, 71))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addGap(55, 55, 55)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(exp_years, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelEVUSERNAME, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EVUSERNAME, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EVNAME)
                                    .addComponent(jLabelEVNAME, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EVSURNAME, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                    .addComponent(jLabelEVSURNAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EVEXPYEARS, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                    .addComponent(jLabelEvexpyears, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EVFIRM, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                    .addComponent(jLabelEvfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(jButtonCREATEV))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MANAGERSNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelUSRNM, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEXPYEARS, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MANAGERSEXPYEARS, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelFIRM, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(MANAGERSFIRM, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonCREATEM)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEXPYEARS)
                            .addComponent(jLabelFIRM)
                            .addComponent(jLabelUSRNM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MANAGERSNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MANAGERSEXPYEARS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MANAGERSFIRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCREATEM)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEVNAME)
                    .addComponent(jLabelEVUSERNAME)
                    .addComponent(jLabelEVSURNAME)
                    .addComponent(jLabelEvexpyears)
                    .addComponent(jLabelEvfirm))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EVUSERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EVNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EVSURNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EVEXPYEARS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EVFIRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jButtonCREATEV))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(afmcompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(exp_years, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(certificates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sistatikes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonBACK)
                            .addComponent(jButtonCREATEMPL)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel5)))
                                .addGap(18, 18, 18)
                                .addComponent(awards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCREATE, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCREATE, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButtonBACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBACKActionPerformed
       new AdminPage().setVisible(true);
       this.dispose(); 
    }//GEN-LAST:event_jButtonBACKActionPerformed

    private void jButtonCREATEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCREATEMActionPerformed
         jTableManagers.setVisible(true);
          
           
      
        try {
           java.sql.Connection myConn = null;
          
           java.sql.ResultSet rs ;
           CallableStatement cs;
           myConn = DriverManager.getConnection("jdbc:mysql://localhost/staffevaluation", "root" , "");
           DefaultTableModel TblModel = (DefaultTableModel) jTableManagers.getModel();
           String value1 =MANAGERSNAME.getText();
           String value2 = MANAGERSEXPYEARS.getText();
           String value3 = MANAGERSFIRM.getText();
           
         
          
            
         
String query = 
"INSERT INTO manager VALUES (?,?,?)";
            PreparedStatement st = myConn.prepareStatement(query);
        
            st.setString(1,value1);
            st.setString(2,value2);
            st.setString(3,value3);
           
            st.execute();
    
      
      
        JOptionPane.showMessageDialog(null, "Insert succesfully");
       
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, "Dont Insert succesfully");
        }
         DisplayTableMANAGERS();
                             
    }//GEN-LAST:event_jButtonCREATEMActionPerformed

    private void jButtonCREATEVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCREATEVActionPerformed
            jTableEvaluators.setVisible(true);
          
           
      
        try {
           java.sql.Connection myConn = null;
          
           java.sql.ResultSet rs ;
           CallableStatement cs;
           myConn = DriverManager.getConnection("jdbc:mysql://localhost/staffevaluation", "root" , "");
             DefaultTableModel TblModel = (DefaultTableModel) jTableEvaluators.getModel();
           String value1 =EVUSERNAME.getText();
           String value2 = EVNAME.getText();
           String value3 = EVSURNAME.getText();
           String value4 = EVEXPYEARS.getText();
           String value5 = EVFIRM .getText();
           
       
            
         
String query = 
"INSERT INTO evaluator(evaluator_username,evvv_name,evvv_surname,evaluator_exp_years,evaluator_firm) VALUES (?,?,?,?,?)";
            PreparedStatement st = myConn.prepareStatement(query);
        
            st.setString(1,value1);
            st.setString(2,value2);
            st.setString(3,value3);
            st.setString(4,value4);
           st.setString(5,value5);
          
            st.execute();
    
      
      
        JOptionPane.showMessageDialog(null, "Insert succesfully");
       
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, "Dont Insert succesfully");
        }
      DisplayTableEVALUATORS();
              
    }//GEN-LAST:event_jButtonCREATEVActionPerformed

    private void jButtonCREATEMPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCREATEMPLActionPerformed
        jTableEMPLOYEE.setVisible(true);
          
           
      
        try {
           java.sql.Connection myConn = null;
          
           java.sql.ResultSet rs ;
           CallableStatement cs;
           myConn = DriverManager.getConnection("jdbc:mysql://localhost/staffevaluation", "root" , "");
             DefaultTableModel TblModel = (DefaultTableModel)jTableEMPLOYEE.getModel();
              String value1 =username.getText();
           String value2 = bio.getText();
           String value3 = sistatikes.getText();
           String value4 = certificates.getText();
           String value5=awards.getText();
       
           String value6 = afmcompany.getText();
           String value7 = exp_years.getText();
       
          
            
         
String query = 
"INSERT INTO employee (username, bio, sistatikes, certificates, awards, AFM_company, exp_years_emp) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement st = myConn.prepareStatement(query);
        
            st.setString(1,value1);
            st.setString(2,value2);
            st.setString(3,value3);
            st.setString(4,value4);
            st.setString(5,value5);
            st.setString(6,value6);
            st.setString(7,value7);
           
            st.execute();
    
      
      
        JOptionPane.showMessageDialog(null, "Insert succesfully");
       
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, "Dont Insert succesfully");
        }
         DisplayTableemployee();
        
    }//GEN-LAST:event_jButtonCREATEMPLActionPerformed

    
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
            java.util.logging.Logger.getLogger(ADMIN_CREATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADMIN_CREATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADMIN_CREATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADMIN_CREATE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADMIN_CREATE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EVEXPYEARS;
    private javax.swing.JTextField EVFIRM;
    private javax.swing.JTextField EVNAME;
    private javax.swing.JTextField EVSURNAME;
    private javax.swing.JTextField EVUSERNAME;
    private javax.swing.JTextField MANAGERSEXPYEARS;
    private javax.swing.JTextField MANAGERSFIRM;
    private javax.swing.JTextField MANAGERSNAME;
    private javax.swing.JTextField afmcompany;
    private javax.swing.JTextField awards;
    private javax.swing.JTextField bio;
    private javax.swing.JTextField certificates;
    private javax.swing.JTextField exp_years;
    private javax.swing.JButton jButtonBACK;
    private javax.swing.JButton jButtonCREATEM;
    private javax.swing.JButton jButtonCREATEMPL;
    private javax.swing.JButton jButtonCREATEV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabelCREATE;
    private javax.swing.JLabel jLabelEVNAME;
    private javax.swing.JLabel jLabelEVSURNAME;
    private javax.swing.JLabel jLabelEVUSERNAME;
    private javax.swing.JLabel jLabelEXPYEARS;
    private javax.swing.JLabel jLabelEvexpyears;
    private javax.swing.JLabel jLabelEvfirm;
    private javax.swing.JLabel jLabelFIRM;
    private javax.swing.JLabel jLabelUSRNM;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableEMPLOYEE;
    private javax.swing.JTable jTableEvaluators;
    private javax.swing.JTable jTableManagers;
    private javax.swing.JTextField sistatikes;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}

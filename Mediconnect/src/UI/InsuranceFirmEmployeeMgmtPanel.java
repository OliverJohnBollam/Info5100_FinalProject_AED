
package UI;

import Model.InsuranceClaims;
import Model.InsuranceClaimsInfo;
import Model.InsurancePolicyInfo;
import Model.User;
import Model.UserInfo;
import SQLConnection.SQLConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


public class InsuranceFirmEmployeeMgmtPanel extends javax.swing.JPanel {

    /**
     * Creates new form InsuranceFirmEmployeeMgmtPanel
     */
   
    String username;
    UserInfo userData;
    InsuranceClaimsInfo insClaimsInfo;
    InsurancePolicyInfo insPolicy;
    public InsuranceFirmEmployeeMgmtPanel(String username, UserInfo userInfo, InsuranceClaimsInfo insClaimsInfo, InsurancePolicyInfo insPolicyData) {
        initComponents();
        this.username = username;
        this.userData = userInfo;
        this.insClaimsInfo = insClaimsInfo;
        this.insPolicy = insPolicyData;
        loadEmployeeData();
        loadInsuranceData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        InsuranceRequestTable = new javax.swing.JTable();
        lblUT = new javax.swing.JLabel();
        lblIT = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ManageUserJPanel = new javax.swing.JPanel();
        lblCreateUser = new javax.swing.JLabel();
        ManageHospitalJPanel = new javax.swing.JPanel();
        lblRegHospital = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jPanel8.setBackground(new java.awt.Color(4, 133, 129));

        jLabel12.setFont(new java.awt.Font("Menlo", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICONS/Logout-icon-2.png"))); // NOI18N
        jLabel12.setText("Logout");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        EmployeeTable.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        EmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Role", "Org", "Username"
            }
        ));
        jScrollPane1.setViewportView(EmployeeTable);

        InsuranceRequestTable.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        InsuranceRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Patient", "Claim Amount"
            }
        ));
        jScrollPane3.setViewportView(InsuranceRequestTable);

        lblUT.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblUT.setForeground(new java.awt.Color(255, 255, 255));
        lblUT.setText("Employee");

        lblIT.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblIT.setForeground(new java.awt.Color(255, 255, 255));
        lblIT.setText("Insurance");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(lblUT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIT)
                .addGap(288, 288, 288))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUT, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIT, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(147, 147, 147)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(4, 133, 129));

        ManageUserJPanel.setBackground(new java.awt.Color(255, 255, 255));
        ManageUserJPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageUserJPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManageUserJPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManageUserJPanelMouseExited(evt);
            }
        });

        lblCreateUser.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblCreateUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateUser.setText("MANAGE EMPLOYEE");
        lblCreateUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreateUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCreateUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCreateUserMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ManageUserJPanelLayout = new javax.swing.GroupLayout(ManageUserJPanel);
        ManageUserJPanel.setLayout(ManageUserJPanelLayout);
        ManageUserJPanelLayout.setHorizontalGroup(
            ManageUserJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageUserJPanelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(lblCreateUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ManageUserJPanelLayout.setVerticalGroup(
            ManageUserJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageUserJPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblCreateUser)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ManageHospitalJPanel.setBackground(new java.awt.Color(255, 255, 255));
        ManageHospitalJPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageHospitalJPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManageHospitalJPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManageHospitalJPanelMouseExited(evt);
            }
        });

        lblRegHospital.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblRegHospital.setText("MANAGE INSURANCE");
        lblRegHospital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegHospitalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegHospitalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegHospitalMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ManageHospitalJPanelLayout = new javax.swing.GroupLayout(ManageHospitalJPanel);
        ManageHospitalJPanel.setLayout(ManageHospitalJPanelLayout);
        ManageHospitalJPanelLayout.setHorizontalGroup(
            ManageHospitalJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageHospitalJPanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(lblRegHospital)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        ManageHospitalJPanelLayout.setVerticalGroup(
            ManageHospitalJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageHospitalJPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblRegHospital)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ManageHospitalJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ManageUserJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(ManageUserJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(ManageHospitalJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(4, 133, 129));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICONS/Very-Basic-Menu-icon.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INSURANCE");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FIRM MANAGEMENT");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Welcome!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(91, 91, 91))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        MediconnectLoginPanel login1 = new MediconnectLoginPanel();
        MediconnectLoginPanel login = (MediconnectLoginPanel) SwingUtilities.getRoot(this);
        login1.setVisible(true);
        login.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void lblCreateUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateUserMouseClicked
        // TODO add your handling code here:
        InsuranceEmployeeManagementPanel  ime = new InsuranceEmployeeManagementPanel(username, userData, insClaimsInfo);
        MediconnectLoginPanel login = (MediconnectLoginPanel) SwingUtilities.getRoot(this);
        login.setContentPane(ime);
        login.invalidate();
        login.validate();
    }//GEN-LAST:event_lblCreateUserMouseClicked

    private void lblCreateUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateUserMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCreateUserMouseEntered

    private void lblCreateUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateUserMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCreateUserMouseExited

    private void ManageUserJPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageUserJPanelMouseClicked
        // TODO add your handling code here:
        InsuranceEmployeeManagementPanel  ime = new InsuranceEmployeeManagementPanel(username, userData, insClaimsInfo);
        MediconnectLoginPanel login = (MediconnectLoginPanel) SwingUtilities.getRoot(this);
        login.setContentPane(ime);
        login.invalidate();
        login.validate();
    }//GEN-LAST:event_ManageUserJPanelMouseClicked

    private void ManageUserJPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageUserJPanelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageUserJPanelMouseEntered

    private void ManageUserJPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageUserJPanelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageUserJPanelMouseExited

    private void ManageHospitalJPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageHospitalJPanelMouseClicked
        // TODO add your handling code here:
        MainInsuranceFirmMgmtPanel  hmi = new MainInsuranceFirmMgmtPanel(username, userData, insClaimsInfo, insPolicy);
        MediconnectLoginPanel login = (MediconnectLoginPanel) SwingUtilities.getRoot(this);
        login.setContentPane(hmi);
        login.invalidate();
        login.validate();
    }//GEN-LAST:event_ManageHospitalJPanelMouseClicked

    private void ManageHospitalJPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageHospitalJPanelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageHospitalJPanelMouseEntered

    private void ManageHospitalJPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageHospitalJPanelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageHospitalJPanelMouseExited

    private void lblRegHospitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegHospitalMouseClicked
        // TODO add your handling code here:
        MainInsuranceFirmMgmtPanel  hmi = new MainInsuranceFirmMgmtPanel(username, userData, insClaimsInfo, insPolicy);
        MediconnectLoginPanel login = (MediconnectLoginPanel) SwingUtilities.getRoot(this);
        login.setContentPane(hmi);
        login.invalidate();
        login.validate();
    }//GEN-LAST:event_lblRegHospitalMouseClicked

    private void lblRegHospitalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegHospitalMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRegHospitalMouseEntered

    private void lblRegHospitalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegHospitalMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRegHospitalMouseExited


    private void loadEmployeeData() {
            DefaultTableModel model= (DefaultTableModel) EmployeeTable.getModel();
            model.setRowCount(0);
            for(User obj : userData.getEmployeesFromDb()){
                Object[] row= new Object[4];
                row[0] = obj;
                row[1] = obj.getRole();
                row[2] = obj.getOrgName();
                row[3] = obj.getUsername();
                model.addRow(row);
            }

    }  
    
    private void loadInsuranceData() {
            DefaultTableModel model= (DefaultTableModel) InsuranceRequestTable.getModel();
            model.setRowCount(0);
            for(InsuranceClaims obj : insClaimsInfo.getInsuranceClaimsInfoFromDb()){
                Object[] row= new Object[2];
                row[0] = obj;
                row[1] = obj.getAmount();
                model.addRow(row);
            }

    }  
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmployeeTable;
    private javax.swing.JTable InsuranceRequestTable;
    private javax.swing.JPanel ManageHospitalJPanel;
    private javax.swing.JPanel ManageUserJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCreateUser;
    private javax.swing.JLabel lblIT;
    private javax.swing.JLabel lblRegHospital;
    private javax.swing.JLabel lblUT;
    // End of variables declaration//GEN-END:variables
}

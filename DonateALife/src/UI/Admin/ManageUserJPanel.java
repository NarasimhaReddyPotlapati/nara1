/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin;

import Backend.EcoSystem;
import Backend.Employee.Employee;
import Backend.Enterprise.Enterprise;
import Backend.NGO.NGO;
import Backend.Organization.Organization;
import Backend.Organization.OrganizationDirectory;
import Backend.Role.Role;
import Backend.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class ManageUserJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private EcoSystem system;
    
    public ManageUserJPanel(JPanel userProcessContainer, Enterprise enterprise,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;      
        this.enterprise = enterprise;
        this.system = system ;
        EntNmtxtfld.setText(enterprise.getName());
       
        popOrganizationComboBox();
        popData();
    }

    ManageUserJPanel(OrganizationDirectory organizationDirectory, Enterprise enterprise) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void popOrganizationComboBox() {
               
        organizationcmboc.removeAllItems();   
        employeecmbox.removeAllItems();  
        rlcmbox.removeAllItems();     
        System.out.println(enterprise.getOrganizationDirectory().getOrganizationList());
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationcmboc.addItem(organization);    
        }
                    
    }
     
      public void populateEmployeeComboBox(Organization organization){
          
        employeecmbox.removeAllItems();  
      
        for (Employee employee : organization.getEmployeeDirectory().getEmplyList()){
            
            employeecmbox.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
         rlcmbox.removeAllItems();     
        for (Role role : organization.getSupportedRole()){
            rlcmbox.addItem(role);
        }
    }
    
    public void popData() {

        DefaultTableModel model = (DefaultTableModel) usersJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[3];
                row[0] = ua;
                row[1] = ua.getRole();
                System.out.println(row[1]);
                System.out.println("raja");
                row[2] = ua.getUsername();
                ((DefaultTableModel) usersJTable.getModel()).addRow(row);
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

        tltlbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        srlpn1 = new javax.swing.JScrollPane();
        usersJTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        orglbl = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        organizationcmboc = new javax.swing.JComboBox();
        lbl7 = new javax.swing.JLabel();
        employeecmbox = new javax.swing.JComboBox();
        lbl8 = new javax.swing.JLabel();
        rlcmbox = new javax.swing.JComboBox();
        lbl2 = new javax.swing.JLabel();
        usrtxtfld = new javax.swing.JTextField();
        lbl9 = new javax.swing.JLabel();
        psdfld = new javax.swing.JPasswordField();
        addbtn = new javax.swing.JButton();
        EntNmtxtfld = new javax.swing.JTextField();
        lbl10 = new javax.swing.JLabel();
        bgdimg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tltlbl.setBackground(new java.awt.Color(255, 255, 255));
        tltlbl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        tltlbl.setForeground(new java.awt.Color(255, 255, 255));
        tltlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tltlbl.setText("Users Creation");
        add(tltlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 50));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        usersJTable.setBackground(new java.awt.Color(153, 153, 153));
        usersJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Employee", "Role", "User Name"
            }
        ));
        usersJTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        srlpn1.setViewportView(usersJTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(srlpn1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(srlpn1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 520, 140));

        jPanel2.setBackground(new java.awt.Color(8, 21, 49));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 400));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);

        orglbl.setBackground(new java.awt.Color(255, 255, 255));
        orglbl.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        orglbl.setForeground(new java.awt.Color(255, 255, 255));
        orglbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orglbl.setText("Organization");

        lbl6.setFont(new java.awt.Font("Dubai Medium", 0, 13)); // NOI18N
        lbl6.setForeground(new java.awt.Color(255, 255, 255));
        lbl6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl6.setText("Organization");

        organizationcmboc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationcmboc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationcmbocActionPerformed(evt);
            }
        });

        lbl7.setFont(new java.awt.Font("Dubai Medium", 0, 13)); // NOI18N
        lbl7.setForeground(new java.awt.Color(255, 255, 255));
        lbl7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl7.setText("Employee");

        employeecmbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employeecmbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeecmboxActionPerformed(evt);
            }
        });

        lbl8.setFont(new java.awt.Font("Dubai Medium", 0, 13)); // NOI18N
        lbl8.setForeground(new java.awt.Color(255, 255, 255));
        lbl8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl8.setText("Role");

        rlcmbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbl2.setFont(new java.awt.Font("Dubai Medium", 0, 13)); // NOI18N
        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        lbl2.setText("LoginId");

        usrtxtfld.setBorder(null);
        usrtxtfld.setCaretColor(new java.awt.Color(30, 59, 92));
        usrtxtfld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usrtxtfldFocusGained(evt);
            }
        });
        usrtxtfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrtxtfldActionPerformed(evt);
            }
        });

        lbl9.setFont(new java.awt.Font("Dubai Medium", 0, 13)); // NOI18N
        lbl9.setForeground(new java.awt.Color(255, 255, 255));
        lbl9.setText("Password");

        psdfld.setBorder(null);
        psdfld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                psdfldFocusGained(evt);
            }
        });
        psdfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psdfldActionPerformed(evt);
            }
        });

        addbtn.setFont(new java.awt.Font("Dubai Medium", 0, 13)); // NOI18N
        addbtn.setText("CREATE");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orglbl, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(psdfld, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(usrtxtfld))
                            .addGap(38, 162, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(employeecmbox, javax.swing.GroupLayout.Alignment.LEADING, 0, 140, Short.MAX_VALUE)
                                .addComponent(organizationcmboc, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rlcmbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(29, 29, 29)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(orglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(organizationcmboc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(employeecmbox, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rlcmbox, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(usrtxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)
                    .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(psdfld, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {psdfld, usrtxtfld});

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 330, 320));

        EntNmtxtfld.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EntNmtxtfld.setBorder(null);
        EntNmtxtfld.setCaretColor(new java.awt.Color(30, 59, 92));
        EntNmtxtfld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EntNmtxtfldFocusGained(evt);
            }
        });
        EntNmtxtfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntNmtxtfldActionPerformed(evt);
            }
        });
        add(EntNmtxtfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 140, 30));

        lbl10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl10.setForeground(new java.awt.Color(255, 255, 255));
        lbl10.setText("Enterprise Name");
        add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, 30));

        bgdimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminPage.png"))); // NOI18N
        add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void organizationcmbocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationcmbocActionPerformed
        // TODO add your handling code here:

        Organization organization = (Organization) organizationcmboc.getSelectedItem();
        if (organization != null) {
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_organizationcmbocActionPerformed

    private void usrtxtfldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usrtxtfldFocusGained
        // TODO add your handling code here:
        usrtxtfld.setText("");
    }//GEN-LAST:event_usrtxtfldFocusGained

    private void usrtxtfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrtxtfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usrtxtfldActionPerformed

    private void psdfldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_psdfldFocusGained
        // TODO add your handling code here:
        psdfld.setText("");
    }//GEN-LAST:event_psdfldFocusGained

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        if (usrtxtfld.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username cannot be empty");
            return;
        }
        
        if (psdfld.getText().length() < 6 ){
            JOptionPane.showMessageDialog(null, "Password should be more than 6 Digit");
            return;
        
        }
       if (!checkUserIdExists(usrtxtfld.getText())){
            JOptionPane.showMessageDialog(null, "UserName Already Present","Warning",JOptionPane.WARNING_MESSAGE);
            return;
            }
        
        String userName = usrtxtfld.getText();
        char[] passwordCharArray = psdfld.getPassword();
        String password = String.valueOf(passwordCharArray);
        Organization organization = (Organization) organizationcmboc.getSelectedItem();
        Employee employee = (Employee) employeecmbox.getSelectedItem();
        Role role = (Role) rlcmbox.getSelectedItem();

        organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);

        JOptionPane.showMessageDialog(null, "User account for " + userName + " created Successfully");

        popData();
        usrtxtfld.setText("");
        psdfld.setText("");
    }//GEN-LAST:event_addbtnActionPerformed
    private void psdfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psdfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psdfldActionPerformed

    private void EntNmtxtfldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EntNmtxtfldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_EntNmtxtfldFocusGained

    private void EntNmtxtfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntNmtxtfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntNmtxtfldActionPerformed

    private void employeecmboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeecmboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeecmboxActionPerformed
private boolean checkUserIdExists(String userName) {
        if (system.getUserDirectory().checkIfUsernameIsUnique(userName)) {
            if (system.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                for (NGO ngo : system.getngoList()) {
                    for (Enterprise enterprise : ngo.getEnterpriseDirectory().getEnterpList()) {
                        if (enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                            if (enterprise.getOrganizationDirectory().getOrganizationList().size() > 0) {
                                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                    if (organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                                        return true;

                                    } else {
                                        return false;
                                    }

                                }
                            } else {
                                return true;
                            }
                        } else {
                            return false;

                        }
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EntNmtxtfld;
    private javax.swing.JButton addbtn;
    private javax.swing.JLabel bgdimg;
    private javax.swing.JComboBox employeecmbox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JComboBox organizationcmboc;
    private javax.swing.JLabel orglbl;
    private javax.swing.JPasswordField psdfld;
    private javax.swing.JComboBox rlcmbox;
    private javax.swing.JScrollPane srlpn1;
    private javax.swing.JLabel tltlbl;
    private javax.swing.JTable usersJTable;
    private javax.swing.JTextField usrtxtfld;
    // End of variables declaration//GEN-END:variables

   
}

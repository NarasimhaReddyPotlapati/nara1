/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdmin;

import Backend.EcoSystem;
import Backend.Employee.Employee;
import Backend.Enterprise.Enterprise;
import Backend.NGO.NGO;
import Backend.Organization.Organization;
import Backend.Role.AdminRole;
import Backend.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author admin
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    private JPanel userProcessContainer;
      private EcoSystem ecosystem ;
      private Enterprise  enterprisetemp ;
      private UserAccount UA;
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem ecosystem,UserAccount UA) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem ;
        this.UA = UA;
        btncreate.setEnabled(false);
        
        populateTable();
    }
private void populateTable() {
     DefaultTableModel model = (DefaultTableModel) tblauthorization.getModel();

        model.setRowCount(0);
        System.out.println(30);
        
        for (NGO ngo : ecosystem.getngoList()) {
            System.out.println(ngo.getEnterpriseDirectory());
            if(UA.getUsername().equals(ngo.getName())){
            if(ngo.getEnterpriseDirectory().getEnterpList() != null){
            for (Enterprise enterprise : ngo.getEnterpriseDirectory().getEnterpList()) {
                Object[] row = new Object[5];
                row[0] = ngo;
                row[1] = enterprise.getEnterpriseType().getValue();
                row[2] = enterprise; 
                System.out.println(enterprise);
                System.out.println(100);
                row[3] = enterprise.getPhoneNumber();
                row[4] = enterprise.getAddress();
                model.addRow(row);
            }
            }
        }   
        } 
        
    }

private void populateAdminTable(Enterprise enterprise) {
     DefaultTableModel model = (DefaultTableModel) tbladm.getModel();

        model.setRowCount(0);
       
            for (UserAccount user : enterprise.getUserAccountDirectory().getUserAccountList()) {
                Object[] row = new Object[5];
                row[0] = enterprise;
                row[1] = user.getEmployee().getName();
                row[2] = user.getUsername();
                model.addRow(row);
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

        headerlabel = new javax.swing.JLabel();
        jPanelTable = new javax.swing.JPanel();
        pnscrl1 = new javax.swing.JScrollPane();
        tblauthorization = new javax.swing.JTable();
        pnscrl2 = new javax.swing.JScrollPane();
        tbladm = new javax.swing.JTable();
        lblselectrow = new javax.swing.JLabel();
        jPanelCreate = new javax.swing.JPanel();
        admncretlbl = new javax.swing.JLabel();
        btncreate = new javax.swing.JButton();
        namelbl = new javax.swing.JLabel();
        txtentpname = new javax.swing.JTextField();
        admnnamelbl = new javax.swing.JLabel();
        txtadmnname = new javax.swing.JTextField();
        lblusrname = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        passdlbl = new javax.swing.JLabel();
        txtpasswd = new javax.swing.JPasswordField();
        bgdimng = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1100, 800));
        setPreferredSize(new java.awt.Dimension(1100, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerlabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        headerlabel.setForeground(new java.awt.Color(255, 255, 255));
        headerlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerlabel.setText("Create Admin for Enterprise");
        add(headerlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 50));

        jPanelTable.setBackground(new java.awt.Color(30, 50, 71));

        tblauthorization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NGO", "Enterprise Type", "Name", "Phone Number", "Zip code"
            }
        ));
        tblauthorization.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblauthorizationMouseClicked(evt);
            }
        });
        pnscrl1.setViewportView(tblauthorization);

        tbladm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise", "Admin Name", "Username"
            }
        ));
        tbladm.setEnabled(false);
        pnscrl2.setViewportView(tbladm);

        javax.swing.GroupLayout jPanelTableLayout = new javax.swing.GroupLayout(jPanelTable);
        jPanelTable.setLayout(jPanelTableLayout);
        jPanelTableLayout.setHorizontalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnscrl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
            .addComponent(pnscrl2)
        );
        jPanelTableLayout.setVerticalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTableLayout.createSequentialGroup()
                .addComponent(pnscrl1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(pnscrl2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        add(jPanelTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 540, 300));

        lblselectrow.setBackground(new java.awt.Color(55, 96, 128));
        lblselectrow.setFont(new java.awt.Font("Dubai Medium", 0, 16)); // NOI18N
        lblselectrow.setForeground(new java.awt.Color(255, 255, 255));
        lblselectrow.setText("*Please select a row");
        add(lblselectrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 630, 20));

        jPanelCreate.setBackground(new java.awt.Color(8, 21, 49));
        jPanelCreate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelCreate.setPreferredSize(new java.awt.Dimension(250, 400));
        jPanelCreate.setRequestFocusEnabled(false);
        jPanelCreate.setVerifyInputWhenFocusTarget(false);

        admncretlbl.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        admncretlbl.setForeground(new java.awt.Color(255, 255, 255));
        admncretlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admncretlbl.setText("Create Admin");

        btncreate.setFont(new java.awt.Font("Dubai Medium", 0, 13)); // NOI18N
        btncreate.setText("CREATE");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });

        namelbl.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        namelbl.setForeground(new java.awt.Color(255, 255, 255));
        namelbl.setText("Name");

        txtentpname.setEditable(false);
        txtentpname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtentpnameActionPerformed(evt);
            }
        });

        admnnamelbl.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        admnnamelbl.setForeground(new java.awt.Color(255, 255, 255));
        admnnamelbl.setText("AdminName");

        txtadmnname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadmnnameActionPerformed(evt);
            }
        });

        lblusrname.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        lblusrname.setForeground(new java.awt.Color(255, 255, 255));
        lblusrname.setText("Username");

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        passdlbl.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        passdlbl.setForeground(new java.awt.Color(255, 255, 255));
        passdlbl.setText("Password");

        txtpasswd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpasswdFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanelCreateLayout = new javax.swing.GroupLayout(jPanelCreate);
        jPanelCreate.setLayout(jPanelCreateLayout);
        jPanelCreateLayout.setHorizontalGroup(
            jPanelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(admncretlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelCreateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncreate, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addGroup(jPanelCreateLayout.createSequentialGroup()
                        .addGroup(jPanelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(admnnamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblusrname, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passdlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtpasswd)
                            .addComponent(txtusername)
                            .addComponent(txtentpname)
                            .addComponent(txtadmnname, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanelCreateLayout.setVerticalGroup(
            jPanelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCreateLayout.createSequentialGroup()
                .addComponent(admncretlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtentpname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admnnamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtadmnname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusrname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passdlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtpasswd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btncreate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jPanelCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 310));

        bgdimng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminPage.png"))); // NOI18N
        add(bgdimng, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblauthorization.getSelectedRow();
        
        if (txtusername.getText().isEmpty() || txtadmnname.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "All fields mandatory","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
         if (!checkUserIdExists(txtusername.getText())){
            JOptionPane.showMessageDialog(null, "UserName Already Present","Warning",JOptionPane.WARNING_MESSAGE);
            return;
            }
         
         if (txtpasswd.getText().length() < 6 ){
            
            JOptionPane.showMessageDialog(null, "Password should be more than 6 characters","Warning",JOptionPane.WARNING_MESSAGE);
            return;
            }
         
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row to Process" ,"Warning" , JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
        String adminName = txtadmnname.getText();
        String userid = txtusername.getText();
        String password = String.valueOf(txtpasswd.getPassword());
       
        
        Employee employee = enterprisetemp.getEmployeeDirectory().createEmployee(adminName);
        
        UserAccount account = enterprisetemp.getUserAccountDirectory().createUserAccount(userid, password, employee, new AdminRole());
        
          JOptionPane.showMessageDialog(null, "User " + userid + " is created sucessfully");
          
          txtadmnname.setText("");
          txtusername.setText("");
          txtpasswd.setText("");
          txtentpname.setText("");
            populateAdminTable(enterprisetemp);
        }
    }//GEN-LAST:event_btncreateActionPerformed
private boolean checkUserIdExists(String userName) {
        if (ecosystem.getUserDirectory().checkIfUsernameIsUnique(userName)) {
            if (ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                for (NGO ngo : ecosystem.getngoList()) {
                    if(ngo.getEnterpriseDirectory().getEnterpList() != null){
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
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
        return false;
    }
    private void txtentpnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtentpnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtentpnameActionPerformed

    private void txtadmnnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadmnnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtadmnnameActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void tblauthorizationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblauthorizationMouseClicked
        // TODO add your handling code here:
         int row = tblauthorization.getSelectedRow();
        System.out.println(row);
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
       btncreate.setEnabled(true);
       Enterprise enterprise = (Enterprise) tblauthorization.getValueAt(row, 2);
       System.out.println(enterprise.getName());
       System.out.println(enterprise);
       enterprisetemp = enterprise ;
       System.out.println(10);
       System.out.println(enterprise.getName());
       System.out.println(txtentpname);
       txtentpname.setText(enterprise.getName());
       System.out.println(10);
       System.out.println(txtentpname);
       
       populateAdminTable(enterprise);
    }//GEN-LAST:event_tblauthorizationMouseClicked

    private void txtpasswdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswdFocusGained
        // TODO add your handling code here:
        txtpasswd.setText("");
    }//GEN-LAST:event_txtpasswdFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admncretlbl;
    private javax.swing.JLabel admnnamelbl;
    private javax.swing.JLabel bgdimng;
    private javax.swing.JButton btncreate;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JPanel jPanelCreate;
    private javax.swing.JPanel jPanelTable;
    private javax.swing.JLabel lblselectrow;
    private javax.swing.JLabel lblusrname;
    private javax.swing.JLabel namelbl;
    private javax.swing.JLabel passdlbl;
    private javax.swing.JScrollPane pnscrl1;
    private javax.swing.JScrollPane pnscrl2;
    private javax.swing.JTable tbladm;
    private javax.swing.JTable tblauthorization;
    private javax.swing.JTextField txtadmnname;
    private javax.swing.JTextField txtentpname;
    private javax.swing.JPasswordField txtpasswd;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

  
}

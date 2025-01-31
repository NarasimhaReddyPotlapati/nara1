/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.InventoryManager;

import Backend.Connection.Connection;
import Backend.DB4OUtil.DB4OUtil;
import Backend.EcoSystem;
import Backend.Email;
import Backend.Enterprise.Enterprise;
import static Backend.Enterprise.Enterprise.EnterpriseType.LegalDepartment;
import Backend.NGO.NGO;
import Backend.Organization.AdvocateOrganization;
import Backend.Organization.InventoryManagerOrganization;
import Backend.Organization.Organization;
//import Backend.SendMessageTwilio;
import Backend.UserAccount.UserAccount;
import Backend.WorkQueue.WorkRequest;
import UI.Receiver.ManageRequestReceiverJPanel;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ms
 */
public class OrganAvailabilityCheckInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUsersJPanel
     */
    private EcoSystem system;
    private Enterprise enterprise ;
    private DB4OUtil dB4OUtil;
    private UserAccount userAccount;
    private InventoryManagerOrganization inventoryManager;
    private Connection connectionEmail;
    
    public OrganAvailabilityCheckInventoryJPanel(UserAccount account, 
            Organization organization, EcoSystem system,DB4OUtil dB4OUtil,Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise ;
        this.dB4OUtil = dB4OUtil;
        this.system = system;
        this.userAccount =userAccount;
        this.inventoryManager = (InventoryManagerOrganization) organization;
        populateTable();
        populateStatusTable();
    }
    
    private void populateTable() {
            DefaultTableModel donorModel = (DefaultTableModel)tbldon.getModel();
            DefaultTableModel receiverModel = (DefaultTableModel)tblrec.getModel();
        
            donorModel.setRowCount(0);
            receiverModel.setRowCount(0);
        
        
        for (WorkRequest request : inventoryManager.getWorkQueue().getWorkRequestList()) {

            if (request.getInventStatus().equals("in inventory")) {

                Object[] row = new Object[5];
                row[0] = request.getUser();
                row[2] = request;

                if (request.getUser().getType() == 'd') {
                    row[1] = request.getDonorOrgan();
                    donorModel.addRow(row);
                } else {
                    row[1] = request.getReceiverOrgan();
                    receiverModel.addRow(row);
                }
            }
        }
      }
     public void populateStatusTable(){
          DefaultTableModel model = (DefaultTableModel)tblstat.getModel();
        
          model.setRowCount(0);
        
        for(Connection connection : inventoryManager.getConnectionDirectory().getconnecList()){

            Object[] row = new Object[5];
            row[0] = connection.getDonorReq().getUser().getName();
            row[1] = connection;
            row[2] = connection.getReceiverReq().getUser().getName();
            row[3] = connection.getInventStatus();
             
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbldon = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblrec = new javax.swing.JTable();
        btnprocreq = new javax.swing.JButton();
        labelrec = new javax.swing.JLabel();
        labeldon = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblstat = new javax.swing.JTable();
        labeltitle = new javax.swing.JLabel();
        bgdimg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbldon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Organ", "Date"
            }
        ));
        jScrollPane1.setViewportView(tbldon);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 419, 113));

        tblrec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Organ", "Date"
            }
        ));
        jScrollPane2.setViewportView(tblrec);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 419, 110));

        btnprocreq.setBackground(new java.awt.Color(5, 30, 72));
        btnprocreq.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        btnprocreq.setForeground(new java.awt.Color(255, 255, 255));
        btnprocreq.setText("Process Request");
        btnprocreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprocreqActionPerformed(evt);
            }
        });
        add(btnprocreq, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 170, 40));

        labelrec.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        labelrec.setForeground(new java.awt.Color(255, 255, 255));
        labelrec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelrec.setText("Receiver");
        add(labelrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 419, 26));

        labeldon.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        labeldon.setForeground(new java.awt.Color(255, 255, 255));
        labeldon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeldon.setText("Donor");
        add(labeldon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 419, 26));

        tblstat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donor Name", "Organ", "Receiver Name", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblstat);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 560, 110));

        labeltitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labeltitle.setForeground(new java.awt.Color(255, 255, 255));
        labeltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltitle.setText("Requests Management");
        add(labeltitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 44));

        bgdimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/capsule.png"))); // NOI18N
        add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void btnprocreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprocreqActionPerformed
        // TODO add your handling code here:
           int donorRow = tbldon.getSelectedRow();
        int receiverRow = tblrec.getSelectedRow();
        
       
        if (tbldon.getSelectedRowCount() != 1){
            JOptionPane.showMessageDialog(null, "Please select only one donor organ");
            return;
        }
        if (tblrec.getSelectedRowCount() != 1){
            JOptionPane.showMessageDialog(null, "Please select only one Receiver organ");
            return;
        }
        Enterprise legalent = null;
        for (NGO ngo : system.getngoList()) {
            for (Enterprise allenterprise : ngo.getEnterpriseDirectory().getEnterpList()) {
                System.out.print(allenterprise.getName() + '\n');
                System.out.print(allenterprise.getEnterpriseType());
                System.out.print(allenterprise.getEnterpriseType().equals(LegalDepartment));
                if (allenterprise.getEnterpriseType().equals(LegalDepartment)) {
                    legalent = allenterprise;
                    break;
                }
            }
            if(legalent != null){
                break;
            }

        }
        System.out.print(1+ '\n');
        System.out.print(legalent.getName()+ '\n');
        Organization org = null;
        for (Organization organization : legalent.getOrganizationDirectory().getOrganizationList()) {
            System.out.print(organization.getName());
            if (organization instanceof AdvocateOrganization) {
                org = organization;
                break;
            }
        }
        System.out.print(org);
        if (org == null) {
           JOptionPane.showMessageDialog(null, "Legal organization not present", "Error", JOptionPane.ERROR_MESSAGE);
           return;
        }
        System.out.print(1);
        
        String donatedOrgan = tbldon.getValueAt(donorRow, 1).toString() ;
        String receivedOrgan = tblrec.getValueAt(receiverRow, 1).toString();
        
        if (donatedOrgan.equals(receivedOrgan)){
            
        WorkRequest donorRequest = (WorkRequest)tbldon.getValueAt(donorRow, 2);
        WorkRequest receiverRequest = (WorkRequest)tblrec.getValueAt(receiverRow, 2);
        
        donorRequest.setOverallStatus("Potential match Found, Waiting for Advocate Approval");
        donorRequest.setInventStatus("Done");
        receiverRequest.setOverallStatus("Potential match Found, Waiting for Advocate Approval");
        receiverRequest.setInventStatus("Done");
        
        Connection connection = new Connection();
        connection.setDonorReq(donorRequest);
        connection.setReceiverReq(receiverRequest);
    //    connection.setDoctorStatus("Requested to Doctor");
         connection.setAdvStatus("Requested to Advocate");
        connection.setOrgan((tblrec.getValueAt(receiverRow, 1).toString()));
        connection.setInventStatus("In progress");
        
        inventoryManager.getConnectionDirectory().getconnecList().add(connection);
        
        
       
        
        
            if (org != null) {
            connection.setAdvStatus("Requested to Advocate");
            
            connection.getReceiverReq().setOverallStatus("Sent to Advocate, Will be taken care by Advocate");
            connection.getDonorReq().setOverallStatus("Sent to Advocate, Will be taken care by Advocate");
            connection.setInventStatus("Done");
            org.getConnectionDirectory().getconnecList().add(connection);
            emailDonor(connection);
            emailReceiver(connection);
            JOptionPane.showMessageDialog(null, "Request Sent Successfully");
            populateStatusTable();
            populateTable();
            } else {
            
                JOptionPane.showMessageDialog(null, "Legal organization not present", "Error", JOptionPane.ERROR_MESSAGE);
            
            }
       
        } 
        
        else {
        
        JOptionPane.showMessageDialog(null, "Organ does not match ", "Error", JOptionPane.ERROR_MESSAGE);
        return ;
        }
        
    }//GEN-LAST:event_btnprocreqActionPerformed
        public void emailDonor(Connection connection){
          String emailTo = connection.getDonorReq().getUser().getEmailId();
                String subject = "Request Status";
                String body = connection.getDonorReq().getUser().getName() + "\nYou have found a potential receiver for the organ you offered to donate"
                        +"\nReceiver's information is:"+"\nName: "+connection.getReceiverReq().getUser().getName()+
                        "\nGender: "+connection.getReceiverReq().getUser().getGender()+
                          "\nAddress:  "+connection.getReceiverReq().getUser().getAddr()+
                                    "\nCity: "+connection.getReceiverReq().getUser().getUrban(); 
               
                Email email = system.getEmail();
//                SendMessageTwilio twilio=system.getTwilio();
          try {
              email.sendMail(emailTo, subject, body);
              JOptionPane.showMessageDialog(null, "Email  to Donor successfully");
//              twilio.sendMessage(connection.getDonorReq().getUser().getPhoneNumber(), body);
              
              
          } catch (Exception ex) {
              Logger.getLogger(ManageRequestReceiverJPanel.class.getName()).log(Level.SEVERE, null, ex);
          }
        }
        
        public void emailReceiver(Connection connection){
         String emailTo = connection.getReceiverReq().getUser().getEmailId();
                String subject = "Request Status";
                String body = connection.getReceiverReq().getUser().getName() + "\nYou have found a potential donor for the organ you requested"
                        +"\nDonor's information is:"+"\nName: "+connection.getDonorReq().getUser().getName()+
                        "\nGender: "+connection.getDonorReq().getUser().getGender()+
                          "\nAddress: "+connection.getDonorReq().getUser().getAddr()+
                                    "\nCity: "+connection.getDonorReq().getUser().getUrban(); 
             
              Email email = system.getEmail();
//                SendMessageTwilio twilio=system.getTwilio();
          try {
              email.sendMail(emailTo, subject, body);
              JOptionPane.showMessageDialog(null, "Email to reciever successfully");
//              twilio.sendMessage(connection.getReceiverReq().getUser().getPhoneNumber(), body);
          } catch (Exception ex) {
              Logger.getLogger(ManageRequestReceiverJPanel.class.getName()).log(Level.SEVERE, null, ex);
          }
        }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgdimg;
    private javax.swing.JButton btnprocreq;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labeldon;
    private javax.swing.JLabel labelrec;
    private javax.swing.JLabel labeltitle;
    private javax.swing.JTable tbldon;
    private javax.swing.JTable tblrec;
    private javax.swing.JTable tblstat;
    // End of variables declaration//GEN-END:variables

   
}

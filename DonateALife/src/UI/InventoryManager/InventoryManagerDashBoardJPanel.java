/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.InventoryManager;

import UI.Donor.*;
import UI.Receiver.ManageRequestReceiverJPanel;
import UI.Coordinator.*;
import UI.Admin.*;
import Backend.DB4OUtil.DB4OUtil;
import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Organization.CoordinatorOrganization;
import Backend.Organization.InventoryManagerOrganization;
import Backend.Organization.Organization;
import Backend.User.User;
import Backend.UserAccount.UserAccount;
import MainPages.LoginPage;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.SwingUtilities.getWindowAncestor;

/**
 *
 * @author ms
 */
public class InventoryManagerDashBoardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserDashBoardJPanel
     */

    private EcoSystem system;
    private Enterprise enterprise ;
    private DB4OUtil dB4OUtil;
    private UserAccount userAccount;
    private InventoryManagerOrganization inventoryManager;
    public InventoryManagerDashBoardJPanel(UserAccount account, Organization organization, EcoSystem system,DB4OUtil dB4OUtil,Enterprise enterprise) {
        initComponents();
       this.enterprise = enterprise ;
        this.dB4OUtil = dB4OUtil;
        this.system = system;
        this.userAccount =account;
        this.inventoryManager = (InventoryManagerOrganization)organization;
        setColor(invprofbtn);
        resetColor(new JPanel[]{reqmngbtn,pnchrtbtn});
        ManageInventoryManagerDetailsJPanel jpanel = new ManageInventoryManagerDetailsJPanel(userAccount,system,inventoryManager,enterprise);
        userProcessContainer.add("ManageInventoryManagerDetailsJPanel",jpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sptpn4 = new javax.swing.JSplitPane();
        admmang = new javax.swing.JPanel();
        reqmngbtn = new javax.swing.JPanel();
        reqlabel = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        invprofbtn = new javax.swing.JPanel();
        labelprofile = new javax.swing.JLabel();
        pnchrtbtn = new javax.swing.JPanel();
        chartlabel = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(974, 682));

        sptpn4.setBackground(new java.awt.Color(55, 96, 128));
        sptpn4.setDividerSize(0);

        admmang.setBackground(new java.awt.Color(8, 21, 49));

        reqmngbtn.setBackground(new java.awt.Color(8, 21, 49));
        reqmngbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reqmngbtnMousePressed(evt);
            }
        });

        reqlabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        reqlabel.setForeground(new java.awt.Color(255, 255, 255));
        reqlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reqlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/request x 32.png"))); // NOI18N
        reqlabel.setText(" Request");

        javax.swing.GroupLayout reqmngbtnLayout = new javax.swing.GroupLayout(reqmngbtn);
        reqmngbtn.setLayout(reqmngbtnLayout);
        reqmngbtnLayout.setHorizontalGroup(
            reqmngbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reqmngbtnLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(reqlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        reqmngbtnLayout.setVerticalGroup(
            reqmngbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reqmngbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reqlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        back.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logoutx32.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });

        invprofbtn.setBackground(new java.awt.Color(8, 21, 49));
        invprofbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                invprofbtnMousePressed(evt);
            }
        });

        labelprofile.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        labelprofile.setForeground(new java.awt.Color(255, 255, 255));
        labelprofile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/account x 32.png"))); // NOI18N
        labelprofile.setText("Profile");

        javax.swing.GroupLayout invprofbtnLayout = new javax.swing.GroupLayout(invprofbtn);
        invprofbtn.setLayout(invprofbtnLayout);
        invprofbtnLayout.setHorizontalGroup(
            invprofbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invprofbtnLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(labelprofile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        invprofbtnLayout.setVerticalGroup(
            invprofbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invprofbtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelprofile)
                .addContainerGap())
        );

        pnchrtbtn.setBackground(new java.awt.Color(8, 21, 49));
        pnchrtbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnchrtbtnMousePressed(evt);
            }
        });

        chartlabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chartlabel.setForeground(new java.awt.Color(255, 255, 255));
        chartlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chartlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bar-chartx32.png"))); // NOI18N
        chartlabel.setText("Charts");

        javax.swing.GroupLayout pnchrtbtnLayout = new javax.swing.GroupLayout(pnchrtbtn);
        pnchrtbtn.setLayout(pnchrtbtnLayout);
        pnchrtbtnLayout.setHorizontalGroup(
            pnchrtbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnchrtbtnLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(chartlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnchrtbtnLayout.setVerticalGroup(
            pnchrtbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnchrtbtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chartlabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout admmangLayout = new javax.swing.GroupLayout(admmang);
        admmang.setLayout(admmangLayout);
        admmangLayout.setHorizontalGroup(
            admmangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reqmngbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(invprofbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnchrtbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        admmangLayout.setVerticalGroup(
            admmangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admmangLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(invprofbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(reqmngbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(pnchrtbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
        );

        sptpn4.setLeftComponent(admmang);

        userProcessContainer.setBackground(new java.awt.Color(8, 21, 49));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        sptpn4.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sptpn4, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sptpn4, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reqmngbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reqmngbtnMousePressed
        // TODO add your handling code here:
        setColor(reqmngbtn);
        resetColor(new JPanel[]{pnchrtbtn,invprofbtn});
        OrganAvailabilityCheckInventoryJPanel jpanel = new OrganAvailabilityCheckInventoryJPanel (userAccount, inventoryManager, system, dB4OUtil,enterprise);
        userProcessContainer.add("OrganAvailabilityCheckInventoryJPanel",jpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_reqmngbtnMousePressed

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        // TODO add your handling code here:
        JFrame frame = (JFrame) getWindowAncestor(this);
        frame.dispose();
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_backMousePressed

    private void invprofbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invprofbtnMousePressed
        // TODO add your handling code here:
        setColor(invprofbtn);
        resetColor(new JPanel[]{reqmngbtn,pnchrtbtn});
        ManageInventoryManagerDetailsJPanel jpanel = new ManageInventoryManagerDetailsJPanel(userAccount,system,inventoryManager,enterprise);
        userProcessContainer.add("ManageInventoryManagerDetailsJPanel",jpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_invprofbtnMousePressed

    private void pnchrtbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnchrtbtnMousePressed
        // TODO add your handling code here:
        setColor(pnchrtbtn);
        resetColor(new JPanel[]{reqmngbtn,invprofbtn});
        Charts jpanel = new Charts(system);
        userProcessContainer.add("Charts",jpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_pnchrtbtnMousePressed

 private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(50, 62, 168));
    }
    
    private void resetColor(JPanel [] pane)
    {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(23,35,51));
           
        } 
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel admmang;
    private javax.swing.JLabel back;
    private javax.swing.JLabel chartlabel;
    private javax.swing.JPanel invprofbtn;
    private javax.swing.JLabel labelprofile;
    private javax.swing.JPanel pnchrtbtn;
    private javax.swing.JLabel reqlabel;
    private javax.swing.JPanel reqmngbtn;
    private javax.swing.JSplitPane sptpn4;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}

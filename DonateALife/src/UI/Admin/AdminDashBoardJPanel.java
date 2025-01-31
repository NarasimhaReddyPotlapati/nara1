/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin;

import Backend.DB4OUtil.DB4OUtil;
import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
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
public class AdminDashBoardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminDashBoardJPanel
     */
    private EcoSystem system;
    private Enterprise enterprise ;
    private DB4OUtil dB4OUtil;
    public AdminDashBoardJPanel(Enterprise enterprise,DB4OUtil dB4OUtil,EcoSystem system) {
        initComponents();
         this.enterprise = enterprise ;
        this.dB4OUtil = dB4OUtil;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane4 = new javax.swing.JSplitPane();
        mngAdmin = new javax.swing.JPanel();
        mngOrganizationButton = new javax.swing.JPanel();
        jMngOrganizationLabel10 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        mngUsrButton = new javax.swing.JPanel();
        MngUserlabel = new javax.swing.JLabel();
        mngEmployeeButton = new javax.swing.JPanel();
        mngEmployeelbl = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(974, 682));

        jSplitPane4.setBackground(new java.awt.Color(55, 96, 128));
        jSplitPane4.setDividerSize(0);
        jSplitPane4.setPreferredSize(new java.awt.Dimension(1200, 800));

        mngAdmin.setBackground(new java.awt.Color(8, 21, 49));

        mngOrganizationButton.setBackground(new java.awt.Color(8, 21, 49));
        mngOrganizationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mngOrganizationButtonMousePressed(evt);
            }
        });

        jMngOrganizationLabel10.setBackground(new java.awt.Color(8, 21, 49));
        jMngOrganizationLabel10.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jMngOrganizationLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jMngOrganizationLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMngOrganizationLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/enterprisex32.png"))); // NOI18N
        jMngOrganizationLabel10.setText("Organization Management ");

        javax.swing.GroupLayout mngOrganizationButtonLayout = new javax.swing.GroupLayout(mngOrganizationButton);
        mngOrganizationButton.setLayout(mngOrganizationButtonLayout);
        mngOrganizationButtonLayout.setHorizontalGroup(
            mngOrganizationButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMngOrganizationLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mngOrganizationButtonLayout.setVerticalGroup(
            mngOrganizationButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mngOrganizationButtonLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jMngOrganizationLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        back.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logoutx32.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });

        mngUsrButton.setBackground(new java.awt.Color(8, 21, 49));
        mngUsrButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mngUsrButtonMousePressed(evt);
            }
        });

        MngUserlabel.setBackground(new java.awt.Color(8, 21, 49));
        MngUserlabel.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        MngUserlabel.setForeground(new java.awt.Color(255, 255, 255));
        MngUserlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MngUserlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Userx32.png"))); // NOI18N
        MngUserlabel.setText("User Management");

        javax.swing.GroupLayout mngUsrButtonLayout = new javax.swing.GroupLayout(mngUsrButton);
        mngUsrButton.setLayout(mngUsrButtonLayout);
        mngUsrButtonLayout.setHorizontalGroup(
            mngUsrButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mngUsrButtonLayout.createSequentialGroup()
                .addComponent(MngUserlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mngUsrButtonLayout.setVerticalGroup(
            mngUsrButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mngUsrButtonLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(MngUserlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        mngEmployeeButton.setBackground(new java.awt.Color(8, 21, 49));
        mngEmployeeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mngEmployeeButtonMousePressed(evt);
            }
        });

        mngEmployeelbl.setBackground(new java.awt.Color(8, 21, 49));
        mngEmployeelbl.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        mngEmployeelbl.setForeground(new java.awt.Color(255, 255, 255));
        mngEmployeelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mngEmployeelbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Employeex32.png"))); // NOI18N
        mngEmployeelbl.setText("Employee Management");

        javax.swing.GroupLayout mngEmployeeButtonLayout = new javax.swing.GroupLayout(mngEmployeeButton);
        mngEmployeeButton.setLayout(mngEmployeeButtonLayout);
        mngEmployeeButtonLayout.setHorizontalGroup(
            mngEmployeeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
            .addGroup(mngEmployeeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mngEmployeeButtonLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(mngEmployeelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        mngEmployeeButtonLayout.setVerticalGroup(
            mngEmployeeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
            .addGroup(mngEmployeeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mngEmployeeButtonLayout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(mngEmployeelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(31, Short.MAX_VALUE)))
        );

        userProcessContainer.setBackground(new java.awt.Color(8, 21, 49));
        userProcessContainer.setPreferredSize(new java.awt.Dimension(1200, 800));
        userProcessContainer.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout mngAdminLayout = new javax.swing.GroupLayout(mngAdmin);
        mngAdmin.setLayout(mngAdminLayout);
        mngAdminLayout.setHorizontalGroup(
            mngAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mngAdminLayout.createSequentialGroup()
                .addGroup(mngAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mngAdminLayout.createSequentialGroup()
                        .addComponent(mngOrganizationButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mngAdminLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mngAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mngAdminLayout.createSequentialGroup()
                                .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(29, 29, 29))
                            .addGroup(mngAdminLayout.createSequentialGroup()
                                .addComponent(mngEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mngAdminLayout.createSequentialGroup()
                                .addComponent(mngUsrButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addComponent(userProcessContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mngAdminLayout.setVerticalGroup(
            mngAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mngAdminLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(mngOrganizationButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mngEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mngUsrButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mngAdminLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(userProcessContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane4.setLeftComponent(mngAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1108, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mngOrganizationButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mngOrganizationButtonMousePressed
        // TODO add your handling code here:
        setColor(mngOrganizationButton);
        resetColor(new JPanel[]{mngEmployeeButton,mngUsrButton});
        ManageOrgsJPanel manageOrgs = new ManageOrgsJPanel(enterprise.getOrganizationDirectory(),enterprise);
        userProcessContainer.add("ManageOrgsJPanel",manageOrgs);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_mngOrganizationButtonMousePressed

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        // TODO add your handling code here:
        JFrame frame = (JFrame) getWindowAncestor(this);
        frame.dispose();
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_backMousePressed

    private void mngUsrButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mngUsrButtonMousePressed
        // TODO add your handling code here:
       setColor(mngUsrButton);
        resetColor(new JPanel[]{mngOrganizationButton,mngEmployeeButton});
        ManageUserJPanel manageUser = new ManageUserJPanel(userProcessContainer,enterprise,system);
        userProcessContainer.add("ManageOrgsJPanel1",manageUser);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_mngUsrButtonMousePressed

    private void mngEmployeeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mngEmployeeButtonMousePressed
        // TODO add your handling code here: 
       setColor(mngEmployeeButton);
        resetColor(new JPanel[]{mngOrganizationButton,mngUsrButton});
        System.out.println(enterprise.getOrganizationDirectory());
        System.out.println("Hi");
        System.out.println(enterprise);
        System.out.println("Hi");
        ManageEmpJPanel manageEmp = new ManageEmpJPanel(enterprise.getOrganizationDirectory(),enterprise);
        userProcessContainer.add("ManageEmpJPanel",manageEmp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_mngEmployeeButtonMousePressed

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
    private javax.swing.JLabel MngUserlabel;
    private javax.swing.JLabel back;
    private javax.swing.JLabel jMngOrganizationLabel10;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JPanel mngAdmin;
    private javax.swing.JPanel mngEmployeeButton;
    private javax.swing.JLabel mngEmployeelbl;
    private javax.swing.JPanel mngOrganizationButton;
    private javax.swing.JPanel mngUsrButton;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}

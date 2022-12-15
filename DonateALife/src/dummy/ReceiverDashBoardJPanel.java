/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy;

import UI.Receiver.*;
import Backend.DB4OUtil.DB4OUtil;
import Backend.EcoSystem;
import Backend.User.User;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.SwingUtilities.getWindowAncestor;

/**
 *
 * @author ms
 */
public class ReceiverDashBoardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReceiverDashBoardJPanel
     */  private DB4OUtil dB4OUtil;
    private EcoSystem system;
    private User user;
    public ReceiverDashBoardJPanel(DB4OUtil dB4OUtil,EcoSystem system,User user) {
       initComponents();
        this.dB4OUtil = dB4OUtil;
        this.system = system;
        this.user =user;
        jSplitPane4.setTopComponent(admnmng);
         setColor(prfmng);
        resetColor(new JPanel[]{mngusrreqbtn});
        ManageReceiverDetailsJPanel jpanel = new ManageReceiverDetailsJPanel(user,system);
        userProcessContainer.add("ManageUserDetailsJPanel",jpanel);
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

        jSplitPane4 = new javax.swing.JSplitPane();
        admnmng = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        prfmng = new javax.swing.JPanel();
        lblprfmng = new javax.swing.JLabel();
        mngusrreqbtn = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1100, 800));

        jSplitPane4.setDividerSize(0);
        jSplitPane4.setForeground(new java.awt.Color(55, 96, 128));

        admnmng.setBackground(new java.awt.Color(0, 0, 0));
        admnmng.setPreferredSize(new java.awt.Dimension(200, 748));

        back.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logoutx32.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });

        prfmng.setBackground(new java.awt.Color(0, 0, 0));
        prfmng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                prfmngMousePressed(evt);
            }
        });

        lblprfmng.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblprfmng.setForeground(new java.awt.Color(255, 255, 255));
        lblprfmng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblprfmng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/account x 32.png"))); // NOI18N
        lblprfmng.setText("Profile");

        javax.swing.GroupLayout prfmngLayout = new javax.swing.GroupLayout(prfmng);
        prfmng.setLayout(prfmngLayout);
        prfmngLayout.setHorizontalGroup(
            prfmngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prfmngLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblprfmng, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        prfmngLayout.setVerticalGroup(
            prfmngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prfmngLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblprfmng, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        mngusrreqbtn.setBackground(new java.awt.Color(0, 0, 0));
        mngusrreqbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mngusrreqbtnMousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/request x 32.png"))); // NOI18N
        jLabel10.setText("Request Queue");

        javax.swing.GroupLayout mngusrreqbtnLayout = new javax.swing.GroupLayout(mngusrreqbtn);
        mngusrreqbtn.setLayout(mngusrreqbtnLayout);
        mngusrreqbtnLayout.setHorizontalGroup(
            mngusrreqbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mngusrreqbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );
        mngusrreqbtnLayout.setVerticalGroup(
            mngusrreqbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mngusrreqbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout admnmngLayout = new javax.swing.GroupLayout(admnmng);
        admnmng.setLayout(admnmngLayout);
        admnmngLayout.setHorizontalGroup(
            admnmngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(prfmng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mngusrreqbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(admnmngLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        admnmngLayout.setVerticalGroup(
            admnmngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admnmngLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(prfmng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(mngusrreqbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(345, Short.MAX_VALUE))
        );

        jSplitPane4.setLeftComponent(admnmng);

        userProcessContainer.setBackground(new java.awt.Color(0, 0, 0));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane4.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane4)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        // TODO add your handling code here:
        JFrame frame = (JFrame) getWindowAncestor(this);
        frame.dispose();
        ReceiverDashBoardJPanel.super.setVisible(false);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_backMousePressed

    private void prfmngMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prfmngMousePressed
        // TODO add your handling code here:

       setColor(prfmng);
        resetColor(new JPanel[]{mngusrreqbtn});
        ManageReceiverDetailsJPanel jpanel = new ManageReceiverDetailsJPanel(user,system);
        userProcessContainer.add("ManageUserDetailsJPanel",jpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_prfmngMousePressed

    private void mngusrreqbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mngusrreqbtnMousePressed
        // TODO add your handling code here:
        setColor(mngusrreqbtn);
        resetColor(new JPanel[]{prfmng});
        ManageRequestReceiverJPanel jpanel = new ManageRequestReceiverJPanel(system,user);
        userProcessContainer.add("ManageRequestUserJPanel",jpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_mngusrreqbtnMousePressed
int xx,xy;    
    private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(41,57,80));
    }
    
    private void resetColor(JPanel [] pane)
    {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(23,35,51));
           
        } 
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel admnmng;
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JLabel lblprfmng;
    private javax.swing.JPanel mngusrreqbtn;
    private javax.swing.JPanel prfmng;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainPages;

/**
 *
 * @author narasimhareddypotlapati
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        this.setSize(1100, 650);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        Donorimage = new javax.swing.JLabel();
        Homelabel = new javax.swing.JLabel();
        bgimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(null);

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("MNGO");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(-40, 10, 1100, 80);

        Donorimage.setBackground(new java.awt.Color(102, 0, 102));
        Donorimage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Donorimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Donorx64.png"))); // NOI18N
        Donorimage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DonorimageMousePressed(evt);
            }
        });
        getContentPane().add(Donorimage);
        Donorimage.setBounds(380, 260, 250, 200);

        Homelabel.setBackground(new java.awt.Color(255, 255, 255));
        Homelabel.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        Homelabel.setForeground(new java.awt.Color(255, 255, 255));
        Homelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Homelabel.setText("Home");
        getContentPane().add(Homelabel);
        Homelabel.setBounds(410, 190, 202, 90);

        bgimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/log.jpg"))); // NOI18N
        bgimg.setLabelFor(bgimg);
        getContentPane().add(bgimg);
        bgimg.setBounds(0, -10, 1610, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DonorimageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DonorimageMousePressed
        // TODO add your handling code here:
        new LoginPage().show();
    }//GEN-LAST:event_DonorimageMousePressed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Donorimage;
    private javax.swing.JLabel Homelabel;
    private javax.swing.JLabel bgimg;
    private javax.swing.JLabel jLabel15;
    // End of variables declaration//GEN-END:variables
}

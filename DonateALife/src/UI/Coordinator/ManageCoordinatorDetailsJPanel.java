/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Coordinator;

import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Organization.CoordinatorOrganization;
import Backend.UserAccount.UserAccount;
import UI.Donor.ManageDonorDetailsJPanel;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ms
 */
public class ManageCoordinatorDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserDetailsJPanel
     */
    private EcoSystem system;
    private UserAccount userAccount;
     private CoordinatorOrganization coordinator;
     private Enterprise enterprise ;
     private byte[] tempdP;
    public ManageCoordinatorDetailsJPanel(UserAccount userAccount, EcoSystem system,CoordinatorOrganization coordinator,Enterprise enterprise) {
        initComponents();
        this.system = system;
        this.userAccount = userAccount;
        this.coordinator = coordinator ;
        this.enterprise  = enterprise ;
        populateDefault();
    }

    private void populateDefault() {
        btnsve.setEnabled(false);
        btnupl.setEnabled(false);
        gendcmbox.removeAllItems();
        gendcmbox.addItem("Male");
        gendcmbox.addItem("Female");
        txtname.setText(userAccount.getEmployee().getName());
        txtaddr.setText(userAccount.getEmployee().getAddr());
        txtcity.setText(userAccount.getEmployee().getUrban());
        txtcont.setText(userAccount.getEmployee().getPhoneNumber());
        dtpk1.setDate(userAccount.getEmployee().getDOB());
        gendcmbox.setSelectedItem(userAccount.getEmployee().getGender());
        //organBankTextField.setText(userAccount.getEmployee().getEmergencyPhoneNumber());
        //orgTextField.setText(userAccount.getEmployee().getRelationShip());
        txtstat.setText(userAccount.getEmployee().getState());
        txtzipcode.setText(userAccount.getEmployee().getZip());
        txtorg.setText(coordinator.getOrgName());
//        txtornbnk.setText(enterprise.getName());
        if(userAccount.getEmployee().getdP() !=null){
        //Working line
         byte[] JLabelpictureLabel = userAccount.getEmployee().getdP();
        ImageIcon i = setPicturebyte(JLabelpictureLabel);
        lblphoto.setIcon(i);
        }
        else{
            System.err.println("No Image");
        }
        txtaddr.setEditable(false);
        txtcity.setEditable(false);
        txtcont.setEditable(false);
        dtpk1.setEditable(false);
        gendcmbox.setEnabled(false);
//        txtornbnk.setEditable(false);
        txtstat.setEditable(false);
        txtorg.setEditable(false);
        txtzipcode.setEditable(false); 
    }
private ImageIcon setPicturebyte(byte[] byteArrayImage){

        ImageIcon imageCar;
        imageCar = new ImageIcon(byteArrayImage);
        Image picCar = imageCar.getImage();
        JLabel pictureLabel1 = new JLabel();
        pictureLabel1.setSize(107, 133);
        Image resizedImage = picCar.getScaledInstance(pictureLabel1.getWidth(), pictureLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedCarPicture = new ImageIcon(resizedImage);
        return selectedCarPicture;  
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltitle = new javax.swing.JLabel();
        lbladdr = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtcity = new javax.swing.JTextField();
        lblcity = new javax.swing.JLabel();
        txtaddr = new javax.swing.JTextField();
        lblcnt = new javax.swing.JLabel();
        txtcont = new javax.swing.JTextField();
        lblname = new javax.swing.JLabel();
        txtstat = new javax.swing.JTextField();
        lblstat = new javax.swing.JLabel();
        lblzipcode = new javax.swing.JLabel();
        txtzipcode = new javax.swing.JTextField();
        lblphoto = new javax.swing.JLabel();
        lblgenf = new javax.swing.JLabel();
        gendcmbox = new javax.swing.JComboBox();
        lbldob = new javax.swing.JLabel();
        dtpk1 = new org.jdesktop.swingx.JXDatePicker();
        txtorg = new javax.swing.JTextField();
        lblorg = new javax.swing.JLabel();
        btnupl = new javax.swing.JButton();
        btnsve = new javax.swing.JButton();
        btnupd = new javax.swing.JButton();
        bgdimg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(890, 539));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(255, 255, 255));
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("Coordinator Information");
        add(lbltitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 80));

        lbladdr.setBackground(new java.awt.Color(255, 255, 255));
        lbladdr.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        lbladdr.setForeground(new java.awt.Color(255, 255, 255));
        lbladdr.setText("Address");
        add(lbladdr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 65, -1));

        txtname.setEditable(false);
        txtname.setBorder(null);
        txtname.setCaretColor(new java.awt.Color(30, 59, 92));
        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnameFocusGained(evt);
            }
        });
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 140, 22));

        txtcity.setBorder(null);
        txtcity.setCaretColor(new java.awt.Color(30, 59, 92));
        txtcity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcityFocusGained(evt);
            }
        });
        txtcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcityActionPerformed(evt);
            }
        });
        add(txtcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 496, 140, -1));

        lblcity.setBackground(new java.awt.Color(255, 255, 255));
        lblcity.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        lblcity.setForeground(new java.awt.Color(255, 255, 255));
        lblcity.setText("City");
        add(lblcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        txtaddr.setBorder(null);
        txtaddr.setCaretColor(new java.awt.Color(30, 59, 92));
        txtaddr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtaddrFocusGained(evt);
            }
        });
        txtaddr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddrActionPerformed(evt);
            }
        });
        add(txtaddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 140, 17));

        lblcnt.setBackground(new java.awt.Color(255, 255, 255));
        lblcnt.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        lblcnt.setForeground(new java.awt.Color(255, 255, 255));
        lblcnt.setText("Contact");
        add(lblcnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        txtcont.setBorder(null);
        txtcont.setCaretColor(new java.awt.Color(30, 59, 92));
        txtcont.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcontFocusGained(evt);
            }
        });
        txtcont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontActionPerformed(evt);
            }
        });
        add(txtcont, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 140, 19));

        lblname.setBackground(new java.awt.Color(255, 255, 255));
        lblname.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setText("Name");
        add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        txtstat.setBorder(null);
        txtstat.setCaretColor(new java.awt.Color(30, 59, 92));
        txtstat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtstatFocusGained(evt);
            }
        });
        txtstat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstatActionPerformed(evt);
            }
        });
        add(txtstat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 140, -1));

        lblstat.setBackground(new java.awt.Color(255, 255, 255));
        lblstat.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        lblstat.setForeground(new java.awt.Color(255, 255, 255));
        lblstat.setText("State");
        add(lblstat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        lblzipcode.setBackground(new java.awt.Color(255, 255, 255));
        lblzipcode.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        lblzipcode.setForeground(new java.awt.Color(255, 255, 255));
        lblzipcode.setText("Zip Code");
        add(lblzipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, -1, -1));

        txtzipcode.setBorder(null);
        txtzipcode.setCaretColor(new java.awt.Color(30, 59, 92));
        txtzipcode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtzipcodeFocusGained(evt);
            }
        });
        txtzipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtzipcodeActionPerformed(evt);
            }
        });
        add(txtzipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 140, -1));

        lblphoto.setBackground(new java.awt.Color(255, 255, 255));
        lblphoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        add(lblphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 107, 133));

        lblgenf.setBackground(new java.awt.Color(255, 255, 255));
        lblgenf.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        lblgenf.setForeground(new java.awt.Color(255, 255, 255));
        lblgenf.setText("Gender");
        add(lblgenf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        gendcmbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(gendcmbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        lbldob.setBackground(new java.awt.Color(255, 255, 255));
        lbldob.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        lbldob.setForeground(new java.awt.Color(255, 255, 255));
        lbldob.setText("Date of Birth");
        add(lbldob, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        dtpk1.setBackground(new java.awt.Color(255, 255, 255));
        add(dtpk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));

        txtorg.setEditable(false);
        txtorg.setBorder(null);
        txtorg.setCaretColor(new java.awt.Color(30, 59, 92));
        txtorg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtorgFocusGained(evt);
            }
        });
        txtorg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtorgActionPerformed(evt);
            }
        });
        add(txtorg, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 140, 20));

        lblorg.setBackground(new java.awt.Color(255, 255, 255));
        lblorg.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        lblorg.setForeground(new java.awt.Color(255, 255, 255));
        lblorg.setText("Organization");
        add(lblorg, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        btnupl.setBackground(new java.awt.Color(0, 0, 0));
        btnupl.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        btnupl.setForeground(new java.awt.Color(255, 255, 255));
        btnupl.setText("Upload");
        btnupl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuplActionPerformed(evt);
            }
        });
        add(btnupl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        btnsve.setBackground(new java.awt.Color(0, 0, 0));
        btnsve.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        btnsve.setForeground(new java.awt.Color(255, 255, 255));
        btnsve.setText("Save");
        btnsve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsveActionPerformed(evt);
            }
        });
        add(btnsve, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 117, -1));

        btnupd.setBackground(new java.awt.Color(0, 0, 0));
        btnupd.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        btnupd.setForeground(new java.awt.Color(255, 255, 255));
        btnupd.setText("Update");
        btnupd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdActionPerformed(evt);
            }
        });
        add(btnupd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, 117, -1));

        bgdimg.setBackground(new java.awt.Color(0, 0, 0));
        bgdimg.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        bgdimg.setForeground(new java.awt.Color(255, 255, 255));
        bgdimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HealthcareData.png"))); // NOI18N
        add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtnameFocusGained

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtcontFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcontFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontFocusGained

    private void txtcontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontActionPerformed

    private void txtaddrFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddrFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddrFocusGained

    private void txtaddrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddrActionPerformed

    private void txtcityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcityFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcityFocusGained

    private void txtcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcityActionPerformed

    private void txtstatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtstatFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstatFocusGained

    private void txtstatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstatActionPerformed

    private void txtzipcodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtzipcodeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtzipcodeFocusGained

    private void txtzipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtzipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtzipcodeActionPerformed

    private void txtorgFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtorgFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtorgFocusGained

    private void txtorgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtorgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtorgActionPerformed

    private void btnuplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuplActionPerformed
        // TODO add your handling code here:
      JFileChooser file = new JFileChooser();
          file.setCurrentDirectory(new File(System.getProperty("user.dir")));
          //filter the files
          FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
          file.addChoosableFileFilter(filter);
          int result = file.showSaveDialog(null);
           //if the user click on save in Jfilechooser
          if(result == JFileChooser.APPROVE_OPTION){
              File selectedFile = file.getSelectedFile();
              tempdP = new byte[(int) selectedFile.length()]; 
                FileInputStream fis;
             try {
                 fis = new FileInputStream(selectedFile);
                 fis.read(tempdP);
                 fis.close();
             } catch (IOException ex) {
                 Logger.getLogger(ManageDonorDetailsJPanel.class.getName()).log(Level.SEVERE, null, ex);
             }             
              lblphoto.setIcon(ResizeImage(selectedFile.getAbsolutePath()));
              lblphoto.setIcon(setPicture(selectedFile.getAbsolutePath(),lblphoto));
          }

          else if(result == JFileChooser.CANCEL_OPTION){
              System.out.println("No File Select");
          }
    }//GEN-LAST:event_btnuplActionPerformed
private ImageIcon setPicture(String carImageLocation, JLabel carImage){

        ImageIcon imageCar;
        imageCar = new ImageIcon(carImageLocation);
        Image picCar = imageCar.getImage();
        Image resizedImage = picCar.getScaledInstance(carImage.getWidth(), carImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedCarPicture = new ImageIcon(resizedImage);
        return selectedCarPicture;  
}
     
    private void btnsveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsveActionPerformed
        // TODO add your handling code here:
        
//        try {
//            Integer.parseInt(zipJTextField.getText());
//            Integer.parseInt(contactJTextField.getText());
//
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(null, "Contact Number and Zip code should be numberic", "Error", 0);
//            return;
//        }
         
        if (txtaddr.getText().isEmpty()           || txtcity.getText().isEmpty()     ||
            txtcont.getText().isEmpty()           || txtstat.getText().isEmpty()    ||
            txtzipcode.getText().isEmpty()               || txtname.getText().isEmpty() )
            
        { 
    
         JOptionPane.showMessageDialog(null, "All fields are mandatory", "Error", JOptionPane.ERROR_MESSAGE);
         return ;
        }
        
          Date currentDate = new Date();
          
          if (currentDate.equals(dtpk1.getDate()) || dtpk1.getDate().after(currentDate)) {
          
             JOptionPane.showMessageDialog(null, "Date should be past date", "Error", JOptionPane.ERROR_MESSAGE);
             return;
          }
          
          if (txtcont.getText().length() != 10 ) {
             JOptionPane.showMessageDialog(null, "Contact information should be 10 number", "Error", JOptionPane.ERROR_MESSAGE);
             return;   
          }
          
          if (txtzipcode.getText().length() != 5) {
             JOptionPane.showMessageDialog(null, "Zip code should be 5 digit", "Error", JOptionPane.ERROR_MESSAGE);
             return;   
          }
          
        
        userAccount.getEmployee().setAddr(txtaddr.getText());
        userAccount.getEmployee().setUrban(txtcity.getText());
        userAccount.getEmployee().setPhoneNumber(txtcont.getText());
        userAccount.getEmployee().setDOB(dtpk1.getDate());
        userAccount.getEmployee().setGender((String) gendcmbox.getSelectedItem());
//        userAccount.getEmployee().setEmergencyPhoneNumber(txtornbnk.getText());
        userAccount.getEmployee().setRelationShip(txtorg.getText());
        userAccount.getEmployee().setState(txtstat.getText());
        userAccount.getEmployee().setZip(txtzipcode.getText());
         userAccount.getEmployee().setPhotoLabel(lblphoto);
          userAccount.getEmployee().setdP(tempdP);
        JOptionPane.showMessageDialog(null, "Profile Updated Sucessfully");   
        txtaddr.setEditable(false);
        txtcity.setEditable(false);
        txtcont.setEditable(false);
        dtpk1.setEnabled(false);
        gendcmbox.setEnabled(false);
//        txtornbnk.setEditable(false);
        txtstat.setEditable(false);
        txtorg.setEditable(false);
        txtzipcode.setEditable(false);      
        btnupd.setEnabled(true);
        btnsve.setEnabled(false);
        btnupl.setEnabled(false);
        
    }//GEN-LAST:event_btnsveActionPerformed

    private void btnupdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdActionPerformed
        // TODO add your handling code here:
        btnupd.setEnabled(false);
        btnsve.setEnabled(true);
        btnupl.setEnabled(true);
        txtaddr.setEditable(true);
        txtcity.setEditable(true);
        txtcont.setEditable(true);
        dtpk1.setEditable(true);
        gendcmbox.setEnabled(true);
//        txtornbnk.setEditable(true);
        txtstat.setEditable(true);
        txtorg.setEditable(true);
        txtzipcode.setEditable(true); 
    }//GEN-LAST:event_btnupdActionPerformed
    
    public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lblphoto.getWidth(), lblphoto.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgdimg;
    private javax.swing.JButton btnsve;
    private javax.swing.JButton btnupd;
    private javax.swing.JButton btnupl;
    private org.jdesktop.swingx.JXDatePicker dtpk1;
    private javax.swing.JComboBox gendcmbox;
    private javax.swing.JLabel lbladdr;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblcnt;
    private javax.swing.JLabel lbldob;
    private javax.swing.JLabel lblgenf;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblorg;
    private javax.swing.JLabel lblphoto;
    private javax.swing.JLabel lblstat;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lblzipcode;
    private javax.swing.JTextField txtaddr;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtcont;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtorg;
    private javax.swing.JTextField txtstat;
    private javax.swing.JTextField txtzipcode;
    // End of variables declaration//GEN-END:variables

}

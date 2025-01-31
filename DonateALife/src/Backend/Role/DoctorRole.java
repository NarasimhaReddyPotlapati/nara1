/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Role;

import Backend.DB4OUtil.DB4OUtil;
import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Organization.DoctorOrganization;
import Backend.Organization.Organization;
import Backend.UserAccount.UserAccount;
import UI.Admin.AdminDashBoardJPanel;
import UI.Doctor.DoctorDashBoardJPanel;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author admin
 */
public class DoctorRole extends Role{

    @Override
    public void createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,DB4OUtil dB4OUtil) {
        DoctorDashBoardJPanel docPanel = new DoctorDashBoardJPanel(account,organization,business,dB4OUtil,enterprise);
        userProcessContainer.add("DoctorAssistantDashBoardJPanel",docPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        docPanel.setVisible(true);
    }
       
}

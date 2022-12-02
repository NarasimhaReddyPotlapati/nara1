/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import Backend.NGO.NGO;
import Backend.Organization.Organization;
import Backend.Role.Role;
import Backend.Role.SystemAdminRole;
import Backend.User.UserDirectory;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<NGO> ngoList;
    private  UserDirectory userDirectory;
    private Email email;
    private SendMessageTwilio twilio;
    
    
    public static EcoSystem getInstance(){
        if(business==null){
           business=new EcoSystem();
        }
        return business;
    }
    
    public NGO createAndAddNGO(){
        NGO ngo=new NGO();
        ngoList.add(ngo);
        return ngo;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    private EcoSystem(){
        super(null);
        ngoList=new ArrayList<NGO>();
        userDirectory  = new UserDirectory();
        email = new Email();
        twilio=new SendMessageTwilio();
    }
    
     public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
    
      public SendMessageTwilio getTwilio() {
        return twilio;
    }

    public void setTwilio(SendMessageTwilio twilio) {
        this.twilio = twilio;
    }
    
    
 public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

      
    public ArrayList<NGO> getngoList() {
        return ngoList;
    }

    public void setngoList(ArrayList<NGO> ngoList) {
        this.ngoList = ngoList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(NGO ngo:ngoList){
            
        }
        return true;
    }
}

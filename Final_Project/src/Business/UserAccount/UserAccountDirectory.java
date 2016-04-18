/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Person.Person;
import Business.Role.Role;
import java.awt.Button;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author jaini
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
       String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        password = getHash(password);
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                Log.Log.writeLog("Username:"+ua.getUsername()+timeStamp+ua.getRole().toString()+":"+Button.PROPERTIES+":"+Button.class+Button.ERROR);
               
                return ua;
            }
        return null;
    }
    
    private String getHash(String password) throws RuntimeException {
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();

            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);//byte wise
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();
        } catch(Exception ex){
           throw new RuntimeException(ex);
        }
    }
    
    public UserAccount createUserAccount(String username, String password, Person person, Role role){
          
//        String result=checkIfUsernameIsUnique(username);
//        if(result.equalsIgnoreCase("UserName Exists"))
//        {   System.out.println("Part2");
//            JOptionPane.showMessageDialog(null, "UserName Exists");
//            System.exit(0);
//            
//        }
       
        System.out.println("Part3");
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(getHash(password));
        userAccount.setPerson(person);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
        
     
        
    }  
    public String checkIfUsernameIsUnique(String username)
    {
        String result="";
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equalsIgnoreCase(username))
                
            {   System.out.println("part1");
                System.out.println("USernames:"+ua.getUsername());
                 result= "UserName Exists";
                 System.out.println("result1"+result);
                 
                 
            }
            else if(!ua.getUsername().equalsIgnoreCase(username))
            {   System.out.println("part4");
                result=  "Create UserName";
               //JOptionPane.showMessageDialog(null, "Create UserName");
            }
           
        }
      return result;  
    }

}
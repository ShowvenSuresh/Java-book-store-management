
package snebookstoreinventorymanagement;

import javax.swing.JOptionPane;

/**
 *
 * @author showven suresh
 */
public class ErrorChecking //scpecific class for error checking 
{
    private AccountManager am = new AccountManager();//object for the database
    
    
    
    public boolean uniqueUsernameCheck(String username)
    {
        if (am.retriveUsername(username)==null)
            return true;
        else
        {
            JOptionPane.showMessageDialog(null, "Username entered already exists please re-enter", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean uniquePasswordCheck(String password)
    {
        if(am.retrivePassword(password)==null)
            return true;
        else
        {
            JOptionPane.showMessageDialog(null, "Password is not unique please try again ", "Error", JOptionPane.ERROR_MESSAGE);
            return false ;
        }
            
    }
    
    public boolean uniqueFullNameCheck(String fullName)
    {
        if (am.retriveFullName(fullName)==null)
            return true;
        else 
        {
            JOptionPane.showMessageDialog(null, "A user with this name already exists", "Error", JOptionPane.ERROR_MESSAGE);
            return false ;
        }
    }
    
    public boolean uniqueEmailCheck(String email)
    {
        String sql="SELECT emailAdd FROM account WHERE emailAdd='"+email+"'";
        if (am.retriveEmail(sql)==null)
            return true;
        else 
        {
            JOptionPane.showMessageDialog(null, "Email Address already is registed", "Error", JOptionPane.ERROR_MESSAGE);
            return false ;
        }
    }
    
    public boolean checkEmailFormat(String email)
    {
        String[] splitEmail=null;
        //verify the @ symbol only as there are too many diffrent domain to consider
        splitEmail=email.split("@");
        System.out.println(splitEmail.length);
        if (splitEmail.length>1)
            return true;
        else 
        {
            JOptionPane.showMessageDialog(null, "The email address entered is not the correct format, please try again", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    
    
   
    
}

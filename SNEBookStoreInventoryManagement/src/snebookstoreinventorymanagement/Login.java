
package snebookstoreinventorymanagement;

import javax.swing.JOptionPane;

/**
 *
 * @author showven suresh
 */
public class Login 
{ 
    private String username,password;
    protected AccountManager am= new AccountManager();
    
    public Login(String username,String password)  //consturcts the object based on the username and password
    {
        setUsername(username);
        setPassword(password);
        
    }
    public Login()
    {
        
    }
    
    
            
    private void setUsername(String username)
    {
       this.username=username;
    }
    
    private void setPassword(String password)
    {
        this.password=password;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getAccountType()
    {
        
        return am.retriveAccountType(getUsername());
    }
    
    public String getEmail()
    {
        String sql="SELECT emailAdd FROM account WHERE username='"+getUsername()+"'";
        return am.retriveEmail(sql);
    }
    
   public boolean verifyLogin()
    {
        
        
        if(am.verifyLogin(getUsername(),getPassword())==true)
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Username or password entered is wrong", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
     
        
    }
   
   public void createAccount(String username, String password, String fullName,String emailAdd,String accType)
   {
       String sql="insert into account values ('"+username+"','"+password+"','"+fullName+"','"+emailAdd+"','"+accType+"')";
       am.createAccount(sql);
   }
    
   
   public void changePassword(String email,String password)
   {
       String sql="update account set psswd= '"+password+"' where emailAdd= '"+email+"'";
       am.changePassword(sql);
   }
    
    
    
}

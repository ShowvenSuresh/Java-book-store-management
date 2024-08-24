
package snebookstoreinventorymanagement;
import java.sql.*;
import javax.swing.JOptionPane;

public class AccountManager extends DatabaseManager
{
    public AccountManager ()
    {
        super.dbConnect();
    }
    
    public boolean verifyLogin(String username,String password)
    {
       boolean verify=false;
        String user=null,psswd=null;
        System.out.println(username+password);
        try
        {
            
            Statement s = connectDB.createStatement();
            ResultSet ac=s.executeQuery("SELECT username , psswd FROM account WHERE username= '"+username+"' AND psswd= '"+password+"'");
            if(ac.next())
            {
                user=ac.getString("username");
                psswd=ac.getString("psswd");
            }
            
            System.out.println(user+psswd);
            if (username.equals(user)&&password.equals(psswd))
            {
                
                
                return true;
            }
            else 
                verify = false;
            
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        //System.out.println(verify);
        
        return verify;
    }
    
    public String retriveUsername(String username)
    {
        String user=null;
        try
        {
            Statement s=connectDB.createStatement();
            ResultSet usr=s.executeQuery("SELECT username FROM account WHERE username='"+username+"'");
            
            if (usr.next())
            {
                user=usr.getString("username");
            }
            //System.out.println(user);
            
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        
        return user;
    }
    
    public String retrivePassword (String password)
    {
        String pass=null;
        try
        {
            Statement s  = connectDB.createStatement();
            ResultSet ps=s.executeQuery("SELECT psswd FROM account WHERE psswd='"+password+"'");
            if (ps.next())
            {
                pass=ps.getString("psswd");
            }
           // System.out.println(pass);
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        
        
        return pass;
    }
    
    public String retriveFullName(String fullName)
    {
        String name=null;
            try
            {
                Statement s= connectDB.createStatement();
                ResultSet fn=s.executeQuery("SELECT fullname FROM account WHERE fullname='"+fullName+"'");
                if (fn.next())
                {
                    name=fn.getString("fullname");
                }
               // System.out.println(name);
            }catch (SQLException e)
            {
                e.printStackTrace();
            }
        return name;
    }
    
    public String retriveAccountType(String username)
    {
        String accType=null;
        try
        {
           
            Statement s=connectDB.createStatement();
            ResultSet ac=s.executeQuery("SELECT accountType FROM account WHERE username='"+username+"'");
            if(ac.next())
            {
                accType= ac.getString("accountType");
            }
            
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return accType;
    }
    
    public String retriveEmail(String sql)
    {
        String mail=null;
        try
        {
            Statement s = connectDB.createStatement();
            ResultSet em= s.executeQuery(sql);
            if(em.next())
            {
                mail=em.getString("emailAdd");
            }
            System.out.println(mail);
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        
        
        return mail;
    }
    
    public void createAccount(String sql)
    {
        try
        {
            Statement s = connectDB.createStatement();
            int ca=s.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Account has been create, Please try logging in ", "INFO", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Account add sucess"+ca);
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void changePassword(String sql)
    {
        try
        {
            Statement s = connectDB.createStatement();
            int ca=s.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Password has been changed Please try logging in again", "INFO", JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    
    
}

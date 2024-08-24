
package snebookstoreinventorymanagement;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Session;
import javax.mail.Transport;
import javax.swing.JOptionPane;
/**
 *
 * @author showvensuresh
 */
public class EmailVerify 
{
    private String senderEmail= "senbookstore12@gmail.com",senderPassword= "vbbn qvws amej jnoq";
    private String recipiantEmail;
    private String otp;
    
    public EmailVerify(String email)
    {
        setRecipiantEmail(email);
        setOTP();
    }
    
    public void setRecipiantEmail(String email)
    {
        recipiantEmail=email;
    }
    
    public String getRecipiantEmail()
    {
        return recipiantEmail;
    }
    
    public String getSenderEmail()
    {
        return senderEmail;
    }
    
    public String getSenderPassword()
    {
        return senderPassword;
    }
    
    private void setOTP()
    {
        otp=generateRandomString();
    }
    
    public String getOTP()
    {
        return otp;
    }
    
    private Session createSession()
    {
        String host= "smtp.gmail.com";//using gmail smtp sever
        Properties properties= System.getProperties();//get system properties
        properties.setProperty("mail.smtp.host", host);//sets up the mail sever
        properties.setProperty("mail.smtp.port", "587");//port
        properties.setProperty("mail.smtp.auth", "true");//athentication
        properties.setProperty("mail.smtp.starttls.enable", "true");
        
        Session session =Session.getDefaultInstance(properties, new Authenticator()
        {
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication (getSenderEmail(),getSenderPassword());
            }
        });
        
        return session;
    }
    
    public void generateVerificationEmail()
    {
         
        try
        {
            
            MimeMessage message = new MimeMessage(createSession());//MimeMessage object
            message.setFrom(new InternetAddress(getSenderEmail()));//sets the from feild from the email to the senders email address
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(getRecipiantEmail()));//sets the to feild to  the recipient email address
            message.setSubject("!!VERIFICATION EMAIL!!");//set the subject feilds
            message.setText("\t\t\t\t\t\tThe following is your verification code\n\n\n\t\t\t\t\t\t\t"+getOTP());//set the body of the email
            Transport.send(message);///send the message
            System.out.println("done ");
        }catch(MessagingException mex)
        {
            mex.printStackTrace();;
        }
    }
    
    public String generateRandomString()
    {
        String randString="";
        
        String rangeOfCharacters="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklnmopqrstuvwxyz";
        
        for(int i=0;i<4;i++)
        {
            int j= (int)(rangeOfCharacters.length()*Math.random());
            randString+=rangeOfCharacters.charAt(j);
                    
        }
        System.out.println(randString);
        
        return randString;
    }
    
   public boolean verifyCode()
   {
       JOptionPane.showMessageDialog(null, "Sending OTP to Email", "INFO", JOptionPane.INFORMATION_MESSAGE);
       generateVerificationEmail();
       String message="Enter ONE-TIME PASSWORD";
       String verifyInput= JOptionPane.showInputDialog(message);
       
       if(verifyInput.equals(getOTP()))
       {
           return true;
       }
       else 
       {
           JOptionPane.showMessageDialog(null, "Wrong code entered", "Error", JOptionPane.ERROR_MESSAGE);
           return false;
       }
       
   }
}

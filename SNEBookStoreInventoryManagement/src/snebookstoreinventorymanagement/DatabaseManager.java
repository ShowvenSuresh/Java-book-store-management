
package snebookstoreinventorymanagement;
import java.sql.*;


/**
 *
 * @author showven suresh
 */
public class DatabaseManager 
{
    private String username = "root";//username for the database sever 
    private String password= "admin";//password for the database sever
    private String url="jdbc:mysql://localhost:3306/snebookstore";// to  establish the comnnection with mySQL
    public static Connection connectDB = null;
    
    public Connection dbConnect()
    {
        if (connectDB==null)
        {
            try
            {
                connectDB= DriverManager.getConnection(url,username,password);
                if(connectDB!=null)
                {
                    System.out.println("Database Connected");
                }
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
        else;
        return connectDB;
    }
    
    
    public void closeDBConnect()
    {
        if (connectDB!=null)
        {
            try
            {
                connectDB.close();
                System.out.println("connection closed");
            }catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }
    
    
    
    
}

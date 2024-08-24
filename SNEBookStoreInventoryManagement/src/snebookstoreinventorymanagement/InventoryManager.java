
package snebookstoreinventorymanagement;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author showven suresh
 */
public class InventoryManager extends DatabaseManager
{
    public InventoryManager()
    {
        super.dbConnect();
    }
    
    public void addBookStock(String sql)
    {
        try
        {
            Statement s = connectDB.createStatement();
            int add= s.executeUpdate(sql);
            System.out.println(add);
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void addDeleteEditBook(String sql)
    {
        try
        {
            Statement s = connectDB.createStatement();
            int add= s.executeUpdate(sql);
            System.out.println(add);
            
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    
    
    
    
}

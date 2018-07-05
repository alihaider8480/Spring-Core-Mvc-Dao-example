package foodcart3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
public class DbUtil 
{
	    static Connection con = null;
	    static PreparedStatement pst = null;      
	    static ResultSet rs = null; 
	public static List<food> getfoodlist() throws ClassNotFoundException, SQLException
	{
		 ArrayList<food> arr = new ArrayList<>();
		 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         String s = "jdbc:sqlserver://localhost:1433;DatabaseName=food;User=sa;Password=56789";
         con = DriverManager.getConnection(s);
		 pst = con.prepareStatement("select * from foodcart");
         rs  = pst.executeQuery();
          while(rs.next())
         {
        	int    id    = rs.getInt(1);
        	String item  = rs.getString(2);
        	int    price = rs.getInt(3);
            food f = new food(id, item, price);
            arr.add(f);
         }
		return arr;
	}
}

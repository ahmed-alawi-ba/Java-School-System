
/**
 *
 * @author ahmed alawi Bakhashwain
 * last modified 26/12/2018
 * 
 */

package School;


import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;





public class SQLite {
    
    
    private static boolean isCreated = false;
    
    private final String dbDirectory = "src\\Database\\students.db";
    
    
    
    
    /********    Methods   ****************/
    
    
    
    
    SQLite(){

        if(new File(dbDirectory).exists())
            isCreated = true;
        else
            createDatabase();
    }
    
    
    
    private void createDatabase(){
        
        Connection con = null;
        
        try{
            
            String url = "jdbc:sqlite:src\\Database\\students.db";
            con = DriverManager.getConnection(url);
            
            isCreated = true;
            System.out.println("The database has been created.");
            
            initDatabase();
            
            
            
            if (con.isClosed() == false){
                con.close();
            }
 
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        

    }
    
    
    

    
    
    
    private void initDatabase(){
        
        Connection con = connect();
        
        try {
            
            Statement st = con.createStatement();
            
            st.execute("CREATE TABLE students(id int(10) primary key, name varchar(255),"
                    + " email varchar(255), dob date, phone char(10));");
            
            
            st.execute("insert into students values(2018000001, 'Eesa Alharbi "
                    + "Ba khashwain', 'khali647@gmail.com', "
                    + "'1996-01-25', '0113875590');");
            
            
            
            if (con.isClosed() == false){
                con.close();
            }
         
            
        } catch (SQLException ex) {
            Logger.getLogger(SQLite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    
    
    
    
        protected Connection connect(){
        
        Connection con = null;
        
        String url = "jdbc:sqlite:src\\Database\\students.db";
        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            System.out.println("Failed to connect to sqlite database");
        }
        
        return con;
        
    }
    
    
    
}

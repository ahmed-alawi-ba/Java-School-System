
/**
 *
 * @author ahmed alawi Bakhashwain
 * last modified 26/12/2018
 * 
 */

package School;

import java.sql.Connection;
import java.util.Date;
import java.sql.SQLException;
import java.sql.Statement;



public class DB {
    
    
    DB(){
        
    }
    
    
    
    // a function to register a new student and insert the student's data into the database
    public static void NEW_STUDENT(String name, String email, String dob, String phone){
        
        SQLite sqlite = new SQLite();
        Connection con = sqlite.connect();
        
        
        if(!checkInfo(name, email, dob, phone)){
            System.out.println("Wrong data input");
        }
        else{
            try {
                Statement st = con.createStatement();

                st.execute("insert into students values(" + generateID() +", '" + name +"', '"
                + email +"', '" + dob + "', '" + phone +  "');");


                if(!con.isClosed()){
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        
        
    }
    
    
    
    
    
    
    private static String generateID(){
        
        String id;
        
        String idDate = new Date().toString().substring(24); 
        // to extract the year from the date string
        
        
        int idNo = (int)(Math.random()*1000000);
        // cast the double to int, and round the number to 6 digits

        
        String idString = Integer.toString(idNo);
        

        while(idString.length() != 6){
            
            idNo = (int)(Math.random()*1000000);
            idString = Integer.toString(idNo);
            
        }
              
        
        id = idDate + idString;
        System.out.println(id);
        
        
        return id;
    }

    
    
    
    
    
    private static boolean checkName(String name){
        
        boolean b = true;
        
        if(name.length() < 7 || name.length() > 35 )
        b = false;
        
        return b;
    }
    
    
    private static boolean checkEmail(String email){
    
        boolean b = true;
        
        if(email.length() < 7 || email.length() > 35 || !email.contains("@"))
        b = false;
        
        return b;
    }
    
    
    private static boolean checkPhone(String phone){
    
        boolean b = true;
        
        if(phone.length() != 10)
        b = false;
        
        return b;
    }
    
    
    
    
    
    
    
    private static boolean checkInfo(String name, String email, String dob, String phone){
        
        boolean b = false;
        
        if(checkName(name) && checkEmail(email) && checkPhone(phone)){
            
            b = true;
            
        }
        
        return b;
    }
        
    
}

    


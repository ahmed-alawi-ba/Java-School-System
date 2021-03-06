
package School;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Database {

    
    

    
    
//    protected static void search() {
//        Scanner in = new Scanner(System.in);
//        try{
//            
//            Connection con = new DB().connect();
//            
//            ResultSet rs = null;
//            
//            PreparedStatement ps = con.prepareStatement("SELECT id, first_name,"
//                    + " father_name, last_name FROM main_info WHERE id=? OR "
//                    + "first_name=? OR father_name=? OR last_name=?");
//            
//            System.out.print("Enter student name or ID:  ");
//            String input = in.next();
//            
//            ps.setString(1, input);
//            ps.setString(2, input);
//            ps.setString(3, input);
//            ps.setString(4, input);
//            
//            rs = ps.executeQuery();
//            
//            
//            byte counter = 0;
//            
//            while (rs.next()){
//                
//                System.out.println("\n============================="
//                        + "\n   Student ID  :  " + rs.getString("id")
//                        + "\n   First name  :  " + rs.getString("first_name")
//                        + "\n   Father name :  " + rs.getString("father_name")
//                        + "\n   Last name   :  " + rs.getString("last_name")
//                        + "\n============================="
//                );
//                
//                counter++;
//                
//            }
//            
//            System.out.println("\n\n\nSearch complete, " + counter + " students found.\n");
//            
//            
//            
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    protected static void update() {
//        Scanner in = new Scanner(System.in);
//        try{
//            
//            Connection con = new DB().connect();
//       
//            Statement st = con.createStatement();
//    
//            System.out.print("\nWhat do you want to update:"
//                           + "\n1) first name"
//                           + "\n2) father name"
//                           + "\n3) last name"
//                           + "\n4) email"
//                           + "\n\n0) back"
//            );
//            int input = in.nextInt();
//            
//            
// 
//            st.executeQuery("");
//            
//            
//            ResultSet rs = null;
//            
//            rs =st.getResultSet();
//                        
//            
//            System.out.println("\n\n\nStudent information has been updated.\n");
//            
//            
//            
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//    }
    
}

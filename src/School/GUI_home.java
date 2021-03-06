

/**
 *
 * @author ahmed alawi Bakhashwain
 * last modified 26/12/2018
 * 
 */

package School;


import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class GUI_home extends JFrame{
    
    
    
    JLabel main = new JLabel();
    
    ButtonRect updateButton = new ButtonRect("Edit",320,90);
    ButtonRect searchButton = new ButtonRect("Search",920, 50);
    ButtonRect addeditButton = new ButtonRect("NEW",1030, 420,3);
    ButtonRect helpButton = new ButtonRect("HELP",1030, 350,3);
    ButtonRect moreButton = new ButtonRect("MORE",1030, 250,3);
    
    JLabel image = new JLabel();
    JLabel logo = new JLabel();

    JTextField searchField = new JTextField();
    
    
    JLabel idText = new JLabel();
    JLabel nameText = new JLabel();
    
    JScrollPane scrPane = new JScrollPane();
    JList list = new JList();
    DefaultListModel model;
    
    
    JPanel details = new JPanel();
    
    
    
    
    
    
    GUI_home(){
        
        init();
        
    }
    
    
    
    
    

    private void init() {
        
  
        
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        setSize(1200, 700);
        setTitle("A.A.B  School System");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //setVisible(true);
        setResizable(true);
        
        System.out.println(getWidth() + "  " + getHeight());
        
        ////////////////////////////////////////
        
        
        main.setSize(getWidth(), getHeight());
        main.setLocation(0, 0);
        main.setLayout(null);
        main.setIcon(new ImageIcon(getClass().getResource("/images/Building2.jpg")));
        add(main);
        
        
        main.add(searchButton);
        
        main.add(updateButton);
        
        main.add(addeditButton);
        
        main.add(helpButton);
        
        main.add(moreButton);
        
        
        
        
        
        
        searchField.setBounds(450,50,450, 30);
        searchField.setVisible(true);
        searchField.setForeground(Color.black);
        searchField.setBackground(Color.WHITE);
        main.add(searchField);
        

        
        image.setBounds(60,30,80, 90);
        image.setIcon(new ImageIcon(getClass().getResource("/images/student_image2.png")));
        main.add(image);
        
        
        logo.setBounds(1220,50,20, 26);
        logo.setIcon(new ImageIcon(getClass().getResource("/images/logo.png")));
        main.add(logo);
        
        
        
        idText.setText("ID");
        idText.setFont(new Font("Arial",1,15));
        idText.setBounds(485,120,50,30);
        main.add(idText);
        

        
        nameText.setText("Name");
        nameText.setFont(new Font("Arial",1,15));
        nameText.setBounds(600,120,180,30);
        main.add(nameText);
        
        
        details.setBounds(60, 150, 340, 480);
        details.setBackground(new Color(220,220,220));
        details.setBorder(new LineBorder(new Color(100,100,100), 1, false));
        main.add(details);
        
        
        
        scrPane.setBounds(450, 150, 550,480);
        scrPane.setVisible(true);
        scrPane.setBackground(Color.black);
        scrPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        main.add(scrPane);
        
        model = new DefaultListModel();
        
        setModelList();
        
        list.setModel(model);
        scrPane.setViewportView(list);
        list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        list.setFixedCellHeight(30);
        list.setFont(new Font("Arial", 0, 15));

        
        
        
        
        
        
        DB.NEW_STUDENT("Hashim Hijazi Alaa", "kjljk@hghhj", "1997-09-12", "9999998766");
            
        setVisible(true);
    }
    
    
    
    
    
    
    
    private void setModelList(){
        /**********************************************************************
         to connect to the database and list all the students in the list
         component by adding them into the model of the list.
        **********************************************************************/
        
        try{
            
        
          Connection con = new SQLite().connect();
          ResultSet rs = null;
          Statement st = con.createStatement();
          rs = st.executeQuery("SELECT * FROM students;");
          
          while(rs.next()){
              
              model.addElement("  "+rs.getString("id") + "        " +rs.getString("name"));
              
              
          }
          
          if (con.isClosed() == false){
              con.close();
          }
          
          
        
       
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    
    
  
    
    
    
    
    
    
    
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_home();
            }
        });
    }
    
    
    

    
    
}

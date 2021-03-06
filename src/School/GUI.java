
/**
 *
 * @author ahmed alawi Bakhashwain
 * last modified 26/12/2018
 * 
 */


package School;

import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ahmed
 */
public class GUI {
    
    
    
    
    
    
    
    public JButton Button(String text, int x, int y){
        
        JButton button = new JButton();
        button.setText(text);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setLocation(x, y);
        

        button.setSize(80, 30);
        
        return button;
    }
    
    
    
    
    public JButton Button2(String text, int x, int y){
        
        
        JButton button = Button(text, x, y);
        
  
        button.setSize(120, 60);
        button.setFont(new Font("arial",Font.BOLD, 16));
        
        
        return button;
        
        
    }
    
    
    
    public JLabel BG(JFrame f){
        
        JLabel bg = new JLabel();
   
        
        bg.setSize(f.getWidth(), f.getHeight());
        bg.setLocation(0, 0);
        bg.setLayout(null);
        bg.setIcon(new ImageIcon(getClass().getResource("/images/Building2.jpg")));
        
        
        return bg;
        
    }
    
    
    public void initFrame(JFrame f){
        
        f.setSize(1200, 700);
        f.setTitle("A.A.B  School System");
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(true);
        
        
    }
    
    
    
}

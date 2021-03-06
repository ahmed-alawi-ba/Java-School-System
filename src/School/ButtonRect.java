

/**
 *
 * @author ahmed alawi Bakhashwain
 * last modified 26/12/2018
 * 
 */

package School;


import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;


public class ButtonRect extends JButton{
    
    
    ButtonRect(String text, int x, int y){
        
        super(text);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.setLocation(x, y);
        
//        this.setForeground(Color.white);
//        this.setBackground(new Color(10,150,255));
        this.setSize(80, 30);
        
        
    }
    
    ButtonRect(String text, int x, int y, int type){
        
        
        this(text, x, y);
        
        if(type == 2){
            this.setSize(200, 50);
        }
        
        if(type == 3){
            this.setSize(120, 60);
            this.setFont(new Font("arial",Font.BOLD, 16));
        }
        
        
        
        
    }
    
    
    
}

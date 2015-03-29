package project.ui;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;


public class SplashScreen extends JWindow{

    public SplashScreen (int delay)
    {
        Image image = Toolkit.getDefaultToolkit().getImage("src/others/logo.jpg");
        JLabel label =new JLabel();
        label.setIcon(new ImageIcon(image));
        getContentPane().add(label);
        setSize(400,300);
        setLocationRelativeTo(null);
        setVisible(true);
        try
        {
            Thread.sleep(delay);
        }
        catch(InterruptedException ie)
        {      
        }
        setVisible(false);
    }
}

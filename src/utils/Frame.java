package utils;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Frame {
    
    private static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private static final int WIDTH = screenSize.width;
    private static final int HEIGHT = screenSize.height;
    
    private Frame() {}
    
    public static void center(JFrame frame) {
    
        int frameWidth = frame.getSize().width;
        int frameHeight = frame.getSize().height;

        int x = (WIDTH - frameWidth) / 2;
        int y = (HEIGHT - frameHeight) / 2;

        frame.setLocation(x, y);
    }
    
    public static void dynamicSize(JFrame frame, double number) {
        
        int x = (int) Math.round((WIDTH  / number));
        int y = (int) Math.round((HEIGHT / number));


        frame.setSize(x, y);
    }
}

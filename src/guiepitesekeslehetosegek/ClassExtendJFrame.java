
package guiepitesekeslehetosegek;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class ClassExtendJFrame extends JFrame{
    private JFrame frame;

    public ClassExtendJFrame() {
        frame.setTitle("extendeles");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        //frame = new JFrame("extndeles");
        frame.setVisible(true);
    }

    
    
}

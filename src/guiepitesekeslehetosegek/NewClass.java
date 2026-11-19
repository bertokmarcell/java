
package guiepitesekeslehetosegek;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class NewClass {
    public static void main(String[] args) {
        //JFrame frame=new JFrame("GUI KÓD");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new JFrame("giukód").setVisible(true);
                JFrame frame=new JFrame("GUI KÓD");
                frame.setSize(600, 400);
                frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                
            }
        });
        
    }

    private void go() {
        
    }
}

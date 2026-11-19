
package guiepitesekeslehetosegek;

import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class ClassExtendJFrame extends JFrame{
    

    public ClassExtendJFrame() {
        setTitle("onnalo");
        
        setTitle("extendeles");
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        JButton b = new JButton("click ide");
        JRadioButton r = new JRadioButton();
        r.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(r.isSelected()){setLayout(new GridLayout(3,3));}else{
                setLayout(new BoxLayout(getContentPane(),BoxLayout.LINE_AXIS));
                }
                pack();
                repaint();
            }
        });
        add(b);
        add(r);
        setVisible(true);
    } 
}

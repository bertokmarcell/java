
package guiepitesekeslehetosegek;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class NewClass {
    public static void main(String[] args) {
        //JFrame frame=new JFrame("GUI KÓD");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new JFrame("giukód").setVisible(true);
                //SwingUtilities.invokeLater(NewClass::go);
                JFrame frame=new JFrame("GUI KÓD");
                frame.setSize(600, 400);
                frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                frame.setLayout(new FlowLayout());
                JPanel p = new JPanel();
                 
                //frame.setLayout(new BoxLayout(frame.getContentPane(),  BoxLayout.X_AXIS));
                frame.setLayout(new java.awt.GridLayout(3, 3));
                frame.setVisible(true);
                JButton btn = new JButton("kilepes1");
                JButton btn2 = new JButton("kilepes2");
                JButton btn3 = new JButton("kilepes3");
                
                btn.setSize(100, 20);
                //generalt kod amit most manualisan csinalunk V
                btn.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        JOptionPane.showMessageDialog(frame,"kilepes");
                       
                    }
                
                });
                p.setBorder(new BevelBorder(BevelBorder.RAISED));
                p.add(btn);
                p.add(btn2);
                p.add(btn3);
                frame.add(p);
                
                
            }
        });
        
    }

    private static void go() {
        
    }
}

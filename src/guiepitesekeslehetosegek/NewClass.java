
package guiepitesekeslehetosegek;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
                frame.setLayout(new FlowLayout());
                frame.setVisible(true);
                JButton btn = new JButton("kilepes");
                JButton btn2 = new JButton("kilepes");
                JButton btn3 = new JButton("kilepes");
                
                btn.setSize(100, 20);
                //generalt kod amit most manualisan csinalunk V
                btn.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        JOptionPane.showMessageDialog(frame,"kilepes");
                    }
                
                });
                frame.add(btn);
                frame.add(btn2);
                frame.add(btn3);
                
                
            }
        });
        
    }

    private void go() {
        
    }
}

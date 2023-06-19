import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class trafficlight {
      trafficlight(){
            JFrame f = new JFrame();
            JButton b1 = new JButton();
            b1.setBackground(Color.WHITE);

            JButton b2 = new JButton();
            b2.setBackground(Color.WHITE);

            JButton b3 = new JButton();
            b3.setBackground(Color.WHITE);

            f.setBackground(Color.WHITE);
            f.setLayout(new GridLayout(1,3));
            f.add(b1);f.add(b2);f.add(b3);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
            f.setSize(500, 200);

            b1.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent e){
                        b1.setBackground(Color.RED);
                        b2.setBackground(Color.WHITE);
                        b3.setBackground(Color.WHITE);
                  }
            });

            b2.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent e){
                        b1.setBackground(Color.WHITE);
                        b2.setBackground(Color.ORANGE);
                        b3.setBackground(Color.WHITE);
                  }
            });

            b3.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent e){
                        b1.setBackground(Color.WHITE);
                        b2.setBackground(Color.WHITE);
                        b3.setBackground(Color.GREEN);
                  }
            });
      }

      public static void main(String[]args){
            new trafficlight();
      }
}

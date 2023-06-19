import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class nikhitlight {
      nikhitlight(){
            JFrame f = new JFrame("*****Nikhit Lights*****");
            JButton a = new JButton("red");
            a.setBackground(Color.WHITE);
            JButton b = new JButton("green");
            b.setBackground(Color.WHITE);

            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(400,100);
            f.setVisible(true);
            f.add(a);f.add(b);
            f.setLayout(new GridLayout(1,2));

            a.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent e){
                        a.setBackground(Color.RED);
                        b.setBackground(Color.WHITE);
                  }
            });
            b.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent e){
                        a.setBackground(Color.WHITE);
                        b.setBackground(Color.GREEN);
                  }
            });
      }

      public static void main(String[]args){
            new nikhitlight();
      }
}

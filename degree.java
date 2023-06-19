import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class degree implements ActionListener{
      JFrame f;
      JTextField t1,t3;
      JButton b1;

      degree(){
            f = new JFrame("TEMPERATURE APP");

            t1 = new JTextField();
            t3 = new JTextField();
            t1.setEditable(true);
            t3.setEditable(false);

            b1 = new JButton("CONVERT");
            b1.addActionListener(this);

            f.add(t1);
            f.add(t3);
            f.add(b1);

            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(300,300);
            f.setLayout(new GridLayout(3,1));
            f.setVisible(true);
      }

      public void actionPerformed(ActionEvent e){
            if(e.getSource()==b1)
            {
                  int a = Integer.parseInt(t1.getText());
                  Double result = (a*1.8)+32;
                  t3.setText(result+" Farenheit");
            }
      }

      public static void main(String[]args){
            new degree();
      }
}
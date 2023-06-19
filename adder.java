import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class adder implements ActionListener{
      JFrame f;
      JTextField t1,t2,t3;
      JButton b1,b2;

      adder(){
            f = new JFrame("ADDER APP");

            t1 = new JTextField();
            t2 = new JTextField();
            t3 = new JTextField();
            t1.setEditable(true);
            t2.setEditable(true);
            t3.setEditable(false);

            b1 = new JButton("ADD");
            b2 = new JButton("CLEAR");
            b1.addActionListener(this);
            b2.addActionListener(this);

            f.add(t1);
            f.add(t2);
            f.add(t3);
            f.add(b1);
            f.add(b2);

            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(300,500);
            f.setLayout(new GridLayout(5,1));
            f.setVisible(true);
      }

      public void actionPerformed(ActionEvent e){
            if(e.getSource()==b1)
            {
                  int a = Integer.parseInt(t1.getText());
                  int b = Integer.parseInt(t2.getText());
                  int result = a + b;
                  t3.setText(result+"");
            }
            if(e.getSource()==b2)
            {
                  t1.setText("");
                  t2.setText("");
                  t3.setText("");
            }
      }

      public static void main(String[]args){
            new adder();
      }
}

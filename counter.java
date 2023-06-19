import java.awt.event.*;
import javax.swing.*;

public class counter {
      public int i = 0;
      counter(){
            JFrame f = new JFrame("Counter");
            JTextField t = new JTextField("count");
            JButton b = new JButton("add");
            f.setLayout(null);
            t.setBounds(10,10,200,100);
            b.setBounds(10, 120, 200, 100);
            f.add(t);f.add(b);

            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(235,265);
            f.setVisible(true);
            b.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent e){
                        i++;
                        t.setText(i+" ");
                  }
            });
      }

      public static void main(String[]args){
            new counter();
      }
}

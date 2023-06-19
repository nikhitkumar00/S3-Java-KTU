import javax.swing.*;
import java.awt.*;
public class frame {
      public frame(){
            JFrame j = new JFrame("Frameee");
            JButton a = new JButton("yes");
            JButton b = new JButton("no");
            j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            j.setLayout(new FlowLayout());
            j.setSize(500,500);
            j.add(a);j.add(b);
            j.setVisible(true);
      }

      public static void main(String[]args) {
            new frame();
      }
}

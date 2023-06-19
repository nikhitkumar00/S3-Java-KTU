import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class power {
      power(){
            JFrame f = new JFrame("Power Calculator");
            JTextField t1 = new JTextField();
            JTextField t2 = new JTextField();
            JTextField t3 = new JTextField();
            t1.setEditable(true);
            t2.setEditable(true);
            t3.setEditable(false);
            f.add(t1);f.add(t2);f.add(t3);

            f.setSize(200,300);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
            f.setLayout(new GridLayout(3,1));

            t2.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent e){
                        int p = Integer.parseInt(t1.getText());
                        int q = Integer.parseInt(t2.getText());
                        power w=new power();
                        t3.setText(w.powerr(p,q)+"");
                  }
            });
      }

      public int powerr(int p,int q){
            int powere=1;
            try{
                  if(p==0&&q==0){throw new numberexception();}
                  else if(p==0&&q==1){return (0);}
                  else if(p==1&&q==0){return (1);}
                  else{
                        for(int i=0;i<q;i++){
                              powere = powere * p;
                        }
                  }
            }
            catch(numberexception e){System.out.println("Both n and p cant be zero");}
            
            return powere;
      }
      public static void main(String[]args){
            new power();
      }
}
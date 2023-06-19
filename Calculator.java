import javax.swing.*;
import java.awt.event.*;
class Calculator implements ActionListener
{
 static int a=0,b=0,count=0,result=0;
 JFrame f;
 JTextField t;
 JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
 Calculator()
 {
 f=new JFrame("Calculator");
 t=new JTextField();
 t.setEditable(false);
 t.setBounds(75,50,200,30);
 b1=new JButton("1");b1.setBounds(100,100,50,50);
 b2=new JButton("2");b2.setBounds(150,100,50,50);
 b3=new JButton("3");b3.setBounds(200,100,50,50);
 b4=new JButton("4");b4.setBounds(100,150,50,50);
 b5=new JButton("5");b5.setBounds(150,150,50,50);
 b6=new JButton("6");b6.setBounds(200,150,50,50);
 b7=new JButton("7");b7.setBounds(100,200,50,50);
 b8=new JButton("8");b8.setBounds(150,200,50,50);
 b9=new JButton("9");b9.setBounds(200,200,50,50);
 b10=new JButton("+");b10.setBounds(100,250,50,50);
 b11=new JButton("0");b11.setBounds(150,250,50,50);
 b12=new JButton("-");b12.setBounds(200,250,50,50);
 b13=new JButton("*");b13.setBounds(100,300,50,50);
 b14=new JButton("=");b14.setBounds(150,300,50,50);
 b15=new JButton("/");b15.setBounds(200,300,50,50);
 b16=new JButton("Clear");b16.setBounds(100,350,150,30); 
 f.add(t);f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);f.add(b15);f.add(b16);
 f.setSize(400,450);
 f.setLayout(null);
 f.setVisible(true);
 b1.addActionListener(this); b2.addActionListener(this); 
 b3.addActionListener(this);b4.addActionListener(this); 
 b5.addActionListener(this); b6.addActionListener(this); 
 b7.addActionListener(this); b8.addActionListener(this); 
 b9.addActionListener(this); b10.addActionListener(this); 
 b11.addActionListener(this);b12.addActionListener(this); 
 b13.addActionListener(this); b14.addActionListener(this);
 b15.addActionListener(this); b16.addActionListener(this); 
 
 
 }
 public void actionPerformed(ActionEvent e)
 { 
 if(e.getSource()==b1)
 {
 t.setText(t.getText().concat("1")); 
 }
 else if(e.getSource()==b2)
 {
 t.setText(t.getText().concat("2")); 
 }
 else if(e.getSource()==b3)
 {
 t.setText(t.getText().concat("3"));
 }
 else if(e.getSource()==b4)
 {
 t.setText(t.getText().concat("4"));
 }
 else if(e.getSource()==b5)
 {
 t.setText(t.getText().concat("5"));
 }
 else if(e.getSource()==b6)
 {
 t.setText(t.getText().concat("6"));
 } 
 else if(e.getSource()==b7)
 {
 t.setText(t.getText().concat("7"));
 } 
 else if(e.getSource()==b8)
 {
 t.setText(t.getText().concat("8"));
 } 
 else if(e.getSource()==b9)
 {
 t.setText(t.getText().concat("9"));
 }
 else if(e.getSource()==b10)
 {
 a=Integer.parseInt(t.getText());
 count=1;
 t.setText("");
 } 
 else if(e.getSource()==b11)
 {
 t.setText(t.getText().concat("0"));
 } 
 else if(e.getSource()==b12)
 {
 a=Integer.parseInt(t.getText()); 
 count=2;
 t.setText("");
 } else if(e.getSource()==b13)
 {
 a=Integer.parseInt(t.getText());
 count=3;
 t.setText("");
 } 
 else if(e.getSource()==b14)
 {
 b=Integer.parseInt(t.getText());
 try
 {
 switch(count)
 {
 case 1:result=a+b;
 break;
 case 2:result=a-b;
 break;
 case 3:result=a*b;
 break;
 case 4:result=a/b;
 break;
 default:result=0;
 }
 t.setText(" "+result);
 }
 catch(ArithmeticException o)
 {
 t.setText("Math Error");
 }
 }
 else if(e.getSource()==b15)
 {
 count=4;
 a=Integer.parseInt(t.getText());
 t.setText("");
 }
 else if(e.getSource()==b16)
 {
 t.setText("");
 }
 
 }
 public static void main(String arg[])
 {
 new Calculator();
 } 
}
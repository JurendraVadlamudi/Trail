package Demo;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
public class GUI implements ActionListener 
{ 
 JFrame f; 
 JButton b1,b2,b3,b4,b5; 
 JTextField t1,t2,t3; 
 JLabel l1,l2,l3; 
   
 public GUI() 
 { 
  f=new JFrame("Calculator"); 
  l1=new JLabel("Input1"); 
  l2=new JLabel("Input2"); 
  l3=new JLabel("Output"); 
  t1=new JTextField(10); 
  t2=new JTextField(10); 
  t3=new JTextField(10); 
  b1=new JButton("Add"); 
  b2=new JButton("Sub"); 
  b3=new JButton("Mul"); 
  b4=new JButton("Div"); 
  f.setLayout(new FlowLayout()); 
  f.setVisible(true); 
  f.add(t1); 
  f.add(t2); 
  f.add(t3); 
  f.add(b1); 
   f.add(b2); 
  f.add(b3); 
  f.add(b4); 
 
  b1.addActionListener(this); 
  b2.addActionListener(this); 
  b3.addActionListener(this); 
  b4.addActionListener(this); 
  f.pack(); 
  f.setSize(500, 500);

 } 
 public void actionPerformed(ActionEvent e) 
 { 
   
  if(e.getSource()==b1) 
  { 
   int a=Integer.parseInt(t1.getText()); 
   int b=Integer.parseInt(t2.getText()); 
   int c=a+b; 
               t3.setText(Integer.toString(c)); 
  } 
  else if(e.getSource()==b2) 
  { 
   int a=Integer.parseInt(t1.getText()); 
   int b=Integer.parseInt(t2.getText()); 
   int c=a-b; 
   t3.setText(Integer.toString(c));  
  } 
  else if(e.getSource()==b3) 
  { 
   int a=Integer.parseInt(t1.getText()); 
   int b=Integer.parseInt(t2.getText()); 
   int c=a*b; 
   t3.setText(Integer.toString(c)); 
  } 
  else if(e.getSource()==b4) 
  { 
   double a=Double.parseDouble(t1.getText()); 
   double b=Double.parseDouble(t2.getText()); 
   double c=a/b; 
   t3.setText(Double.toString(c)); 
  } 
 } 
 public static void main(String args[]) 
 { 
  new GUI(); 
 } 
}  

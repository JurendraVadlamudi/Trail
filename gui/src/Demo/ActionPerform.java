package Demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ActionPerform {   //JButton Action
static JButton red=new JButton("RED");
static JButton green=new JButton("GREEN");
static JButton blue=new JButton("BLUE");

public static void main(String[] args) {

JFrame frame=new JFrame("Action Demo");
frame.setSize(700,300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


Container c=frame.getContentPane();
c.setLayout(null);

red.setBounds(10,20,100,50);
green.setBounds(130,20,100,50);
blue.setBounds(250,20,100,50);

c.add(red);
c.add(green);
c.add(blue);

red.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent event){
red_action(event);
}
});

green.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent event){
green_action(event);
}
});

blue.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent event){
blue_action(event);
}
});

frame.setVisible(true);

}
public static void red_action(ActionEvent e){
if(e.getSource()==red){
red.setBackground(Color.BLUE);
}}

public static void green_action(ActionEvent e){

if(e.getSource()==green){
green.setBackground(Color.GREEN);
}}

public static void blue_action(ActionEvent e){

if(e.getSource()==blue){
//blue.setBackground(Color.BLUE);

JOptionPane.showMessageDialog(blue,"Hello, Welcome to Javatpoint.");  
}}

}
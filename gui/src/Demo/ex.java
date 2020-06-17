package Demo;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ex {
	public static void main(String args[] ) {
	JFrame j1=new JFrame("RAILWAY TICKET BOOKING");
	Container c1=j1.getContentPane();
	c1.setLayout(null);
	j1.setBounds(300,100,700,500);
	j1.setVisible(true);
	j1.setResizable(false);
	j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				
	JButton b1=new JButton("LOGIN");
	c1.add(b1);
	b1.setBounds(402, 250, 250, 29);
	//b1.setBounds(277, 318, 100, 30);
	JButton b2=new JButton("CREATE AN ACCOUNT");
	c1.add(b2);
	b2.setBounds(277, 350, 100, 30);
	JLabel jx=new JLabel("HI Mr/Mrs");
	c1.add(jx);
	jx.setBounds(60, 10, 592, 39);
}
}
package railway;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame4 {
	JFrame j;

	public void book() {
		j=new JFrame();
		j.setBounds(300,100,660,453);
		j.setResizable(false);
		j.setVisible(true);
		Container c=j.getContentPane();
		c.setLayout(null);
		JLabel l=new JLabel("NO OF PASSENGERS:");
		l.setForeground(Color.WHITE);
		l.setBackground(Color.WHITE);
		l.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		c.add(l);
		JButton jb=new JButton("BOOK TRAIN");
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				JOptionPane jp=new JOptionPane();
		jp.showMessageDialog(null,"YOU HAVE SUCCESSFULL BOOKED TICKETS\n    HAPPY JOURNEY\n     LOGOUT AND EXITING");
			j.dispose();	
			}
		});
		jb.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		c.add(jb);
		

		JComboBox b=new JComboBox();
		c.add(b);
		b.addItem("");
		b.addItem("1");
		b.addItem("2");
		b.addItem("3");
		b.addItem("4");
		b.addItem("5");
		b.addItem("6");
		
		
		
		JLabel lc9=new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/indianrailways.jpg")).getImage();	
		lc9.setIcon(new ImageIcon(img1));
		c.add(lc9);		
		
		l.setBounds(87,57,214,31);
		b.setBounds(340,60,100,31);
		lc9.setBounds(0,0,656,425);
		jb.setBounds(209,349,179,40);
	}
}

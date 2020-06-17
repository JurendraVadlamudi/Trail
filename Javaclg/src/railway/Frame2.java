package railway;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Frame2 {
JPasswordField p;
JTextField l4;
JFrame j2;

	public void third() {
		j2=new JFrame("LOGIN");
		j2.setResizable(false);
		j2.setVisible(true);
		Container c2=j2.getContentPane();
		c2.setLayout(null);
		j2.setBounds(300,100,660,453);
		JLabel l2=new JLabel("LOGIN ID:");
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("Arial", Font.BOLD, 20));
		l2.setBounds(76,197,156,24);
		c2.add(l2);
		JLabel jl=new JLabel("PLEASE ENTER YOU LOGIN DETAILS");
		jl.setForeground(Color.WHITE);
		jl.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 22));
		c2.add(jl);
		jl.setBounds(53,136,481,51);
		JLabel l3=new JLabel("PASSWORD:");
		l3.setForeground(Color.WHITE);
		l3.setFont(new Font("Arial", Font.BOLD, 20));
		l3.setBounds(76,247,180,24);
		c2.add(l3);
		l4=new JTextField();
		l4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		l4.setBounds(248,197,180,24);
		c2.add(l4);
		p=new JPasswordField();
		p.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				try {
					boolean b=verify();
					if(b!=true) {
					JOptionPane jp=new JOptionPane("");
					jp.showMessageDialog(null, "INVALID LOGIN ID OR PASSWORD \n               RETRY");
					l4.setText(null);
					p.setText(null);
					}
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
			}
			}
		});
		p.setBounds(248,247,180,24);
		c2.add(p);
		JButton bx=new JButton("LOGIN");
		bx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(e.getSource()==bx) {
				try {
					boolean b=verify();
					if(b!=true) {
					JOptionPane jp=new JOptionPane("");
					jp.showMessageDialog(null, "INVALID LOGIN ID OR PASSWORD \n               RETRY");
					l4.setText(null);
					p.setText(null);
					
					}
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
			}
			}
		});
		c2.add(bx);
		bx.setBounds(99,311,180,24);
		
		JButton bx1=new JButton("BACK");
		c2.add(bx1);
		bx1.setBounds(332,311,180,24);	
		bx1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==bx1) {
					j2.dispose();
					Frame ox=new Frame();
					ox.first();
				}
			}
		});

		JLabel ji=new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/KL.png")).getImage();
		ji.setIcon(new ImageIcon(img));
		c2.add(ji);
		ji.setBounds(0,0,254,115);
		
		JLabel lo=new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/indianrailways.jpg")).getImage();
		lo.setIcon(new ImageIcon(img1));
		lo.setBounds(0,0,646,416);
		c2.add(lo);	

	}
	public boolean verify() throws FileNotFoundException {
		boolean fo=false;
		String tempuser,temppass,c1,c2;
		
		tempuser=l4.getText();
		temppass=new String(p.getPassword());
		File fv=new File("C:\\Users\\juren\\eclipse-workspace\\Javaclg\\Textfiles\\Check.txt");
		Scanner sv=new Scanner(fv);
		sv.useDelimiter("[,\n]");
		
		while(sv.hasNext()&&fo==false) {
			c1=sv.next();
			c2=sv.next();
			if(c1.trim().equals(tempuser.trim())&&c2.trim().contentEquals(temppass.trim())) {
			fo=true;
			JOptionPane jp=new JOptionPane("");
			jp.showMessageDialog(null, "SUCCESSFULL LOGIN");
			j2.dispose();
			Frame3 f=new Frame3();
			f.fourth();
			}
		}
	sv.close();
	return fo;
	}

}

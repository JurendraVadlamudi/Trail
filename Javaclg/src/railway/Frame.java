package railway;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Frame {
JLabel jx,l2,l3;

	public void first()  {
		
		Font f1=new Font("Arial",Font.BOLD,20);
		JFrame j1=new JFrame("RAILWAY TICKET BOOKING");
		Container c1=j1.getContentPane();
		c1.setLayout(null);
		j1.setBounds(300,100,800,500);
		j1.setVisible(true);
		j1.setResizable(false);			
		JButton b1=new JButton("LOGIN");
		c1.add(b1);
		b1.setBounds(287, 207, 166, 29);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b1) {
					j1.dispose();
					Frame2 fx=new Frame2();
					fx.third();
				}
			}

			
		});
		JButton b2=new JButton("CREATE AN ACCOUNT");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b2) {
					j1.dispose();
					Frame1 ob=new Frame1();
					ob.second();
				}
			}
		});
		c1.add(b2);
		b2.setBounds(287, 288, 166, 30);
		
		jx=new JLabel("WELCOME TO K L RAILWAY TICKET BOOKING SYSTEM");
		jx.setFont(f1);
		jx.setForeground(Color.WHITE);
		c1.add(jx);
		jx.setBounds(227, 32, 559, 39);
		
		l2=new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/KL-2018.png")).getImage();
		l2.setIcon(new ImageIcon(img));
		c1.add(l2);		
		l2.setBounds(0,10,279,111);

		l3=new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/indianrailways.jpg")).getImage();
		l3.setIcon(new ImageIcon(img1));
		c1.add(l3);
		l3.setBounds(0,0,796,462);
		
			
		
	}

}

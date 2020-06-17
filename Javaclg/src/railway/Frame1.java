package railway;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Frame1 {

	private JFrame jc;
	JTextField jt,jt1,jt2,jt3,jt4;
	JPasswordField jp,jp1;


	/**
	 * @wbp.parser.entryPoint
	 */
	public void second() {
		
		jc = new JFrame();
		jc.setBounds(100, 100, 889, 693);
		jc.setVisible(true);
		jc.setResizable(false);
	Container cc=jc.getContentPane();
	cc.setLayout(null);
	JLabel lc=new JLabel("FULL NAME:");
	lc.setForeground(Color.WHITE);
	lc.setFont(new Font("Arial", Font.BOLD, 14));
	cc.add(lc);
	JLabel lc1=new JLabel("EMAIL:");
	lc1.setForeground(Color.WHITE);
	lc1.setFont(new Font("Arial", Font.BOLD, 14));
	cc.add(lc1);
	JLabel lc2=new JLabel("PHONE NUMBER:");
	lc2.setForeground(Color.WHITE);
	lc2.setFont(new Font("Arial", Font.BOLD, 14));
	cc.add(lc2);
	JLabel lc3=new JLabel("DATE OF BIRTH:");
	lc3.setForeground(Color.WHITE);
	lc3.setFont(new Font("Arial", Font.BOLD, 14));
	cc.add(lc3);
	JLabel lc4=new JLabel("GENDER:");
	lc4.setForeground(Color.WHITE);
	lc4.setFont(new Font("Arial", Font.BOLD, 14));
	cc.add(lc4);
	JLabel lc5=new JLabel("ID:");
	lc5.setForeground(Color.WHITE);
	lc5.setFont(new Font("Arial", Font.BOLD, 14));
	cc.add(lc5);
	JLabel lc6=new JLabel("PASSWORD:");
	lc6.setForeground(Color.WHITE);
	lc6.setFont(new Font("Arial", Font.BOLD, 14));
	cc.add(lc6);
	JLabel lc7=new JLabel("RE-ENTER PASSWORD:");
	lc7.setForeground(Color.WHITE);
	lc7.setFont(new Font("Arial", Font.BOLD, 14));
	cc.add(lc7);
	JLabel lc8=new JLabel("ENTER YOUR DETAILS:");
	lc8.setForeground(Color.WHITE);
	lc8.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 21));
	cc.add(lc8);
	JCheckBox cb=new JCheckBox("PLEASE ACCEPT TERM'S AND CONDITIONS.");
	cc.add(cb);
	JButton jb=new JButton("CREATE ACCOUNT");
	jb.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==jb&&jt.getText()!=null) {	
				jc.dispose();
			try {
				char c[]=jp.getPassword();
				char c1[]=jp1.getPassword();
				String cs,cs1;
				cs=new String(c);
				cs1=new String(c1);
			if(cs==cs1) {
			File f=new File("C:\\Users\\juren\\eclipse-workspace\\Javaclg\\Textfiles\\Check.txt");
	        BufferedWriter fw = new BufferedWriter(new FileWriter(f, true)); 
			char[] password = jp.getPassword();
			String s=new String(password);
			fw.write(jt1.getText()+","+s+"\n");
			fw.close();
			Frame2 f1=new Frame2();
			f1.third();
			}}
			 catch (IOException e1) {
					e1.printStackTrace();
				}

		}
		}});
	cc.add(jb);
	JButton jb1=new JButton("BACK");
	jb1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==jb1) {
				Frame f=new Frame();
				jc.dispose();
				f.first();
			}
		}
	});
	cc.add(jb1);
	jt=new JTextField();
	jt.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
	cc.add(jt);
	jt1=new JTextField();
	jt1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
	cc.add(jt1);
	jt2=new JTextField();
	jt2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
	cc.add(jt2);
	jt3=new JTextField();
	jt3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
	cc.add(jt3);
	jt4=new JTextField();
	jt4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
	cc.add(jt4);
	jp=new JPasswordField();
	jp.setFont(new Font("Arial", Font.PLAIN, 16));
	cc.add(jp);
	jp1=new JPasswordField();
	jp1.setFont(new Font("Arial", Font.PLAIN, 16));
	cc.add(jp1);
	JRadioButton jr=new JRadioButton("MALE");
	jr.setFont(new Font("Arial", Font.PLAIN, 14));
	jr.setForeground(Color.BLACK);
	JRadioButton jr1=new JRadioButton("FEMALE");
	jr1.setForeground(Color.BLACK);
	jr1.setFont(new Font("Arial", Font.PLAIN, 14));
	cc.add(jr);
	cc.add(jr1);
	
	ButtonGroup bg=new ButtonGroup();
	bg.add(jr);
	bg.add(jr1);
	
	JLabel lc9=new JLabel("");
	Image img1=new ImageIcon(this.getClass().getResource("/indianrailways.jpg")).getImage();
	lc9.setIcon(new ImageIcon(img1));
	cc.add(lc9);

//	bounds
	jc.setBounds(300,100,800,550);
	lc.setBounds(64,82,189,30);
	lc1.setBounds(64,162,189,30);
	lc2.setBounds(64,202,189,30);
	lc3.setBounds(64,242,189,30);
	lc4.setBounds(64,362,189,30);
	lc5.setBounds(63,122,190,30);
	lc6.setBounds(64,282,189,30);
	lc7.setBounds(64,322,189,30);
	lc8.setBounds(255,10,302,49);
	lc9.setBounds(0,0,796,522);
	cb.setBounds(64,398,314,37);
	jb.setBounds(145,452,160,37);
	jb1.setBounds(408,452,160,37);
	jt.setBounds(283,83,261,30);
	jt1.setBounds(283,123,261,30);
	jt2.setBounds(283,163,261,30);
	jt3.setBounds(283,203,261,30);
	jt4.setBounds(283,243,261,30);
	jp.setBounds(283,283,261,30);
	jp1.setBounds(283,323,261,30);
	jr.setBounds(283,362,63,30);
	jr1.setBounds(377,362,83,30);

		
	}

}

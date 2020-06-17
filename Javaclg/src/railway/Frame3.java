package railway;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JViewport;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Frame3 {
JLabel l4;
Container c;
static JComboBox<String> cb,t,t1;


public void fourth() {
	JFrame j=new JFrame("ENTER JOURNEY DETAILS");
	j.setBounds(100, 100, 800, 534);
	j.setVisible(true);
	 c	=j.getContentPane();
	c.setLayout(null);
	JLabel l=new JLabel("FROM:");
	l.setFont(new Font("Arial", Font.PLAIN, 14));
	l.setForeground(Color.WHITE);
	c.add(l, BorderLayout.NORTH);
	JLabel l1=new JLabel("TO:");
	l1.setFont(new Font("Arial", Font.PLAIN, 14));
	l1.setForeground(Color.WHITE);
	c.add(l1);
	t=new JComboBox<String>();
	t.addItem("");
	t.addItem("K L U");
	t.addItem("VIJAYAWADA (BZA)");
	t.addItem("GUNTUR");
	t.addItem("MANGALAGIRI");
	t.addItem("TENALI");
	t.addItem("NUNNA");
	t.addItem("AMARAVATI");
	t.addItem("LOCAL");
	c.add(t);
	t1=new JComboBox<String>();
	t1.addItem("");
	t1.addItem("K L U");
	t1.addItem("VIJAYAWADA (BZA)");
	t1.addItem("GUNTUR");
	t1.addItem("MANGALAGIRI");
	t1.addItem("TENALI");
	t1.addItem("NUNNA");
	t1.addItem("AMARAVATI");
	t1.addItem("LOCAL");
	c.add(t1);	
	JLabel l2=new JLabel("CHECK TRAINS:");
	l2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
	l2.setForeground(Color.WHITE);
	c.add(l2);
	
	JButton b3=new JButton("LOGOUT AND EXIT");
	b3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b3) {
				j.dispose();
			}
		}
	});
	b3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
	c.add(b3);
	JButton b=new JButton("CHECK TRAIN");
	b.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
	b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b) {
					cb.removeAllItems();
				trains();
			}}
	});
	c.add(b);
	JButton b1=new JButton("RESET");
	b1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
	b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1) {
				t.setSelectedIndex(0);
				t1.setSelectedIndex(0);
				cb.removeAllItems();
			}
		}
	});
	c.add(b1);

	cb=new JComboBox<String>();
	c.add(cb);
	cb.setBounds(288,192,315,30);
	JButton b2=new JButton("BOOK TRAIN");
	b2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			j.dispose();
			Frame4 f4=new Frame4();
			f4.book();
		}
	});
	c.add(b2);
	b2.setBounds(170,402,184,41);
	b2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
	
	
	JLabel lc9=new JLabel("");
	Image img1=new ImageIcon(this.getClass().getResource("/indianrailways.jpg")).getImage();	
	lc9.setIcon(new ImageIcon(img1));
	c.add(lc9);
	
	
	
	
	//BOUNDS
	l.setBounds(50,24,100,20);
	l1.setBounds(403,24,66,20);
	t.setBounds(134,22,220,28);
	t1.setBounds(479,22,220,28);
	b.setBounds(195,98,181,41);
	b1.setBounds(435,99,181,39);
	lc9.setBounds(0,0,786,497);
	l2.setBounds(103,184,164,41);
	b3.setBounds(448, 402, 220, 41);

	
	
	}

public void trains() {
		if((t.getSelectedIndex()==1&&(t1.getSelectedIndex()==2||t1.getSelectedIndex()==6)) ||(t.getSelectedIndex()==2&&(t1.getSelectedIndex()==1||t1.getSelectedIndex()==6)) ||(t.getSelectedIndex()==6&&(t1.getSelectedIndex()==2||t1.getSelectedIndex()==1)) ){
		t.setSelectedIndex(0);
		t1.setSelectedIndex(0);
		cb.addItem("");
		cb.addItem("TRAIN NO:12345     -   :KL BZA PASSENGER");
		cb.addItem("TRAIN NO:75689	   -   :KL BZA EXPRESS");
		cb.addItem("TRAIN NO:23451     -   :KL LOCAL TRAIN");
		
	}
else if((t.getSelectedIndex()==1&&(t1.getSelectedIndex()==3||t1.getSelectedIndex()==4||t1.getSelectedIndex()==5))||t.getSelectedIndex()==3&&(t1.getSelectedIndex()==1||t1.getSelectedIndex()==4||t1.getSelectedIndex()==5)||(t.getSelectedIndex()==4&&(t1.getSelectedIndex()==3||t1.getSelectedIndex()==1||t1.getSelectedIndex()==5))||(t.getSelectedIndex()==5&&(t1.getSelectedIndex()==3||t1.getSelectedIndex()==4||t1.getSelectedIndex()==1))){
	t.setSelectedIndex(0);
	t1.setSelectedIndex(0);
	cb.addItem("");
	cb.addItem("TRAIN NO:32323     -   :KL - GNT PASSENGER");
	cb.addItem("TRAIN NO:12321     -   :KL - GNT EXPRESS");
	cb.addItem("TRAIN NO:23451     -   :KL LOCAL TRAIN");
}
else if((t.getSelectedIndex()==1&&(t1.getSelectedIndex()==7||t1.getSelectedIndex()==8))||(t.getSelectedIndex()==7&&(t1.getSelectedIndex()==1||t1.getSelectedIndex()==8))||t.getSelectedIndex()==8&&(t1.getSelectedIndex()==7||t1.getSelectedIndex()==1)){
	t.setSelectedIndex(0);
	t1.setSelectedIndex(0);
	cb.addItem("");
	cb.addItem("TRAIN NO:28657     -   :KL - AMARAVATI PASSENGER");
	cb.addItem("TRAIN NO:18954     -   :KL - AMARAVATI EXPRESS");
	cb.addItem("TRAIN NO:23451     -   :KL LOCAL TRAIN");
}

}


}

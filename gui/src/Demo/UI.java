package Demo;

import java.awt.*;

import javax.swing.*;

public class UI {

	public static void main(String[] args) {
		JFrame frame=new JFrame(" frame");
		JButton b=new JButton(" add");
		Container c=frame.getContentPane();
		c.add(b);
		frame.setVisible(true);
		frame.setBounds(300,300,300,300);
	}

}

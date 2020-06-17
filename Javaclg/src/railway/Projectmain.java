package railway;
import java.awt.*;
import java.io.IOException;

public class Projectmain {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Projectmain window = new Projectmain();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Projectmain() throws IOException {
		initialize();
	}


	
	
	private void initialize() throws IOException {

		Frame ob=new Frame();
		ob.first();
	}

}

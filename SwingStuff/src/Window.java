import javax.swing.JFrame;

import org.junit.Test;

@SuppressWarnings("serial")
public class Window extends JFrame{
	public void windowStart(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 500, 500);
		setLocation(0, 0);
		setLayout(null);
		setResizable(false);
		setVisible(true);
		System.out.println("HI");
		System.out.println("Hi nmr 2");
	}
	
	@Test
	public void test001() {
		System.out.println("HI");
	}
	
}

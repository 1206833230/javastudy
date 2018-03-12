package draw;

import javax.swing.JFrame;


public class DrawFrame extends JFrame {

	/**
	 * 
	 */
//	public static void main(String[] agrs) {
//		
//	}
	private static final long serialVersionUID = 1L;

	public DrawFrame() {
		add(new DrawComponent());
		pack();
	}
}

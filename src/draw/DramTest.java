package draw;

import java.awt.EventQueue;

import javax.swing.JFrame;

/**
 * 
 * @author Jun Li
 * 2018年1月31日
 * 下午10:56:08
 */
public class DramTest {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		EventQueue.invokeLater(() ->{
			JFrame frame = new DrawFrame();
			frame.setTitle("DrawTest");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});

	}

}

package draw;

import java.awt.EventQueue;

import javax.swing.JFrame;

/**
 * 
 * @author Jun Li
 * 2018��1��31��
 * ����10:56:08
 */
public class DramTest {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		EventQueue.invokeLater(() ->{
			JFrame frame = new DrawFrame();
			frame.setTitle("DrawTest");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});

	}

}

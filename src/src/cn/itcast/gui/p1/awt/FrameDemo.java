package cn.itcast.gui.p1.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame f = new Frame("my frame");
//		f.setSize(500,400);
//		f.setLocation(500, 500);
		f.setBounds(400,200,500,400);
		
		f.setLayout(new FlowLayout());
		
		Button but = new Button("Ò»¸ö°´Å¥");
		f.add(but);
		f.addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
//				System.out.println("closing"+e);
				System.exit(-1);
			}
			
		});
		but.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		f.setVisible(true);
		System.out.println("over");
	}

}

package cn.itcast.p2.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {
private static final String LINE_SEPARATOR = System.getProperty("line.sepatator");

/*
 * 
 */
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			 fw = new FileWriter("k:\\demo.text");

			fw.write("ancbdd" + LINE_SEPARATOR + "hahhashahs");

			fw.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			if(fw != null)
			try {
				fw.close();
			}catch (IOException e) {
				//code...
				throw new RuntimeException("πÿ±’ ß∞‹");
			}
			
		}
		

	}

}

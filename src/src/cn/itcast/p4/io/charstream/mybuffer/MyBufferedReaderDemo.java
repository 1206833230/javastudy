package cn.itcast.p4.io.charstream.mybuffer;


import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		
//		demo();
		FileReader fr = new FileReader("buf.txt");
		
		MyBufferedReader bufr = new MyBufferedReader(fr);
		
		String line = null;
		
		while((line=bufr.myReadLine())!=null) {
			System.out.println(line);
		}
		
//		
		bufr.myClose();

	}


}

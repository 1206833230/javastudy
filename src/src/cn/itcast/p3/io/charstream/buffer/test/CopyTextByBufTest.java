package cn.itcast.p3.io.charstream.buffer.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextByBufTest {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		
		FileReader fr = new FileReader("buf.txt");
		
		BufferedReader bufr = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("buf_copy.txt");
		BufferedWriter bufw = new BufferedWriter(fw);
		
		String line = null;
		while((line=bufr.readLine())!=null) {
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}
		
//		int ch = 0;
//		while((ch=bufr.read())!=-1) {
//			bufw.write(ch);
//		}
		bufw.close();
		bufr.close();

	}

}

package cn.itcast.p2.io.charstream.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		
		FileWriter fw = new FileWriter("buf.txt");
		
		//为了提高写入的效率，使用了字符流的缓冲区。
		//创建一个字符流写入缓冲区，并和指定要被缓冲的流对象相关联。
		BufferedWriter bufw = new BufferedWriter(fw);
		
		//使用缓冲区的写入方法将据写入缓冲区中。
		bufw.write("skj,"+LINE_SEPARATOR+"sajsndak.");
		
//		bufw.write("XIXIIXIX");
//		bufw.newLine();
//		bufw.write("kasdhakjshd");
		
		for(int x= 1;x<=4; x++) {
			bufw.write("absdkja"+x);
			bufw.newLine();
			bufw.flush();
		}
		//使用缓冲区的刷新方法将数据刷新到目的地中。
//		bufw.flush();
		
		//关闭缓冲区
		bufw.close();//关闭缓冲区的同时其实就是已经关闭流
		
//		fw.write("asdsad");
		
//		fw.close();
	}

}

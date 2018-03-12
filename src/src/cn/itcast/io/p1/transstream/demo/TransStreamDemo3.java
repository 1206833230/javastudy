package cn.itcast.io.p1.transstream.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TransStreamDemo3 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		readText_2();

	}

	public static void readText_2() throws IOException {
		// TODO 自动生成的方法存根
		
		InputStreamReader isr = new InputStreamReader(new FileInputStream("u8_1.txt"),"UTF-8");
		
		char[] buf = new char[10];
		int len = isr.read(buf);
		String str = new String(buf,0,len);
		System.out.println(str);
		
		isr.close();
	}

	public static void readText_1() throws IOException {
		// TODO 自动生成的方法存根
		FileReader fr = new FileReader("gbk_1.txt");
		
		char[] buf = new char[10];
		int len = fr.read(buf);
		String str = new String(buf,0,len);
		System.out.println(str);
		
		fr.close();
	}

	public static void writeText_3() throws IOException {
		// TODO 自动生成的方法存根
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("u8_1.txt"),"UTF-8");
		osw.write("您好");
		
		osw.close();
	}

	@SuppressWarnings("unused")
	private static void writeText_2() throws IOException {
		// TODO 自动生成的方法存根
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk_2.txt"),"GBK");
		osw.write("您好");
		
		osw.close();
	}

	public static void writeText_1() throws IOException {
		// TODO 自动生成的方法存根
		
		FileWriter fw = new FileWriter("gbk_1.txt");
		/*
		 * 这两句代码是等同的。
		 * FileWriter：其实就是转换刘指定了本机 默认码表的体现，而且是个转换流的子类对象，可以方便操作文本文件。
		 *       简单说：操作文件的字节流，本机默认编码表。
		 *       这是按照默认码表来操作文件的便捷类。
		 *  如果操作文本文件需要明确具体的编码，FileWriter就  不行了，必须使用  
		 */
		fw.write("您好");
		
		fw.close();
		
		
	}

}

package cn.itcast.io.p1.transstream.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TransStreamDemo {

	/*
	 * 字节流 与 字符流的转换
	 * 
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		
		//字节流
		
		InputStream in =  System.in;
		
		//字节流读取中文一个中文读两次 两个字节
//		int ch = in.read();
//		System.out.println(ch);
//		int ch1 = in.read();
//		System.out.println(ch1);
		//将字节流转换为字符流，转换流。
		InputStreamReader isr = new InputStreamReader(in);
		
		//转换为字节流一个中文字符读一次
//		int ch = isr.read();
//		System.out.println((char)ch);
//		//字节流
		BufferedReader bufr = new BufferedReader(isr);
		
		OutputStream out = System.out;
	
		OutputStreamWriter osw = new OutputStreamWriter(out);
		
		BufferedWriter bufw = new BufferedWriter(osw);
		
		
		String line = null;
		
		while((line=bufr.readLine())!=null) {
			if("over".equals(line))
				break;
//			System.out.println(line.toUpperCase());
			
//			osw.write(line.toUpperCase()+"\r\n");
//			osw.flush();
			
			bufw.write(line.toUpperCase());
			bufw.newLine();
			bufw.flush();
		}
		

	}

}

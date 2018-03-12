package cn.itcast.io.p1.transstream.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TransStreamDemo2 {

	/*
	 * 字节流 与 字符流的转换
	 * 
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		
		/*
		 * 1.需求：将键盘录入的数据写入到文件当中
		 * 
		 * 2.需求：将一个文本文件内容显示在控制台
		 * 
		 * 3.需求：将一个文本文件中内容复制到另一个文件中
		 */
//		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt")));
//		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("a.txt")));
//		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("b.txt")));
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

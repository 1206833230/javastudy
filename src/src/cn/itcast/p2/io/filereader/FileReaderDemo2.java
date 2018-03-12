package cn.itcast.p2.io.filereader;

import java.io.FileReader;
import java.io.IOException;

//需求读取一个文本文件，将读取到文件输出到控制台
//同上找到了FileReafer
public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
		/*
		 * 使用read(char[])读取文本数据
		 * 
		 * 先创建字符数组。
		 */
		FileReader fr = new FileReader("demo.txt");
		
		char[] buf = new char[1024];
		int len = 0;
		
		while((len=fr.read(buf))!=-1) {
			System.out.println(new String(buf,0,len));
		}
		
//		char[] buf = new char[3];
//		
//		int num = fr.read(buf);
//		System.out.println(num+":"+new String(buf));
		
		fr.close();

	}

}

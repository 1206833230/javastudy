package cn.itcast.p2.io.filereader;

import java.io.FileReader;
import java.io.IOException;

//需求读取一个文本文件，将读取到文件输出到控制台
//同上找到了FileReafer
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		//1.创建读取字符数据对象
		/*
		 * 在创建读取流对象时必须明确被读取的文件存在
		 * 
		 * 用读取流关联一个文件
		 */
		FileReader fr = new FileReader("demo.txt");
		
		//用Reader中的reader方法读取文件
		
		int ch = 0;
		while((ch=fr.read())!=-1) {
			System.out.println((char)ch);
		}
//		int ch = fr.read();
//		System.out.println((char)ch);
//		int ch1 = fr.read();
//		System.out.println(ch1);
		
		fr.close();

	}

}

package cn.itcast.p1.io.charstream.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 需求：作业：将c盘的一个文件复制到d盘。
 * 
 * 思路：
 * 1.读取成盘文件中的数据，
 * 2.将这些数据写入到d盘当中。
 * 
 */
public class CopyTextTest {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		
		//1.读取一个已有文本文件，使用字符读取流和文件相关联。
		FileReader fr = new FileReader("IO流_2.txt");
		
		//2.创建一个目的，用于储存读到的数据。
		FileWriter fw = new FileWriter("copytext_1.txt");
		
		//3.频繁的读写操作
		int ch = 0;
		
		while((ch=fr.read())!=-1) {
			fw.write(ch);
		}
		//4.关闭流
		fw.close();
		fr.close();

	}

}

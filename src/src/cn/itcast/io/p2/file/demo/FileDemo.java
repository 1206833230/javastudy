package cn.itcast.io.p2.file.demo;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		constructorDemo();

	}

	public static void constructorDemo() {
		// TODO 自动生成的方法存根
		//可以将一个已存在的，说着不存在的文件对象或者目录封装成对象file对象
		File file = new File("a.txt");
		
		File f2 = new File("c:\\",".txt");
		
		File f = new File("c:\\");
		
		File f3 = new File(f,".txt");
		
//		File f4 = new File("c:"+System.getProperty("file.separator")+"abc\\a.txt");
		File f4 = new File("c:"+File.separator+"abc"+File.separator+"a.txt");
		System.out.println(f4);
	}

}

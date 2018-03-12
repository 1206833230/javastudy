package cn.itcast.io.p2.file.demo;

import java.io.File;

import cn.itcast.io.p2.filetr.FilterByJava;
import cn.itcast.io.p2.filetr.SuffixFilter;

public class FileListDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		listDemo_3();

	}

	public static void listDemo_3() {
		// TODO 自动生成的方法存根
		File dir = new File("C:\\");
		
		File[] files = dir.listFiles(new SuffixFilter(".java"));
		
		for(File file: files) {
			System.out.println(file);
		}
	}

	public  static void listDemo_2() {
		// TODO 自动生成的方法存根
		File file = new File("C:\\Users\\12068\\eclipse-workspace\\day22e\\src\\cn\\itcast\\io\\p2\\file\\demo");
		
		String[] names = file.list(new FilterByJava());
		
		for(String name: names) {
			System.out.println(name);
		}
	}
	

	public static void listDemo() {
		// TODO 自动生成的方法存根
		File file = new File("C:\\");
		/*
		 * 获取当前目录下的文件以及文件的名称，包含影藏文件
		 * 调用list方法的File对象中封装的必须是目录，
		 * 否则或发生空指针异常。
		 * 如果访问系统级目录也会发生空指针异常。
		 * 若果目怒存在但是没有内容会返回一个数组但是长度为零
		 */
		String[] names = file.list();
		
		for(String name: names) {
			System.out.println(name);
		}
	}

}

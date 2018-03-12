package cn.itcast.io.p2.file.demo;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class FileMethodDemo {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		/*
		 * File对象常见的方法。
		 * 
		 * 1.获取：
		 *    1.1获取文件名称
		 *    1.2获取文件路径
		 *    1.3获取文件大小
		 *    1.4获取文件修改时间。
		 * 2.创建与删除
		 *    boolean 
		 * 3.判断。
		 * 
		 * 4.重命名
		 */
//		getDemo();
//		createAndDeleteDemo();
//		siDemo();
//		renameToDemo();
		
		listRootDemo();
		

	}
	
	
	
	
	public static void listRootDemo() {
		// TODO 自动生成的方法存根
		File file = new File("d:\\");
		
		System.out.println("getFreeSpace:"+file.getFreeSpace());
		System.out.println("getTotalSpace:"+file.getTotalSpace());
		System.out.println("getUsableSpace:"+file.getUsableSpace()/1024/1024);
		
		
//		File[] files = File.listRoots();
//		for(File file: files) {
//			System.out.println(file);
//		}
	}




	public static void renameToDemo() throws IOException {
		// TODO 自动生成的方法存根
		File f1 = new File("0.mp3");
		f1.createNewFile();
		File f2 = new File("1.mp3");
		
		boolean b = f1.renameTo(f2);
		
		System.out.println(b);
	}




	public static void siDemo() {
		// TODO 自动生成的方法存根
		File f = new File("aa.txt");
		
		f.mkdir();
		
//		boolean b = f.exists();
//		
//		System.out.println("b:"+b);
		//最好先判断是否存在
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		
		
	}




	public static void createAndDeleteDemo() throws IOException {
		// TODO 自动生成的方法存根
		//文件的创建与删除
		File dir = new File("abc\\asd\\as\\d\\asd\\asd");
		
//		boolean b = dir.mkdir();
//		System.out.println("b:"+b);
		dir.mkdirs();
//		System.out.println(dir.delete());
		System.out.println(dir.delete());
//		  File file = new File("file.txt");
		  /*
		   * 和输入流不一样，如果存在不创建，不存在则创建。
		   */
//		  boolean b = file.createNewFile();
//		  
//		  System.out.println("b:"+b);
		  
//		  boolean b = file.delete();
//		  System.out.println("b:"+b);
	}




	public static void getDemo() {
		File file = new File("a.txt");
		
		String name = file.getName();
		
		String abspath = file.getAbsolutePath();//绝对路径
		
		String path = file.getPath();
		
		long len = file.length();
		
		long time = file.lastModified();
		
		Date date = new Date(time);
		
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		
		String str_time = dateFormat.format(date);
		System.out.println("parent:"+file.getParent());
		System.out.println("name:"+name);
		System.out.println("abspath:"+abspath);
		System.out.println("path:"+path);
		System.out.println("len:"+len);
		System.out.println("time:"+time);
		System.out.println("str_time:"+str_time);
	}

}

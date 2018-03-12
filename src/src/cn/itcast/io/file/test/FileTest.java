package cn.itcast.io.file.test;

import java.io.File;

/*
 * 需求：对指定目录进行所有内容的列出（包含子目录中的内容）
 * 也可以理解为深度遍历。
 */
public class FileTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		File dir = new File("E:\\sadad");
		
		listAll(dir,0);
	}

	public static void listAll(File dir,int level) {
		// TODO 自动生成的方法存根
		//获取指定目录下当前所有文件夹或者文件对象
		
		System.out.println(getSpace(level)+dir.getAbsolutePath());
		File[] files = dir.listFiles();
		
		for(int x = 0; x<=files.length-1; x++) {
			
			if(files[x].isDirectory()) {
				listAll(files[x],level);
			}
			else {
				System.out.println("file:"+files[x].getName());
			}
		}
		
	}

	private static String getSpace(int level) {
		// TODO 自动生成的方法存根
		StringBuilder sb = new StringBuilder();
		for(int x = 0; x<level; x++) {
			sb.append("1-------");
		}
		return sb.toString();
	}

}

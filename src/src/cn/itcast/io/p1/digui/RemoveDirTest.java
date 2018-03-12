package cn.itcast.io.p1.digui;

import java.io.File;

/*
 * 删除一个带内容的目录。
 * 
 * 原理：必须要从最里面往外删
 */
public class RemoveDirTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File dir = new File("E:\\sadad");
		
		removeDir(dir);

	}

	public static void removeDir(File dir) {
		// TODO 自动生成的方法存根
		
		File[] files = dir.listFiles();
		
		for(File file : files) {
			
			if(file.isDirectory()) {
				removeDir(file);
			}
			else {
				System.out.println(file+":"+file.delete());
			}
		}
		System.out.println(dir+":"+dir.delete());
	}

}

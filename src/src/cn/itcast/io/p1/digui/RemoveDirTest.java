package cn.itcast.io.p1.digui;

import java.io.File;

/*
 * ɾ��һ�������ݵ�Ŀ¼��
 * 
 * ԭ��������Ҫ������������ɾ
 */
public class RemoveDirTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		File dir = new File("E:\\sadad");
		
		removeDir(dir);

	}

	public static void removeDir(File dir) {
		// TODO �Զ����ɵķ������
		
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
package cn.itcast.io.p2.file.demo;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		constructorDemo();

	}

	public static void constructorDemo() {
		// TODO �Զ����ɵķ������
		//���Խ�һ���Ѵ��ڵģ�˵�Ų����ڵ��ļ��������Ŀ¼��װ�ɶ���file����
		File file = new File("a.txt");
		
		File f2 = new File("c:\\",".txt");
		
		File f = new File("c:\\");
		
		File f3 = new File(f,".txt");
		
//		File f4 = new File("c:"+System.getProperty("file.separator")+"abc\\a.txt");
		File f4 = new File("c:"+File.separator+"abc"+File.separator+"a.txt");
		System.out.println(f4);
	}

}

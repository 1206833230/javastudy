package cn.itcast.io.p2.file.demo;

import java.io.File;

import cn.itcast.io.p2.filetr.FilterByJava;
import cn.itcast.io.p2.filetr.SuffixFilter;

public class FileListDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		listDemo_3();

	}

	public static void listDemo_3() {
		// TODO �Զ����ɵķ������
		File dir = new File("C:\\");
		
		File[] files = dir.listFiles(new SuffixFilter(".java"));
		
		for(File file: files) {
			System.out.println(file);
		}
	}

	public  static void listDemo_2() {
		// TODO �Զ����ɵķ������
		File file = new File("C:\\Users\\12068\\eclipse-workspace\\day22e\\src\\cn\\itcast\\io\\p2\\file\\demo");
		
		String[] names = file.list(new FilterByJava());
		
		for(String name: names) {
			System.out.println(name);
		}
	}
	

	public static void listDemo() {
		// TODO �Զ����ɵķ������
		File file = new File("C:\\");
		/*
		 * ��ȡ��ǰĿ¼�µ��ļ��Լ��ļ������ƣ�����Ӱ���ļ�
		 * ����list������File�����з�װ�ı�����Ŀ¼��
		 * ���������ָ���쳣��
		 * �������ϵͳ��Ŀ¼Ҳ�ᷢ����ָ���쳣��
		 * ����Ŀŭ���ڵ���û�����ݻ᷵��һ�����鵫�ǳ���Ϊ��
		 */
		String[] names = file.list();
		
		for(String name: names) {
			System.out.println(name);
		}
	}

}

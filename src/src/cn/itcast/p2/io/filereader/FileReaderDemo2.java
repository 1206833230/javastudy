package cn.itcast.p2.io.filereader;

import java.io.FileReader;
import java.io.IOException;

//�����ȡһ���ı��ļ�������ȡ���ļ����������̨
//ͬ���ҵ���FileReafer
public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
		/*
		 * ʹ��read(char[])��ȡ�ı�����
		 * 
		 * �ȴ����ַ����顣
		 */
		FileReader fr = new FileReader("demo.txt");
		
		char[] buf = new char[1024];
		int len = 0;
		
		while((len=fr.read(buf))!=-1) {
			System.out.println(new String(buf,0,len));
		}
		
//		char[] buf = new char[3];
//		
//		int num = fr.read(buf);
//		System.out.println(num+":"+new String(buf));
		
		fr.close();

	}

}

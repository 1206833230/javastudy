package cn.itcast.p2.io.filereader;

import java.io.FileReader;
import java.io.IOException;

//�����ȡһ���ı��ļ�������ȡ���ļ����������̨
//ͬ���ҵ���FileReafer
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		//1.������ȡ�ַ����ݶ���
		/*
		 * �ڴ�����ȡ������ʱ������ȷ����ȡ���ļ�����
		 * 
		 * �ö�ȡ������һ���ļ�
		 */
		FileReader fr = new FileReader("demo.txt");
		
		//��Reader�е�reader������ȡ�ļ�
		
		int ch = 0;
		while((ch=fr.read())!=-1) {
			System.out.println((char)ch);
		}
//		int ch = fr.read();
//		System.out.println((char)ch);
//		int ch1 = fr.read();
//		System.out.println(ch1);
		
		fr.close();

	}

}

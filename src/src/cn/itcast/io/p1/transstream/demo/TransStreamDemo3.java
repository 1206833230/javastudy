package cn.itcast.io.p1.transstream.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TransStreamDemo3 {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		readText_2();

	}

	public static void readText_2() throws IOException {
		// TODO �Զ����ɵķ������
		
		InputStreamReader isr = new InputStreamReader(new FileInputStream("u8_1.txt"),"UTF-8");
		
		char[] buf = new char[10];
		int len = isr.read(buf);
		String str = new String(buf,0,len);
		System.out.println(str);
		
		isr.close();
	}

	public static void readText_1() throws IOException {
		// TODO �Զ����ɵķ������
		FileReader fr = new FileReader("gbk_1.txt");
		
		char[] buf = new char[10];
		int len = fr.read(buf);
		String str = new String(buf,0,len);
		System.out.println(str);
		
		fr.close();
	}

	public static void writeText_3() throws IOException {
		// TODO �Զ����ɵķ������
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("u8_1.txt"),"UTF-8");
		osw.write("����");
		
		osw.close();
	}

	@SuppressWarnings("unused")
	private static void writeText_2() throws IOException {
		// TODO �Զ����ɵķ������
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk_2.txt"),"GBK");
		osw.write("����");
		
		osw.close();
	}

	public static void writeText_1() throws IOException {
		// TODO �Զ����ɵķ������
		
		FileWriter fw = new FileWriter("gbk_1.txt");
		/*
		 * ����������ǵ�ͬ�ġ�
		 * FileWriter����ʵ����ת����ָ���˱��� Ĭ���������֣������Ǹ�ת������������󣬿��Է�������ı��ļ���
		 *       ��˵�������ļ����ֽ���������Ĭ�ϱ����
		 *       ���ǰ���Ĭ������������ļ��ı���ࡣ
		 *  ��������ı��ļ���Ҫ��ȷ����ı��룬FileWriter��  �����ˣ�����ʹ��  
		 */
		fw.write("����");
		
		fw.close();
		
		
	}

}

package cn.itcast.io.p1.transstream.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TransStreamDemo2 {

	/*
	 * �ֽ��� �� �ַ�����ת��
	 * 
	 */
	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		
		/*
		 * 1.���󣺽�����¼�������д�뵽�ļ�����
		 * 
		 * 2.���󣺽�һ���ı��ļ�������ʾ�ڿ���̨
		 * 
		 * 3.���󣺽�һ���ı��ļ������ݸ��Ƶ���һ���ļ���
		 */
//		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt")));
//		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("a.txt")));
//		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("b.txt")));
		String line = null;
		
		
		while((line=bufr.readLine())!=null) {
			if("over".equals(line))
				break;
//			System.out.println(line.toUpperCase());
			
//			osw.write(line.toUpperCase()+"\r\n");
//			osw.flush();
			
			bufw.write(line.toUpperCase());
			bufw.newLine();
			bufw.flush();
		}
		

	}

}

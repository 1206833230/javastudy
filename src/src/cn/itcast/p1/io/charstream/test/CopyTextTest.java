package cn.itcast.p1.io.charstream.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ������ҵ����c�̵�һ���ļ����Ƶ�d�̡�
 * 
 * ˼·��
 * 1.��ȡ�����ļ��е����ݣ�
 * 2.����Щ����д�뵽d�̵��С�
 * 
 */
public class CopyTextTest {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		
		//1.��ȡһ�������ı��ļ���ʹ���ַ���ȡ�����ļ��������
		FileReader fr = new FileReader("IO��_2.txt");
		
		//2.����һ��Ŀ�ģ����ڴ�����������ݡ�
		FileWriter fw = new FileWriter("copytext_1.txt");
		
		//3.Ƶ���Ķ�д����
		int ch = 0;
		
		while((ch=fr.read())!=-1) {
			fw.write(ch);
		}
		//4.�ر���
		fw.close();
		fr.close();

	}

}

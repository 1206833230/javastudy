package cn.itcast.io.p4.print.demo;

import java.io.FileNotFoundException;
import java.io.PrintStream;
/*
 * ��ӡ��
 */
public class PrintDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO �Զ����ɵķ������

		/*
		 * PrintStream:
		 * 1.�ṩ�˴�ӡ�������ԶԶ�����������ֵ���д�ӡ�����������ݵı�ʾ��ʽ��
		 * 2.������IOException
		 * 
		 * ���캯����������������ֵ��
		 * 1.�ַ���·����
		 * 2.File����
		 * 3.�ֽ��������
		 */
		
		PrintStream out = new PrintStream("print1.txt");
		
//		int by = read();
//		
//		write(by);
		
//		out.write(97);
		
		//��97�ȱ���ַ�������ԭ�������ݴ�ӡ��Ŀ�ĵء�
		out.print(97);
		
		out.close();
	}

}

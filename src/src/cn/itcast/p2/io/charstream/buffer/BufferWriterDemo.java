package cn.itcast.p2.io.charstream.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		
		FileWriter fw = new FileWriter("buf.txt");
		
		//Ϊ�����д���Ч�ʣ�ʹ�����ַ����Ļ�������
		//����һ���ַ���д�뻺����������ָ��Ҫ��������������������
		BufferedWriter bufw = new BufferedWriter(fw);
		
		//ʹ�û�������д�뷽������д�뻺�����С�
		bufw.write("skj,"+LINE_SEPARATOR+"sajsndak.");
		
//		bufw.write("XIXIIXIX");
//		bufw.newLine();
//		bufw.write("kasdhakjshd");
		
		for(int x= 1;x<=4; x++) {
			bufw.write("absdkja"+x);
			bufw.newLine();
			bufw.flush();
		}
		//ʹ�û�������ˢ�·���������ˢ�µ�Ŀ�ĵ��С�
//		bufw.flush();
		
		//�رջ�����
		bufw.close();//�رջ�������ͬʱ��ʵ�����Ѿ��ر���
		
//		fw.write("asdsad");
		
//		fw.close();
	}

}

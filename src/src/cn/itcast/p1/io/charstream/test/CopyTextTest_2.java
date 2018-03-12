package cn.itcast.p1.io.charstream.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest_2 {

	private static final int BUFFER_SIZE = 1024;

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("IO��_2.txt");
			fw = new FileWriter("copytest_2.txt");
			
			//��������ʱ���������ڻ����ȡ�����ַ���
			char[]  buf = new char[BUFFER_SIZE];
			
			//����һ��������¼��ȡ�����ַ���������ʵ������������װ���ַ�������
			
			int len = 0;
			
			while((len=fr.read(buf))!=-1) {
				fw.write(buf,0,len);
			}
			
		}catch(Exception e) {
			
		}finally {
			if(fw!=null)
				try {
					fw.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
//					e.printStackTrace();
					throw new RuntimeException("��дʧ��");
				}
			if(fr!=null)
				try {
					fr.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
		}

	}

}

package cn.itcast.p2.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
private static final String LINE_SEPARATOR = System.getProperty("line.sepatator");

/*
 * 
 */
	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		//����һ���������ļ���б���ַ������ַ�����������
		/*
		 * ��Ȼ�����ļ���д���ļ����ݣ���ô�ڴ�������ʱ���ͱ�����ȷ���ļ������ڴ洢���ݵ�Ŀ�ĵأ���
		 * 
		 * ����ļ����ڣ��Ḳ��
		 * ����ļ������ڣ�����Զ�����
		 * 
		 * ������캯���м���true������ʵ���ļ���д
		 */
		FileWriter fw = new FileWriter("demo.txt",true);
		
		//����writer����Writer��String)������д�����ݡ�
		/*
		 * ��ʵ����д����ʱ������
		 */
		fw.write("ancbdd"+LINE_SEPARATOR+"hahhashahs");
		
		/*
		 * ����ˢ�£�������ֱ��д��Ŀ�ĵ���
		 */
		
//		fw.flush();
		
		/*
		 * �ر������ر���Դ.�ڹر�ǰ�����flushˢ����Դ�����滺������Դ��
		 */
		
		fw.close();
		

	}

}

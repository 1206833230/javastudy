package cn.itcast.p1.otherapi.system;

import java.io.IOException;

public class RuntimeDemo {
	 /**
	  * 
	  * @param args
	  * @throws IOException
	 * @throws InterruptedException 
	  */

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO �Զ����ɵķ������
		/*
		 * Runtime:û�й��췽��ժҪ��˵�����಻���Դ�������
		 * �ַ��ֻ��зɾ�̬������˵������Ӧ���ṩ��̬�ķ��ظ������ķ�����
		 * ����ֻ��һ����˵��Runtime��ʹ���˵������ģʽ��
		 */

		Runtime r = Runtime.getRuntime();
		
		//execute: ִ�С�xxx.exe
		
		Process p = r.exec("notepad.exe ");
		Thread.sleep(5000);
		p.destroy();
	}

}

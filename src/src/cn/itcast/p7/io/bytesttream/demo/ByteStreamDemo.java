package cn.itcast.p7.io.bytesttream.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������

		demo_write();
		demo_read();
		
	}

	private static void demo_read() throws IOException {
		// TODO �Զ����ɵķ������
		//1.����һ����ȡ�����󣬺�ָ���ļ�������
		FileInputStream fis = new FileInputStream("bytedemo.txt");
		
		byte[] buf = new byte[fis.available()];
		
		fis.read(buf);
		
		System.out.println(new String(buf));
		
//		System.out.println(fis.available());
		
//		byte[] buf = new byte[1024];
//		int  len = 0;
//		
//		while((len=fis.read(buf))!=-1) {
//			System.out.println(new String(buf,0,len));
//		}
		
//		int ch = fis.read();
//		
//		System.out.println(ch);
//		
//		int  ch1 = 0;
//		while(( ch1=fis.read())!=-1) {
//			System.out.println( ch1);
//		}
		
		fis.close();
	}

	public  static void demo_write() throws IOException {
		// TODO �Զ����ɵķ������
		//1.�����ֽ�������������ڲ����ļ���
		
		FileOutputStream fos = new FileOutputStream("bytedemo.txt");
		
		//2.д���ݣ�ֱ��д��
		fos.write("ajsgajhsgd".getBytes());
		
//		fos.flush();//û��ʵ������
		
		fos.close();//�ر���Դ�Ķ���Ҫ���
	}

}



package cn.itcast.io.p7.encode;

import java.io.IOException;

public class EncodeDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * �ַ���-->�ַ���������
		 * �ֽ�����-->�ַ��������롣
		 * 
		 * ���ã�GBK -60 -6 -70 -61
		 * ���ã�UTF����8 -26 -126 -88 -27 -91 -67
		 * 
		 * ��������ˣ��ⲻ������
		 * �������ˣ�����ˣ��п����оȡ�
		 */
		
		String str = "����";
		
		byte[] buf = str.getBytes("GBK");
		
//		String s1 = new String(buf,"iso8859-1");
		String s1 = new String(buf,"UTF-8");
		
		System.out.println("s1="+s1);
		
//		byte[] buf2 = s1.getBytes("iso8859-1");
		byte[] buf2 = s1.getBytes("UTF-8");
		
		
		String s2 = new String(buf2,"GBK");
		
		System.out.println("s2="+s2);
//		//���룺
//		byte[] buf = str.getBytes("UTF-8");
//		
////		printBytes(buf);
//		
//		//���룺
//		String s1 = new String(buf,"UTF-8");
//		System.out.println("s1="+s1);
	}

	@SuppressWarnings("unused")
	private static void printBytes(byte[] buf) {
		// TODO Auto-generated method stub
		for(byte b : buf) {
			System.out.print(b);
		}
	}

}

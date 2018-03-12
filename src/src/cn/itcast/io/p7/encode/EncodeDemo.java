package cn.itcast.io.p7.encode;

import java.io.IOException;

public class EncodeDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * 字符串-->字符串：编码
		 * 字节数组-->字符串：解码。
		 * 
		 * 您好：GBK -60 -6 -70 -61
		 * 您好：UTF——8 -26 -126 -88 -27 -91 -67
		 * 
		 * 如果你编错了，解不出来。
		 * 如果编对了，解错了，有可能有救。
		 */
		
		String str = "您好";
		
		byte[] buf = str.getBytes("GBK");
		
//		String s1 = new String(buf,"iso8859-1");
		String s1 = new String(buf,"UTF-8");
		
		System.out.println("s1="+s1);
		
//		byte[] buf2 = s1.getBytes("iso8859-1");
		byte[] buf2 = s1.getBytes("UTF-8");
		
		
		String s2 = new String(buf2,"GBK");
		
		System.out.println("s2="+s2);
//		//编码：
//		byte[] buf = str.getBytes("UTF-8");
//		
////		printBytes(buf);
//		
//		//解码：
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

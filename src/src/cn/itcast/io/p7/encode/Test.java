package cn.itcast.io.p7.encode;

import java.io.UnsupportedEncodingException;

public class Test {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
		String str = "ab����cdлл";
//		str = "ab�u�ucd�Ʒ�";
		int len = str.getBytes("GBk").length;
		
		for(int x = 0; x<len; x++) {
			System.out.println("��ȡ"+(x+1)+"���ֽڽ���ǣ�"+cutStringByU8Byte(str,x+1));
		}
		
//		str = "�u";
//		
//		byte[] buf = str.getBytes("GBK");
//		for(byte b : buf) {
//			System.out.println(b);
//		}

		/*
		 * ��JAVA�У�
		 */
	}
	
	public static String cutStringByU8Byte(String str, int len) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
       byte[] buf = str.getBytes("UTF-8");
		
		int count = 0;
		
		for(int x=len-1; x>=0; x--) {
			if(buf[x]<0)
				count++;
			else
				break;
		}
		if(count%2==0)
			return new String(buf,0,len,"UTF-8");
		else if(count%3==1)
			return new String(buf,0,len-1,"UTF-8");
		else
			return new String(buf,0,len-2,"UTF-8");
		
	}

	public static String cutStringByByte(String str,int len) throws UnsupportedEncodingException {
		
		byte[] buf = str.getBytes("GBK");
		
		int count = 0;
		
		for(int x=len-1; x>=0; x--) {
			if(buf[x]<0)
				count++;
			else
				break;
		}
		if(count%2==0)
			return new String(buf,0,len,"GBK");
		else
			return new String(buf,0,len-1,"GBk");
	}

}

package cn.itcast.io.p7.encode;

import java.io.UnsupportedEncodingException;

public class LianTong {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		String str = "ÁªÍ¨";
		/*
		11000001
		10101010
		11001101
		10101000
		*/
		byte[] buf = str.getBytes("GBK");
		
		for(byte b : buf) {
			System.out.println(Integer.toBinaryString(b&255));
		}
	}

}

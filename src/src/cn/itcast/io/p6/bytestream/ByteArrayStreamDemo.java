package cn.itcast.io.p6.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ByteArrayInputStream bis = new ByteArrayInputStream("dasdas".getBytes());
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		int ch = 0;
		
		while((ch=bis.read())!=-1) {
			bos.write(ch);
		}
		
		System.out.println(bos.toString());
		bis.close();
		bos.close();
	}

}

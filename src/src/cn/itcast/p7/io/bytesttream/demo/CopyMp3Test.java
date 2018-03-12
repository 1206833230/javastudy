package cn.itcast.p7.io.bytesttream.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyMp3Test {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		
		copy_1();
		

	}

	public static void copy_1() throws IOException {
		// TODO 自动生成的方法存根
		FileInputStream fis = new FileInputStream("‪C:\\0.mp3");
		BufferedInputStream bufis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("C:\\1.mp3");
		BufferedOutputStream bufos = new BufferedOutputStream(fos);
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		while((len=bufis.read())!=-1) {
			bufos.write(buf,0,len);
			bufos.flush(); 
		}
		
		fos.close();
		fis.close();
	}

}

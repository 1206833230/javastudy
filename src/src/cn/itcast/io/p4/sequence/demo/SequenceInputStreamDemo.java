package cn.itcast.io.p4.sequence.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class SequenceInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		/*
		 * 将几个文件合并到一个文件中
		 */
		/*Vector<FileInputStream> v = new Vector<FileInputStream>();
		
		v.add(new FileInputStream("out.txt"));
		v.add(new FileInputStream("print.txt"));
		v.add(new FileInputStream("print1.txt"));*/
		
		ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
		
//		for(int x = 1; x<3; x++) {
		al.add(new FileInputStream("out.txt"));
		al.add(new FileInputStream("print.txt"));
		al.add(new FileInputStream("print1.txt"));
//		}
		
//		final Iterator<FileInputStream> it = al.iterator();
		
		Enumeration<FileInputStream> en = Collections.enumeration(al);
//		Enumeration<FileInputStream> en = new Enumeration<FileInputStream>(){
//
//			@Override
//			public boolean hasMoreElements() {
//				// TODO 自动生成的方法存根
//				return it.hasNext();
//			}
//
//			@Override
//			public FileInputStream nextElement() {
//				// TODO 自动生成的方法存根
//				return it.next();
//			}
//			
//		};
		
		SequenceInputStream sis = new SequenceInputStream(en);
		
		FileOutputStream fos = new FileOutputStream("5.txt");
		
		byte[] buf = new byte[1024];
		
		int len = 0 ;
		while((len=sis.read(buf))!=-1) {
			fos.write(buf,0,len);
		}
		
		fos.close();
		sis.close();

	}

}

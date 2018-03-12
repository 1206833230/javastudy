package cn.itcast.io.p3.randomfile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * RandomAccessFile:
		 * 一看这个类名，纠结。不是IO体系的子类。
		 * 
		 * 特点：
		 * 1.对象即能读，又能写。
		 * 2.该对象内部维护一个byte大型数组。并通过指针可以操作数组中的元素。
		 * 3.可以通过getFilePointer方法获取指针位置，和通过seek方法设置指针的位置。
		 * 4.其实该对象就是讲字节输入流和输出流进行封装。
		 * 5.该对象对得源和目的只能是文件。通过构造函数就可以看出。
		 */
//		writeFile();
//		readFile();
		randomWrite();
		
	}
	public static void randomWrite() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("ranacc.txt","rw");
		
		//往指定位置写入数据。
		raf.seek(3*8);
		raf.write("赵六".getBytes());
		
		raf.writeInt(102);
		
		raf.close();
	}
	public static void readFile() throws IOException {
		// TODO Auto-generated method stub
		
		RandomAccessFile raf = new RandomAccessFile("ranacc.txt","r");
		//通过seek设置指针的位置。
		raf.seek(1*8);//实现随机的读取。只要指定指针的位置即可。
		
		byte[] buf = new byte[4];
		
		raf.read(buf);
		
		String name = new String(buf);
		
		int age = raf.readInt();
		
		System.out.println("name="+name);
		System.out.println("age="+age);
		
		System.out.println("pos"+raf.getFilePointer());
		raf.close();
				
	
				
		
	}
	//使用RandomAccessFile对象写入一些人员信息，比如姓名和年龄。

	public static void writeFile() throws IOException {
		// TODO Auto-generated method stub
		
		RandomAccessFile raf = new RandomAccessFile("ranacc.txt","rw");
		
		raf.write("张三".getBytes());
		
		raf.writeInt(97);
		
        raf.write("张三1".getBytes());
		
		raf.writeInt(98);
		
		raf.close();
	}
	

}

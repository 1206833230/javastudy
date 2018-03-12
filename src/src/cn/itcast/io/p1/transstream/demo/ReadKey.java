package cn.itcast.io.p1.transstream.demo;

import java.io.IOException;
import java.io.InputStream;

/*
 * 读取文件键盘录入的数据，并打印在控制台上。
 * 
 * 键盘本身就是一个标准的输入设备。
 * 
 * 对于java而言，对于这种输入设备都对应的对应。
 * 
 * 
 */
public class ReadKey {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		
		readKey_2();
		
//		System.out.println((int)'\r');
//		System.out.println((int)'\n');
		

	}

	public static void readKey_2() throws IOException {
		// TODO 自动生成的方法存根
		/*
		 * 获取用户键盘输入的数据，
		 * 并转化为大写显示在控制台
		 * 如果用户输入的Over，结束输入。
		 * 
		 * 思路：
		 * 1.因为键盘录入只读一个字节，要判断是否是over，需要将字符串
		 */
		
		//1.创建容器
		StringBuilder sb = new StringBuilder();
		
		//获取键盘读取流
		
		InputStream in = System.in;
		
		//定义变量记录读取到的字节，并循环获取。
		
		int ch = 0;
		
		while((ch=in.read())!=-1) {
			//在储存之前需要判断是否是换行标记，因为换行标记不存储
			//将读取到的字节存储StringBuilder中
			
			if(ch=='\r')
				continue;
			if(ch=='\n') {
				String temp = sb.toString();
				if("over".equals(temp))
					break;
				System.out.println(temp.toUpperCase());
				sb.delete(0, sb.length());
			}
			else
				sb.append((char)ch);
//			System.out.println(ch);
			
			
		}
		
	}

	public static void readKey() throws IOException {
		// TODO 自动生成的方法存根
		
		InputStream in = System.in;
		
		int ch = in.read();//阻塞式方法
		
		System.out.println(ch);
		
        int ch2 = in.read();//阻塞式方法
		
		System.out.println(ch2);
		
        int ch3 = in.read();//阻塞式方法
		
		System.out.println(ch3);
		
		in.close();
		
//		InputStream in2 = System.in;
//		
//        int ch4 = in.read();//阻塞式方法
//		
//		System.out.println(ch4);
		
	}

}

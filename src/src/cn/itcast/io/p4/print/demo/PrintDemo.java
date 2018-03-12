package cn.itcast.io.p4.print.demo;

import java.io.FileNotFoundException;
import java.io.PrintStream;
/*
 * 打印流
 */
public class PrintDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO 自动生成的方法存根

		/*
		 * PrintStream:
		 * 1.提供了打印方法可以对多种数据类型值进行打印。并保存数据的表示形式。
		 * 2.它不抛IOException
		 * 
		 * 构造函数，接收三种类型值。
		 * 1.字符串路径。
		 * 2.File对象。
		 * 3.字节输出流。
		 */
		
		PrintStream out = new PrintStream("print1.txt");
		
//		int by = read();
//		
//		write(by);
		
//		out.write(97);
		
		//将97先变成字符串保持原样将数据打印到目的地。
		out.print(97);
		
		out.close();
	}

}

package cn.itcast.p2.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
private static final String LINE_SEPARATOR = System.getProperty("line.sepatator");

/*
 * 
 */
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		//创建一个可以往文件中斜土字符数据字符输入流对象
		/*
		 * 既然是往文件中写入文件数据，那么在创建对象时，就必须明确该文件（用于存储数据的目的地）。
		 * 
		 * 如果文件处在，会覆盖
		 * 如果文件不存在，则会自动创建
		 * 
		 * 如果构造函数中加入true，可以实现文件续写
		 */
		FileWriter fw = new FileWriter("demo.txt",true);
		
		//调用writer对象Writer（String)方法，写入数据。
		/*
		 * 其实数据写入临时缓冲区
		 */
		fw.write("ancbdd"+LINE_SEPARATOR+"hahhashahs");
		
		/*
		 * 进行刷新，将数据直接写到目的地中
		 */
		
//		fw.flush();
		
		/*
		 * 关闭流，关闭资源.在关闭前会调用flush刷新资源并保存缓冲区资源。
		 */
		
		fw.close();
		

	}

}

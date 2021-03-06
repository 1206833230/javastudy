package cn.itcast.io.p1.splitfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 文件切割
 */
public class SplitFileDemo {

	private static final int SIZE = 1024*1024;

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根

		File file = new File("C:\\Users\\12068\\eclipse-workspace\\day24e\\src\\dir\\1.bmp");
		
		splitFile_2(file);
	}
	
	private static void splitFile_2(File file) throws IOException {
		// TODO 自动生成的方法存根
		//读取流关联源文件。
				FileInputStream fis = new FileInputStream(file);
				
				//定义一个1M的缓冲区。
				byte[] buf = new byte[SIZE];
				
				//创建一个目的
				
				FileOutputStream fos = null;
				
				@SuppressWarnings("unused")
				int len = 0;
				int count = 1;
				
				/*
				 *切割文件时，必须记录被切割文件的名称，以及切割出来碎片文件的歌数，以方便合并。
				 *这个信息为了简单描述，使用键值对的方式。用到Properties对象。
				 */
				Properties prop = new Properties();
				
				
				
				File dir = new File("C:\\partfiles");
				if(!dir.exists())
					dir.mkdirs();
				
				while((len=fis.read(buf))!=-1) {
					
					fos = new FileOutputStream((count++)+".part");
					fos.close();
				}
				//将被切割文件信息保存到prop集合中。
				prop.setProperty("partcunt", count+"");
				prop.setProperty("filename", file.getName());
				
				fos = new FileOutputStream(new File(dir,count+".properties"));
				
				//将prop集合中的数据存储到文件中。
				prop.store(fos,"Save file info");
				
				fis.close();
				fos.close();
	}

	public static void splitFile(File file) throws IOException {
		
		//读取流关联源文件。
		FileInputStream fis = new FileInputStream(file);
		
		//定义一个1M的缓冲区。
		byte[] buf = new byte[SIZE];
		
		//创建一个目的
		
		FileOutputStream fos = null;
		
		@SuppressWarnings("unused")
		int len = 0;
		int count = 1;
		
		File dir = new File("C:\\partfiles");
		if(!dir.exists())
			dir.mkdirs();
		
		while((len=fis.read(buf))!=-1) {
			
			fos = new FileOutputStream((count++)+".part");
		}
		
		fis.close();
		fos.close();
	}

}

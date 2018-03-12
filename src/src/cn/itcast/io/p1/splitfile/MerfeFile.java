package cn.itcast.io.p1.splitfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;

/*
 * 合并文件
 */
public class MerfeFile {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		
		File dir = new File("C:\\Users\\12068\\eclipse-workspace\\day24e\\src\\dir");
		
		mergeFile_2(dir);

	}
	public static void mergeFile_2(File dir) throws IOException {
		// TODO 自动生成的方法存根
		
		File[] files = dir.listFiles(new SuffixFilter(".properties"));
		
		if(files.length!=1) 
			throw new RuntimeException(dir+",该目录下没有properties扩展名的文件或者不唯一");
		//记录配置文件对象
		File confile = files[0];
		
		//获取该文件中的信息
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream(confile);
			
		prop.load(fis);
		

		String filename = prop.getProperty("filename");
		
		int count = Integer.parseInt(prop.getProperty("partcount"));
		
		//获取该目录下的所有碎片文件。
		
		File[] partFiles = dir.listFiles(new SuffixFilter(".part"));
		
		if(partFiles.length!=(count-1)){
			throw new RuntimeException(" 碎片文件不符合要求，个数不对！应该"+count+"个");
		}
        ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
		
		for(int x = 1; x <= 3; x++) {
			al.add(new FileInputStream(partFiles[x]));
		}
		
		Enumeration<FileInputStream> en = Collections.enumeration(al);
		SequenceInputStream sis = new SequenceInputStream(en);
		
		FileOutputStream fos = new FileOutputStream(new File(dir,filename));
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		while((len=sis.read(buf))!=-1) {
			fos.write(buf, 0, len);
		}
		
		fos.close();
		sis.close();
		
		
		
		
	}
	public static void mergeFile(File dir) throws IOException {
		
		ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
		
		for(int x = 1; x <= 3; x++) {
			al.add(new FileInputStream(new File(dir,x+".part")));
		}
		Enumeration<FileInputStream> en = Collections.enumeration(al);
		SequenceInputStream sis = new SequenceInputStream(en);
		
		FileOutputStream fos = new FileOutputStream(new File(dir,"1.bmp"));
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		while((len=sis.read(buf))!=-1) {
			fos.write(buf, 0, len);
		}
		
		fos.close();
		sis.close();
	}

}

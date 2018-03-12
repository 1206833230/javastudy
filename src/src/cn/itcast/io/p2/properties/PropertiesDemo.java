package cn.itcast.io.p2.properties;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * 处理XML文件
 */
public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		/*
		 * Map
		 *    1---Hashtable
		 *       1---Properties
		 *       
		 * Properties集合：
		 * 1.该集合键和值都是字符串类型。
		 * 2.集合中数据可以保存到流中，或者从源中获取。
		 * 
		 * 通常该集合用于操作以键值对形式存在的配置文件。
		 */
//		mothodDemo_4();
//		myLoad();
		test();

	}
	
	//对已有的配置文件中的信息进行修改。
	/*
	 * 读取这个文件
	 * 并将这个文件中的键值数据存储到集合中。
	 * 在通过集合对数据进行修改。
	 * 在通过流将修改后的数据储存到文件中。
	 * 
	 */
	public static void test() throws IOException {
		//读取一个文件
		File file = new File("info.txt");
		
		if(!file.exists()) {
			file.createNewFile();
			
		}
		FileReader fr = new FileReader(file);
		
		//创建集合存储配置信息
		Properties prop = new Properties();
		
		//将流中的信息储存到集合中。
		prop.load(fr);
		
		prop.setProperty("zhangsan0", "19");
		
		FileWriter fw = new FileWriter(file);
		
		prop.store(fw, "");
		
		prop.list(System.out);
		
		fw.close();
		
		fr.close();
	}
	//模拟一下load方法
	public static void myLoad() throws IOException {
		
		Properties prop = new Properties();
		
		BufferedReader bufr = new BufferedReader(new FileReader("info.txt"));
		
		String line = null;
		
		while((line=bufr.readLine())!=null) {
			if(line.startsWith("#"))
				continue;
			
			String[] arr = line.split("=");
			
//			System.out.println(arr[0]+"::"+arr[1]);
			
			prop.setProperty(arr[0], arr[1]);
		}
		bufr.close();
	}
	public static void mothodDemo_4() throws IOException {
		// TODO 自动生成的方法存根
		Properties prop = new Properties();
		//集合中的数据来自于一个文件。
		//注意：必须要保证该文件中的数据是键值对。
		//需要使用到读取流。
		FileInputStream fis = new FileInputStream("info.txt");
		
		//使用load方法。
		prop.load(fis);
		
		prop.list(System.out);
	}
	public static void mothodDemo_3() throws IOException {
		// TODO 自动生成的方法存根
		Properties prop = new Properties();
		
		//储存元素
		prop.setProperty("zhangsan0","10");
		prop.setProperty("zhangsan1","11");
		prop.setProperty("zhangsan2","12");
		prop.setProperty("zhangsan3","13");
		
		//想要将这些集合中的字符串键值信息持久化存储到文件中。
		//需要关联输出流。
		
		FileOutputStream fos = new FileOutputStream("info.txt");
		
		//将这些集合中的数据存储到文件中，使用Store方法。
		prop.store(fos, "info");
		
		fos.close();
	}
	/*
	 * 演示properties集合和流对象相结合的
	 */
	public  static void mothodDemo_2() {
		//创建一个Properties集合。
		
				Properties prop = new Properties();
				
				//储存元素
				prop.setProperty("zhangsan0","10");
				prop.setProperty("zhangsan1","11");
				prop.setProperty("zhangsan2","12");
				prop.setProperty("zhangsan3","13");
//				prop = System.getProperties();//獲取系統信息
				prop.list(System.out);
	}
	/*
	 * Properties集合的存和取
	 */
	public static void propertiesDemo() {
		//创建一个Properties集合。
		
		Properties prop = new Properties();
		
		//储存元素
		prop.setProperty("zhangsan0","10");
		prop.setProperty("zhangsan1","11");
		prop.setProperty("zhangsan2","12");
		prop.setProperty("zhangsan3","13");
		
		//修改元素
		
		prop.setProperty("zhangsan2","14");
		
		//取出所有元素
		Set<String> names = prop.stringPropertyNames();
		
		for(String name : names) {
			String value = prop.getProperty(name);
			System.out.println(name+":"+value);
		}
		
	}

}

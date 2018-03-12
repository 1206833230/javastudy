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
 * ����XML�ļ�
 */
public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		/*
		 * Map
		 *    1---Hashtable
		 *       1---Properties
		 *       
		 * Properties���ϣ�
		 * 1.�ü��ϼ���ֵ�����ַ������͡�
		 * 2.���������ݿ��Ա��浽���У����ߴ�Դ�л�ȡ��
		 * 
		 * ͨ���ü������ڲ����Լ�ֵ����ʽ���ڵ������ļ���
		 */
//		mothodDemo_4();
//		myLoad();
		test();

	}
	
	//�����е������ļ��е���Ϣ�����޸ġ�
	/*
	 * ��ȡ����ļ�
	 * ��������ļ��еļ�ֵ���ݴ洢�������С�
	 * ��ͨ�����϶����ݽ����޸ġ�
	 * ��ͨ�������޸ĺ�����ݴ��浽�ļ��С�
	 * 
	 */
	public static void test() throws IOException {
		//��ȡһ���ļ�
		File file = new File("info.txt");
		
		if(!file.exists()) {
			file.createNewFile();
			
		}
		FileReader fr = new FileReader(file);
		
		//�������ϴ洢������Ϣ
		Properties prop = new Properties();
		
		//�����е���Ϣ���浽�����С�
		prop.load(fr);
		
		prop.setProperty("zhangsan0", "19");
		
		FileWriter fw = new FileWriter(file);
		
		prop.store(fw, "");
		
		prop.list(System.out);
		
		fw.close();
		
		fr.close();
	}
	//ģ��һ��load����
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
		// TODO �Զ����ɵķ������
		Properties prop = new Properties();
		//�����е�����������һ���ļ���
		//ע�⣺����Ҫ��֤���ļ��е������Ǽ�ֵ�ԡ�
		//��Ҫʹ�õ���ȡ����
		FileInputStream fis = new FileInputStream("info.txt");
		
		//ʹ��load������
		prop.load(fis);
		
		prop.list(System.out);
	}
	public static void mothodDemo_3() throws IOException {
		// TODO �Զ����ɵķ������
		Properties prop = new Properties();
		
		//����Ԫ��
		prop.setProperty("zhangsan0","10");
		prop.setProperty("zhangsan1","11");
		prop.setProperty("zhangsan2","12");
		prop.setProperty("zhangsan3","13");
		
		//��Ҫ����Щ�����е��ַ�����ֵ��Ϣ�־û��洢���ļ��С�
		//��Ҫ�����������
		
		FileOutputStream fos = new FileOutputStream("info.txt");
		
		//����Щ�����е����ݴ洢���ļ��У�ʹ��Store������
		prop.store(fos, "info");
		
		fos.close();
	}
	/*
	 * ��ʾproperties���Ϻ����������ϵ�
	 */
	public  static void mothodDemo_2() {
		//����һ��Properties���ϡ�
		
				Properties prop = new Properties();
				
				//����Ԫ��
				prop.setProperty("zhangsan0","10");
				prop.setProperty("zhangsan1","11");
				prop.setProperty("zhangsan2","12");
				prop.setProperty("zhangsan3","13");
//				prop = System.getProperties();//�@ȡϵ�y��Ϣ
				prop.list(System.out);
	}
	/*
	 * Properties���ϵĴ��ȡ
	 */
	public static void propertiesDemo() {
		//����һ��Properties���ϡ�
		
		Properties prop = new Properties();
		
		//����Ԫ��
		prop.setProperty("zhangsan0","10");
		prop.setProperty("zhangsan1","11");
		prop.setProperty("zhangsan2","12");
		prop.setProperty("zhangsan3","13");
		
		//�޸�Ԫ��
		
		prop.setProperty("zhangsan2","14");
		
		//ȡ������Ԫ��
		Set<String> names = prop.stringPropertyNames();
		
		for(String name : names) {
			String value = prop.getProperty(name);
			System.out.println(name+":"+value);
		}
		
	}

}

package cn.itcast.io.p2.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * ���幦�ܣ���ȡһ��Ӧ�ó�������д��������������Σ�����ʹ�ô����ѵ�����ע�����ʾ������Ҫ�����г���
 * 
 * ˼·��
 *1. Ӧ���м�������
 *ÿ�γ�����������Ҫ����һ�Σ�������ԭ�еĴ����Ͻ��м�����
 *2.����������һ����������������ʱ���м��������������봢�����ڴ沢�������㡣
 *���ǳ���һ����������������ʧ�ˣ���ô�������б����³�ʼ���ˡ�
 *�� ������Ҫ�������ͬһ��Ӧ�ó���ʹ�õ���ͬһ����������
 *����Ǽ��������������ڱ䳤�����ڴ洢�浽Ӳ���ļ��С�
 *
 *3.���ʹ������������أ�
 *���� ��������ʱ��Ӧ���ȶ�ȡ������ڼ�¼��������Ϣ�������ļ���
 *��ȡ��һ�μ�����������������ʹ�ô����жϡ�
 *��Σ��Ըô�����������������������Ĵ������´洢�������ļ��С�
 *
 *4.�ļ����ǲ���ȷ�����ݵĺ��壬����Ϣ����ν��д��沢���֡�
 *  ֱ�Ӵ洢����ֵ���ԣ����������־ͷǳ���Ҫ��
 *  ���ֺ�ֵ��Ӧ������ʹ�ü�ֵ�ԡ�
 *  
 *  ����ӳ���ϵmap���ϸ㶨������Ҫ��ȡӲ���ϵ����ݣ�����map+IO = Properties.
 *
 * 
 * 
 * 
 * 
 * 
 */
public class PropertiesTest {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		
		getAppCount();

	}
	
	public static void getAppCount() throws IOException {
		//�������ļ���װ��File����
		
		File confile = new File("count.properties");
		
		if(!confile.exists()) {
			confile.createNewFile();
		}
		
		FileInputStream fis = new FileInputStream(confile);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		//�Ӽ�����ͨ������ȡ������
		String value = prop.getProperty("time");
		
		//�������������¼��ȡ���Ĵ�����
		int count = 0;
		if(value != null) {
			count = Integer.parseInt(value);
			if(count>=5) {
//				System.out.println("ʹ�ô����ѵ�����ע�ᣬ��Ǯ��");
//				return;
				throw new RuntimeException("ʹ�ô����ѵ�����ע�ᣬ��Ǯ��");
			}
		}
		count++;
		
		//���ı��Ĵ������´��浽�����С�
		prop.setProperty("time", count+"");
		
		FileOutputStream fos = new FileOutputStream(confile);
		
		prop.store(fos, "");
		
		fos.close();
		fis.close();
	}

}

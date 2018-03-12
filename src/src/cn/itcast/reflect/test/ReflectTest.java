package cn.itcast.reflect.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReflectTest {

	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
		// TODO �Զ����ɵķ������

		Mainboard mb = new Mainboard();
		mb.run();
		//ÿ�����һ���O�䶼��Ҫ�޸Ĵ��a����һ���´����Ķ���
//		mb.usePCI(new SounCard());
	    //�ܲ��ܲ��޸Ĵ���Ϳ���������������
		//����new����ɡ�����ֻ��ȡ��Class�ļ������ڲ�ʵ�ִ�������Ķ�����
		
		File configFile = new File("pci.properties");
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(configFile);
		
		prop.load(fis);
		
		for(int x=0; x<prop.size(); x++) {
			
			String pciName = prop.getProperty("pci"+(x+1));
			
			Class clazz = Class.forName(pciName);//ʹ��Classȥ�������pci����
			
			PCI p = (PCI)clazz.newInstance();
			
			mb.usePCI(p);
			
		}
		fis.close();
	}

}

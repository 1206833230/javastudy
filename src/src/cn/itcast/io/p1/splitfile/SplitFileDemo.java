package cn.itcast.io.p1.splitfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * �ļ��и�
 */
public class SplitFileDemo {

	private static final int SIZE = 1024*1024;

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������

		File file = new File("C:\\Users\\12068\\eclipse-workspace\\day24e\\src\\dir\\1.bmp");
		
		splitFile_2(file);
	}
	
	private static void splitFile_2(File file) throws IOException {
		// TODO �Զ����ɵķ������
		//��ȡ������Դ�ļ���
				FileInputStream fis = new FileInputStream(file);
				
				//����һ��1M�Ļ�������
				byte[] buf = new byte[SIZE];
				
				//����һ��Ŀ��
				
				FileOutputStream fos = null;
				
				@SuppressWarnings("unused")
				int len = 0;
				int count = 1;
				
				/*
				 *�и��ļ�ʱ�������¼���и��ļ������ƣ��Լ��и������Ƭ�ļ��ĸ������Է���ϲ���
				 *�����ϢΪ�˼�������ʹ�ü�ֵ�Եķ�ʽ���õ�Properties����
				 */
				Properties prop = new Properties();
				
				
				
				File dir = new File("C:\\partfiles");
				if(!dir.exists())
					dir.mkdirs();
				
				while((len=fis.read(buf))!=-1) {
					
					fos = new FileOutputStream((count++)+".part");
					fos.close();
				}
				//�����и��ļ���Ϣ���浽prop�����С�
				prop.setProperty("partcunt", count+"");
				prop.setProperty("filename", file.getName());
				
				fos = new FileOutputStream(new File(dir,count+".properties"));
				
				//��prop�����е����ݴ洢���ļ��С�
				prop.store(fos,"Save file info");
				
				fis.close();
				fos.close();
	}

	public static void splitFile(File file) throws IOException {
		
		//��ȡ������Դ�ļ���
		FileInputStream fis = new FileInputStream(file);
		
		//����һ��1M�Ļ�������
		byte[] buf = new byte[SIZE];
		
		//����һ��Ŀ��
		
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

package cn.itcast.io.file.test;

import java.io.File;

/*
 * ���󣺶�ָ��Ŀ¼�����������ݵ��г���������Ŀ¼�е����ݣ�
 * Ҳ�������Ϊ��ȱ�����
 */
public class FileTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		File dir = new File("E:\\sadad");
		
		listAll(dir,0);
	}

	public static void listAll(File dir,int level) {
		// TODO �Զ����ɵķ������
		//��ȡָ��Ŀ¼�µ�ǰ�����ļ��л����ļ�����
		
		System.out.println(getSpace(level)+dir.getAbsolutePath());
		File[] files = dir.listFiles();
		
		for(int x = 0; x<=files.length-1; x++) {
			
			if(files[x].isDirectory()) {
				listAll(files[x],level);
			}
			else {
				System.out.println("file:"+files[x].getName());
			}
		}
		
	}

	private static String getSpace(int level) {
		// TODO �Զ����ɵķ������
		StringBuilder sb = new StringBuilder();
		for(int x = 0; x<level; x++) {
			sb.append("1-------");
		}
		return sb.toString();
	}

}

package cn.itcast.io.p3.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		File dir = new File("C:\\Users\\12068\\eclipse-workspace");
		
		FilenameFilter filter = new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				// TODO �Զ����ɵķ������
				return name.endsWith(".java");
			}
			
		};
		
		List<File> list = new ArrayList<File>();
		
		getFiles(dir,filter,list);
		
		File destFile = new File(dir,"javalist.txt");

		write2File(list,destFile);
	}
	/**
	 * ��ָ��Ŀ¼�е�������ȱ���
	 * @param dir
	 * @param filter
	 * @param list
	 */
	public static void getFiles(File dir,FilenameFilter filter,List<File> list) {
		File[] files = dir.listFiles();
		
		for(File file : files) {
			if(file.isDirectory()) {
				//�ݹ�
				getFiles(file,filter,list);
			}
			else {
				//�Ա������ļ����й������Ĺ��ˡ�������File���󣬴��浽List�����С�
				if(filter.accept(dir, file.getPath())) {
					list.add(file);
				}
			}
		}
	}
	
	public static void write2File(List<File> list,File destFile) {
		
		BufferedWriter bufw = null;
		try {
				bufw = new BufferedWriter(new FileWriter(destFile));
				for(File file : list) {
					bufw.write(file.getPath());
					bufw.newLine();
					bufw.flush();
				}
				
				
	}catch(IOException e) {
		throw new RuntimeException("д��ʧ��");
	}
		finally {
		if(bufw!=null)
			try {
				bufw.close();
			}catch(IOException e) {
				
				throw new RuntimeException("�ر�ʧ��");
				
			}
				
			}
	}

}

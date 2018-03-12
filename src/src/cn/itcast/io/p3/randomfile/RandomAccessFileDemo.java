package cn.itcast.io.p3.randomfile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * RandomAccessFile:
		 * һ��������������ᡣ����IO��ϵ�����ࡣ
		 * 
		 * �ص㣺
		 * 1.�����ܶ�������д��
		 * 2.�ö����ڲ�ά��һ��byte�������顣��ͨ��ָ����Բ��������е�Ԫ�ء�
		 * 3.����ͨ��getFilePointer������ȡָ��λ�ã���ͨ��seek��������ָ���λ�á�
		 * 4.��ʵ�ö�����ǽ��ֽ�����������������з�װ��
		 * 5.�ö���Ե�Դ��Ŀ��ֻ�����ļ���ͨ�����캯���Ϳ��Կ�����
		 */
//		writeFile();
//		readFile();
		randomWrite();
		
	}
	public static void randomWrite() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("ranacc.txt","rw");
		
		//��ָ��λ��д�����ݡ�
		raf.seek(3*8);
		raf.write("����".getBytes());
		
		raf.writeInt(102);
		
		raf.close();
	}
	public static void readFile() throws IOException {
		// TODO Auto-generated method stub
		
		RandomAccessFile raf = new RandomAccessFile("ranacc.txt","r");
		//ͨ��seek����ָ���λ�á�
		raf.seek(1*8);//ʵ������Ķ�ȡ��ֻҪָ��ָ���λ�ü��ɡ�
		
		byte[] buf = new byte[4];
		
		raf.read(buf);
		
		String name = new String(buf);
		
		int age = raf.readInt();
		
		System.out.println("name="+name);
		System.out.println("age="+age);
		
		System.out.println("pos"+raf.getFilePointer());
		raf.close();
				
	
				
		
	}
	//ʹ��RandomAccessFile����д��һЩ��Ա��Ϣ���������������䡣

	public static void writeFile() throws IOException {
		// TODO Auto-generated method stub
		
		RandomAccessFile raf = new RandomAccessFile("ranacc.txt","rw");
		
		raf.write("����".getBytes());
		
		raf.writeInt(97);
		
        raf.write("����1".getBytes());
		
		raf.writeInt(98);
		
		raf.close();
	}
	

}

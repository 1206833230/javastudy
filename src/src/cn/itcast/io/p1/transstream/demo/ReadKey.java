package cn.itcast.io.p1.transstream.demo;

import java.io.IOException;
import java.io.InputStream;

/*
 * ��ȡ�ļ�����¼������ݣ�����ӡ�ڿ���̨�ϡ�
 * 
 * ���̱������һ����׼�������豸��
 * 
 * ����java���ԣ��������������豸����Ӧ�Ķ�Ӧ��
 * 
 * 
 */
public class ReadKey {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		
		readKey_2();
		
//		System.out.println((int)'\r');
//		System.out.println((int)'\n');
		

	}

	public static void readKey_2() throws IOException {
		// TODO �Զ����ɵķ������
		/*
		 * ��ȡ�û�������������ݣ�
		 * ��ת��Ϊ��д��ʾ�ڿ���̨
		 * ����û������Over���������롣
		 * 
		 * ˼·��
		 * 1.��Ϊ����¼��ֻ��һ���ֽڣ�Ҫ�ж��Ƿ���over����Ҫ���ַ���
		 */
		
		//1.��������
		StringBuilder sb = new StringBuilder();
		
		//��ȡ���̶�ȡ��
		
		InputStream in = System.in;
		
		//���������¼��ȡ�����ֽڣ���ѭ����ȡ��
		
		int ch = 0;
		
		while((ch=in.read())!=-1) {
			//�ڴ���֮ǰ��Ҫ�ж��Ƿ��ǻ��б�ǣ���Ϊ���б�ǲ��洢
			//����ȡ�����ֽڴ洢StringBuilder��
			
			if(ch=='\r')
				continue;
			if(ch=='\n') {
				String temp = sb.toString();
				if("over".equals(temp))
					break;
				System.out.println(temp.toUpperCase());
				sb.delete(0, sb.length());
			}
			else
				sb.append((char)ch);
//			System.out.println(ch);
			
			
		}
		
	}

	public static void readKey() throws IOException {
		// TODO �Զ����ɵķ������
		
		InputStream in = System.in;
		
		int ch = in.read();//����ʽ����
		
		System.out.println(ch);
		
        int ch2 = in.read();//����ʽ����
		
		System.out.println(ch2);
		
        int ch3 = in.read();//����ʽ����
		
		System.out.println(ch3);
		
		in.close();
		
//		InputStream in2 = System.in;
//		
//        int ch4 = in.read();//����ʽ����
//		
//		System.out.println(ch4);
		
	}

}

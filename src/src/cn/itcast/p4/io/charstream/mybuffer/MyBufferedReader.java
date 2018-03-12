package cn.itcast.p4.io.charstream.mybuffer;

import java.io.FileReader;
import java.io.IOException;

/*
 * �Զ���Ļ�������ȡ���� ����ʵ����BufferedReader
 * 
 * ������
 * 
 * ���������޷Ǿ��Ƿ�װһ������
 * �������ṩ�˸���ķ�����������з���
 * ��ʵ��Щ�������ղ����Ķ�������Ǳ�
 * 
 * �����ԭ��
 * 
 * ��ʵ������Դ�л�ȡһ������װ���������С�
 * �ڻ��������ϵ�ȡ��һ��һ�������ݡ�
 * 
 * �ڴ���ȡ����ٴ�Դ�м���ȡ��һ�����ݵ���������
 * ��Դ������ȡ��֮����-1��Ϊ������ǡ�
 * 
 * 
 * 
 * 
 */
public class MyBufferedReader {

		// TODO �Զ����ɵķ������
		private FileReader r;
		
		//����һ��������Ϊ��������
		private char[] buf = new char[1024];
		
		//����һ��ָ�����ڲ�����������е�Ԫ�ء������������һ��Ԫ�غ�ָ��Ӧ�ù��㡣
		private int pos = 0;
		
		//����һ�����������ڼ�¼�������е����ݸ������������ݼ���0���ʹ�Դ�л�ȡ���ݵ��������С�
		private int count = 0;
		
		MyBufferedReader(FileReader r){
			this.r = r;
		}
		
		
		public int myRead() throws IOException  {
		
			if(count==0) {
				count = r.read(buf);
				pos = 0;
				
			}
			if(count<0) 
				return -1;
				char ch = buf[pos++];
				count--;
			
//			//1.��Դ�л�ȡһ�����ݵ��������У���Ҫ���жϣ�ֻ�м�����0ʱ������Ҫ��Դ�л�ȡ���ݡ�
//			if(count==0) {
//				count = r.read(buf);
//				
//				if(count<0)
//					return -1;
//				char ch = buf[pos];
//				
//				pos++;
//				count--;
//				
//				return ch;
//				
//			}else if(count>0) {
//                char ch = buf[pos];
//				
//				pos++;
//				count--;
//				
				return ch;
//				
			}
			
		
		public String myReadLine() throws IOException   {
			
			StringBuilder  sb = new StringBuilder();
			int ch = 0;
			while((ch = myRead())!=-1) {
				
				if(ch=='\r')
					continue;
				if(ch=='\n')
					return sb.toString();
				//���ӻ������������ַ����洢�������ݵĻ������С�
				sb.append((char)ch);
			}
				
			if(sb.length()!=0)
				return sb.toString();
			return null;
//		}

		}


		public void myClose() throws IOException {
			// TODO �Զ����ɵķ������
			r.close();
		}

}

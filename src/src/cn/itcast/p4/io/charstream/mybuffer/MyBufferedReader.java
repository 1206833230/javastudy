package cn.itcast.p4.io.charstream.mybuffer;

import java.io.FileReader;
import java.io.IOException;

/*
 * 自定义的缓冲区读取方法 ，其实就是BufferedReader
 * 
 * 分析：
 * 
 * 缓冲区中无非就是封装一个数组
 * 并对外提供了更多的方法对数组进行访问
 * 其实这些方法最终操作的都是数组角标
 * 
 * 缓冲的原理：
 * 
 * 其实就是中源中获取一批数据装进缓冲区中。
 * 在缓冲区不断的取出一个一个的数据。
 * 
 * 在此批取完后再从源中继续取出一批数据到缓冲区。
 * 当源中数据取完之后，用-1作为结束标记。
 * 
 * 
 * 
 * 
 */
public class MyBufferedReader {

		// TODO 自动生成的方法存根
		private FileReader r;
		
		//定义一个数组作为缓冲区。
		private char[] buf = new char[1024];
		
		//定义一个指针用于操作这个数组中的元素。当操作到最后一个元素后，指针应该归零。
		private int pos = 0;
		
		//定义一个计数器用于记录缓冲区中的数据个数，当该数据减到0，就从源中获取数据到缓冲区中。
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
			
//			//1.从源中获取一批数据到缓冲区中，需要先判断，只有计数器0时，才需要从源中获取数据。
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
				//将从缓冲区读到的字符，存储到行数据的缓冲区中。
				sb.append((char)ch);
			}
				
			if(sb.length()!=0)
				return sb.toString();
			return null;
//		}

		}


		public void myClose() throws IOException {
			// TODO 自动生成的方法存根
			r.close();
		}

}

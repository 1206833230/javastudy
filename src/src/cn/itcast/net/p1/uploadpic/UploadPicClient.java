package cn.itcast.net.p1.uploadpic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadPicClient {

	/**
	 * 
	 * @param args
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		//1.创建客户端socket
		Socket s = new Socket("192.168.149.1",10006);
		
		//2.读取客户端要上传的图片文件�??
		FileInputStream fis = new FileInputStream("图片1.png");
		
		//3.获取Socket输出流，将读取图片数据发送给服务流�??
		OutputStream out = s.getOutputStream();
		
		byte[] buf = new byte[1024];
		
		int len =  0;
		
		while((len=fis.read(buf))!=-1) {
			out.write(buf,0,len);
			
		}
		//告诉服务端说：这边的数据发�?�完毕，让服务端停止读取�?
		s.shutdownOutput();
		
		//读取服务端发回的内容�?
		InputStream in = s.getInputStream();
		byte[] bufIn = new byte[1024];
		
		int lenIn = in.read(bufIn);
		
		String text = new String(buf,0,lenIn);
		
		System.out.println(text);
		System.out.println("您好");
		
		fis.close();
		s.close();
	}

}

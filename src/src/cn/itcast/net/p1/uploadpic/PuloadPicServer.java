package cn.itcast.net.p1.uploadpic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class PuloadPicServer {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//1.创建tcp的Socket服务端。
		ServerSocket ss = new ServerSocket(10006);
		
		while(true) {
			//2.获取客户端。
		    Socket s = ss.accept();
			new Thread(new UploadTast(s)).start();
		}
		
		
//		String ip = s.getInetAddress().getHostAddress();
//		System.out.println(ip+".....connected");
//		
//		//3.读取客户端发来的数据。
//		InputStream in = s.getInputStream();
//		
//		//4.将读取到数据储存到一个文件中。
//		File dir = new File("图片");
//		
//		if(!dir.exists()) {
//			dir.mkdirs();
//		}
//		File file = new File(dir,ip+".png");
//		FileOutputStream fos = new FileOutputStream(file);
//		
//		byte[] buf = new byte[1024];
//		
//		int len = 0;
//		
//		while((len=in.read(buf))!=-1) {
//			fos.write(buf, 0, len);
//		}
//		
//		//获取Socket输出流，将上传成功字样发给客户端。
//		OutputStream out = s.getOutputStream();
//		out.write("上传成功".getBytes());
//		
//		fos.close();
//		s.close();
	}

}

package cn.itcast.net.p4.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * 建立tcp服务端的思路：
		 * 1.创建服务端Socket服务，通过ServerSocket对象。
		 * 2.服务端必须对外提供一个端口，否则客户端无法连接。
		 * 3.获取连接过来的客户端对象。
		 * 4.通过客户端对象获取Socket流读取客户端发来的数据打印在控制台上。
		 * 5.关闭客户端，关闭服务端。
		 */
		
		//1.创建服务端对象。
		ServerSocket ss = new ServerSocket(20002);
		
		//2.过去连接过来的客户端对象。
		Socket s = ss.accept();
		
		String ip = s.getInetAddress().getHostAddress();
		//3.通过Socket对象输入流，要读取客户端发过来的数据。
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		
		String text = new String(buf,0,len);
		
		System.out.println("server:"+text);
		System.out.println(ip);
		
		//使用客户端Socket对象的输出流给客户端返回数据。
		OutputStream out = s.getOutputStream();
		out.write("收到".getBytes());
		
		s.close();
		ss.close();
	}

}

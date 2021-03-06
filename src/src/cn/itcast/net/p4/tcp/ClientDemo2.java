package cn.itcast.net.p4.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo2 {

	public static void main(String[] args) throws IOException, IOException {
		// TODO Auto-generated method stub

		/*
		 * Tcp传输，客户端建立的过程。
		 * 1.创建tcp客户端socket服务，使用的是Socket对象。
		 *  建议改对象一创建就明确目的地。要建立连接的主机。
		 * 2.如果建立连接成功，说明数据传输通道已建立。
		 *   该通道就是socket流，是底层建立好的。既然是流，说明这里既有输入，又有输出。
		 *   想要输入或输出流对象，可以找Socket来获取。
		 *   可以通过getOutputStream()和getInputStream()来获取两个字节流。
		 * 3.使用输出流，将数据写出。
		 * 4.关闭资源。
		 */
		
		//创建客户端Socket服务
		Socket socket = new Socket("192.168.149.1",20002);
		
		//获取Socket流中的输出流。
		OutputStream out = socket.getOutputStream();
		
		//使用输出流将指定的数据写出去。
		out.write("tcp演示：哥们又来了！".getBytes());
		
		//读取服务端返回数据，使用socket读取流。
        InputStream in = socket.getInputStream();
		
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		
		String text = new String(buf,0,len);
		
		System.out.println("server:"+text);
		//关闭资源
		socket.close();
		
	}

}

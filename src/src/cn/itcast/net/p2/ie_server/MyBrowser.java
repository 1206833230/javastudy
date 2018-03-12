package cn.itcast.net.p2.ie_server;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyBrowser {

	/**
	 * 
	 * @param args
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO �Զ����ɵķ������

		Socket s = new Socket("196.168.149.1",8080);
		
		//ģ�����������Tomcat���������ͷ���httpЭ���������Ϣ��
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		out.println("GET/myweb/1.html HTTP/1.1");
		out.println("Accept: */*");
		out.println("Host: 192.168.149.1:8080");
		out.println("Connection: close");
		out.println("");
		out.println("");
		
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		
		String str = new String(buf,0,len);
		System.out.println(str);
		
		s.close();
	}

}

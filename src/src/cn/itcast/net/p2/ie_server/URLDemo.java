package cn.itcast.net.p2.ie_server;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������

		
		String str_url = "http://192.168.149.1:8080/myweb/1.html?name=lisi";
		
		URL url = new URL(str_url);
		
//		System.out.println("getProtocol:"+url.getProtocol());
//		System.out.println("getHost:"+url.getHost());
//		System.out.println("getPort:"+url.getPort());
//		System.out.println("getFile:"+url.getFile());
//		System.out.println("getPath:"+url.getPath());
//		System.out.println("getQuery:"+url.getQuery());
		
//		InputStream in = url.openStream();
		//��ȡurl�����url���������󡣽����ӷ�װ���˶���java�����õĿ��Խ����ľ���Э�����+socket��
		URLConnection conn = url.openConnection();
		
		System.out.println(conn);
//		byte[] buf = new byte[1024];
//		int len = in.read(buf);
//		String text = new String(buf,0,len);
//		
//		System.out.println(text);
		
	}

}
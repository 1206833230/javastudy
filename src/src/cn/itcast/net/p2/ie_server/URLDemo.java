package cn.itcast.net.p2.ie_server;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根

		
		String str_url = "http://192.168.149.1:8080/myweb/1.html?name=lisi";
		
		URL url = new URL(str_url);
		
//		System.out.println("getProtocol:"+url.getProtocol());
//		System.out.println("getHost:"+url.getHost());
//		System.out.println("getPort:"+url.getPort());
//		System.out.println("getFile:"+url.getFile());
//		System.out.println("getPath:"+url.getPath());
//		System.out.println("getQuery:"+url.getQuery());
		
//		InputStream in = url.openStream();
		//获取url对象的url连接器对象。将连接封装成了对象：java中内置的可以解析的具体协议对象+socket。
		URLConnection conn = url.openConnection();
		
		System.out.println(conn);
//		byte[] buf = new byte[1024];
//		int len = in.read(buf);
//		String text = new String(buf,0,len);
//		
//		System.out.println(text);
		
	}

}

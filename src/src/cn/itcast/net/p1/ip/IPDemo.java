package cn.itcast.net.p1.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub

		//获取本机主机IP地址对象。
		InetAddress ip = InetAddress.getLocalHost();
		
		//获取其他主机IP地址对象
		ip = InetAddress.getByName(null);//InetAddress.getByName("my_think");
		System.out.println(ip.getHostAddress());
		System.out.println(ip.getHostName());
		
	}

}

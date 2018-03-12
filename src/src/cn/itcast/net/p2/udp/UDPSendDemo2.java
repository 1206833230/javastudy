package cn.itcast.net.p2.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSendDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("发送端启动....");
		/*
		 * 创建UDp传输的发送端。
		 * 思路：
		 * 1.建立udp的socket服务。
		 * 2.将要发送的数据封装到数据包中。
		 * 3.通过udp的socket服务将数据包发送出去。
		 * 4.关闭socket服务。
		 */
	    //1.udpsocket服务，使用DatagramSocket对象。
		DatagramSocket ds = new DatagramSocket();
		
		//2.将要发送的数据封装到数据包中。
//		String str = "udp传输演示：哥们来了！您好！";
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		
		while((line=bufr.readLine())!=null) {
			
			byte[] buf = line.getBytes();
			
			DatagramPacket dp = 
					new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.149.1"),10000);
			ds.send(dp);
			if("886".equals(line))
				break;
		}
		
		//使用DatagramPacket将数据封装到该对象包中。
//		byte[] buf = str.getBytes();
//		
//		DatagramPacket dp = 
//				new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.149.1"),10000);
//		//3.通过udp的socket服务将数据包发送出去。使用send方法。
//		ds.send(dp);
		
		//关闭数据
		ds.close();
	}

}

package cn.itcast.net.p2.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSendDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("���Ͷ�����....");
		/*
		 * ����UDp����ķ��Ͷˡ�
		 * ˼·��
		 * 1.����udp��socket����
		 * 2.��Ҫ���͵����ݷ�װ�����ݰ��С�
		 * 3.ͨ��udp��socket�������ݰ����ͳ�ȥ��
		 * 4.�ر�socket����
		 */
	    //1.udpsocket����ʹ��DatagramSocket����
		DatagramSocket ds = new DatagramSocket();
		
		//2.��Ҫ���͵����ݷ�װ�����ݰ��С�
		String str = "udp������ʾ���������ˣ����ã�";
		
		//ʹ��DatagramPacket�����ݷ�װ���ö�����С�
		byte[] buf = str.getBytes();
		
		DatagramPacket dp = 
				new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.149.1"),10000);
		//3.ͨ��udp��socket�������ݰ����ͳ�ȥ��ʹ��send������
		ds.send(dp);
		
		//�ر�����
		ds.close();
	}

}

package cn.itcast.net.p2.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("���ն�����.....");

		/*
		 * ����UDP���ն˵�˼·��
		 * 1.����udp socket������ΪҪ�������ݣ�����Ҫ��ȷ�˿ںš�
		 * 2.�������ݰ������ڴ洢���յ������ݡ����������ݰ�����ķ���������Щ���ݡ�
		 * 3.ʹ��socket�����receive�������յ������ݴ��浽���ݰ��С�
		 * 4.ͨ�����ݰ��ķ����������ݰ��е����ݡ�
		 * 5.�ر���Դ��
		 * 
		 */
		//1.����udp socket����
		DatagramSocket ds = new DatagramSocket(10000);
		
		//2.�������ݰ������ڴ洢���յ������ݡ����������ݰ�����ķ���������Щ���ݡ�
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		
		//3.ʹ��socket�����receive�������յ������ݴ��浽���ݰ��С�
		ds.receive(dp);//����ʽ��
		
		//4.ͨ�����ݰ��ķ����������ݰ��е����ݡ�
		String ip = dp.getAddress().getHostAddress();
		int port = dp.getPort();
		String text = new String(dp.getData(),0,dp.getLength());
		System.out.println(ip+"::"+port+"::"+text);
		
		//5.�ر���Դ��
		ds.close();
		
	}

}
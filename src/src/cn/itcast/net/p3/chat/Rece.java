package cn.itcast.net.p3.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class Rece implements Runnable {

	private DatagramSocket ds;
	public Rece(DatagramSocket ds) {
		// TODO Auto-generated method stub

		this.ds = ds;
	}


public void run() {
	// TODO Auto-generated method stub
	try {
		while(true) {
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
			
			if(text.equals("886")) {
				System.out.println(ip+"....�˳�������");
			}
		}
		
	}catch(Exception e) {
		
	}
}


}

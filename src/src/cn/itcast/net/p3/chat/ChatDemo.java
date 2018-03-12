package cn.itcast.net.p3.chat;

import java.io.IOException;
import java.net.DatagramSocket;

public class ChatDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		DatagramSocket send = new DatagramSocket();
		DatagramSocket rece = new DatagramSocket(10001);
		
		new Thread(new Send(send)).start();
		new Thread(new Rece(rece)).start();
	}

}

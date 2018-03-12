package cn.itcast.net.p4.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * ����tcp����˵�˼·��
		 * 1.���������Socket����ͨ��ServerSocket����
		 * 2.����˱�������ṩһ���˿ڣ�����ͻ����޷����ӡ�
		 * 3.��ȡ���ӹ����Ŀͻ��˶���
		 * 4.ͨ���ͻ��˶����ȡSocket����ȡ�ͻ��˷��������ݴ�ӡ�ڿ���̨�ϡ�
		 * 5.�رտͻ��ˣ��رշ���ˡ�
		 */
		
		//1.��������˶���
		ServerSocket ss = new ServerSocket(20002);
		
		//2.��ȥ���ӹ����Ŀͻ��˶���
		Socket s = ss.accept();
		
		String ip = s.getInetAddress().getHostAddress();
		//3.ͨ��Socket������������Ҫ��ȡ�ͻ��˷����������ݡ�
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		
		String text = new String(buf,0,len);
		
		System.out.println("server:"+text);
		System.out.println(ip);
		
		//ʹ�ÿͻ���Socket�������������ͻ��˷������ݡ�
		OutputStream out = s.getOutputStream();
		out.write("�յ�".getBytes());
		
		s.close();
		ss.close();
	}

}

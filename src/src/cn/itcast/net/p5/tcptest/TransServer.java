package cn.itcast.net.p5.tcptest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TransServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * ת������ˡ�
		 * ������
		 * 1.ServerSocket����
		 * 2.��ȡSocket����
		 * 3.Դ��Socket����ȡ�ͻ��˷���������Ҫת�������ݡ�
		 * 4.Ŀ�ģ���ʾ�ڿ�̨��
		 * 5.������ת�ɴ�д�����ͻ��ˡ�
		 */
		//1.
		ServerSocket ss = new ServerSocket(1500);
		
		//2.��ȡSocket����.
		Socket s = ss.accept();
		
		//��ȡip
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip);
		//3.��ȡSocket��ȡ������װ�Ρ�
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//4.��ȡSocket�����������װ�Ρ�
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		String line = null;
		while((line=bufIn.readLine())!=null) {
			System.out.println(line);
			out.println(line.toUpperCase());
		}
		s.close();
		ss.close();
	}

}

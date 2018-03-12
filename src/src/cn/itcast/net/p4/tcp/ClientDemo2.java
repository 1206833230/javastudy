package cn.itcast.net.p4.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo2 {

	public static void main(String[] args) throws IOException, IOException {
		// TODO Auto-generated method stub

		/*
		 * Tcp���䣬�ͻ��˽����Ĺ��̡�
		 * 1.����tcp�ͻ���socket����ʹ�õ���Socket����
		 *  ����Ķ���һ��������ȷĿ�ĵء�Ҫ�������ӵ�������
		 * 2.����������ӳɹ���˵�����ݴ���ͨ���ѽ�����
		 *   ��ͨ������socket�����ǵײ㽨���õġ���Ȼ������˵������������룬���������
		 *   ��Ҫ�������������󣬿�����Socket����ȡ��
		 *   ����ͨ��getOutputStream()��getInputStream()����ȡ�����ֽ�����
		 * 3.ʹ���������������д����
		 * 4.�ر���Դ��
		 */
		
		//�����ͻ���Socket����
		Socket socket = new Socket("192.168.149.1",20002);
		
		//��ȡSocket���е��������
		OutputStream out = socket.getOutputStream();
		
		//ʹ���������ָ��������д��ȥ��
		out.write("tcp��ʾ�����������ˣ�".getBytes());
		
		//��ȡ����˷������ݣ�ʹ��socket��ȡ����
        InputStream in = socket.getInputStream();
		
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		
		String text = new String(buf,0,len);
		
		System.out.println("server:"+text);
		//�ر���Դ
		socket.close();
		
	}

}

package cn.itcast.net.p4.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {

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
		Socket socket = new Socket("192.168.149.1",20000);
		
		//��ȡSocket���е��������
		OutputStream out = socket.getOutputStream();
		
		//ʹ���������ָ��������д��ȥ��
		out.write("tcp��ʾ���������ˣ�".getBytes());
		
		//�ر���Դ
		socket.close();
		
	}

}

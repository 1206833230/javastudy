package cn.itcast.net.p5.tcptest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TransClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		/*˼·
		 * �ͻ��ˣ�
		 * 1.��Ҫ����Socket�˵㡣
		 * 2.�ͻ�������Դ�����̡�
		 * 3.�ͻ��˵�Ŀ�ĵأ�Socket��
		 * 4.���շ���˵����ݣ�Դ��Socket��
		 * 5.��������ʾ��ӡ������Ŀ�ģ� ����̨��
		 * 6.����Щ�����������ݶ����ı����ݡ�
		 * ת���ͻ��ˣ�
		 * 1.����Socket�ͻ��˶���
		 * 2.��ȡ����¼�롣
		 * 3.��¼������ݷ��͸�Socket��
		 */
		//����Socket�ͻ��˶���
		Socket s = new Socket("192.168.149.1",1500);
		
		//��ȡ����¼�롣
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		
		//3.Socket�������
//		new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		//4.��ȡ����������ȡ����˷��صĴ�д���ݡ�
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line = null;
		
		while((line=bufr.readLine())!=null) {
			if("over".equals(line))
				break;
			out.println(line);
			
			//��ȡ����˷��ص�һ�д�д���ݡ�
			String upperStr = bufIn.readLine();
			System.out.println(upperStr);
			
//			s.close();
		}
		s.close();
	}

}

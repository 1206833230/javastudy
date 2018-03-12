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

		/*思路
		 * 客户端：
		 * 1.需要先有Socket端点。
		 * 2.客户端数据源：键盘。
		 * 3.客户端的目的地：Socket。
		 * 4.接收服务端的数据，源：Socket。
		 * 5.将数据显示打印出来：目的： 控制台。
		 * 6.在这些流操作的数据都是文本数据。
		 * 转换客户端：
		 * 1.创建Socket客户端对象。
		 * 2.获取键盘录入。
		 * 3.将录入的数据发送给Socket。
		 */
		//创建Socket客户端对象。
		Socket s = new Socket("192.168.149.1",1500);
		
		//获取键盘录入。
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		
		//3.Socket输出流。
//		new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		//4.读取输入流，读取服务端返回的大写数据。
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line = null;
		
		while((line=bufr.readLine())!=null) {
			if("over".equals(line))
				break;
			out.println(line);
			
			//读取服务端发回的一行大写数据。
			String upperStr = bufIn.readLine();
			System.out.println(upperStr);
			
//			s.close();
		}
		s.close();
	}

}

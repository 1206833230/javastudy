package cn.itcast.net.p6.uploadtext;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		//1.
		Socket s = new Socket("192.168.149.1",1006);
		
		//2.
		BufferedReader bufr = new BufferedReader(new FileReader("client.txt"));
		
		//3.
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		String line = null;
		while((line=bufr.readLine())!=null) {
			out.println(line);
		}
		//告诉客户端，客户端写完了。
		s.shutdownOutput();
		BufferedReader bufrIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String str = bufrIn.readLine();
		System.out.println(str);
		
		bufr.close();
		s.close();
	}

}

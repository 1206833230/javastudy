package cn.itcast.net.p6.uploadtext;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//1.
		ServerSocket ss = new ServerSocket(1006);
	
		//2.
		Socket s = ss.accept();
		System.out.println(s.getInetAddress().getHostAddress());
		//3.
		BufferedReader bufrIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//4.
		BufferedWriter bufw = new BufferedWriter(new FileWriter("server.txt"));
		
		String line = null;
		while((line=bufrIn.readLine())!=null) {
			if("over".equals(line))
				break;
			bufw.write(line);
			bufw.newLine();
			bufw.close();
		}
		
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		out.println("上传成功");
		
		bufw.close();
		s.close();
		ss.close();
	}
	
	

}

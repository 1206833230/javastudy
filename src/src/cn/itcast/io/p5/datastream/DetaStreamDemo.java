package cn.itcast.io.p5.datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DetaStreamDemo {
	
	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		writeDeta();
		readData();
	}

	public static void readData() throws IOException {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
				
		String str  = dis.readUTF();
		
		System.out.println(str);
	
	}

	public static void writeDeta() throws IOException {
		// TODO Auto-generated method stub
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
		
		dos.writeUTF("ฤ๚บร");
		
		dos.close();
	}

}

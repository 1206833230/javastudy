package cn.itcast.io.p4.piped;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PidedStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		PipedInputStream input = new PipedInputStream();
		PipedOutputStream output = new PipedOutputStream();
		
		input.connect(output);
		
		new Thread(new Input(input)).start();
		new Thread(new Output(output)).start();
	}

}
class Input implements Runnable{
	
	private PipedInputStream in;
	Input(PipedInputStream in){
		this.in = in;
	}
	public void run() {
		try {
			byte[] buf = new byte[1024];
			
			int len = in.read(buf);
			
			String s = new String(buf,0,len);
			
			System.out.println("s="+s);
			
			in.close();
		}catch(Exception e) {
			
		}
	}
}
class Output implements Runnable{
	
	private PipedOutputStream out;
	Output(PipedOutputStream out){
		this.out = out;
		
	}
	public void run() {
		try {
			Thread.sleep(5000);
			out.write("hi, �ܵ����ˣ�".getBytes());
		}catch(Exception e) {
			
		}
		
	}
}
package cn.itcast.p6.charstream.linenumber;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		FileReader fr = new FileReader("IO��_2.txt");
		
		LineNumberReader lnr = new LineNumberReader(fr);
		
		String line = null;
		lnr.setLineNumber(10);
		while((line=lnr.readLine())!=null){
			System.out.println(lnr.getLineNumber()+"::"+line);
		}
		
		lnr.close();

	}

}

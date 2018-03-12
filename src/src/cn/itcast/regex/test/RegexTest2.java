package cn.itcast.regex.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 网页爬虫：
 * 其实一个程序用于在互联网中符合指定规则的数据。
 * 
 * 爬取邮箱地址。
 */
public class RegexTest2 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根

		List<String> list = getMailsByWeb();
		for(String mail: list) {
			System.out.println(mail);
		}
	}

	public static List<String> getMailsByWeb() throws IOException {
		// TODO 自动生成的方法存根

		//1.读取源文件。
//		BufferedReader bufr = new BufferedReader(new FileReader("c:\\mail.html"));
		
		URL url = new URL("http://192.168.149.1:8080/myweb/mail.html");
		
		BufferedReader bufrIn = new BufferedReader(new InputStreamReader(url.openStream()));
		//2.对去读取的数据进行规则的匹配。从中获取符合规则的数据。
		String mail_regex = "\\w+@\\w+(\\.\\w+)+";
		
		List<String> list = new ArrayList<String>();
		
		Pattern p = Pattern.compile(mail_regex);
		
		String line = null;
		
		while((line=bufrIn.readLine())!=null) {
			
			Matcher m = p.matcher(line);
			while(m.find()) {
				//3.将符合规则的数据储存到集合中。
				list.add(m.group());
			}
		}
		
		return list;
	}

	public static List<String> getMails() throws IOException {
		
		//1.读取源文件。
		BufferedReader bufr = new BufferedReader(new FileReader("c:\\mail.html"));
		
		//2.对去读取的数据进行规则的匹配。从中获取符合规则的数据。
		String mail_regex = "\\w+@\\w+(\\.\\w+)+";
		
		List<String> list = new ArrayList<String>();
		
		Pattern p = Pattern.compile(mail_regex);
		
		String line = null;
		
		while((line=bufr.readLine())!=null) {
			
			Matcher m = p.matcher(line);
			while(m.find()) {
				//3.将符合规则的数据储存到集合中。
				list.add(m.group());
			}
		}
		
		return list;
	}
}

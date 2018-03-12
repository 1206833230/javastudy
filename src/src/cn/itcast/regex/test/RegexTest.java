package cn.itcast.regex.test;

import java.util.TreeSet;

public class RegexTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		/*
		 * 治疗口吃： 我我我。。。我我我。。。我我。。。我我。。我我我。。。我。。
		 * 要。。。要要。。要要要。。。要要要要。。学学学学。。学学学。。学学。。
		 * 编编编编编。。编编编编编编。。。编
		 * 程程程程。。。程程程程。。程程程。。程程程。。。。程程。
		 */
		text_3();
	}

	public static void text_3() {
		// TODO 自动生成的方法存根
		
		String mail = "abb@sina.com";
		
		String regex = "[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,3})+";
		
		regex = "\\w+@\\w+(\\.\\w+)+";//1@1.1
		
		boolean b = mail.matches(regex);
		
		System.out.println(mail+"::"+b);
	}

	/*
	 * ip排序排序。
	 * 
	 * 192.168.10.34
	 * 127.0.0.1
	 * 3.3.3.3
	 * 105.70.11.55
	 */
	public static void text_2() {
		// TODO 自动生成的方法存根
		String ip_str = "192.168.10.34 127.0.0.1 3.3.3.3 105.70.11.55";
		
		//1.为了让IP可以按照字符串顺序比较，只要让ip的每一段的位数相同。
		//所以，补零，按照每一段所需最多位进行0补充。每一段都加两个0.
		
		ip_str = ip_str.replaceAll("(\\d+)", "00$1");
		
		System.out.println(ip_str);
		
		//每一段保留数字3位。
		ip_str = ip_str.replaceAll("0*(\\d{3})","$1");
		System.out.println(ip_str);
		
		//1.将ip地址切出。
		String[] ips = ip_str.split(" +");
		
		TreeSet<String> ts = new TreeSet<String>();
		
		for(String ip: ips) {
			ts.add(ip);
		}
		
		for(String ip : ts) {
			System.out.println(ip.replaceAll("0*(\\d+)", "$1"));
		}
	}

	public static void text_1() {
		// TODO 自动生成的方法存根
		String str = "我我我。。。我我我。。。我我。。。我我。。我我我。。。我。。要。。。要要。。要要要。。。要要要要。。学学学学。。学学学。。学学。。程程程程。。。编编编。。。编编。。编编编编。。程程程程程。。程程程。。程程程。。。。程程。";
		
		//1.将字符串。去掉。用替换。
		str = str.replaceAll("。", "");
		System.out.println(str);
		
		
		//2.替换叠词
		str = str.replaceAll("(.)\\1+", "$1");
		System.out.println(str);
		
	}

}

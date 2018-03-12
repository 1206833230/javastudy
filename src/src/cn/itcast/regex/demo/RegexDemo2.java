package cn.itcast.regex.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		/*
		 * 正则表达式对字符串的常见操作。
		 * 1.匹配。
		 *    其实使用的就是String类中的matches方法。
		 * 2.切割。
		 *     其实就是字符串split方法。
		 * 3.替换。
		 *     其实使用的就是String类中的replaceAll方法。
		 * 4.获取。
		 */
		functionDemo_4();

	}
	/*
	 * 获取：
	 * //将正则规则进行对象的封装。
	 * Pattern p = Pattern.compile("a*b");
	 * //通过正则对象的matcher方法字符串相关联。获取要对字符串操作的匹配对象Matcher。
	 * Matcher m = p.matcher("aaaac");
	 *  //通过Matcher匹配器对象的方法对字符串操作。
	 *  boolean b = m.matchers();
	 */
	public static void functionDemo_4() {
		// TODO 自动生成的方法存根
		
		String str = "da jia hao,ming tian bu fang jia!";
		
		String regex = "\\b[a-z]{3}\\b";
		
		//1.将正则封装成对象。
		Pattern p = Pattern.compile(regex);
		
		//2.通过正则对象获取匹配器对象。
		Matcher m = p.matcher(str);
		
		//使用Matcher对象的方法对字符串进行操作。
		//既然要获取三个字母组成的单词。
		//查找。find();
		System.out.println(str);
		while(m.find()) {
			System.out.println(m.group());
			
			System.out.println(m.start()+"::"+m.end());
		}
		
		
	}
	public static void functionDemo_3() {
		// TODO 自动生成的方法存根
//		String str = "zhangsantttttxiaoqingnnnnnnzhaoliu";
//		
//		str = str.replaceAll("(.)\\1+", "$1");
//		
//		System.out.println(str);
//		
		String tel = "15846541111";//158******1111
		
		tel = tel.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
		
		System.out.println(tel);
	}
	/*
	 * 切割。
	 * 组：（（A）（B（C）））
	 */
	public static void functionDemo_2() {
		// TODO 自动生成的方法存根
		String str = "zhangsantttttxiaoqingnnnnnnzhaoliu";
		String[] names = str.split("(.)\\1+");//str.split(" +");
		for(String name : names){
			System.out.println(name);
			
		}
	}
	/*
	 * 演示匹配
	 */

	public static void functionDemo_1() {
		//匹配手机号是否正确。
		String tel = "15096675243";
		
		String regex = "1[358]\\d{9}";
		
		boolean b = tel.matches(regex);
		System.out.println(tel+":"+b);
	}
}

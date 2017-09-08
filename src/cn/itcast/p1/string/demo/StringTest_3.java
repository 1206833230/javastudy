package cn.itcast.p1.string.demo;

public class StringTest_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * 3.两个字符串的最大相同子串
		 * "saadgajkshdasjghwqeertuyui"
		 * "asdfghkxzmcnbzxmcnvbqweiuieroitujkk"
		 * 思路;
		 * 1.用短的子串比较
		 * 2.用短的子串递减的子串去比较。
		 */
		String s1 = "saadgajkshdasjghwqeertuyui";
		String s2 = "asdfghkxzmcnbzxmcnvbqweiuieroitujkk";
		String s = getMaxSubstring(s2,s1);
		System.out.println("s="+s);

	}
/**
 * 获取最大子串
 * @param s1
 * @param s2
 * @return
 */
	private static String getMaxSubstring(String s1, String s2) {
		// TODO 自动生成的方法存根
		String max = null,min = null;
		max = (s1.length()>s2.length())?s1:s2;
		min = max.equals(s1)?s2:s1;
		System.out.println("max="+max);
		System.out.println("min="+min);
		for(int i = 0; i < min.length(); i++) {
			for(int a = 0,b = min.length()-i; b!=s2.length()+1; a++,b++) {
				String sub = min.substring(a,b);
//				System.out.println(sub);
				if(max.contains(sub))
					return sub;
					
			}
		}
		return null;
	}

}

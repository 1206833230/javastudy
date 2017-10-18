package cn.itcast.p1.string.demo;

public class StringTest_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 模拟体格trim功能一致的方法。去除字符串两端的空格
		 * 思路：
		 * 1.定义两个变量
		 * 一个变量作为从头开始判断空格角标。不断++；
		 *  一个变量作为从尾开始判断空格角标。不断--；
		 * 
		 */

		String s = "    adas   dsad  ";
		s = myTrim(s);
		System.out.println("-"+s+"-");
	}

	private static String myTrim(String s) {
		// TODO Auto-generated method stub
		int start = 0,end = s.length()-1;
		while(start <= end && s.charAt(start)==' ')
		{
			start++;
		}
		while(start <= end && s.charAt(end)==' ')
		{
			end--;
		}
		return s.substring(start,end + 1);
	}

}

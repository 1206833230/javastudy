package cn.itcast.p1.string.demo;

public class StringTest_4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * 模拟一个trim功能一致的方法。
		 */
		String s = "     ab   c     ";
		s = myTrim(s);
		System.out.println("-"+s+"-");

	}

	private static String myTrim(String s) {
		// TODO 自动生成的方法存根
		int start = 0,end = s.length()-1;
		while(start <= end && s.charAt(start)==' ') {
			start++;
		}
		while(start <= end && s.charAt(end)==' ') {
			end--;
		}
		return s.substring(start, end+1);
	}

}

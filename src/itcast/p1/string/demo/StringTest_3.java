package cn.itcast.p1.string.demo;

public class StringTest_3 {
	public  static void main(String[] arg) {
		String s1 = "dafakjkfkashfakfasfkasdfghneklrwnwrlkn";
		String s2 = "ajshdgasgjaasdfghjkdgjknveknnlsafafafasfsafasfafa";
		String s = getMaxSubstring(s1,s2);
		System.out.println("s="+s);
		
	}


/*
 * 两个字符串中最大的相同字符串长度
 * "dafakjkfkashfakfasfkasdfghneklrwnwrlkn"
 * "ajshdgasgjaasdfghjkdgjknveknnl"
 * 思路：
 * 1.既然取得是最大子串，先看短的那个字符串是否存在长的那个字符串中。
 * 2.如果不存在，将短的那个字符串长度递减的方式去找子串。
 */
private static String getMaxSubstring(String s1, String s2) {
		// TODO Auto-generated method stub
	String max = null,min = null;
	max = (s1.length()>s2.length())?s1:s2;
	min = max.equals(s1)?s2:s1;
	System.out.println("min="+min);
	System.out.println("max="+max);
	
	for(int i = 0;i<s2.length();i++)
{
	for(int a=0,b=s2.length()-i;b!=s2.length()+1 ;a++,b++)
	{
		String sub = s2.substring(a,b);
//		System.out.println(sub);
		if(s1.contains(sub))
			return sub;
	}
}
		return null;
	}
}


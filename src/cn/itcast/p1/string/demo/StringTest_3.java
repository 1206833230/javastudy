package cn.itcast.p1.string.demo;

public class StringTest_3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * 3.�����ַ����������ͬ�Ӵ�
		 * "saadgajkshdasjghwqeertuyui"
		 * "asdfghkxzmcnbzxmcnvbqweiuieroitujkk"
		 * ˼·;
		 * 1.�ö̵��Ӵ��Ƚ�
		 * 2.�ö̵��Ӵ��ݼ����Ӵ�ȥ�Ƚϡ�
		 */
		String s1 = "saadgajkshdasjghwqeertuyui";
		String s2 = "asdfghkxzmcnbzxmcnvbqweiuieroitujkk";
		String s = getMaxSubstring(s2,s1);
		System.out.println("s="+s);

	}
/**
 * ��ȡ����Ӵ�
 * @param s1
 * @param s2
 * @return
 */
	private static String getMaxSubstring(String s1, String s2) {
		// TODO �Զ����ɵķ������
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

package cn.itcast.p1.string.demo;

public class StringTest_3 {
	public  static void main(String[] arg) {
		String s1 = "dafakjkfkashfakfasfkasdfghneklrwnwrlkn";
		String s2 = "ajshdgasgjaasdfghjkdgjknveknnlsafafafasfsafasfafa";
		String s = getMaxSubstring(s1,s2);
		System.out.println("s="+s);
		
	}


/*
 * �����ַ�����������ͬ�ַ�������
 * "dafakjkfkashfakfasfkasdfghneklrwnwrlkn"
 * "ajshdgasgjaasdfghjkdgjknveknnl"
 * ˼·��
 * 1.��Ȼȡ��������Ӵ����ȿ��̵��Ǹ��ַ����Ƿ���ڳ����Ǹ��ַ����С�
 * 2.��������ڣ����̵��Ǹ��ַ������ȵݼ��ķ�ʽȥ���Ӵ���
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


package cn.itcast.p1.string.demo;

public class StringTest_4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * ģ��һ��trim����һ�µķ�����
		 */
		String s = "     ab   c     ";
		s = myTrim(s);
		System.out.println("-"+s+"-");

	}

	private static String myTrim(String s) {
		// TODO �Զ����ɵķ������
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

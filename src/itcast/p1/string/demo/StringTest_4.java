package cn.itcast.p1.string.demo;

public class StringTest_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ģ�����trim����һ�µķ�����ȥ���ַ������˵Ŀո�
		 * ˼·��
		 * 1.������������
		 * һ��������Ϊ��ͷ��ʼ�жϿո�Ǳꡣ����++��
		 *  һ��������Ϊ��β��ʼ�жϿո�Ǳꡣ����--��
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

package cn.itcast.p1.string.demo;

public class StringMethodDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * ����������˼����ַ������з��ࡣ
		 * ��abcd��
		 * 1.��ȡ;
		 * 1.1��ȡ�ַ������ȡ�
		 * int length();
		 * 1.2�������ӻ�ȡ�ַ���
		 * char charAt(int index);
		 * 1.3�����ַ���ȡ���ַ����е�λ�á���һ�γ��ֵ�λ�á�
		 * int indexof(int ch)
		 * int indexof(int ch,int fromIndex)��ָ��λ�ÿ�ʼ����
		 * int indexof(String str)
		 * int indexof(string str,int fromIndex)
		 * int lastindexof(int ch)
		 * int lastindexof(int ch,int fromIndex)��ָ��λ�ÿ�ʼ����
		 * int lastindexof(String str)
		 * int lastindexof(string str,int fromIndex)
		 * 1.4��ȡ�ַ����е�һ�����ַ�����Ҳ���Ӵ���
		 * String subString(int beginIndex, int endIndex)
		 * String subString(int beginIndex)
		 * 
		 * 2.ת��
		 * 2.1���ַ�������ַ������飨�ַ������и��
		 * String[] split(String regex);�漰��������ʽ��
		 * 2.2���ַ�������ַ������顣
		 * char[] toCharArray();
		 * 2.3���ַ���װ���ֽ����顣
		 * 2.4���ַ����е���ĸת����Сд��
		 * String toUpperCase();��д
		 * StringtoLowerCase();Сд
		 * 2.5���ַ����е����ݽ����滻��
		 * String replace(char oldch,char newch)
		 * String replace��String s1,String s2);
		 * 2.6���ַ������˵Ŀո����ɾ��
		 * String trim();
		 * 2.7���ַ�������
		 * String concat(String);
		 * 3.�ж�
		 * 3.1�����ַ��������Ƿ���ͬ
		 * Boolean equals(object obj);
		 * boolean equalsIgnoreCase(string str);���Դ�Сд�Ƚ��ַ�����
		 * 3.2�ַ����Ƿ���ָ���ַ�����
		 * Boolean contions(string str);
		 * 3.3�ַ����Ƿ���ָ���ַ�����ͷ���β��
		 * boolean startWith(String Str);
		 * boolean endsWith(String str);
		 * 4.�Ƚ�
		 * 
		 * 
		 * 
		 */
		System.out.println("abc".concat("kk"));
		System.out.println("abc"+"kk");
		System.out.println(String.valueOf(4)+1);
		stringMethodDemo_1();
		stringMethodDemo_2();
		stringMethodDemo_3();
		stringMethodDemo_4();

	}

	private static void stringMethodDemo_4() {
		// TODO �Զ����ɵķ������
		System.out.println("abc".compareTo("aqz"));
	}

	private static void stringMethodDemo_3() {
		// TODO �Զ����ɵķ������
		String s = "abc";
		System.out.println(s.equals("ABC".toLowerCase()));
		System.out.println(s.equalsIgnoreCase("ABC"));
		System.out.println(s.contains("cc"));
		String str = "ArrayDemo.java";
		System.out.println(str.startsWith("Array"));
		System.out.println(str.endsWith(".java"));
		System.out.println(str.contains("Demo"));
	}

	private static void stringMethodDemo_2() {
		// TODO �Զ����ɵķ������
		String s = "����,����,����";
		String[] arr = s.split(",");
		for(int i = 0; i< arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		char[] chs = s.toCharArray();
		for(int i = 0; i< chs.length; i++)
		{
			System.out.println(chs[i]);
		}
		s = "ab��";//ASCII������׼�������GBI������GBK������ֵ����
		byte[] bytes = s.getBytes();
		for(int i = 0; i< bytes.length; i++)
		{
			System.out.println(bytes[i]);
		}
		System.out.println("Abc".toUpperCase());//ת����Сд 
		String s1 = "java";
		String s2 = s1.replace('q','a');//�滻�ַ�
		System.out.println(s1==s2);	
		System.out.println("-"+"      ab c  ".trim()+"-");
	}

	private static void stringMethodDemo_1() {
		// TODO �Զ����ɵķ������
		
		String s = "abcdae";
		System.out.println("length:"+s.length());//6
		System.out.println("char:"+s.charAt(2));//cjava.lang.StringIndexOutOfBoundsException
		System.out.println("index;"+s.indexOf('k'));//0���ǿ��Ը���-1�ж��ַ��Ƿ����
		System.out.println("lastIndex:"+s.lastIndexOf('a'));//4
		System.out.println("subString:"+s.substring(2,s.length()));
	}

}

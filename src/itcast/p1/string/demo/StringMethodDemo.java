package cn.itcast.p1.string.demo;

public class StringMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ������������˼����ַ������й��ܷ��ࡣ
		 * ��abcd��
		 * 1.��ȡ��
		 * 1.1��ȡ�ַ����ַ��ĸ��������ȣ���
		 *          int length������
		 * 1.2����λ�û�ȡ�ַ���
		 *          ���� ��int index����
		 * 1.3���ݻ�ȡ���ַ����е�һ�γ��ֵ�λ�á�
		 *          int index��int ch��
		 *          int index ��int ch��int fromindex ����ָ��λ�ý�������
		 *          int indexof��string str��
		 *          int indexof��string str��intfromIndex����
		 *          int lastindex��int ch��
		 *          int lastindex ��int ch��int fromindex ����ָ��λ�ý�������
		 *          int lastindexof��string str��
		 *          int lastindexof��string str��intfromIndex����
		 * 1.4��ȡ�ַ����еĲ����ַ�����Ҳ���Ӵ���
		 *          String subString(int beginIndex,int endIndex)
		 *          String substring(int beginIndex)
		 * 2.ת��
		 * 2.1���ַ�������ַ�������  
		 *     String[] {String regex}:�漰��������ʽ
		 * 2.2���ַ�������ֽ����顣
		 *     char[] getBytes();
		 * 2.3���ַ���ת�������ַ����顣
		 *     char[] toCharArray();
		 *  2.4���ַ�����ĸת��Ϊ��Сд��
		 *     String toUpperCase();
		 *     string toLowerCase(0��
		 *  2.5���ַ����е������滻��
		 *     String replace(char oldch,char newCh)
		 *    
		 *  2.6���ַ������˵Ŀո�������
		 *  String trim();
		 *  2.7���ַ�������
		 *  String concat������
		 *  String valueOf();
		 *  3.�ж�
		 *  3.1�����ַ����Ƿ���ͬ��
		 *   boolean equals(object obj);
		 *   boolean equalsIgnoreCase(string str);���Դ�д�Ƚ��ַ�����
		 *  3.2�ַ����Ƿ����ָ���ַ�?
		 *   boolean contains(string str);
		 *  3.3�ַ����Ƿ�ָ���ַ������Ƿ���ָ���ַ�������
		 *  
		 *  4.�Ƚ�
		 *  
		 *                
		 *          
		 */
		stringMethodDemo_4();
		stringMethodDemo_3();
		stringMethodDemo_2();
		stringMethodDemo_1();
		
		System.out.println("abc".concat("kk"));
		System.out.println("abc"+"kk");
		
		System.out.println(String.valueOf(4)+1);
		System.out.println(""+4+1);

	}

	private static void stringMethodDemo_4() {
		// TODO Auto-generated method stub
		System.out.println("abc".compareTo("aqz"));
	}

	private static void stringMethodDemo_3() {
		// TODO Auto-generated method stub
		String s = "abc";
		System.out.println(s.equals("ABC".toLowerCase()));
		System.out.println(s.equalsIgnoreCase("ABC"));
		System.out.println(s.contains("bc"));
		
		String str = "ArrayDemo.java";
		System.out.println(str.endsWith(".java"));
		System.out.println(str.endsWith("Demo"));
	}

	private static void stringMethodDemo_2() {
		// TODO Auto-generated method stub
		String s = "����,����,����";
		String[] arr = s.split(",");
		for(int i = 0; i < arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		char[] chs = s.toCharArray();
		for(int i = 0; i < chs.length;i++)
		{
			System.out.println(chs[i]);
		}
		s = "ab��";
		byte[] bytes = s.getBytes();
		for(int i = 0; i < bytes.length;i++)
		{
			System.out.println(bytes[i]);
		}
		System.out.println("Abc".toUpperCase());
		String s1 = "java";
		String s2 = s1.replace('a', 'q');
		System.out.println(s2);
		System.out.println("-"+"    abc c  c ".trim()+"-");
		
		
	}

	private static void stringMethodDemo_1() {
		// TODO Auto-generated method stub
		String s = "abcdae";
		System.out.println("length:"+s.length());
		System.out.println("char:"+s.charAt(2));
		System.out.println("index:"+s.indexOf('k'));
		System.out.println("lastIndex:"+s.lastIndexOf('a'));
		
		System.out.println("substring:"+s.substring(2));
		
	}

}

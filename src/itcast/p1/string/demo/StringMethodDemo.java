package cn.itcast.p1.string.demo;

public class StringMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 按照面向对象的思想对字符串进行功能分类。
		 * “abcd”
		 * 1.获取：
		 * 1.1获取字符串字符的个数（长度）。
		 *          int length（）；
		 * 1.2根据位置获取字符。
		 *          插入 （int index）；
		 * 1.3根据获取在字符串中第一次出现的位置。
		 *          int index（int ch）
		 *          int index （int ch，int fromindex ）从指定位置进行索引
		 *          int indexof（string str）
		 *          int indexof（string str，intfromIndex）；
		 *          int lastindex（int ch）
		 *          int lastindex （int ch，int fromindex ）从指定位置进行索引
		 *          int lastindexof（string str）
		 *          int lastindexof（string str，intfromIndex）；
		 * 1.4获取字符串中的部分字符串，也叫子串。
		 *          String subString(int beginIndex,int endIndex)
		 *          String substring(int beginIndex)
		 * 2.转换
		 * 2.1将字符串变成字符串数组  
		 *     String[] {String regex}:涉及到正则表达式
		 * 2.2将字符串变成字节数组。
		 *     char[] getBytes();
		 * 2.3将字符串转换化成字符数组。
		 *     char[] toCharArray();
		 *  2.4将字符串字母转化为大小写。
		 *     String toUpperCase();
		 *     string toLowerCase(0；
		 *  2.5将字符串中的内容替换。
		 *     String replace(char oldch,char newCh)
		 *    
		 *  2.6将字符串两端的空格清除输出
		 *  String trim();
		 *  2.7将字符串链接
		 *  String concat（）；
		 *  String valueOf();
		 *  3.判断
		 *  3.1两个字符串是否相同？
		 *   boolean equals(object obj);
		 *   boolean equalsIgnoreCase(string str);忽略大写比较字符内容
		 *  3.2字符串是否包含指定字符?
		 *   boolean contains(string str);
		 *  3.3字符串是否指定字符串。是否以指定字符串结束
		 *  
		 *  4.比较
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
		String s = "张三,李四,王五";
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
		s = "ab你";
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

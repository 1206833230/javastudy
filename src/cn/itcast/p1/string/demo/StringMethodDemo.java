package cn.itcast.p1.string.demo;

public class StringMethodDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * 按照面对象的思想对字符串进行分类。
		 * “abcd”
		 * 1.获取;
		 * 1.1获取字符串长度。
		 * int length();
		 * 1.2根据卫视获取字符。
		 * char charAt(int index);
		 * 1.3根据字符获取在字符串中的位置。第一次出现的位置。
		 * int indexof(int ch)
		 * int indexof(int ch,int fromIndex)从指定位置开始索引
		 * int indexof(String str)
		 * int indexof(string str,int fromIndex)
		 * int lastindexof(int ch)
		 * int lastindexof(int ch,int fromIndex)从指定位置开始索引
		 * int lastindexof(String str)
		 * int lastindexof(string str,int fromIndex)
		 * 1.4获取字符串中的一部分字符串，也叫子串。
		 * String subString(int beginIndex, int endIndex)
		 * String subString(int beginIndex)
		 * 
		 * 2.转换
		 * 2.1将字符串变成字符串数组（字符串的切割）。
		 * String[] split(String regex);涉及到正则表达式。
		 * 2.2将字符串变成字符串数组。
		 * char[] toCharArray();
		 * 2.3将字符串装成字节数组。
		 * 2.4将字符串中的字母转化大小写。
		 * String toUpperCase();大写
		 * StringtoLowerCase();小写
		 * 2.5将字符串中的内容进行替换。
		 * String replace(char oldch,char newch)
		 * String replace（String s1,String s2);
		 * 2.6将字符串两端的空格进行删除
		 * String trim();
		 * 2.7将字符串链接
		 * String concat(String);
		 * 3.判断
		 * 3.1两个字符串内容是否相同
		 * Boolean equals(object obj);
		 * boolean equalsIgnoreCase(string str);忽略大小写比较字符串。
		 * 3.2字符串是否含有指定字符串。
		 * Boolean contions(string str);
		 * 3.3字符串是否以指定字符串开头或结尾。
		 * boolean startWith(String Str);
		 * boolean endsWith(String str);
		 * 4.比较
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
		// TODO 自动生成的方法存根
		System.out.println("abc".compareTo("aqz"));
	}

	private static void stringMethodDemo_3() {
		// TODO 自动生成的方法存根
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
		// TODO 自动生成的方法存根
		String s = "张三,李四,王五";
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
		s = "ab你";//ASCII美国标准交换码表GBI国标码GBK两万多字的码表
		byte[] bytes = s.getBytes();
		for(int i = 0; i< bytes.length; i++)
		{
			System.out.println(bytes[i]);
		}
		System.out.println("Abc".toUpperCase());//转化大小写 
		String s1 = "java";
		String s2 = s1.replace('q','a');//替换字符
		System.out.println(s1==s2);	
		System.out.println("-"+"      ab c  ".trim()+"-");
	}

	private static void stringMethodDemo_1() {
		// TODO 自动生成的方法存根
		
		String s = "abcdae";
		System.out.println("length:"+s.length());//6
		System.out.println("char:"+s.charAt(2));//cjava.lang.StringIndexOutOfBoundsException
		System.out.println("index;"+s.indexOf('k'));//0我们可以根据-1判断字符是否存在
		System.out.println("lastIndex:"+s.lastIndexOf('a'));//4
		System.out.println("subString:"+s.substring(2,s.length()));
	}

}

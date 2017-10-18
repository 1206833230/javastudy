package cn.itcast.p1.string.demo;

public class StringTest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nbafenbafasfnbaasde";
		String key = "nba";
		int count1 = getKeyStringCount_1(str,key);
		int count2 = getKeyStringCount_2(str,key);
		System.out.println("count="+count2+count1);

	}

	private static int getKeyStringCount_2(String str, String key) {
		// TODO Auto-generated method stub
		int count = 0;
		int index = 0;
		while((index = str.indexOf(key,index))!=-1) {
			index = index + key.length();
			count++;
			
			
		}
		return count;
	}

	public static int getKeyStringCount_1(String str, String key) {
		// TODO Auto-generated method stub
		//定义计数器
		int count = 0;
		//定义变量记录key出现的位置。
		int index = 0;
		while((index=str.indexOf(key))!=-1)
		{
			str = str.substring(index+key.length());
			count++;
		}
		
		return count;
	}
}
/*
 * 查找字符串中子字符串出现的次数“nbafenbafasfnbaasde”
 * 思路：
 * 1.要找的子串是否存在，如果存在获取出现的位置。这个可以使用indexOf完成。
 * 2.如果找到了，那么就记录位置继续查找。
 * 而剩余字符串起始的位置+子串长度。
 * 
 */

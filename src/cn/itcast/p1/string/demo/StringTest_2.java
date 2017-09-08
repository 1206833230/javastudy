package cn.itcast.p1.string.demo;

public class StringTest_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * 2.一个字符串在整 串中出现的字数
		 * "nabdanbaghnbaklasdasnbasdnbadsadsgnba"
		 * 思路：
		 * 1.要找子串是否存在如果存在就获取位置。
		 */
		String str = "nabdanbaghnbaklnabdanbaghnbasdnbadsadsgnba";
		String key = "nba";
//		int count = getKeyStringCount(str,key);
		int count = getKeyStringCount_1(str,key);
		System.out.println("count="+count);

	}

	private static int getKeyStringCount_1(String str, String key) {
		// TODO 自动生成的方法存根
		int count = 0;
		int index = 0;
		while((index = str.indexOf(key,index))!=-1) {
			index = index +  key.length();
			count++;
		}
		return count;
	}

//	private static int getKeyStringCount(String str, String key) {
//		// TODO 自动生成的方法存根
//		//1.定义计数器
//		int count = 0;
//		//2.定义变量记录可以出现的位位置
//		int index = 0;
//		while((index = str.indexOf(key))!=-1) {
//			str = str.substring(index+key.length());
//			count++;
//		}
//		return count;
//	}
//
}

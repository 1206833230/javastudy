/*
 * 查表法得
 */

package JavaStudy;

public class JavaArrayTeat4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String week = getWeek(7);
		System.out.println(week);

	}
	public static String getWeek(int num)
	{
		if(num<1 && num>7)
		{
			System.out.println("输入错误");
		}
		String[] weeks = {"","星期一","星期二","星期三",
				"星期四","星期五","星期六","星期日"};
		return weeks[num];
	}

}

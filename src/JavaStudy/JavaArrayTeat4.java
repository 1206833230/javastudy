/*
 * �����
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
			System.out.println("�������");
		}
		String[] weeks = {"","����һ","���ڶ�","������",
				"������","������","������","������"};
		return weeks[num];
	}

}

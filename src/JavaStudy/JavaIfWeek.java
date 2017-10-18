package JavaStudy;

public class JavaIfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 用户输入数据给对应的星期
		 * 需求: 根据用户输入数据，判断对应的星期。
		 * 思路：
		 * 因为输入的数据不确定，所以应该有判断语句
		 * 
		 */
		int week = 10;
		if (week==1)
			System.out.println("对应的中文为星期一");
		else if (week==2)
			System.out.println("对应的中文为星期二");
		else if (week==3)
			System.out.println("对应的中文为星期三");
		else if (week==4)
			System.out.println("对应的中文为星期四");
		else if (week==5)
			System.out.println("对应的中文为星期五");
		else if (week==6)
			System.out.println("对应的中文为星期六");
		else if (week==7)
			System.out.println("对应的中文为星期日");
		else 
			System.out.println("没有对的星期");
		/*
		 * 一年有四个季节
		 * 春：3，4, 5
		 * 夏：6，7，8
		 * 秋：9, 10， 11，
		 * 冬;12, 1, 2
		 */
		int month = 2;

		if(month==3 || month==4 || month==5)
			System.out.println(month+"月是春季");
		else if(month==6 || month==7 || month==8)
			System.out.println(month+"月是夏季");
		else if(month==9 || month==10 || month==11)
			System.out.println(month+"月是秋季");
		else if(month==12 || month==1 || month==2)
			System.out.println(month+"月是冬季");
		else 
			System.out.println("输入数据有误");
		int month2 = 13;
		if(month2>=3 && month2<=5)
			System.out.println("月是春季");
		else if (month2>=6 && month2<=8)
			System.out.println("月是夏季");
		else if(month2>=9 && month<=11)
			System.out.println("月是秋季");
		else if(month2==12 && month2==1 && month2 ==2)
			System.out.println("月是冬季");
		else 
			System.out.println("输入数据错误");
		

	}

}

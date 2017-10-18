package JavaStudy;

public class JavaSwithCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int x;
		 * swith(x) int，char
		 * {
		 *  case 1:
		 *   执行语句；
		 *   break；
		 *  case 2：
		 *  。。。。
		 *  default：
		 *   执行语句；
		 *   break；
		 *  }
		 */
		int a = 4,b = 2;
		char opr = '-';
		switch(opr)
		{
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			case '*':
				System.out.println(a*b);
				break;
			case '/':
				System.out.println(a/b);
				break;
			default:
				System.out.println("输入有错误");
				break;
		}
		/*
		 * 用户输入的数据对应的星期 
		 */
		int week = 10;
		switch(week)
		{
		case 1:
			System.out.println(week + "对应的星期一");
			break;
		case 2:
			System.out.println(week + "对应的星期二");
			break;
		case 3:
			System.out.println(week + "对应的星期三");
			break;
		case 4:
			System.out.println(week + "对应的星期四");
			break;
		case 5:
			System.out.println(week + "对应的星期五");
			break;
		case 6:
			System.out.println(week + "对应的星期六");
			break;
		case 7:
			System.out.println(week + "对应的星期日");
			break;
		default:
			System.out.println("输入数据有错误！");
			
			
		}

	}

}

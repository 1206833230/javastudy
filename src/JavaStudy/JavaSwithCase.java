package JavaStudy;

public class JavaSwithCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int x;
		 * swith(x) int��char
		 * {
		 *  case 1:
		 *   ִ����䣻
		 *   break��
		 *  case 2��
		 *  ��������
		 *  default��
		 *   ִ����䣻
		 *   break��
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
				System.out.println("�����д���");
				break;
		}
		/*
		 * �û���������ݶ�Ӧ������ 
		 */
		int week = 10;
		switch(week)
		{
		case 1:
			System.out.println(week + "��Ӧ������һ");
			break;
		case 2:
			System.out.println(week + "��Ӧ�����ڶ�");
			break;
		case 3:
			System.out.println(week + "��Ӧ��������");
			break;
		case 4:
			System.out.println(week + "��Ӧ��������");
			break;
		case 5:
			System.out.println(week + "��Ӧ��������");
			break;
		case 6:
			System.out.println(week + "��Ӧ��������");
			break;
		case 7:
			System.out.println(week + "��Ӧ��������");
			break;
		default:
			System.out.println("���������д���");
			
			
		}

	}

}

package JavaStudy;

public class JavaIfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �û��������ݸ���Ӧ������
		 * ����: �����û��������ݣ��ж϶�Ӧ�����ڡ�
		 * ˼·��
		 * ��Ϊ��������ݲ�ȷ��������Ӧ�����ж����
		 * 
		 */
		int week = 10;
		if (week==1)
			System.out.println("��Ӧ������Ϊ����һ");
		else if (week==2)
			System.out.println("��Ӧ������Ϊ���ڶ�");
		else if (week==3)
			System.out.println("��Ӧ������Ϊ������");
		else if (week==4)
			System.out.println("��Ӧ������Ϊ������");
		else if (week==5)
			System.out.println("��Ӧ������Ϊ������");
		else if (week==6)
			System.out.println("��Ӧ������Ϊ������");
		else if (week==7)
			System.out.println("��Ӧ������Ϊ������");
		else 
			System.out.println("û�жԵ�����");
		/*
		 * һ�����ĸ�����
		 * ����3��4, 5
		 * �ģ�6��7��8
		 * �9, 10�� 11��
		 * ��;12, 1, 2
		 */
		int month = 2;

		if(month==3 || month==4 || month==5)
			System.out.println(month+"���Ǵ���");
		else if(month==6 || month==7 || month==8)
			System.out.println(month+"�����ļ�");
		else if(month==9 || month==10 || month==11)
			System.out.println(month+"�����＾");
		else if(month==12 || month==1 || month==2)
			System.out.println(month+"���Ƕ���");
		else 
			System.out.println("������������");
		int month2 = 13;
		if(month2>=3 && month2<=5)
			System.out.println("���Ǵ���");
		else if (month2>=6 && month2<=8)
			System.out.println("�����ļ�");
		else if(month2>=9 && month<=11)
			System.out.println("�����＾");
		else if(month2==12 && month2==1 && month2 ==2)
			System.out.println("���Ƕ���");
		else 
			System.out.println("�������ݴ���");
		

	}

}

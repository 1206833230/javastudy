
/*
 *  �������þ��Ƕ�ջ��������ǽ�ջ��ջ������
 *  �ȵ���������main
 *  Ȼ����÷�������
 *  �����귽������֮�� ��ʹ��������main
 */
package JavaStudy;


public class JavaFunction {
	public static void main(String[] agrs)
	{
		/*
		 * ��һ�����ο���̨
		 */
		draw(10,10);
		System.out.println(getLevel(60));
		print99();
		System.out.println(getMax(3,9));
		System.out.println(equals(5,6));
	}
	public static void draw(int row,int col)
	{
		for(int x=1; x<=row; x++) 
		{
			for(int y=1; y<=col; y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		return ;//����ʡ��
	}
	/*
	 * ���󣺶���һ�������ж��������Ƿ����
	 * ��boolean
	 * 
	 */
	public static boolean equals(int a, int b)
	{
		if(a==b)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	/*
	 * ��ȡ�������������һ��
	 */
	public static int getMax(int a, int b)
	{
		return (a>b)? a:b;
	}
	/*
	 * ����һ������ 99�˷���
	 */
	public static void print99()
	{
		for(int x=1;x<=9; x++)
		{
			for(int y=1;y<=x; y++)
			{
				System.out.print(x+"*"+y+"="+x*y+"\t");
				
			}
			System.out.println();
		}
	}
	/*
	 * �ȼ� �ַ���char
	 * ���� int double
	 * 
	 */
	public static  char getLevel(int num)
	{
		char level;
		if(num>=90 && num<=100)
		    level = 'A';
		else if(num>=80 && num<=89)
			level = 'B';
		else if(num>=70 && num<=79)
			level = 'C';
		else if(num>=60 && num<=69)
			level = 'D';
		else if(num>=0 && num<=59)
			level = 'E';
		else
			level = 'F';
		return level;
			
	}

}

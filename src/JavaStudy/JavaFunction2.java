package JavaStudy;

public class JavaFunction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  ����������
		 *  ͬһ����
		 *  ͬ��
		 *  ������ͬ ���Ͳ�ͬ
		 *  �����ķ���ֵ�������޹�
		 *  Java���Ͻ������� ���ֲ�ȷ���Ծͻᷢ������
		 */
		System.out.println(add(4,5,5));
		print99();
		

	}
	public static int add(int a, int b) 
	{
		return a+b;
	}
	public static double add(double a,double b) 
	{
		return a+b;
	}
	public static int add(int a, int b,int c) 
	{
		return a+b+c;
	}
	public static void print99(int num)
	{
		for(int x=1;x<=num; x++)
		{
			for(int y=1;y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+x*y+"\t");
				
			}
			System.out.println();
		}
		}
		public static void print99()
		{
			print99(9);
			}
	

}

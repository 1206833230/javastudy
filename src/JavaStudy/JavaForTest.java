package JavaStudy;

public class JavaForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ��for�����ɳ��ۼ�
		 */
		int sum = 0;
		for(int x = 1; x <= 10; x++)
		{
			sum = sum + x;
		}
		System.out.println("sum="+sum);
		/*
		 * for��while���ص�
		 * 1��for��while���Ի���
		 * 2.��ʽ�ϵĲ�ͬ����ʹ������С����
		 * 3.�����Ҫͨ��ʹ�ñ�����ѭ�������ʱ�������ֳ�����
		 */
		int x = 1;
		while(x<5)
		{
			System.out.println("x="+x);
			x++;
		}
		System.out.println("x===="+x);
		/*
		 * x�����ټ�һ�Σ������˷��˴���ռ�
		 */
		for(int  y = 0;y<5;y++)
		{
			System.out.println("y="+y);
			
		}
			/*
			 * System.out.println("y==="+y);�޷�����һ�� ��ʡ��һ������ռ�
			 */
		/*
		 * ����ѭ����򵥵ı��ʽ
		 */
		/*
		 * while(true);
		 * for(;;) {}
		 * 
		 * ʲôʱ��ʹ��ѭ���ṹ�أ�
		 * ����ĳЩ�ظ�����ʱ�Ϳ���ʹ��ѭ���ṹ
		 * ����һ����������һ���ж�ʱ��ʹ��if���
		 * ����һ���������ж���ж�ʱ��ʹ��while���
		 * ѭ������Ҫ���ƴ���
		 */

	}

}

package JavaStudy;

public class JavaWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *��ϰ��ȡ��1��10��10�����ݵĺ�
		 *˼·��
		 *1.ÿ�βμӼӷ�����ֵ��ȷ��
		 *2.ÿ�γ��ֵĺ�����Ҳ��ȷ��
		 *3.���ֲ�����ӵ������е����Ĺ���
		 *4.ÿ�μӷ����㶼���ظ��ģ�����ÿ�ζ��Ǽ�������һ���ͺ���һ����
		 *����һ��������¼����ӷ����������
		 *����һ��������¼ÿһ�ν����
		 *���ڲμ�������ӵ����ݵ�����
		 *����ѭ���ṹ
		 *
		 */
		int x = 1;
		int sum = 0,sum1 = 0;
		while(x<=101)
		{
			sum = sum + x;
			x++;
			
		}
		
		
		sum1 = (1+101)/2*101;
	
		System.out.println("sum="+sum+",sum1="+sum1);
		/*
		 * ��ϰ1-100 ֮���6�ı����ĳ��ֵĴ���
		 * ˼�룺
		 * 1.��¼������ֵ�Ǳ仯��
		 * 2.�������ݵ�ֵ�仯��
		 * 3.������ֵ ���з�Χ��
		 * 
		 */
		 int m = 1;
		int sum2 = 0;
		while(m<=100)
		{
			if(m%6==0)
			{
				sum2++;
				m++;
				
			}
			else
			{
				m++;
			}
			
						
		}
		System.out.println("count="+sum2);
		

	}

}

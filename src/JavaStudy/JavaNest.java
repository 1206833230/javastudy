/*
 * ѭ��Ƕ�����
 */
package JavaStudy;

public class JavaNest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 1;
		for(int x = 0;x<3; x++)//��ѭ��
		{
			for(int y=0; y<4; y++)//��ѭ��
			{
				
				System.out.println("OK"+m);
				m++;
			}
			
		}
		for(int p = 0; p<4; p++)
		{
			for(int q = 0; q<4; q++) 
			{
			System.out.print("*");//���������
			}
			System.out.println();//��׼�Ļ���
		}
		for(int h = 0; h<5; h++) 
		{
			for(int j = 0; j<h;j++)
			{
				System.out.print("*"+j);
				
			}
			System.out.println();
		}
		System.out.println();
		for(int h = 5; h>0; h--) 
		{
			for(int j = 0; j<h;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		/*
		 * �žų˷���
		 * 1*1=1
		 * 1*2=2 2*2=4
		 * 1*3=3 2*3=6
		 * \n���з�
		 * \t�Ʊ��
		 * \b�˸��
		 * \r���»س���
		 * \ת���ַ�
		 */
		for(int j = 1; j<10; j++)
		{
			for(int i = 1; i<=j; i++)
			{
				System.out.print(i+"*"+j+"="+i*j+"\t");//��\t���Ʊ��
			}
			System.out.println();
		}
		System.out.println("\\Hello World\\");
		for(int x=1; x<=5; x++) 
		{
			for(int y = 1; y<x; y++)
			{
				System.out.print(" ");
				
			}
			for(int z=x; z<=5;z++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}

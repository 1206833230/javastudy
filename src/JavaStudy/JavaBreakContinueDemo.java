package JavaStudy;

public class JavaBreakContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * break ����
		 * break ���÷�Χ��Ҫô��swith��䣬Ҫôѭ�����
		 */
		for(int x=0; x<3; x++)
		{
			if(x==1)
			break;//����if������
			System.out.println("x="+x);
		}
		/*
		 * xiaoqiang:for(int x=0; x<3; x++)
		
		{
			wangcai:for(int y=0; y<4; y++)//����û�б��õ�
			{
				System.out.println("x="+x);
				break xiaoqiang;
			}
		
		}
		*/
		/*
		 * continue:����
		 * ���÷�Χ��ѭ���ṹ
		 * continue��������ѭ����ʼ�´�ѭ��
		 * continue��������ʱ���������䶼���������
		 */
		for(int x=0; x<11; x++)
		{
			if(x%2==0) 
			{
				continue;
				/*
				System.out.println("x="+x);//�޷���ִ�е����
				*/
			}
		}
		/*xiaoqiang:for(int x=0; x<3; x++)
			
		{
			wangcai:for(int y=0; y<4; y++)//����û�б��õ�
			{
				System.out.println("x="+x);
				continue xiaoqiang;
			}
		
		}
		*/

	}

}

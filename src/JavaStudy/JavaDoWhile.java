package JavaStudy;

public class JavaDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * while(�������ʽ)
		 * {
		 *  ִ����䣻
		 *  }
		 *  do
		 *  {
		 *  ִ����䣻
		 *  }
		 *  while(���ʽ����
		 *  do while������۳�������ѭ������Ȼִ��һ�Σ�
		 *  
		 */
		int x = 1;
		while(x<3)
		{
			System.out.println("x="+x);
			x++;
		}
		int y  = 1;
		do 
		{
			System.out.println("y="+y);
			y++;
		}
		while(y<3);

	}

}

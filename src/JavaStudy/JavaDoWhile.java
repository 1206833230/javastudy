package JavaStudy;

public class JavaDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * while(条件表达式)
		 * {
		 *  执行语句；
		 *  }
		 *  do
		 *  {
		 *  执行语句；
		 *  }
		 *  while(表达式）；
		 *  do while语句无论程序怎样循环语句必然执行一次；
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

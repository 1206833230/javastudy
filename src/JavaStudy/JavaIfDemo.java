/*������Ľ����һ��ֵʱ���������Ԫ���������
 * 
 */
package JavaStudy;

public class JavaIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello World!");
		/*
		 * if(�������ʽ)
		 * {
		 *  ִ����䣻
		 *  }
		 */
		int x = 3;
		{
		if(x>1) {
			System.out.println("yes");
			
		}
		System.out.println("over");
		
		}
		/* if(���ʽ)
		 * {
		 *  ִ����䣻
		 *  }
		 *  else
		 *  {
		 *   ִ����䣻
		 *   }
		 */
		int y = 1;
		if(y>1)
		{
			System.out.println("yes");
			
		}
		else
		{
			System.out.println("no");
		/*
		 * if (�������ʽ)
		 * {
		 *  ִ����䣻
		 *  }
		 *  else if
		 *  {
		 *   ִ����䣻
		 *  }
		 *  else
		 *  {
		 *   ִ����䣻
		 *   }
		 */  
			
		int z=3;
		if(z>1)
		{
		 System.out.println("a");
		 }
		 else if(z>2)
		{
			System.out.println("b");
		}
	     else if(z>3)
		{
			System.out.println("c");
		}
		else
		{
			System.out.println("z");
	
		}
		}
		
		/*{
			int s = 98;
		 System.out.println("hello world"+s);
		
	}
		System.out .println("hello word"+s);//s��{}�������֮��ͱ��ͷ���
		*/
		

	}
	}

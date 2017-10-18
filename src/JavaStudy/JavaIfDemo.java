/*当运算的结果是一个值时候可以用三元运算符代替
 * 
 */
package JavaStudy;

public class JavaIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello World!");
		/*
		 * if(条件表达式)
		 * {
		 *  执行语句；
		 *  }
		 */
		int x = 3;
		{
		if(x>1) {
			System.out.println("yes");
			
		}
		System.out.println("over");
		
		}
		/* if(表达式)
		 * {
		 *  执行语句；
		 *  }
		 *  else
		 *  {
		 *   执行语句；
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
		 * if (条件表达式)
		 * {
		 *  执行语句；
		 *  }
		 *  else if
		 *  {
		 *   执行语句；
		 *  }
		 *  else
		 *  {
		 *   执行语句；
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
		System.out .println("hello word"+s);//s在{}完成运算之后就被释放了
		*/
		

	}
	}

package JavaStudy;

public class JavaForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 用for语句完成成累加
		 */
		int sum = 0;
		for(int x = 1; x <= 10; x++)
		{
			sum = sum + x;
		}
		System.out.println("sum="+sum);
		/*
		 * for和while的特点
		 * 1。for和while可以互换
		 * 2.格式上的不同，在使用上有小区别
		 * 3.如果需要通过使用变量对循环体控制时，就体现出来了
		 */
		int x = 1;
		while(x<5)
		{
			System.out.println("x="+x);
			x++;
		}
		System.out.println("x===="+x);
		/*
		 * x可以再加一次，但是浪费了储存空间
		 */
		for(int  y = 0;y<5;y++)
		{
			System.out.println("y="+y);
			
		}
			/*
			 * System.out.println("y==="+y);无法增加一次 节省了一个储存空间
			 */
		/*
		 * 无限循环最简单的表达式
		 */
		/*
		 * while(true);
		 * for(;;) {}
		 * 
		 * 什么时候使用循环结构呢？
		 * 当对某些重复利用时就可以使用循环结构
		 * 当对一个条件进行一次判断时，使用if语句
		 * 当对一个条件进行多次判断时，使用while语句
		 * 循环下需要控制次数
		 */

	}

}

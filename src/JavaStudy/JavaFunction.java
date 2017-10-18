
/*
 *  函数调用就是堆栈的问题就是进栈出栈的问题
 *  先调用主函数main
 *  然后调用方法函数
 *  计算完方法函数之后 又使用主函数main
 */
package JavaStudy;


public class JavaFunction {
	public static void main(String[] agrs)
	{
		/*
		 * 画一个矩形控制台
		 */
		draw(10,10);
		System.out.println(getLevel(60));
		print99();
		System.out.println(getMax(3,9));
		System.out.println(equals(5,6));
	}
	public static void draw(int row,int col)
	{
		for(int x=1; x<=row; x++) 
		{
			for(int y=1; y<=col; y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		return ;//可以省略
	}
	/*
	 * 需求：定义一个功能判断两个数是否相等
	 * 有boolean
	 * 
	 */
	public static boolean equals(int a, int b)
	{
		if(a==b)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	/*
	 * 获取两个数中最大哪一个
	 */
	public static int getMax(int a, int b)
	{
		return (a>b)? a:b;
	}
	/*
	 * 定义一个功能 99乘法表
	 */
	public static void print99()
	{
		for(int x=1;x<=9; x++)
		{
			for(int y=1;y<=x; y++)
			{
				System.out.print(x+"*"+y+"="+x*y+"\t");
				
			}
			System.out.println();
		}
	}
	/*
	 * 等级 字符，char
	 * 分数 int double
	 * 
	 */
	public static  char getLevel(int num)
	{
		char level;
		if(num>=90 && num<=100)
		    level = 'A';
		else if(num>=80 && num<=89)
			level = 'B';
		else if(num>=70 && num<=79)
			level = 'C';
		else if(num>=60 && num<=69)
			level = 'D';
		else if(num>=0 && num<=59)
			level = 'E';
		else
			level = 'F';
		return level;
			
	}

}

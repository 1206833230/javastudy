package JavaStudy;

public class JavaWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *练习获取从1到10，10个数据的和
		 *思路：
		 *1.每次参加加法的数值不确定
		 *2.每次出现的和数据也不确定
		 *3.发现参与相加的数据有递增的规律
		 *4.每次加法运算都是重复的，并且每次都是假上早上一个和和下一个数
		 *定义一个变量记录参与加法运算的数据
		 *定义一个变量记录每一次结果和
		 *对于参加数据相加的数据的自增
		 *采用循环结构
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
		 * 练习1-100 之间的6的倍数的出现的次数
		 * 思想：
		 * 1.记录个数的值是变化的
		 * 2.遍历数据的值变化的
		 * 3.遍历的值 是有范围的
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

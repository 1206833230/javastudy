package JavaStudy;

public class JavaBreakContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * break 跳出
		 * break 作用范围，要么是swith语句，要么循环语句
		 */
		for(int x=0; x<3; x++)
		{
			if(x==1)
			break;//属于if语句控制
			System.out.println("x="+x);
		}
		/*
		 * xiaoqiang:for(int x=0; x<3; x++)
		
		{
			wangcai:for(int y=0; y<4; y++)//数据没有被用到
			{
				System.out.println("x="+x);
				break xiaoqiang;
			}
		
		}
		*/
		/*
		 * continue:继续
		 * 作用范围：循环结构
		 * continue结束本次循环开始下次循环
		 * continue单独存在时，下面的语句都是无用语句
		 */
		for(int x=0; x<11; x++)
		{
			if(x%2==0) 
			{
				continue;
				/*
				System.out.println("x="+x);//无法被执行的语句
				*/
			}
		}
		/*xiaoqiang:for(int x=0; x<3; x++)
			
		{
			wangcai:for(int y=0; y<4; y++)//数据没有被用到
			{
				System.out.println("x="+x);
				continue xiaoqiang;
			}
		
		}
		*/

	}

}

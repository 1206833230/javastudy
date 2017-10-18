/* 三元运算符（表达式）？表达式:表达式；
*/
package JavaStudy;

public class JavaThreeOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0,y = 0;
		y = (x>1)?100:200;
		System.out.println("y="+y);
		int a = 1,b = 2;
		int max = (a>b)?a:b;
		System.out.println(max);
		/*三个数取最大值
		 *int o,q,p;
		 *int max1 = o>q?o:q;
		 *int max2 = max1>p?max1:p;
		 *
		*/

	}

}

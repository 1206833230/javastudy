/*最高效的2*8的计算
 * 对于两个整数的值进行交换
 * 借用第三方变量 进行数值交换
 *  c = a
 *  a = b
 *  b = c
 */
package JavaStudy;
 

public class JavaOperationGood {
	public static void main(String[] agrs) {
		System.out.println(2<<3);//2*8=16
		int a = 3;
		int b = 5;
		int c;
		c = a;
		a = b;
		b = c;
		/*
		 * a = a ^ b;
		 * a = a ^ b;
		 * b = a ^ b;//面试的时候应用，开发的时候用的就是介质交换
		 */
		System.out.println("a="+a+",b="+b);
		
		/*
		a = a + b;
		b = a - b;
		a = a - b;
		*/
		//一般不能用这种方法 因为这种方法会出现超出int为范围造成越界

}
}
/*数据的运算都是二进制32位的数据运算
 * &与 |或 ^异或 ~取反运算
 * 一个数异或同一个数两次，结果还是这个数。
 * 数据的异或可以用于加密与解密
 * <<左移 一位（相当于这个数乘以2）
 * >>右移 一位（相当于这个数除以2）
 * >>>无符号右移 保证数据的正负性不变
 * 移动就是基于2的几次幂移动
 * 最高位会自动补位
*/package JavaStudy;

public class JavaBitOperation {
	public static void main(String[] agrs) {
		int a = 6;//110
		int b = 3;//011
		System.out.println("C="+(a&b));//110&011=010
		System.out.println("C="+(a|b));//110|011=111
		System.out.println("C="+(a^b));//110^011=101
		System.out.println(3<<2);//3*2^2=12
		System.out.println(6>>1);//6/2=3
		System.out.println(6>>2);//自动与最高位补缺位
		System.out.println(6>>>2);//无符号右移 保证数据的正负值不变
	}

}

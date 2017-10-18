/*变量的自我提升与类型转换
 * 数值类型不同无法运算
 * 自动类型提升已占用内存较大的类型为主
 * Unicode码表示全世界通用码表
 * ASCII码表 美国标准码表
 */
package JavaStudy;
 

public class JavaVariateUp {
	public static void main(String[] agrs) {
		int x=3;//四个字节4byte
		x= x + 5;
		byte b=5;
		x= x + b;
		b=(byte) (b + 200);//强制类型转化
		System.out.println(x);
		System.out.println(b+"强制类型转换");
		System.out.println('我'+1);//ASCII码
	}

}

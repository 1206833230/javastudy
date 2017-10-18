/*算术运算符：+ - * / %(取余数，模运算）
 * +(连接符）
 * ++自增
 * --自减
*/
package JavaStudy;

public class Javaoperation {
public static void main(String[] agrs) {
	int x= 6370;
	x=x/1000*1000;
	System.out.println(x);
	System.out.println(5%2);
	System.out.println(5%-2);
	System.out.println('2'+'3');
	System.out.println("2"+"3");
	int a=33,b=44;
	System.out.println(a+","+b);
	System.out.println("a="+a+","+"b="+b);
	int m = 3,n;
	m++;
	n= m++;
	short s=3;
	s = (short)(s + 4);
	//s+=4;
	System.out.println("s="+s);
	System.out.println("m="+m+","+"n="+n);
}
}

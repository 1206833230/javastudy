/*
 * 对文件进行分类管理
 * 给类提供多层命名空间。
 * 写在程序文件文件的的第一行。
 * 类名
 * 包的所有字母都是小写
 */
package JavaStudyDay14;

import javastudyday15.DemoA;

//import javastudyday15.DemoA;
//导包的原则：用到哪个类，就导导入哪个类。
//import 干嘛用的
public class PackageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoA d = new DemoA();
		d.show();
		javastuyday16.DemoB b = new javastuyday16.DemoB();
		b.method();
		System.out.println("package run");
		

	}

}
/*
 * 包与包之间进行访问，被访问的包中的类与方法必须是public的。
 *         public       protected      default    private
 *同一类中： OK             OK            OK         OK
 *同意包中： OK             OK            OK
 *  子类中： OK             OK
 *不同包中： OK
 */


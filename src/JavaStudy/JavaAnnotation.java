/*
 * 需求：练习一个hello world小程序
 * 思路：
 * 1.定义一个类，Java程序都以类的形式存在，一个字节码文件
 * 2.定义一个主类，保证程序的独立的运行
 * 3.在控制台显示
 * 步骤：
 * 1.用class定义一个可阅读的类名
 * 2.主函数public static void main（String【】 args）{};
 * 3.输出语句：System.out.println("hello world"）；
 * 
 * 
 * /*代码仅仅是思想的体现*/
/*这是一个用于演示hello world的小程序*/
package JavaStudy;

public class JavaAnnotation {//注释讲解
	public static void main(String[] agre) {
		System.out.println("hello world");
	}

}
/**
文档注释。
*/
//单行注释//单行注释可以嵌套
//注释可以用于程序的调试 注解说明
/*
多
行
注
释
*/
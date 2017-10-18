/*比较运算符
 * 运算完之后，都有运算结果。
 * 比较运算符的结果必须是true or false
 * 逻辑运算符
 * 用于连接boolean类型的表达式
 * &：与 true & true = true;true & false = false;
 *       false & false = false;
 * |: 或 true | true = true;false | false = false；
 * 只要有一边有一个true那么结果就是ture。
 */
package JavaStudy;
public class JavaCompare {
	public static void main(String[] agrs) {
		System.out.println(3>2);
		System.out.println(3==2);
		int x = 6;
		System.out.println(x>2&x<5);
	};

}

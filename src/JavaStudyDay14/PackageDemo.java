/*
 * ���ļ����з������
 * �����ṩ��������ռ䡣
 * д�ڳ����ļ��ļ��ĵĵ�һ�С�
 * ����
 * ����������ĸ����Сд
 */
package JavaStudyDay14;

import javastudyday15.DemoA;

//import javastudyday15.DemoA;
//������ԭ���õ��ĸ��࣬�͵������ĸ��ࡣ
//import �����õ�
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
 * �����֮����з��ʣ������ʵİ��е����뷽��������public�ġ�
 *         public       protected      default    private
 *ͬһ���У� OK             OK            OK         OK
 *ͬ����У� OK             OK            OK
 *  �����У� OK             OK
 *��ͬ���У� OK
 */


/*���Ч��2*8�ļ���
 * ��������������ֵ���н���
 * ���õ��������� ������ֵ����
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
		 * b = a ^ b;//���Ե�ʱ��Ӧ�ã�������ʱ���õľ��ǽ��ʽ���
		 */
		System.out.println("a="+a+",b="+b);
		
		/*
		a = a + b;
		b = a - b;
		a = a - b;
		*/
		//һ�㲻�������ַ��� ��Ϊ���ַ�������ֳ���intΪ��Χ���Խ��

}
}
/*��������������������ת��
 * ��ֵ���Ͳ�ͬ�޷�����
 * �Զ�����������ռ���ڴ�ϴ������Ϊ��
 * Unicode���ʾȫ����ͨ�����
 * ASCII��� ������׼���
 */
package JavaStudy;
 

public class JavaVariateUp {
	public static void main(String[] agrs) {
		int x=3;//�ĸ��ֽ�4byte
		x= x + 5;
		byte b=5;
		x= x + b;
		b=(byte) (b + 200);//ǿ������ת��
		System.out.println(x);
		System.out.println(b+"ǿ������ת��");
		System.out.println('��'+1);//ASCII��
	}

}

/*���ݵ����㶼�Ƕ�����32λ����������
 * &�� |�� ^��� ~ȡ������
 * һ�������ͬһ�������Σ���������������
 * ���ݵ����������ڼ��������
 * <<���� һλ���൱�����������2��
 * >>���� һλ���൱�����������2��
 * >>>�޷������� ��֤���ݵ������Բ���
 * �ƶ����ǻ���2�ļ������ƶ�
 * ���λ���Զ���λ
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
		System.out.println(6>>2);//�Զ������λ��ȱλ
		System.out.println(6>>>2);//�޷������� ��֤���ݵ�����ֵ����
	}

}

package JavaStudy;

public class JavaArrayProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //int[] arr = new int[] {89,45,56,576,76,356};//��������Ԫ�����Ͷ�������
		int[] arr1 = {78,454,66,877,90};
		
		/*
		 * ������Ļ����������Ǵ��ȡ
		 * ���ľ��Ƕ�����ű����
		 */
		//for(int x=0;x<=arr1.length ; x++)//�������Խ��java.lang.ArrayIndexOutOfBoundsException
		for(int x=0;x<arr1.length ; x++)
		{
		System.out.println("arr1["+x+"]="+arr1[x]+";");
		}
		/*
		 * ����ȡ��ֵ
		 * ˼·��
		 * 1.��Ҫ���бȽϣ������������¼���ֵ
		 * 2.������������
		 * 3.�����¼��ֵС�� ���������� ������ֵ
		 * 4.�ñ�����¼�����ֵ
		 */
		//int max = getMax(arr1);
		System.out.println(getMax_2(arr1));

	}
	 
		/*public  static int getMax(int[] arr)
		{
			int  maxElement = 0;
			for(int x=0;x<arr.length; x++)
			{
				if(arr[x]>maxElement)
					maxElement = arr[x];
			}
			return maxElement;
		}
		*/
		public  static int getMax_2(int[] arr)
		{
			int  maxIndex = 0;
			for(int x=0;x<arr.length; x++)
			{
				if(arr[x]>arr[maxIndex])
					maxIndex = x;
			}
			return arr[maxIndex];
		}

}

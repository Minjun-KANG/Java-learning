package example;

public class IrregularArray {

	public IrregularArray() {
		
		int intArray[][] = new int[4][];
		intArray[0] = new int[3];
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[2];
		/*
		 * �������� �迭��
		 * ������
		 * ����
		 * ������
		 * ����
		 * �����¸� ����.
		 */
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = (i+1)*10 + j;
				/*
				 * �ٽ��� intArray[i].length�� 2 3���� �ٲ�� ��. �ű⿡ 10 11 12 20 21  �����ε��µ�
				 */
			}
		}
		
		for (int i = 0; i < intArray.length; i++) { //���� �Ϳ� ��¹�
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.print(intArray[i][j]+" ");
			}
			System.out.println();
		}
			
	}

}
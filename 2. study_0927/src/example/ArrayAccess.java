
package example;
import java.util.Scanner;

public class ArrayAccess {

	public ArrayAccess() {
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5]; // �迭 ����
		/*
		 * intArray[]�� ���۷��������� �����ϰ�, new int[5]�� �����Ҵ� �ϴ°���
		 * intArray[]�� �������� �� ����� ������, new int[5]�� ������ �� ����ٴ� �Ҹ���.
		 * ���� i[0]�� ���۷��� ���� ��.
		 * 
		 *	int intArray[] = {0,1,2,3,4,5,6,7,8,9}; �� ���� �ִ� �͵� �����ϰ� �̵� ���� ����
		 * ���� �ϳ��� �迭�� �������� ���۷��������� �����ϴ� �͵� ����.
		 */
		int max=0; // ���� ���� ū ��
		System.out.println("��� 5���� �Է��ϼ���.");
		
		for(int i=0; i<5; i++) {
			intArray[i] = scanner.nextInt(); // �Է¹��� ������ �迭�� ����
			if(intArray[i] >max) // intArray[i]�� ���� ���� ū ������ ũ��
				max = intArray[i]; // intArray[i]�� max�� ����
		}
		System.out.print("���� ū ���� " + max + "�Դϴ�.");
		scanner.close();
		System.out.println("�迭�� ���̴� : "+ intArray.length);
		/*
		 * length�ʵ� ��. �迭�� �ڹٿ��� ��ü�� �������ϴµ�, �迭��ü�� �����ϸ� ���̻�����.
		 * 
		 */
	}

}


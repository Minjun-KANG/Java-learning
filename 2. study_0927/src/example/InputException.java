package example;
import java.util.Scanner;
import java.util.InputMismatchException; // �ش� ��Ű���� ����Ʈ���� ������ ����ó���� �Ұ�����. inputMismatchexception�� �ش� ��Ű���� ����.

public class InputException {

	public InputException() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���");
		int sum=0, n=0;
		for(int i=0; i<3; i++) {
			System.out.print(i+">>");
			try {
				n = scanner.nextInt(); // ���� �Է�
			}
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				scanner.next(); // �Է� ��Ʈ���� �ִ� ������ �ƴ� ��ū�� ������.
				i--; // �ε����� �������� �ʵ��� �̸� ����
				continue; // ���� ����
			}
			sum += n; // ���ϱ�
		}
		
		System.out.println("���� " + sum);
		scanner.close();
	}

}
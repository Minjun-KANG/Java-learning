
package example;
import java.util.Scanner;
/*
 * �ش� import������, java util scanner�� �ɾ��ִµ�, �̸� main������ ���۷��� ��ü�� ȣ���ϴ� ������ ������ ������, main������ ȣ���� �ص� ��ӹ޴°� ��� �׷��� ���Ծ���.
 * Ȥ main�� class�� ��ӹް�, main class��  scanner �����Ÿ� ���� �����ְ� �Ǹ� ����� ������ ������ ����.
 * */

public class BreakExample {

	public BreakExample() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		while(true) {
			System.out.print(">>"); 
			String text = scanner.nextLine();
			if(text.equals("exit")) // "exit"�� �ԷµǸ� �ݺ� ����
				break; // while ���� ���
			} //text.equals ���� ���̴µ� �̴� c�� string.h�� strcmp ���� ������. ������ ���ڿ��� ��Ȯ�� ��ġ�ؾ� �ȴٴ� �κ��� ����.
		System.out.println("�����մϴ�...");
		scanner.close();
	}

}
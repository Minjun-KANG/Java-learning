package example;
import java.util.Scanner;

public class DevideByZeroHandling {

	public DevideByZeroHandling() {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		while(true)
		{
			
			System.out.print("���� ���� �Է��Ͻÿ� : ");
			int devidend = scanner.nextInt(); //���� ���� �Է�
			System.out.print("���� ���� �Է��Ͻÿ� : ");
			int divisior = scanner.nextInt(); //���� ���� �Է�
			
			try {
				System.out.println(devidend +"�� " +divisior+"�� ������ ���� "+devidend/divisior+"�̴�.");
				break;
			}catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�.");
				//e�� �����̰�, ArithmeticException��, ������Ÿ���̴�. �ش� ������Ÿ���� java.langŬ������ �ҼӵǾ� �ְ�, 
				//�޼ҵ带 ȣ���ϵ� �Ķ���͸� �����ϴ°Ŵ�. �״ϱ� ������ �߻��ϸ� �ش� ������Ÿ�� ������ �Ķ���ͷ� �����ϰ�, catch�� �װ� ��Ƽ� ó���Ѵٴ� ��.
			}finally {//finally���� ���������ϴ�.
				n++;
				System.out.println("finally �� "+n+"�� �����.");
			}
			
		}

		scanner.close();
	}

}
/*
 * ArithmeticException - ������ 0���� ���� �� �߻�
 * NullPointerException - null ���۷����� ������ �� �߻�
 * ClassCastException - ��ȯ�� �� ���� Ÿ������ ��ü�� ��ȯ�� �� �߻�
 * OutOfMemoryError - �޸𸮺����� ���
 * ArrayIndexOutOfBoundsException - �迭�� ������ ��� ����
 * IllegalArgumentException - �߸��� ���� ���� �� �߻�
 * IOException - ����� ���� ���� �Ǵ� ���ͷ�Ʈ�� �߻�
 * NumberFormatException ���ڿ��� ��Ÿ���� ���ڿ� ��ġ���� �ʴ� Ÿ���� ���ڷ� ��ȯ �� �߻�
 * InputMismatchException Scanner Ŭ������ NextInt()�� ������ �Է¹������ ������, ����ڰ� ���ڸ� �Է��� �� �߻�
 * 
 * 
 */
package example;
import java.util.Scanner;



public class ScannerEx {

	public ScannerEx() {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in); //scanner ���۷��� ��ü�� �ϳ� ����� ���ÿ� ��ü�� ������.
		
		String name = scanner.next(); // ���ڿ� �б� ���Ͱ��� ȣ����
		/*
		 * �ڹٴ� �޼ҵ带 ȣ��� ���ÿ� �����ڰ� ȣ��Ǵ� ������ �˰�����. ���� CircleArea�� TypeConversion �Ѵ� Main���� ���� �۾��� ������ �ʰ��� ���Ͱ��� ȣ����� ����
		 */
		System.out.print("�̸��� " + name + ", ");
		String city = scanner.next(); // ���ڿ� �б�
		System.out.print("���ô� " + city + ", ");
		int age = scanner.nextInt(); // ���� �б�
		System.out.print("���̴� " + age + "��, ");
		double weight = scanner.nextDouble(); // �Ǽ� �б�
		System.out.print("ü���� " + weight + "kg, ");
		boolean single = scanner.nextBoolean(); // ������ �б�
		System.out.println("���� ���δ� " + single + "�Դϴ�.");
		scanner.close(); // scanner �ݱ� //�̷��� �ݾ������
		}
	//�̵� c�� ���������� �����̽��� ������ ���۸� �������´�. ���ڿ��� �����ؼ� �ι��Է��ϴ� �������� ���ۿ����÷ο츦 ����Ű�� ������ ���δ�.
}
package example;
import java.util.Scanner;
public class Main {
	//public Main() {}
	//��� class Main�̶�� �����ϴ� �͵� C������ ���� ������,
	//Main Ŭ������ ���� �⺻�����ڸ� �����Ϸ��� ���Ͱ��� �ڵ������ϰ� �־���. �ؿ� public static void main�� test Ŭ���� �ӿ� �ִ� main���� ���̴�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Circle pizza = new Circle();
		pizza.name = "�ڹ�����";
		pizza.radius = 10;
		double area = pizza.getArea();
		System.out.println("pizza�� �̸��� : "+pizza.name+" pizza�� ������ "+area);
		*/
		
		/*Rectangle rect = new Rectangle(); // ��ü ����
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		System.out.println("�簢���� ������ " + rect.getArea());
		scanner.close();*/
		
		
	}

}
/*
Ŭ���� ��������
��ü�� �ؾ�̰� Ŭ������ �ؾƲ�̴�.
������ ���ó�� �����̶� SUPERŬ��������, ����, �Ĺ��̶�� SUBŬ������ �����Ѵ�.

�����ε�(Overloading) : ���� �̸��� �޼ҵ带 ���� �� �����鼭 �Ű������� ������ ������ �ٸ����� �ϴ� ���
�������̵�(Overriding) : ���� Ŭ������ ������ �ִ� �޼ҵ带 ���� Ŭ������ ������ �ؼ� ����Ѵ�.

������
�����ڴ� �޼ҵ��̴�.
���� �������� �̸��� Ŭ�����̸��� �����ؾ��Ѵ�. �̴� Circle pizza = new Circle(); ������ �� �� �ִ�. 
�̰� Circle�� ���۷��� ���� pizza�� ����(Circle ��ü����)�ϸ�, new�� �Ҵ��ϴµ�, Circle�� �����ڿ� ���� �Ҵ��ϴ� ���̴�.
���� �����ڴ� �����ε��� ���� ������ ������ �� �ִ�.
���� ��� �������� Ÿ���� void��, return Ÿ���� ����. 
���� ����Ʈ �����ڸ� �ڵ������ϴµ�, ����ڰ� �޼ҵ�����ε����� ���� �����ڰ� �ִٸ�, ����Ʈ�����ڸ� �������� �ʴ´�.

this ���۷���
this�� Ŭ������ �������(�ʵ�)��, �޼ҵ��� �������� �̸��� ��ĥ �� ����Ѵ�.


*/
package example;

public class Circle {
	
	int radius; // ���� ������ �ʵ�
	String name; // ���� �̸� �ʵ�
	//System.out.println("heelo"); ���� ���� Ŭ������ ��� �ൿ�� �ְԵǸ� �Ұ����ϴ�.
	//������������ class�� state�� behavior�� ������ �Ǵµ�, �̴� state������ behavior�� ���� ������ �����ȴ�.
	
	public Circle() { } // ���� ������
	
	public double getArea() { // ���� ���� ��� �޼ҵ�
		return 3.14*radius*radius;
	}
	
	

}
package example5_5;

class Shape { // ���� Ŭ����
	public Shape next;
	public Shape() { next = null; }
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	static void paint(Shape p) { // static method�� non_static ����� �޼ҵ带 ����� �Ұ��ѵ�, Ŭ���� ���۷��� �����̹Ƿ� ��밡�� �׸��� ���δ� ��ĳ���õ�.
		p.draw(); // p�� ����Ű�� ��ü ���� �������̵��� draw() ȣ��.
		// ���� ���ε� - �Ѿ���� ���ڿ� ���� �ٲ�ȣ��
	}
	
	public static void main(String [] args) {
		
		Shape start, last, obj;
		// ��ũ�� ����Ʈ�� ���� �����Ͽ� ����
		start = new Line(); // Line ��ü ����
		last = start;
		
		obj = new Rect();
		last.next = obj; // Rect ��ü ����
		last = obj;
		
		obj = new Line(); // Line ��ü ����
		last.next = obj;
		last = obj;
		
		obj = new Circle(); // Circle ��ü ����
		last.next = obj;
		// ��� ���� ���
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}
	}
	/*
	 *�������̵��� Ȱ���� ��ũ�帮��Ʈ�� ������ �������ε� 
	 *
	 */
}
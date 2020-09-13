package ex6_1;

class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString()
	{
		return getClass().getName() + "#" + hashCode();
	} //Integer.toHexString�� ���� hashcode�� ������. �������̵���
}

public class ObjectPropertyEx {
	
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName()); // Ŭ���� �̸�
		System.out.println(obj.hashCode()); // �ؽ� �ڵ� ��
		System.out.println(obj.toString()); // ��ü�� ���ڿ��� ����� ���
		System.out.println(obj); // ��ü ���
	}
		
	public static void main(String [] args) {
		Point p = new Point(2,3);
		print(p);
	}
}
//��Ű�� - Ŭ���� �̸��� ��ĥ ��� -> ���� ����̶�� �������
//��� -> ��Ű���� �̹����� ����
//toString��, ��ü�� ���ڿ��� ��ȯ�Ѵ�. �̶�, return getClass().getName() + "@" + Integer.toHexString(hashcode()); �� �����̴�.
//print �޼ҵ忡����, �Ķ���ͷ� Object Ÿ���� �޴µ�, �̴� �ֻ��� ����Ŭ������ �ڵ� ��ĳ������ �ҷ����Բ� �Ѵ�.
package com.TryMethod.test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//system.out.println(hap(1,3)); //�̷��� �޼ҵ��� �Ű������� �޼ҵ�� �����°��� �߸��ȵ�
		int a = hap(1,3); //���� ���Ͱ��� �����ؾ���
		int b = 0b00000111;
		int c = 0xff;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static int hap(int a, int b)
	{
		return a+b;
	}
}
/*
	class��� ������ ����, ���� class�� ��� ������ ���ٴ°� ����
	���� class���� �����ϴ� �Լ��� �޼ҵ��� Ī��
	������ �츮�� public static void main(String[] args) ��� ������ ���� Main class�ȿ� main �޼��带 ��ӻ������
	public static void main(String[] args) �̴�,
	�������� ��� : public
	�ΰ������� : static
	�ڷ��� : void
	�̸� : main
	�Ű����� : String �迭������ args
	
	 void�� c������ ���� ���ϰ��� ������� �����ϴ� �Լ��Ű�����
*/
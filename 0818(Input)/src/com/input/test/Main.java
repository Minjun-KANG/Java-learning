package com.input.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//sc��ü ���� �� �޼��� �߰�
		Scanner sc = new Scanner(System.in);
		
		//���� �Է¹޴� �޼��� NextInt() 
		System.out.print("���� �Է� : ");
		int i = sc.nextInt();
		System.out.println("�Է��� ������ : "+i);
		
		System.out.print("�Ǽ� �Է� : ");
		float f = sc.nextFloat();
		System.out.println("�Է��� �Ǽ��� : "+f);
		sc.nextLine(); //���͸� �����Ͽ� ���۸� ����. ���͵� ���ڿ���
		
		System.out.print("���ڿ� �Է� : ");
		String name = sc.nextLine();
		System.out.println("�Է��� ���ڿ��� : "+name);
	}

}
/*
���ۿ����÷ο� ������ �����ϰ� ����
���� ���۸� ����ִ°� �ʿ�

��, �����̽��ٿ� ������� �ٸ����ڿ��� ó������ ����.
 */
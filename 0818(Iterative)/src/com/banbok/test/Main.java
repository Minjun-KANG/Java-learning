//�Է��� ������ 100���� Ȧ���� ����ϱ�

package com.banbok.test;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int i = sc.nextInt();
		
		if(i%2==0) //¦����ƾ
		{
			while(i<100)
			{
				System.out.println(i+=2);
			}
		}
		else //Ȧ����ƾ
		{
			while(i<99)
			{
				System.out.println(i+=2);
			}
		}
	}
}
/*
 Ư������ ���ǰ����� 0�� 1���� ���� �ȉ�, ���� true, false�� �־����,
 i%2�� ���� �����ڵ� ���� �ʾƼ� i%2==0 �� true�� ��ȯ�� �� �ִ� ���� �����ؾ���. 
*/
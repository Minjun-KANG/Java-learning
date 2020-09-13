package com.input.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//sc객체 생성 후 메서드 추가
		Scanner sc = new Scanner(System.in);
		
		//정수 입력받는 메서드 NextInt() 
		System.out.print("정수 입력 : ");
		int i = sc.nextInt();
		System.out.println("입력한 정수는 : "+i);
		
		System.out.print("실수 입력 : ");
		float f = sc.nextFloat();
		System.out.println("입력한 실수는 : "+f);
		sc.nextLine(); //엔터를 저장하여 버퍼를 비운다. 엔터도 문자열임
		
		System.out.print("문자열 입력 : ");
		String name = sc.nextLine();
		System.out.println("입력한 문자열은 : "+name);
	}

}
/*
버퍼오버플로우 개념이 동일하게 적용
따라서 버퍼를 비워주는게 필요

단, 스페이스바와 같은경우 다른문자열로 처리하지 않음.
 */

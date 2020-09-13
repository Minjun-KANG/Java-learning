//입력한 수부터 100까지 홀수만 출력하기

package com.banbok.test;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int i = sc.nextInt();
		
		if(i%2==0) //짝수루틴
		{
			while(i<100)
			{
				System.out.println(i+=2);
			}
		}
		else //홀수루틴
		{
			while(i<99)
			{
				System.out.println(i+=2);
			}
		}
	}
}
/*
 특이점은 조건값으로 0과 1같은 것이 안됌, 따라서 true, false를 넣어야함,
 i%2와 같은 연산자도 먹지 않아서 i%2==0 즉 true로 반환할 수 있는 값을 선정해야함. 
*/

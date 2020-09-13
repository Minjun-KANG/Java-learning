package com.iftest.test;

public class Main {

	public static void main(String[] args) {
	      String str = "문자열";
	      switch(str) {
	      case "문":
	         System.out.println("문");
	         break;
	      case "문자":
	         System.out.println("문자");
	         break;
	      case "문자열":
	         System.out.println("문자열");
	         break;
	      default:
	         break;
	      }
	   }

}
/*
C와 모든조건문의 형태가 같다.
하지만 위와같이 문자열을 설정하는 것과, 문자열을 switch case로 받을 수 있다.
*/
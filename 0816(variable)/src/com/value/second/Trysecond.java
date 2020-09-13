package com.value.second;

public class Trysecond {
//java는 절차지향언어에도 포함이되는 듯.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean type_boolean = false;
		System.out.println("bool type");
		System.out.println(type_boolean);
		
		byte type_byte = -128;
		System.out.println("byte type");
		System.out.println(type_byte);
		
		short type_short = -32768;
		System.out.println("short type");
		System.out.println(type_short);
		
		long type_long = 333333333L; // L을 붙여준다. long임을 알리기위해
		System.out.println(type_long);
		
		float type_float = 3.14F; //f를 붙여준다 float를 알리기위해 (대소문자는 상관없나보다)
		System.out.println(type_float);
	} 

}

/*
 
 자주사용하지 않았던 변수타입 // C와 다른점
 boolean 타입 - true or false 만 입력가능 0, 1은 들어가지도 않네 //c bool변수랑 같네
 byte 타입	8bit 정수 (-128~127)
 short 타입  16bit 정수(-32768~32767) //c랑같네
 long 타입
*/
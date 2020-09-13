package com.TryMethod.test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//system.out.println(hap(1,3)); //이렇게 메소드의 매개변수를 메소드로 보내는것은 잘못된듯
		int a = hap(1,3); //따라서 위와같이 진행해야함
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
	class라는 개념이 존재, 따라서 class를 벗어난 개념은 없다는게 정설
	따라서 class내에 존재하는 함수를 메소드라고 칭함
	기존에 우리는 public static void main(String[] args) 라는 문구로 인해 Main class안에 main 메서드를 계속사용했음
	public static void main(String[] args) 이는,
	접근제어 방식 : public
	부가적형식 : static
	자료형 : void
	이름 : main
	매개변수 : String 배열형식의 args
	
	 void는 c에서와 같이 리턴값이 없을경우 구성하는 함수매개변수
*/
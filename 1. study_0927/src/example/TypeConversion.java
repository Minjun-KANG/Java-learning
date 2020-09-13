package example;

public class TypeConversion { //예제 2.3

	public TypeConversion() {
		byte b = 127;
		int i = 100;
		System.out.println(b+i);
		System.out.println(10/4);
		System.out.println(10.0/4);
		System.out.println((char)0x12340041); //강제형변환 32bit의 데이터를 (char)연산을 통해 뒤에서 8bit끈어 0x41을 출력
		System.out.println((byte)(b+i)); //이도 강제형변환이 일어나서, 227의 binary값인 0b11100011 에, 맨앞을 부호비트처리하여 -29가 나옴. byte는 8bit  
		System.out.println((byte)0b11100011);
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);
	}

}

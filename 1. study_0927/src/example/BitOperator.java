package example;

public class BitOperator {

	public BitOperator() {
		short a = (short)0x55ff; //short 2byte; 
		short b = (short)0x00ff;
		// 비트 논리 연산
		System.out.println("[비트 연산 결과]");
		System.out.printf("%04x\n", (short)(a & b)); // 비트 AND
		System.out.printf("%3.2f\n", 132.354);
		System.out.printf("%08x\n",(short)(a & b)); // 비트 AND
		System.out.printf("%04x\n", (short)(a | b)); // 비트 OR
		System.out.printf("%04x\n", (short)(a ^ b)); // 비트 XOR
		System.out.printf("%04x\n", (short)(~a)); // 비트 NOT
		
		/*
		 * printf 무엇? ㅋㅋ; C언어에서의 printf 와 느낌은 비슷함
		 * C언어의 %3.2f 와 같음. 위 %04x는 4자리를 출력하되 왼쪽부터 0으로 채우고, 16진수를 출력하라 라는 의미.
		 * %3.2f는, 3자리를 출력하되 소수점은 2자리를 출력하라 하는거랑 똑같음 132.354 출력하면 132.35가 나오는거랑 같지
		 * 
		 * */
		byte c = 20; // 0x14
		byte d = -8; // 0xf8
		// 비트 시프트 연산
		System.out.println("[시프트 연산 결과]");
		System.out.println(c <<2); // c를 2비트 왼쪽 시프트
		System.out.println(c >>2); // c를 2비트 오른쪽 시프트. 0 삽입
		System.out.println(d >>2); // d를 2비트 오른쪽 시프트. 1 삽입
		System.out.printf("%x\n", (d >>>2)); // d를 2비트 오른쪽 시프트. 0 삽입
	}

}

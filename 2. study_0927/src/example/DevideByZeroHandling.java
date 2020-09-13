package example;
import java.util.Scanner;

public class DevideByZeroHandling {

	public DevideByZeroHandling() {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		while(true)
		{
			
			System.out.print("나뉨 수를 입력하시오 : ");
			int devidend = scanner.nextInt(); //나뉨 수를 입력
			System.out.print("나눔 수를 입력하시오 : ");
			int divisior = scanner.nextInt(); //나눔 수를 입력
			
			try {
				System.out.println(devidend +"를 " +divisior+"로 나누면 몫은 "+devidend/divisior+"이다.");
				break;
			}catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
				//e는 변수이고, ArithmeticException은, 데이터타입이다. 해당 데이터타입은 java.lang클래스에 소속되어 있고, 
				//메소드를 호출하듯 파라미터를 전달하는거다. 그니깐 오류가 발생하면 해당 데이터타입 변수를 파라미터로 전달하고, catch는 그걸 잡아서 처리한다는 뜻.
			}finally {//finally문은 생략가능하다.
				n++;
				System.out.println("finally 문 "+n+"번 실행됨.");
			}
			
		}

		scanner.close();
	}

}
/*
 * ArithmeticException - 정수를 0으로 나눌 때 발생
 * NullPointerException - null 래퍼런스를 참조할 때 발생
 * ClassCastException - 변환할 수 없는 타입으로 객체를 변환할 때 발생
 * OutOfMemoryError - 메모리부족의 경우
 * ArrayIndexOutOfBoundsException - 배열의 범위를 벗어난 접근
 * IllegalArgumentException - 잘못된 인자 전달 시 발생
 * IOException - 입출력 동작 실패 또는 인터럽트시 발생
 * NumberFormatException 문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환 시 발생
 * InputMismatchException Scanner 클래스의 NextInt()로 정수를 입력받을라고 했지만, 사용자가 문자를 입력할 때 발생
 * 
 * 
 */

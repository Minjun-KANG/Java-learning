package example;

public class ArrayException {

	public ArrayException() {
		int hello[] = new int[5];
		
		try {
		for(int i=0; i<5; i++)
		{
			hello[i] = i+3;
			System.out.println("hello["+i+"] = "+hello[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("index 벗어남 ㅋ");
		}
		
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
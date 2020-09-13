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
			System.out.println("index ��� ��");
		}
		
	}

}
/*
 * ArithmeticException - ������ 0���� ���� �� �߻�
 * NullPointerException - null ���۷����� ������ �� �߻�
 * ClassCastException - ��ȯ�� �� ���� Ÿ������ ��ü�� ��ȯ�� �� �߻�
 * OutOfMemoryError - �޸𸮺����� ���
 * ArrayIndexOutOfBoundsException - �迭�� ������ ��� ����
 * IllegalArgumentException - �߸��� ���� ���� �� �߻�
 * IOException - ����� ���� ���� �Ǵ� ���ͷ�Ʈ�� �߻�
 * NumberFormatException ���ڿ��� ��Ÿ���� ���ڿ� ��ġ���� �ʴ� Ÿ���� ���ڷ� ��ȯ �� �߻�
 * InputMismatchException Scanner Ŭ������ NextInt()�� ������ �Է¹������ ������, ����ڰ� ���ڸ� �Է��� �� �߻�
 * 
 * 
 */
package homework5;

public class MyStack {
	public static void main(String[] args) {
		
		GStack<String> stringStack = new GStack<String>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		stringStack.push("Uijeongbu");
		
		for(int n=stringStack.tos; n>0; n--) //int n=0; n<3; n++�� ������ ���� �ٲ�
		{
			System.out.println(stringStack.pop());
		}
		
		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		
		for(int n=intStack.tos; n>0; n--) { //�̵� ���������� �ٲ�
			System.out.println(intStack.pop());
		}
	}
}
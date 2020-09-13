package 과제4;
import java.util.Scanner;

abstract class Calc
{
	protected int a;
	protected int b;
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	public abstract int calculate();
}
class Add extends Calc
{
	@Override
	public int calculate() {
		return a+b;
	}
}
class Sub extends Calc
{

	@Override
	public int calculate() {
		return a-b;
	}
	
}
class Mul extends Calc
{
	@Override
	public int calculate() {
		return a*b;
	}
}
class Div extends Calc
{
	@Override
	public int calculate() {
		int c=0;
		try {
			c = a/b;
		}catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌 수 없습니다.");
		}
		return c;
	}
}
public class 과제4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 두 정수와 연산자를 입력하시오>> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		char operator = scanner.next().charAt(0);
		switch(operator)
		{
			case '+':
				Add add = new Add();
				add.setValue(a, b);
				System.out.println(add.calculate());
				break;
		
			case '-':
				Sub sub = new Sub();
				sub.setValue(a, b);
				System.out.println(sub.calculate());
				break;
			
			case '*':
				Mul mul = new Mul();
				mul.setValue(a, b);
				System.out.println(mul.calculate());
				break;
			
			case '/':
				Div div = new Div();
				div.setValue(a, b);
				System.out.println(div.calculate());
				break;
				
			default:
				System.out.println("연산자 입력을 잘못했습니다.");
		}
		
		scanner.close();
	}

}

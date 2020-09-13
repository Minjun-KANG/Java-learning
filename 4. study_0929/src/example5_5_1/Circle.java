package example5_5_1;

class Shape
{
	protected String name;
	public void paint()
	{
		draw();
	}
	public void draw()
	{
		System.out.println("Class is Shape - "+name);
	}
}
public class Circle extends Shape {
	protected String name; //name �ΰ�����, Ŭ������ �ٸ��⶧���� ����. ���������ڿ� �������.
	
	//Overriding
	public void draw()
	{
		name = "Circle"; // ��Ŭ���� name�� ��
		super.name = "Shape";
		super.draw();
		System.out.println("Class is Circle - "+name);
	}
	public static void main(String[] args)
	{
		//name = "hello"; ����ƽ����, non_static �� name�� ������� ���Ѵ�. 
		Shape b = new Circle(); //��ĳ�������� Shape type b���۷��� ���� �����ϰ� Cirle �Ҵ�
		b.paint(); // ��ĳ���� �Ǿ��� ������ b�� Circle�� paint��ü�� ��. ���� Shape class�� paint()����,
		//Paint()�� ����Ǹ鼭, draw()�� �������ε��� �Ͼ�� �޼ҵ�������̵� �� Circle��ü�� draw����, name�� Circle�� �ִµ�,
		//���� Ŭ������ name�� ���� ��(���尡���). ����, super.�����ڸ� ���� superŬ������ name�� Shape�� �ְ�, super.draw()�ϸ� �������ε��� ����Ŵ.
	}
}
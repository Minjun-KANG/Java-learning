package example;

class Person
{
	String name;
	String id;
	
	public Person(String name)
	{
		this.name = name;
	}
}

class Student extends Person
{
	String grade;
	String department;
	
	public Student(String name)
	{
		super(name);
	}
}


public class UpcastingEx {

	/*public static void main(String[] args) {
		Person p;
		Student s = new Student("������");
		p = s; //��ĳ����
		
		
		System.out.println(p.name);
		
		//p.grade = "A"; // �Ұ���
		
		//s�� Student ��ü�̴�. p�� Person ��ü�ε�,  p = s �ϴϱ�, p�� ��ĳ���� ��ٰ� �ϴµ�, 
		//���۷��� p�� �̿��ϸ� Person�� ������� ���ٰ����ϴ�
		 
	}*/
	/*public static void main(String[] args) {
		Person p = new Student("������"); //��ĳ���� 
		Student s = (Student)p; // �ٿ�ĳ���� ��������ȯ �ʿ�
		//���� ���� �����ϸ� �ɹ� s�� .grade�� ���� Student ��ü�� ����� ����� �����ϴ�.
		s.grade = "hello"; //����
	}*/
	/*public static void main(String[] args) {
		Person p = new Person("������"); //��ĳ���� 
		Student s = (Student)p; // �ٿ�ĳ���� ��������ȯ �ʿ�
		//���� ���� �����ϸ� �ɹ� s�� .grade�� ���� Student ��ü�� ����� ����� �����ϴ�.
		s.grade = "hello";
		System.out.println(s.grade); //s�� �ٿ�ĳ�������� ���� �����̰�, p�� ���ʿ� Person��ü�� ���� s.grade�� ���� ���Ѵ�. 
	}*/
}

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
		Student s = new Student("강민준");
		p = s; //업캐스팅
		
		
		System.out.println(p.name);
		
		//p.grade = "A"; // 불가능
		
		//s는 Student 객체이다. p는 Person 객체인데,  p = s 하니깐, p는 업캐스팅 됬다고 하는데, 
		//래퍼런스 p를 이용하면 Person의 멤버에만 접근가능하다
		 
	}*/
	/*public static void main(String[] args) {
		Person p = new Student("강민준"); //업캐스팅 
		Student s = (Student)p; // 다운캐스팅 강제형변환 필요
		//위와 같이 접근하면 맴버 s는 .grade와 같은 Student 객체의 멤버도 사용이 가능하다.
		s.grade = "hello"; //가능
	}*/
	/*public static void main(String[] args) {
		Person p = new Person("강민준"); //업캐스팅 
		Student s = (Student)p; // 다운캐스팅 강제형변환 필요
		//위와 같이 접근하면 맴버 s는 .grade와 같은 Student 객체의 멤버도 사용이 가능하다.
		s.grade = "hello";
		System.out.println(s.grade); //s는 다운캐스팅으로 찍은 변수이고, p를 애초에 Person객체로 만들어서 s.grade를 찍지 못한다. 
	}*/
}


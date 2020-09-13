package example;

class Person2 {
	Person2()
	{
		System.out.println("Person");
	}
}
class Student2 extends Person2 { 
	Student2()
	{
		System.out.println("Student");
	}
} 
class Researcher extends Person2 { 
	Researcher()
	{
		System.out.println("Researcher");
	}
}
class Professor extends Researcher { 
	Professor()
	{
		System.out.println("Professor");
	}
}

public class InstanceOfEx {
	
	static void print(Person2 p) {
		if(p instanceof Person2) //instanceof 사용예 맞으면 True 틀리면 false
			System.out.print("Person ");
		if(p instanceof Student2)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.print("new Student() ->\t"); 
		print(new Student2());
		System.out.print("new Researcher() ->\t"); 
		print(new Researcher());
		System.out.print("new Professor() ->\t"); 
		print(new Professor());
		
		
	}
}

package example;

public class BOOK2 { //예제 4.5는 오류가 있어서 내가 수정했다.

	String title;
	String author;
	void show() { System.out.println(title + " " + author); }
	
	public BOOK2() {
		this("", "");
		System.out.println("생성자 호출됨");
	}
	
	public BOOK2(String title) {
		this(title, "작자미상");
	}
	public BOOK2(String title, String author) {
		this.title = title; this.author = author;
	}
	
	public static void main(String [] args) {
		BOOK2 littlePrince = new BOOK2("어린왕자", "생텍쥐페리");
		BOOK2 loveStory = new BOOK2("춘향전");
		BOOK2 emptyBook = new BOOK2(); //생성자 호출로 인한 생성자 호출됨 출력
		
		littlePrince.show(); // 어린왕자 생텍쥐페리
		loveStory.show(); // 춘향전 작자미상
		emptyBook.show(); //출력되지만 공백출력임
	}
}

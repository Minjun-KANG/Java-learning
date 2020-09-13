package example;

public class Book {
	String title;
	String author;
	
	public Book(String t) { // 생성자
		title = t; author = "작자미상";
	}
	public Book(String t, String a) { // 생성자
		title = t; author = a;
	}
	public static void main(String [] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리"); // String t, a를 받는 새성자 호출
		Book loveStory = new Book("춘향전"); //String t를 받는 생성자 호출
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
	/*
	 * eclipse에서는 package 내에 Main이 많아도 RUN항목에서 골라 사용할 수 있다.
	 * */
}

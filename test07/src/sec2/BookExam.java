package sec2;

public class BookExam {

	public static void main(String[] args) {
		// 100개의 Book 배열 선언
		Book[] book = new Book[100];
		/* 방법1 이렇게 만들어도 됨
		for(int i=0;i<5;i++) {
			book[i] = new Book("책제목"+i,"저자"+i);
		}
		방법 2 | 일일히 나열해도 됨*/
		book[0] = new Book("자바 프로그래밍 입문", "박은종");
		book[1] = new Book("HTML/CSS", "전은철");
		book[2] = new Book("파이썬 독학", "김일섭");
		book[3] = new Book("JSP", "김이섭");
		book[4] = new Book("머신러닝", "김삼섭");
		
		for(int i=0;i<5;i++) {
			System.out.println(book[i].toString());
		
		}
	}
}

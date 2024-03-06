package sec1;

public class OverloadEx2 {

	public static void main(String[] args) {
		BookEx01 b = new BookEx01();
		b.setBno(01);
		b.setBname("혼자 공부하는 파이썬");
		b.setPrice(20000);
		b.setAuthor("김파이");
		b.setPub("위스덤하우스");
		
		BookEx01 b2 = new BookEx01();
		b2.setBno(02);
		b2.setBname("혼자 공부하는 머신러닝");
		b2.setPrice(18000);
		b2.setAuthor("김머신");
		b2.setPub("동아일보");
		
		BookEx01 b3 = new BookEx01();
		b3.setBno(03);
		b3.setBname("혼자 공부하는 딥러닝");
		b3.setPrice(16000);
		b3.setAuthor("김공부");
		b3.setPub("영풍문고");
		
		BookEx01 b4 = new BookEx01();
		b4.print(04);
		b4.print("혼자 공부하는 자바", 346);
		b4.print("김응원", "교보문고");
	}

}

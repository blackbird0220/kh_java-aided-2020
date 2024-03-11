package creational.abstactfactory;
//Abstract Factory Pattern : 추상 클래스에서 자식 추상 클래스로, 자식 추상 클래스는 구현 클래스로 상속받아 처리되게 하고
//Factory Method 패턴: Product를 만드는 create ()가 있으므로 이러한 것은 Factory Method
 
public class AbstractFactoryPattern {
	public static void main(String[] args) {

		if(args.length !=1) {
			System.out.println("전달된 환경변수가 존재하지 않습니다.");
			System.out.println("Class Name Not Found");
			System.out.println("Main Class 실행 오류");
		}
		
		final Factory factory = Factory.getFactory(args[0]);

		Link googleLink = factory.createLink("구글", "http://www.google.com");
		Link naverLink = factory.createLink("네이버", "http://www.naver.com");
		Link daumLink = factory.createLink("다음", "http://www.daum.net");
		
		final Tray searchTray = factory.createTray("검색엔진");

		searchTray.add(googleLink);
		searchTray.add(naverLink);
		searchTray.add(daumLink);
		
		final Page page = factory.createPage("검색엔진 리스트", "김응원");

		page.add(searchTray);
		page.output();
		
		/*
		 ListPage의 makeHTML() 메소드 내용이 출력 
		  
		  
		  */
		
		
	}

}

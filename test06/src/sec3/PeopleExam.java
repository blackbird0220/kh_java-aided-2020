package sec3;

public class PeopleExam {
	public static void main(String[] args) {
		People p1 = new People();
		p1.selNum = 200;  // People.selNum = 200; 와 동일 =>클래스 변수 ==정적필드 ==공유데이터
		p1.name = "김응원";	//인스턴스 변수 == 동적 필드
		p1.age =36;		
		p1.addr = "강서구";
				
		
				
		People p2 = new People();
		p2.selNum = 300; 	// = People.selNum = 200;
		p2.name = "박동빈";
		p1.age =46;		
		p1.addr = "강남구";
		
		p1.selNum = 400;
		
		
		System.out.println(p1.selNum+","+p1.name);
		System.out.println(p2.selNum+","+p2.name);
		
		p1.print1();
		p2.print1();
		
		p1.print2();	// = People.print2();
		p2.print2();	// = People.print2();
		
		//정적요소: static으로 선언된 필드 또는 메소드, 객체의 생성없이 활용가능
		//정적 메소드: 객체의 생성없이 해당하는 클래스에서 바로 활용하는 메소드
		System.out.println("정적 메소드= 클래스 메소드");
		
		People.print2();
		People.selNum = 500;
		
		p1.print1();
		p2.print1();
		
			
	}
}

package sec4;

public class ClassExam {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person p1 = new Person("김응원", 36);
		//p1 의 소속패키지 이름과 클래스명을 출력하라
		System.out.println("클래스명: "+p1.getClass().getName());
		
		Class<Person> p2 = Person.class;
		System.out.println("클래스명 : "+p2.getName());
		
		Class p3 = Class.forName("sec4.Person");
		System.out.println("클래스명 :"+p3.getName());

		Person p4 = (Person) p3.newInstance();
		p4.setName("김응원");
		p4.setAge(36);
		System.out.println("인스턴스 주소 :" +p4);
	}

}

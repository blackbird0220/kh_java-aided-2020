package creational.builder;
//Builer Pattern :멤버필드와 같은 구성원을 하나하나 쌓아 올ㄹ려 객체를 생성하는 패턴


class Student {
	private int no;
	private String name = "홍길동";
	private int point;
	private String phoneNumber;

	public Student(int no, String name, int point, String phoneNumber) {
		this.no = no;
		this.name = name;
		this.point = point;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", point=" + point + ", phoneNumber=" + phoneNumber + "]";
	}
	
}

class StudentBuilder {
	private int no;
	private String name;
	private int point;
	private String phoneNumber;


	@Override
	public String toString() {
		return "StudentBuilder [no=" + no + ", name=" + name + ", point=" + point + ", phoneNumber=" + phoneNumber
				+ "]";
	}

	public StudentBuilder no(int no) {
		this.no = no;
		return this;
	}

	public StudentBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public StudentBuilder point(int point) {
		this.point = point;
		return this;
		
	}

	public StudentBuilder phoneNumber(String phoneNumber) {
		this.phoneNumber =phoneNumber;
		return this;
	}

	public Student build() {
		return new Student(no, name, point, phoneNumber);
	}
	

}




public class BuilerPattern {

	

	public static void main(String[] args) {
		Student st1 = new StudentBuilder()
			.no(1001)
			.name("김응원")
			.point(120)
			.phoneNumber("010-4895-4929")
			.build();
		System.out.println(st1.toString());

		Student st2 = new Student(1002, "김연정", 100, "010-4983-4050");
		System.out.println(st2.toString());
			//생성자에 의한 Student
	}
}


package sec1;
//extends Object구절이 생략되어 있음, 그러므로 모든 클래스는 Object 클래스로부터 상속을 받는다
public class Student {	
	private int sno;
	String name;
	public Student() {
		
	}
	
	public Student(int sno, String name) {	//using field
		super();
		this.sno = sno;
		this.name = name;
	}


	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student clone = new Student();	// 해당 객체 생성
		clone.name = this.name;			// 새로 생성된 객체에 모든 필드 값을 넘기기
		clone.sno = this.sno;
		return clone();
	} //객체 복제시에는 반드시 clone()을 오버라이징해야함
	//아래부분처럼 equals 메서드를 오버라이딩하게 되면, 값 비교가 가능해짐
	//ㄷ
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student su1 = (Student) obj;
			if(su1.name == this.name &&su1.sno ==this.sno) {
				return true;
			} else {
				return false;
			}
		}
		return super.equals(obj);
	}
	
}

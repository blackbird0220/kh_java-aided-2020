package sec2;

public class Member {
	private int mno;
	private String mname;
	private int age;
	private String email;
	private int point;
	
	public Member() {}
	public Member(int mno, String mname, int age, String email, int point) {
		super();
		this.mno = mno;
		this.mname = mname;
		this.age = age;
		this.email = email;
		this.point = point;
	}
	
	
	
	
	
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	





}

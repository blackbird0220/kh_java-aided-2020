package org.kh.object1;
/*public (접근제한 범위가 넓음) > protected 같은패키지/ 상속받은 경우/연관 > 
default 같은패키지> private 현재클래스에서만 접근가능함 보안작업에 많이 쓰임(정보은닉 가능)
캡슐화, 메소드에는 private 절대 걸어놓지 않음
특정값으로 세팅하게 해주는 것- set, 얻어오는 거 ger, return문이 없으면 void */
public class Member {

	private String id;
	private String pw;
	private String email;
	private String birth;
	private String tel;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", email=" + email + ", birth=" + birth + ", tel=" + tel + "]";
	}
	
	
			
		/*
		public String getId(String id)
		public void setId(String id) {//괄호안에 매게변수- 외부에서 주는 값으로 데이터값을 산출하게 해주는 변수
			this.id = id;
		}
		public void setpw(String pw) {
			this.pw = pw;
		}*/
}

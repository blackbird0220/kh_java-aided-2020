package sec3;
class PwFormatException extends Exception{
	public PwFormatException(String msg) {
		System.out.println("msg : "+msg);
		System.out.println("암호의 형식 불일치");
	}
}


class Member {
	private String id;
	private String pw;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw)  throws PwFormatException {
		if(pw == null) {
			throw new PwFormatException("암호가 비어 있습니다.");
		} else if (pw.length()>=8 || pw.length()<20) {
			throw new PwFormatException("글자수가 8~20이 아닙니다");
		}
		this.pw = pw;
	}
}

public class UserExceptionExam2 {
	public static void main(String[] args) throws PwFormatException {
		Member mem1 = new Member();
		mem1.setId("admin");
		mem1.setId("1234");
		try {
			mem1.setPw("1234");
		}catch(PwFormatException e) {
			e.printStackTrace();
		}
		try {
			mem1.setPw(null);
		}catch(PwFormatException e) {
			e.printStackTrace();
		}
	}

}


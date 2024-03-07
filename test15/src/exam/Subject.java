package exam;

public class Subject {
	private int code; //과목코드
	private String sname; //과목명
	private String style; //과목평가방법
	
	public Subject() {}
	public Subject(int code, String sname,String style) {
		super();
		this.code = code;
		this.sname = sname;
		this.style = style;
		
		
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public String toString() {
		return "Subject [code=" + code + ", sname=" + sname + ", style=" + style + "]";
	}
	
	
	
}

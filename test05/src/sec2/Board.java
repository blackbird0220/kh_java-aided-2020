package sec2;

public class Board {
	private int bno;
	private String title;
	private String uname;
	private String content;
	private String resdate;
	private int visited;

	public Board(int bno) {
		this.bno = bno;
	}
	public Board(int bno, String title) {
		this.bno = bno;
		this.title = title;
	}
	
	
	
	public Board(int bno, String title, String uname) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
	}
	public Board(int bno, String title, String uname, String content) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
	}
	public Board(int bno, String title, String uname, String content, String resdate) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
		this.resdate = resdate;
	}
	public Board(int bno, String title, String uname, String content, String resdate, int visited) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
		this.resdate = resdate;
		this.visited = visited;
	
	}


	/* 생성자 오버로딩 : 생성자 함수에 매개변수의 종류나 개수에 따라 같은 이름의 생성자를 여러변 정의
		여러개의 매개변수를 통하여 객체를 생성하게 되면 set메서드를 활용할 필요없이
		멤버필드값을 적용하여 객체를 만들게 됨 */
	/*
	public Board() {}
	public Board(int bno) {
		this.bno = bno;
	}
	public Board(int bno, String title)	{
		this.bno = bno;
		this.title = title;
	}
	public Board(int bno, String title, String uname)	{
		this.bno = bno;
		this.title = title;
		this.uname = uname;
	}
	public Board(int bno, String title, String uname, String content)	{
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
	}
	public Board(int bno, String title, String uname, String content, int visited)	{
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
		this.visited;
	}
	
	
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	*/
}

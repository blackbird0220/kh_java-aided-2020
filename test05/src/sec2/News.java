package sec2;
//Top-Down방식의 생성자 함수 오버로딩 만들기
public class News {
	private int bno;
	private String title;
	private String uname;
	private String content;
	private String resdate;
	private int visited;

	public News(int bno, String title, String uname, String content, String resdate, int visited) {
		this(bno, title, uname, content, resdate, 0 )//this()현재 생성자함수 this.	
	}
	
		public News(int bno, String title, String uname, String content, String resdate, int visited) {	
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
		this.resdate = resdate;
		this.visited = visited;
	}

	@Override
	public String toString() {
		return "News [bno=" + bno + ", title=" + title + ", uname=" + uname + ", content=" + content + ", resdate="
				+ resdate + ", visited=" + visited + "]";
	}
	
}

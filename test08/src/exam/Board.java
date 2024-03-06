package exam;

public class Board {
	private int bno;
	private String title;
	private String bname;
	private String content;
	private String redate;
	private int visited;
	
	public Board() {
	public Board() {int bno, String title, String bname, String content, String redate, int visited;}
	
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
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRedate() {
		return redate;
	}
	public void setRedate(String redate) {
		this.redate = redate;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}
}

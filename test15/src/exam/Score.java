package exam;

public class Score {
	private int no;
	private int point;
	private Subject subject;

	public Score() {}
	public Score(int no, int point, Subject subject) {
		super();
		this.no = no;
		this.point = point;
		this.subject = subject;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Score [no=" + no + ", point=" + point + ", subject=" + subject + "]";
	}
	
	
}

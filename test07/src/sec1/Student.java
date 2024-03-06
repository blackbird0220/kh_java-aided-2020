package sec1;
//필드 : 번호, 국어, 영어, 수학
//메소드 : getter/setter 및 총점, 평균, 학점 모든 학생 정보 계산
//5명의 국어, 영어, 수학 점수를 Scanner를 활용하여 키


public class Student {
	//String name;
	private int no;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private float avg;
	
	public Student() { }
	public Student(int no, int kor, int eng, int mat) {
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;	
	}
	
	public int total() {
		return kor + eng + mat;
	}
	public float avg() {
		return (kor + eng + mat)/3.0f;
	}
	public String grade() {
		if(avg()>= 90) { 
			return "A";
		}
		else if(avg()>= 80) { 
			return "B";
		}
		else if(avg()>= 70) { 
			return "C";
		}
		else if(avg()>= 60) { 
			return "D";
		}
		else {return "F";}
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public void print () {
	System.out.println("Student [no=" + no + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]");
	System.out.println("총점 : "+total+"평균 : "+avg);
	}
	
}

	/* int total = kor + eng + mat;
	score*/
	
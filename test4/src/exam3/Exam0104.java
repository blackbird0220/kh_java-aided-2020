package exam3;
/*
 Q4. MyData와 Exam4 클래스를 완성해봅시다.
 <MyData 클래스 완성하기>
 -day, month, year 변수는 private으로 선언한다.
 -각 변수의 get, set 메서드를 public으로 만듭니다.
 -MyDate(int day, int month, int year) 생성자를 만듭니다.
 -public boolean isValid 
 */
//메인함수에만 public 붙일 수 있음

class MyData {
	private int day;
	private int month;
	private int year;

	MyData(int day, int month, int year){
		super.toString();
		this.day = day ;
		this.month = month ;
		this.year = year ;
		
		
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public boolean isValid() {
		boolean valid = false;
		if(month==2){
			if(day>29) valid = false;
			} else if (month==4 || month==6 || month==9 || month==11){
				if(day>0 && day<31) valid = true;
			} else {
				if(day>0 && day<32) valid = true;
			}
			return valid; 
	}	
	public void
	if(this.isValid()) System.out.println("유효한 날짜입니다.");	

}


public class Exam0104 {
	public static void main(String[] args) {
		if(this.isValid()) System.out.println("유효한 날짜입니다.");
	
	}
}

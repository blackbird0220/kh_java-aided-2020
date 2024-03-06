package exam;

public class Q3 {

	public static void main(String[] args) {	
		for(int i=2;i<10;i++) { //단i :2,4,6,8
			System.out.println(i+"단");
			for(int j=1;j<10;j++) {
				if (i<j) continue;
			System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
}

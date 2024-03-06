package exam;
//구구단 짝수 단만 나오게
public class Q2 {

	public static void main(String[] args) {
		for(int i=2;i<10;i+=2) { //단i :2,4,6,8
			System.out.println(i+"단");
			for(int j=1;j<10;j++)
				System.out.println(i+"*"+j+"="+i*j);
			
		}
		for(int i=1;i<10;i+=2) { //단i :2,4,6,8
			System.out.println("\t"+i+"단");
			for(int j=2;j<10;j++)
				System.out.print("\t"+j+"*"+i+"="+j*i+"\t");
			
		}
	
	}

}

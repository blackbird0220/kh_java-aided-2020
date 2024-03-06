package exam;

public class Q1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2= 2;
		char operator = '+';
		int result = 0;
		
		switch(operator) {
			case '+':
				System.out.println(result = num1 + num2);
			case '-':
				System.out.println(result = num1 - num2); ;
			case '*':
				result = num1 * num2 ;
			case '/':
				result = num1 / num2 ;
			default :
				System.out.println("연산오류");
				
		}
		
		
		if(operator == '+') {
			result = num1 + num2; 
		}
		else if(operator =='-' && num1 > num2) {
			result = num1 - num2;
		}
		else if (operator == '*') {
			result = num1 * num2 ;
		}
		else if(operator =='/') {
				result = num1 / num2;
			}
		else {
			System.out.println("연산오류");
		}
	}	
}

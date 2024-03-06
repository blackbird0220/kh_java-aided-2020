package sec4;

import java.util.Stack;

//스택(Stack) : 탑 같이 입력할 때는 쌓아 올려지고, 출력할 때는 반대로 맨 마지막에 입력한 가장위에 입력됨
//LIFO(후입선출법)
public class StackExam {

	public static void main(String[] args) {
		Stack<String> stack = new Stack();
		
		//요소 추가
		stack.push("사과");
		stack.push("파인애플");
		stack.push("멜론");
		stack.push("포도");
		stack.push("바나나");
		stack.push("귤");
		
		//한꺼번에 출력
		System.out.println(stack);
		
		System.out.println(stack.peek()); //맨 마지막 요소 반환
		System.out.println(stack.peek());
		System.out.println(stack.pop());	//맨 마지막 요소 반환 후 제거
		System.out.println(stack.pop());
		System.out.println(stack);
	}

}

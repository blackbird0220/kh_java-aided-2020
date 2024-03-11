package creational.prototype;

import java.util.List;

//Prototype(원형) Pattern : 
public class PrototypePattern {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1 = new Employee(); //Employee는 원본(prototype)
		emp1.loadDate();
		
		Employee emp2 = (Employee)emp1.clone();
		List<String> list = emp2.getEmpList();//prototype으로 얻어진 복제품
		list.add("김민식");
		for(String s:list) {
			System.out.println(s);
		}
	}
}

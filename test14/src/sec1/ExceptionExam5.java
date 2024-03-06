package sec1;

//classCastException : 형변환시 발생하는 예외

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class ExceptionExam5 {
	public static void main(String[] args) {
		
	}
	public static void changeAnimal(Animal animal) {
	try {
		Dog dog = (Dog) animal;
	}
	}
}

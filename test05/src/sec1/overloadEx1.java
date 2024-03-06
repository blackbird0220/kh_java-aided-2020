package sec1;

public class overloadEx1 {

	public static void main(String[] args) {
		Product print1 = new Product();
		print1.print();
		print1.print("krr");
		print1.print(56);
		print1.print("dsfs", 76);
		print1.print(76, "dsfs");

	}

}

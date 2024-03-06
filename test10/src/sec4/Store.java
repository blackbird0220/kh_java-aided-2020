package sec4;
// extends 다중상속 안됨 
//public class Pay extends Inventory{ }
public class Store extends Pay {

	@Override
	public void pay() {
		System.out.println("상점");
		super.pay();
	}

	@Override
	public void inventory() {
		System.out.println("재고 파악");
		super.inventory();
	}

	

}

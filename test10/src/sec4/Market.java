package sec4;
//implements 다중상속 가능
public class Market implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("판매");
		
	}

	@Override
	public void buy() {
		System.out.println("구매");
		
	}

	

}

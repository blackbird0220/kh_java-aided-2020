package factoryMethod;

public class IDCard extends Product {
	private String owner;
	
	public IDCard(String onwer) {
		System.out.println(owner+"의 카드를 만듭니다.");
		this.owner = owner;
		
	}

	@Override
	public void use() {
		 System.out.println(owner+"의 카드를 만듭니다."); 
		
	}

	public String getOwner() {
		return owner;
	}

	
}

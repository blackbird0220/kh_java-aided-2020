package exam3;
//출근길 별다방4000, 콩다방4500
//사람(human)
//별다방(StarCafe)
//콩다방(BeanCafe)
//메뉴(Menu

class Menu{
	final static int STARAMERICANO = 4000;
	final static int STARLATTE = 4300;
	final static int STARMACCHIATO = 4500;
	final static int BeanLATTE = 4100;
	final static int BeanARMACCHIATO = 4500;
	final static int BeanMACCHIATO = 4800;
	
}

class Human {
	String name;
	int money;
	
}
class StarCafe{
	int money;
	public String brewing(int money) {
		this.money+= money;
		if(money == Menu.STARAMERICANO) {
			return "별다방에서 아메리카노 구매"
		} else if(money == Menu.STARLATTE ) {
			return "별다방에서 라떼 구매"
		}
	}
}

public class exam197 {

}

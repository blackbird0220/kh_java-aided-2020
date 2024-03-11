package creational.abstactfactory;
//복습안해도 됨

public abstract class Factory {
	//Factory클래스의 getFactory () 메소드는 className 매개변수로 받은 클래스로 만들어진 것인가
	public static Factory getFactory(String className) {	//정적 메소드
		Factory factory = null;
		try {
			factory = (Factory) Class.forName(className).getDeclaredConstructor().newInstance();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스"+className+"이 발견되지 않았습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}  
		return factory;	
	}
	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title, String author);
	
}

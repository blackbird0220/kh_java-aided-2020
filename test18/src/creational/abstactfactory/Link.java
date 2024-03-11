package creational.abstactfactory;

public abstract class Link extends Item {
	protected String url;
	//<a href= "http://www.naver.com">네이버</a>
	//href 속성의 값("http://www.naver.com")
	
	public Link(String caption, String url) {
		super(caption);
		this.url = url;
	}
	public abstract String makeHTML();
}

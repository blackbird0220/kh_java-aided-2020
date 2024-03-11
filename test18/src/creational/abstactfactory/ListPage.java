package creational.abstactfactory;

public class ListPage extends Page {
	public ListPage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><head><title>"+title+"</title></head>\n");
		buffer.append("<body>\n");
		buffer.append("</body>\n");
		buffer.append("<h1>"+title+"</h1>");
		buffer.append("<u1>\n");
		for(Object o : content) {
			Item item = (Item) o;
			buffer.append("<li>"+item.makeHTML())
		}
	}

	
	
	
	
	
}

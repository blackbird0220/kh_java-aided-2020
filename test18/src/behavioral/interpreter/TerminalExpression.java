package behavioral.interpreter;

public class TerminalExpression implements Expression {
	@Override
	public boolean interpreter(String context) {
		// TODO Auto-generated method stub
		return false;
	}

	private String data;
	
	public TerminalExpression(String data) {
		this.data = data;
	}






}

package utility;

// Type your code
public class StringMethod {
	String text;
	
	public String lower(String text) {
		return text.toLowerCase();
	}
	
	public String upper(String text) {
		return text.toUpperCase();
	}
	
	public String first(String text) {
		char c = text.charAt(0);
		String s=Character.toString(c);
		return s;
	}
	
	public String len(String text) {
		int l = text.length();
		String length = Integer.toString(l);
		return length;
	}
	
	public String trimmer(String text) {
		return text.trim();
	}

	public void setInput(String input) {
		// TODO Auto-generated method stub
		
	}

	public String firstCharacter(String input) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getInput1() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getInput() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
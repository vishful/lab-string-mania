package utility;

// Type your code
public class StringAdvanceMethod {
	String input1, input2;
	char blah;
	public String getInput1(String input1) {
		return this.input1;
	}
	
	public String getInput2(String input2) {
		return this.input2;
	}
	
	public void setInput1() {
		this.input1=input1;
	}
	
	public void setInput2() {
		this.input2=input2;
	}
	
	public String concatenate(String input1, String input2) {
		return input1.concat(input2);
	}
	
	public String[] splitter(String input1, String input2) {
		return input1.split(input2);
	}
	
	public String indexval(String input1, String input22) {
		int val=input1.indexOf(input22);
		String finalVal=Integer.toString(val);
		return finalVal;
	}

	public String index(String input12, String input22) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
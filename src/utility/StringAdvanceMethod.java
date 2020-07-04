package utility;

// Type your code
public class StringAdvanceMethod {
	String inputA, inputB;
	char blah;
	public String getInputA(String inputA) {
		return this.inputA;
	}
	
	public String getInputB(String inputB) {
		return this.inputB;
	}
	
	public void setInputA() {
		this.inputA=inputA;
	}
	
	public void setInputB() {
		this.inputB=inputB;
	}
	
	public String concatenate(String inputA, String inputB) {
		return inputA.concat(inputB);
	}
	
	public String[] splitter(String inputA, String inputB) {
		return inputA.split(inputB);
	}
	
	public String index(String inputA, char blah) {
		int val=inputA.indexOf(blah);
		String finalVal=Integer.toString(val);
		return finalVal;
	}
	
}
package Amazon29;

public class Main {

	public static void main(String[] args) {
//		String code = "AAAAAAAAAAABBBCCDAA";
		String code = "MISSISSIPPI";
		String toDeCode = "6D2O7V1E";
		
		Coder coder = new Coder();
		
		String coded = coder.setCode(code);
		String deCoded = coder.deCode(toDeCode);
		
		System.out.println(code + " code set as " + coded);
		System.out.println(toDeCode + " decoded to " + deCoded);
	}

}

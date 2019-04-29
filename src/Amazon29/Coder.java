package Amazon29;

import java.text.NumberFormat;
import java.text.ParseException;

public class Coder {
	public Coder() {}
	
    //////------SETCODE--------//////
	
	public String setCode(String code) {
		String outString = "";
		char c = code.charAt(0);
		int count = 0;
		
		for(char x : code.toCharArray()) {
			if(x == c) {
				count++;
			}else{
				outString = outString + count + c;
				c = x;
				count = 1;
			}
		}
		outString = outString + count + c;
		return outString;
	}
	
    //////------DECODE--------//////
	
	public String deCode(String code) {
		String outString = "";
		int i = 0, step = 0;
		
		while(code.length()>0) {
			try {
				i = ((Number)NumberFormat.getInstance().parse(code)).intValue();
			} catch (ParseException e) {e.printStackTrace();}
		
			step = ((i+"").length());
			char c = code.charAt(step);
		
			for(int x = 0; x < i; x++ ) {outString += c;}
			code = code.substring(step+1);
		}
		return outString;
	}
}
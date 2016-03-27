package iq;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulation {
	
	public static void main (String [] args){ 
		String s = "janac";
		System.out.println(regexTest(s));
	}
	
	public static String regexTest(String s){
		Pattern p = Pattern.compile("[A-E]|[a-e]");
		Matcher m = p.matcher(s);
		return m.replaceAll("X");
	}

}

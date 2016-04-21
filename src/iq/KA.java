package iq;

import java.util.*;

public class KA {
	/*
	 * Complete the function below.
	 */

	/*
	 * Strategy 1: push any open braces onto the stack pop the stack if we get to
	 * a close brace and then compare
	 * 
	 * This passed 2/4 test cases. Not sure what the failed test cases were
	 * 
	 * 
	 */
	
	public static void main (String [] args){ 
		String [] s = new String [5]; 
		s[0] = "{{()}}[]"; //yes
		s[1] = "{[}]"; //no
		s[2] = "{{{{}]"; //no
		s[3] = "{{{{}}}}"; //yes
		for (String str : s){
			System.out.println(bracesOneLine(str));
		}
	}
	static String[] braces(String[] values) {
		String[] result = new String[values.length];
		for (int i = 0; i < values.length; i++) {
			result[i] = bracesOneLine(values[i]);
		}
		return result;
	}

	static String bracesOneLine(String s) {
		Stack<Character> stack = new Stack<Character>();
		String answer = "YES";
		if (s.length() % 2 == 1)
			return "NO m"; // since an odd size means there can't be a balance

		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == '{') || (s.charAt(i) == '(') || (s.charAt(i) == '[')) {
				stack.push(s.charAt(i));
			} else if (s.charAt(i) == '}') {
				if (stack.pop() != '{')
					return "NO";
			} else if (s.charAt(i) == ']') {
				if (stack.pop() != '[')
					return "NO";
			} else if (s.charAt(i) == ')') {
				if (stack.pop() != '(')
					return "NO";
			}
		}
		return answer;
	}
}

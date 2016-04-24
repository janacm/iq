package iq;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class StringManipulation {

	public static void main(String[] args) throws Exception {

		// checkPolygon();
		// String s = "";
		// s = "janac";
		// s = "a";
		// s = "aaa";
		// System.out.println(insertCow(s));
		System.out.println(convert(7792875));
		// regexTest(s);
	}

	/*
	 * New base converter strategy!
	 * Inspired by:  http://introcs.cs.princeton.edu/java/61data/
	 * 
	 * 1) divide input by 7,
	 * 2) collecting remainders Reverse the remainder list Convert each remainder
	 * 3) to atlassian encoding
	 */
	static String convert(long input) {
		ArrayList<Long> remainders = new ArrayList<>();
		long i = input;
		String result = "";
		StringBuffer b = new StringBuffer();

		// Collect all the remainders in a list
		while (i > 0) {
			remainders.add(i % 7);
			i = i / 7;
		}

		// Convert each remainder to a string, and add to Stringbuffer
		for (long remainder : remainders) {
			b.insert(0, String.valueOf(remainder));
		}

		// Run encoder on each character in StringBuffer and build final string
		for (int j = 0; j < b.length(); j++) {
			result += toBase7digit(String.valueOf(b.charAt(j)));
		}

		return result;

	}

	static String toBase7digit(String decimal) {
		String r = "";
		switch (decimal) {
		case "0":
			r = "0";
			break;
		case "1":
			r = "a";
			break;
		case "2":
			r = "t";
			break;
		case "3":
			r = "l";
			break;
		case "4":
			r = "s";
			break;
		case "5":
			r = "i";
			break;
		case "6":
			r = "n";
			break;
		default:
			r = "ERROR: impossible string";
			break;
		}
		return r;
	}

	public static void regexTest(String s) {
		Pattern p;
		Matcher m;
		try {
			// p = Pattern.compile("[A-E]|[a-e]"); //Compiled rep of a regex
			System.out.println("Word to match: " + s);
			String regex = "";
			regex = "a";
			// regex ="[abc]";

			System.out.println("Regex: " + regex);
			System.out.println();
			p = Pattern.compile(regex); // Compiled rep of a regex
			m = p.matcher(s); // performs match operations with pattern against
								// input string
			System.out.println("find " + regex + ": " + m.find()); // a match
																	// operation
			System.out.println("group " + regex + ": " + m.group());
			System.out.println("lookingAt " + regex + ": " + m.lookingAt()); // checks
																				// if
																				// the
																				// beginning
																				// of
																				// the
																				// input
																				// string
																				// matches
																				// the
																				// input
			// System.out.println("matches " + regex+ ": "+ m.matches());
			// //checks if the whole input string matches the pattern
			// System.out.println("replaceAll(X) "+ regex + ": " +
			// m.replaceAll("X"));
			System.out.println("start index: " + m.start()); // gives index of
																// last match.
																// Must be
																// called right
																// after a
																// successful
																// match
																// operation

		} catch (PatternSyntaxException e) {
			System.err.println("FARTS");
			e.getLocalizedMessage();
			e.printStackTrace();
		}
	}

	// similar to question found here:
	// http://codereview.stackexchange.com/questions/111440/decide-if-4-lengths-form-a-square-rectangle-or-neither

	/*
	 * Test cases by me: -2000 -2000 -2000 -2000 -2000 -2000 -2000 -1999 -1999
	 * -1999 -1999 -1999 -1 -1 -1 -1 0 0 0 0 1 1 1 1 10 10 10 10 2000 2000 2000
	 * 2000 -2000 -2000 2000 2000 -2000 -2000 2000 2000 -1999 -1999 2000 2000 -1
	 * -1 2000 2000 0 0 2000 2000 1 1 2000 2000 10 10 2000 2000 2000 2000 0 0 1
	 * 2 3 4 0 1 2 3 2000 1 2 3 -2000 1 2 3 1 1 1 1 1 200 200 1 200 1 1 1 1 1 1
	 * 200
	 */

	public static void checkPolygon() throws Exception {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> testCases = new ArrayList<String>();
		String line = null;
		while (!((line = br.readLine()).equals(""))) {
			testCases.add(line);
		}
		// for (int i =0; i<6; i++) testCases.add(br.readLine());

		// System.out.println("array lsitz" + testCases.toString());

		int[] dimensionInts = new int[4];
		int rectangles = 0;
		int squares = 0;
		int other = 0;

		for (String testCaseListString : testCases) {
			int i = 0;
			for (String dimension : testCaseListString.split(" ")) {
				dimensionInts[i] = Integer.parseInt(dimension);
				i++;
			}
			if ((dimensionInts[0] == dimensionInts[1]) && (dimensionInts[1] == dimensionInts[2])
					&& (dimensionInts[2] == dimensionInts[3]) && (dimensionInts[1] > 0))
				squares++;
			else if ((dimensionInts[0] == dimensionInts[2]) && (dimensionInts[1] == dimensionInts[3])
					&& (dimensionInts[0] > 0) && (dimensionInts[1] > 0))
				rectangles++;
			else
				other++;
		}
		System.out.println(squares + " " + rectangles + " " + other);
	}

	public static String insertCow(String s) {
		StringBuffer b = new StringBuffer(s);
		return b.insert(0, "COW").toString();
	}

}

package iq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

//public class StringManipulation implements Comparator<StringManipulation>{
public class StringManipulation {

	public static void main(String[] args) throws Exception {
		// System.out.println(Integer.valueOf("-75"));
		jsonParser();
		// checkPolygon();
		// String s = "";
		// s = "janac";
		// s = "a";
		// s = "aaa";
		// System.out.println(insertCow(s));
		// System.out.println(convert(7792875));
		// regexTest(s);
	}

	/*
	 * New base converter strategy! Inspired by:
	 * http://introcs.cs.princeton.edu/java/61data/
	 * 
	 * 1) divide input by 7, 2) collecting remainders Reverse the remainder list
	 * Convert each remainder 3) to atlassian encoding
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

			// gives index of   last match.   Must be   called right   after a   successful   match   operation 
			System.out.println("start index: " + m.start());
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

	/*
	 * Given this input in a file: Jun 23, 2015 11:00:00 PM
	 * org.apache.jsp.index_jsp _jspService
	 * 
	 * INFO: {"sq": 0, "vs": 3, "pf": 11, "sn":
	 * "1965f45398abbf9e995fe9eb18282510", "ht": [{"cn": 1, "ap": 0, "ss": -51,
	 * "s2": 2601, "s3": -132651, "si": "x524b976cd3bb7071", "sh": -51, "sm":
	 * "C49A02", "sl": -51, "ot": 1435100360, "ct": 1435100360}]}
	 * 
	 * Jun 23, 2015 11:00:00 PM org.apache.jsp.index_jsp _jspService
	 * 
	 * 
	 * INFO: {"sq": 0, "vs": 3, "pf": 11, "sn":
	 * "1965f45398abbf9e995fe9eb18282510", "ht": [{"cn": 1, "ap": 0, "ss": -75,
	 * "s2": 5625, "s3": -421875, "si": "x05c96aa3599619ef", "sh": -75, "sm":
	 * "00C610", "sl": -75, "ot": 1435100398, "ct": 1435100398}]}
	 * 
	 * 
	 * Jun 23, 2015 11:00:00 PM org.apache.jsp.index_jsp _jspService
	 * 
	 * INFO: {"sq": 0, "vs": 3, "pf": 11, "sn":
	 * "1965f45398abbf9e995fe9eb18282510", "ht": [{"cn": 1, "ap": 0, "ss": -85,
	 * "s2": 7225, "s3": -614125, "si": "x085ed8ad97ec29ab", "sh": -85, "sm":
	 * "6476BA", "sl": -85, "ot": 1435100340, "ct": 1435100340}]}
	 * 
	 * Jun 23, 2015 11:00:00 PM org.apache.jsp.index_jsp _jspService
	 * 
	 * INFO: {"sq": 0, "vs": 3, "pf": 11, "sn":
	 * "1965f45398abbf9e995fe9eb18282510", "ht": [{"cn": 1, "ap": 0, "ss": -71,
	 * "s2": 5041, "s3": -357911, "si": "x7aff7156cc42d14e", "sh": -71, "sm":
	 * "0C4885", "sl": -71, "ot": 1435100378, "ct": 1435100378}]}
	 * 
	 * Output this: 4 (info lines) 0 (warns) 1 (unique sn) 4 (unique si) -51
	 * (max ss value) closest to 0)
	 */
	public static void jsonParser() throws IOException {

		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT
		 */
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		File f = new File("json.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line = "";
		int info = 0;
		int warn = 0;
		int uniqueSn = 1;
		int uniqueSi = 1;
		ArrayList<String> sns = new ArrayList<>();
		ArrayList<String> sis = new ArrayList<>();
		ArrayList<Integer> ss = new ArrayList<>();

		while ((line = br.readLine()) != null) {
			if (line.contains("INFO")) {
				info++;
				String[] jsonPieces = line.split("\"");
				for (int i = 0; i < jsonPieces.length; i++) {
					// System.out.println(jsonPieces.length);
					if (jsonPieces[i].equals("sn")) {
						sns.add(jsonPieces[i + 2]);
					}
					if (jsonPieces[i].equals("si")) {
						sis.add(jsonPieces[i + 2]);
						// System.out.println("jsonPieces: " + jsonPieces[i]);
					}
					if (jsonPieces[i].equals("ss")) {
						String pieceWithSS = jsonPieces[i + 1];
						int start = pieceWithSS.indexOf(" ");
						int end = pieceWithSS.indexOf(",");
						int ssValue = Integer.valueOf(pieceWithSS.substring(start + 1, end));
						// System.out.println("ss: " + ssValue);
						ss.add(ssValue);
					}
				}
			} else if (line.contains("WARN")) {
				warn++;
				String[] jsonPieces = line.split("\"");
				for (int i = 0; i < jsonPieces.length; i++) {
					if (jsonPieces[i].equals("sn")) {
						sns.add(jsonPieces[i + 2]);
					}
					if (jsonPieces[i].equals("si")) {
						sis.add(jsonPieces[i + 2]);
					}
					if (jsonPieces[i].equals("ss")) {
						ss.add(Integer.valueOf(jsonPieces[i + 2]));
					}
				}
			} else {
				// date line
			}
		}
		// check for how many uniques si and sns there are by sorting the lists,
		// and incrementing by one if i != i+1
		int maxSs = Integer.MIN_VALUE;
		sns.sort(String::compareTo);
		sis.sort(String::compareTo);
		ss.sort(Integer::compareTo);
		System.out.println(Arrays.toString(sns.toArray()));
		for (int i = 0; i < sns.size() - 1; i++) {
			if (!(sns.get(i).equals(sns.get(i + 1))))
				uniqueSn++;
		}

		for (int i = 0; i < sis.size() - 1; i++) {
			if (!(sis.get(i).equals(sis.get(i + 1))))
				uniqueSi++;
		}

		for (int i = 0; i < ss.size(); i++) {
			if (ss.get(i) > maxSs)
				maxSs = ss.get(i);
		}

		/*
		 * // * 4 (info lines) // * 0 (warns) // * 1 (unique sn) // * 4 (unique
		 * si) // * -51 (max ss value)
		 */
		System.out.println(info);
		System.out.println(warn);
		System.out.println(uniqueSn);
		System.out.println(uniqueSi);
		System.out.println(maxSs);
		br.close();
	}

	public int compareTo(StringManipulation a, StringManipulation b) {
		return -1;
	}
}

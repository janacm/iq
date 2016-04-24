package dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;

/*
 * goal 
 * get linkedlist working via eclipse
 * add get method
 * add reverse
 */
public class Test2 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line ="";
		try{
			while ( !((line = br.readLine()).equals("")) ){
				caseStatement(line);
			}
		}catch (IOException e){
			e.printStackTrace();
		}
	}

	public static void caseStatement(String s) {
		switch (s) {
		case "janac":
			System.out.println("janac received");
			break;
		case "bobby":
			System.out.println("yaaradi bobbin");
			break;
		case "cow":
			System.out.println("MOOOOOOOO");
			break;
		}
	}

	public static void hashMapTest() {
		HashMap<String, Integer> ages = new HashMap<>();
		HashMap<String, Integer> ages2 = new HashMap<>();
		ages.put("janac", 22);
		ages.put("jimbo", 29);
		ages.put("bonanza", 30);

		ages2.put("janac", 22);
		ages2.put("jimbo", 29);
		ages2.put("bonanza", 30);

		System.out.println(ages.containsKey("janac"));
		String bimbo = "janac";
		System.out.println(ages.get(bimbo));
		System.out.println(ages.values());
		System.out.println(ages.size());
		System.out.println(ages.getOrDefault("farts", 999));
		System.out.println(ages2.equals(ages));
		System.out.println(ages2 == ages);
		ages2 = ages;
		System.out.println(ages2 == ages);
	}

	public static void janacLLTest() {
		JanacLL l = new JanacLL();
		l.add("a");
		l.add("b");
		l.add("c");
		System.out.println("Started");
		l.reverse();
		System.out.println(l.toString());
		// System.out.println(l.get(2));
	}

}

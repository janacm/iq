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
	public static void main(String[] args) throws Exception {
		// janacStackTest();
		Node currentNode = new Node("a");
		currentNode.next = new Node("b");
		currentNode.next.next = new Node("c");
		System.out.println("original: " + currentNode.value + currentNode.next.value + currentNode.next.next.value);
		reverseLinkedList(currentNode);
		System.out.println("after reverse: " + currentNode.value);
		System.out.print(currentNode.next.value);
		System.out.print(currentNode.next.next.value);
//		janacLLtest();
	}

	public static void caseStatement(String s) {
			// BufferedReader br = new BufferedReader(new
			// InputStreamReader(System.in));
			// line ="";
			// while ( !((line = br.readLine()).equals("")) ){
			// caseStatement(line);
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

	public static void janacStackTest() {
		JanacStack j = new JanacStack();
		j.push("janac");
		j.push("a");
		j.push("b");
		System.out.println(j.pop());
		System.out.println(j.pop());
		System.out.println(j.pop());
	}

	public static Node reverseLinkedList(Node currentNode) {
		// For first node, previousNode will be null
		Node previousNode = null;
		Node nextNode;
		while (currentNode != null) {
			nextNode = currentNode.next;
			// reversing the link
			currentNode.next = previousNode;
			// moving currentNode and previousNode by 1 node
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;
	}

	public static void janacLLtest() {
		JanacLL l = new JanacLL();
		l.add("a");
		l.add("b");
		l.add("c");
		System.out.println("Started");
		System.out.println("original LL: " + l.toString());
		System.out.println("stack reversed LL: " + l.stackReverse().toString());
		l.reverse();
		System.out.println("inplace reversed:" + l.toString());
		// System.out.println(l.get(2));
	}

}

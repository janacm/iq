package iq;
/*
 * goal 
 * get linkedlist working via eclipse
 * add get method
 * add reverse
 */
public class Test2 {
	public static void main (String [] args){
		JanacLL l = new JanacLL(); 
		l.add("a");
		l.add("b");
		l.add("c");
		System.out.println("Started");
		l.reverse();
		System.out.println(l.toString());
//		System.out.println(l.get(2));
	}

}

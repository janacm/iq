package iq;
import java.awt.*;
import iq.JanacLL;
public class Test{
	public static void main (String [] args){
//		JanacLL l = new JanacLL();
		System.out.println("bower" + (4^2)); //this is AND not power!
		System.out.println("bower" + (1^2));

		int [] arr = {1,2,3,4};
		System.out.println("cut: ");
		BinaryTree b = new BinaryTree();
		b.insert("a");
		b.insert("b");
		b.insert("c");
		b.insert("d");
		b.insert("e");
		b.preOrder();
//		System.out.println(b.getRoot());
		System.out.println("\n");
		b.postOrder();
		
	}
}

package iq;
import java.awt.*;
import iq.JanacLL;
public class Test{
	public static void main (String [] args){
//		System.out.println("sdfsdf");
//		String s = new String("sdf");
//		JanacLL l = new JanacLL();
		
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

package iq;

/*
* Singly Linked list implementation 
* - stores string values, using a nested node class
* - references to head and tail 

QUESTION
- does tail.next wrap around?
	- if yes, then modify add() 
*/

public class JanacLL {
	class Node {
		Node next = null;
		String value = null;
		public Node(String value){
			this.value = value;
		}
		
	}
	
	Node head;
	Node tail;
	int size=0;

	/* 
	* Adds an element to the end of the list 
	* if its the first element, then set head and tail to be this element
	* else tail.next = new elem, and tail = tail.next
	*/ 
	public void add(String e){
		if (size ==0){
			head = new Node(e);
			tail = head; 
			size =1;
		}else{
			tail.next = new Node(e);
			tail = tail.next; 
			tail.next = null;
			size++;
		}
	}
	
	/*
	 * Gets the element at the specified index
	 * 1 sets current to head
	 * 2 moves to next elem "index" number of times 
	 * 3 ex
	 * a-b-c-d
	 * get(3)
	 * abcd c=a, i=0 
	 * abcd c=b, i=1 
	 * abcd c=c, i=2
	 * abcd c=d, i=3
	 */
	public String get(int index){
		Node current = head; 
		for (int i = 0; i <index; i++){
			current = current.next; 
		}
		return current.value; 
	}
	
	/*
	 * Reverses the current list
	 * a-b-c-d, h=a, t=d
	 * d-c-b-a, h=d, t=a
	 * just switching the pointers doesn't make sense, because i need "c" to point to "b" as well
	 opt 1: use stack
	 * 1) push the linked list into a stack, and then pop into a new LL 
	 opt 2: in place
	 * 1) 
	 * 2
	 algo: swap two and repeat on next pair, from begining to end
	 abcd
	 bacd
	 bcad
	 bcda //wrong

	 algo: swap two, starting from the end to the beginning (aka: bring the last element to the from) 
	 abcd
	 abdc
	 adbc
	 dabc
	 dacb
	 dcab
	 dcba //correct :)

	 */
	 public void reverse(){
	 	Node current = head; //current = a
		head = current.next;
		current.next.next = current; //a->b->a //current = a, current.next = b
		current.next = null; //b->a  current.next = null, current = a, head = b 
	 }

	 /*
	 swap the element at the given index, and index+1
	 1) traverse to i 
	 2) swappy swap 
	*/ 
	public void swap2(int j){
		Node current = head;
		for (int i =0; i<j; i++){
			current= current.next;
		}
		
	}

	/*
	given two indices, swap the elements in this linked list
	1) traverse two pointers for i and j
	2) set i.next = j.next 
	3) set j.next = i
	*/
	public void swap2(int i, int j){
		Node elemi;
		Node elemj; 

	}
	
	
	
	/*
	* traverses through the list, until it reaches a null pointer (tail.next)
	* sample print out: 
	* 1->2->3->
	*/
	public String toString(){
		Node current = head;
		String s="";

		while (current !=null){
			s+=current.value + "->";
			current = current.next;
		}
		return s;
	}
}

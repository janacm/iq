package dataStructures;

public class JNode<E> {
	public JNode<E> next = null;
	public E value = null;

	public JNode(E value) {
		this.value = value;
	}

}

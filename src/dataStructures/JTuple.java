package dataStructures;

public class JTuple<K, V> {
	K key;
	V value;

	public JTuple(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public boolean equals(Object arg0) {
		return value.equals(arg0);
	}

	public int hashCode() {
		return value.hashCode();
	}

	public String toString() {
		return value.toString();
	}

}

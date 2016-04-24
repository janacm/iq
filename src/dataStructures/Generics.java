package dataStructures;

public class Generics<E extends Number> {
	public static <E extends Integer> E addOne(E num){
		Number d=3;
		d.byteValue();
		return num++;
	}
}

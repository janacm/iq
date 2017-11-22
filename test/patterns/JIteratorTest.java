package patterns;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class JIteratorTest<E> {

	@Test
	public void testArrayListIterator() throws Exception {
		String[] arr = { "a", "b", "c" };
		List<String> list = Arrays.asList(arr);
		String result = "";

		Iterator<String> iterator = list.iterator();
		Iterator<String> iterator2 = list.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(iterator2.next());
			result += next;
		}

		List<E> list1 = new ArrayList<E>();
		for (int i = 0; i < list1.size(); i++) {
			E e = list1.get(i); 
			e.toString();
		}

		assertEquals("abc", result);

	}
}

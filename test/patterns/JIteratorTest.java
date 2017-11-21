package patterns;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class JIteratorTest {

	@Test
	public void testArrayListIterator() throws Exception {
		String[] arr = { "a", "b", "c" };
		List<String> list = Arrays.asList(arr);
		String result = "";

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			result += next;
		}
		
		assertEquals("abc", result);

	}
}

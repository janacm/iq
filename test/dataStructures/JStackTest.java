package dataStructures;

import org.junit.Assert;
import org.junit.Test;

public class JStackTest {

	@Test
	public void test_size() throws Exception {
		JStack stack = new JStack();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		
		Assert.assertEquals(4, stack.size());

		while (!stack.isEmpty()){
			stack.pop();
		}
		Assert.assertEquals(0, stack.size());
	}
}

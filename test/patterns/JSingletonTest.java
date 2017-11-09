package patterns;

import org.junit.Assert;
import org.junit.Test;


public class JSingletonTest {
	
	@Test
	public void testSingleton() throws Exception {
		JSingleton jSingleton1 = JSingleton.getInstance(); 
		JSingleton jSingleton2 = JSingleton.getInstance(); 
		Assert.assertEquals(true, jSingleton1 == jSingleton2);
	}

}

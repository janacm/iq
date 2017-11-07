package ctci;

import org.junit.Assert;
import org.junit.Test;

public class ArraysAndStringsTest {
	ArraysAndStrings aas = new ArraysAndStrings();
	
	@Test
	public void q11_test() throws Exception {
		Assert.assertEquals(true, aas.q11_IsUnique("abcd"));
		Assert.assertEquals(false, aas.q11_IsUnique("aacd"));
	}
	
	@Test
	public void q12_test() throws Exception{
		Assert.assertEquals(true, aas.q12_IsPermutation("abcd", "dcba"));
		Assert.assertEquals(false, aas.q12_IsPermutation("aacd", "aljx"));
		Assert.assertEquals(false, aas.q12_IsPermutation("aacd", "aacdd"));
		Assert.assertEquals(false, aas.q12_IsPermutation("aacd", null));
	}

}

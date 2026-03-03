package generics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PairUnitTest {
	
  @Test
  public void testFirstFromPair() {
	  Pair<Integer, String> p1 = new Pair<>(10, "elf");
	  Integer result = p1.getFirst();
	  Assert.assertEquals(result, 10);
  }
  
  @Test
  public void testSecondFromPair() {
	  Pair<Integer, String> p1 = new Pair<>(10, "elf");
	  String result = p1.getSecond();
	  Assert.assertEquals(result, "elf");
  }
  
  @Test
  public void testFirstFromSwappedPair() {
	  Pair<Integer, String> p1 = new Pair<>(10, "elf");
	  Pair<String, Integer> p2 = p1.swap();
	  String result = p2.getFirst();
	  Assert.assertEquals(result, "elf");
  }
  
  @Test
  public void testSecondFromSwappedPair() {
	  Pair<Integer, String> p1 = new Pair<>(10, "elf");
	  Pair<String, Integer> p2 = p1.swap();
	  Integer result = p2.getSecond();
	  Assert.assertEquals(result, 10);
  }
  
}

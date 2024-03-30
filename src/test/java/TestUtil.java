import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }
  
  @Test
  public void testArgsLength_1(){
  assertFalse(c.compute(4));//array length 1
  }
   
  @Test
  public void testArgsLengthEven(){
  assertFalse(c.compute(4,1));//2 tane elemanlı args arrayi
  }
  
}

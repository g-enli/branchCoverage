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
  
  @Test(expected = RuntimeException.class)//exception beklenen durum
  public void testOneArg_0(){
   
	c.compute(0,1,3);//length 1 değil, even değil üst iflere takılmadan* arg=0dan exception at
	// Eğer buraya kadar hata oluşmadıysa test başarısız olmalı
	fail("Bir RuntimeException bekleniyordu, ancak hiçbir exception fırlatılmadı.");
       
  }
  @Test
  public void testSumDivibleByOneArg(){
  assertTrue(c.compute(3,3,3));//*
  }
  @Test
  public void testSumNonDivibleArgs(){
  assertFalse(c.compute(13,11,7));//*
  }
}

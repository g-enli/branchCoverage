import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void testConstructor() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }
  
  @Test
  public void testSize_0() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(0);
    assertEquals(-1,c.countNumberOfOccurrences(""));
  }
  
  @Test
  public void testDontContainString() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(1);//size=0'a takılmasın
    String e = anyString();
    when(mq.contains(e)).thenReturn(false);
    assertEquals(0,c.countNumberOfOccurrences(e));//0 bekliyorum 0 geldi olmalı
  }
  
}

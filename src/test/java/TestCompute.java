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
  
  @Test
  public void testCounterEquals() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(5);//size'a takılmasın
    String e = anyString();
    when(mq.contains(e)).thenReturn(true);//containse takılmasın
    when(mq.getAt(anyInt())).thenReturn(e);
    assertEquals(5,c.countNumberOfOccurrences(e));//count değerini dönsün
  }
  
  @Test
  public void testCounterNotEquals() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(5);//size'a takılmasın
    String e = anyString();
    when(mq.contains(e)).thenReturn(true);//containse takılmasın
    when(mq.getAt(0)).thenReturn(e);
    when(mq.getAt(1)).thenReturn(null);
    when(mq.getAt(2)).thenReturn(null);
    when(mq.getAt(3)).thenReturn(null);
    when(mq.getAt(4)).thenReturn(null);
    assertEquals(1,c.countNumberOfOccurrences(e));//count değerini dönsün
  }
}


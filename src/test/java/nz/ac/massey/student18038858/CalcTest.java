package nz.ac.massey.student18038858;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {
  private final Calc calc = new Calc();

  @Test
  public void testAdd() {
    assertEquals(4, calc.add(2, 2));
  }
}

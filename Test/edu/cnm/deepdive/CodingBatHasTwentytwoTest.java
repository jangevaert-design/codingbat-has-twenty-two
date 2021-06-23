package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatHasTwentytwoTest {

  private int[][] twentyTwoParams = {
      {1, 2, 2},
  {1, 2, 1, 2},
  {2, 1, 2},
  {2, 2, 1, 2},
  {1, 3, 2},
  {1, 3, 2, 2},
  {2, 3, 2, 2},
  {4, 2, 4, 2, 2, 5},
  {1, 2},
  {2, 2},
  {2},
  {},
  {3, 3, 2, 2},
  {5, 2, 5, 2}
  };

  private boolean[] twentyTwoExpected = {true, false, false, true, false, true, true, true, false, true,
  false, false, true, false};

  @Test
  void twentyTwoTest() {
    for (int i = 0; i < twentyTwoParams.length; i++) {
      boolean actual = CodingBatHasTwentytwo.has22(twentyTwoParams[i]);
      Assertions.assertEquals(actual, twentyTwoExpected[i]);
    }
  }

}
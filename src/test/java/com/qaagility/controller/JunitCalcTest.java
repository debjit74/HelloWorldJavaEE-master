package com.qaagility.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
 
public class JunitCalcTest {

      public void testSlow() {
        System.out.println("slow");
      }

      public void testSlower() {
        System.out.println("slower");
      }

      public void testFast() {
        System.out.println("fast-updated");
      }

	@Test	
      public void JunittestCalc() {
        assertEquals("Result", 10, 9);
      }

	@Test	
      public void JunittestCalc1() {
        assertEquals("Result - Fail", 9, 9);
      }
	
	
}

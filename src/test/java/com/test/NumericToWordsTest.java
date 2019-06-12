package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumericToWordsTest {
	
	@Test
	public void testNumericToWord_onedigit() {
		NumericToWords obj = new NumericToWords();
		assertEquals("NINE",obj.convert(9L, 1));
		
	}
	
	@Test
	public void testNumericToWord_twodigit() {
		NumericToWords obj = new NumericToWords();
		assertEquals("TWENTY NINE",obj.convert(29L, 2));
		
	}
	
	@Test
	public void testNumericToWord_threedigit() {
		NumericToWords obj = new NumericToWords();
		assertEquals("TWO HUNDRED AND TWENTY NINE",obj.convert(229L, 3));
		
	}
	@Test
	public void testNumericToWord_three_digit() {
		NumericToWords obj = new NumericToWords();
		assertEquals("ONE HUNDRED AND FIVE",obj.convert(105L, 3));
		
	}
	@Test
	public void testNumericToWord_fourdigit() {
		NumericToWords obj = new NumericToWords();
		assertEquals("TWO THOUSAND TWO HUNDRED AND TWENTY NINE",obj.convert(2229L, 4));
		
	}
	@Test
	public void testNumericToWord_fivedigit() {
		NumericToWords obj = new NumericToWords();
		assertEquals("TWENTY TWO THOUSAND TWO HUNDRED AND TWENTY NINE",obj.convert(22229L, 5));
		
	}
	@Test
	public void testNumericToWord_sixdigit() {
		NumericToWords obj = new NumericToWords();
		assertEquals("TWO LACK TWENTY TWO THOUSAND TWO HUNDRED AND TWENTY NINE",obj.convert(222229L, 6));
		
	}
	@Test
	public void testNumericToWord_sevendigit() {
		NumericToWords obj = new NumericToWords();
		assertEquals("TWENTY TWO LACK TWENTY TWO THOUSAND TWO HUNDRED AND TWENTY NINE",obj.convert(2222229L, 7));
		
	}
	@Test
	public void testNumericToWord_eightdigit() {
		NumericToWords obj = new NumericToWords();
		assertEquals("TWO CRORE TWENTY TWO LACK TWENTY TWO THOUSAND TWO HUNDRED AND TWENTY NINE",obj.convert(22222229L, 8));
		
	}

}

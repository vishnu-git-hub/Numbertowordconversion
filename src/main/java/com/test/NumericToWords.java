package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumericToWords {
	static Map<Long, String> mapObject = new HashMap<Long, String>();
	static Long number;
	static String word;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the number:");
		number = sc.nextLong();
		System.out.println(convert(number, number.toString().length()));
	}

	protected static String convert(Long number, int length) {
		if (length == 0) {
			System.out.println("Enter Correct number");
			return "";
		} else if (length == 1 || number <= 9) {
			word = printOneDigit(number);

		}else if(length == 2 || number <=99) {
			word= printTwoDigit(number);
		}else if(length == 3 || number <=999) {
			word = printThreeDigit(number);
		}else if(length == 4 || number <=9999) {
			word = printFourDigit(number);
		}else if(length == 5 || number <= 99999) {
			word = printFiveDigit(number);
		}else if( length ==  6 || number <=999999) {
			word = printSixDigit(number);
		}else if(length == 7 || number <=9999999) {
			word = printSevenDigit(number);
		}else if(length == 8 || number <=99999999) {
			word = printEightDigit(number);
		}
		return word;
	}

	private static String printEightDigit(Long number) {
		String localWord = "";
		localWord = localWord + printOneDigit(number/10000000);
		localWord = localWord + " CRORE ";
		if(number>0) {
			localWord = localWord + printSevenDigit(number%10000000);
		}
		return localWord;
	}

	private static String printSevenDigit(Long number) {
		String localWord= "";
		if(number/100000>0) {
			localWord = printTwoDigit(number/100000);
			localWord = localWord + " LACK ";
		}
		if(number%100000>9999) {
			localWord = localWord + printFiveDigit(number%100000);
		}else if((number%10000)>999) {
			localWord = localWord + printFourDigit(number%10000);
		}else if( (number%1000)>99) {
			localWord = localWord + printThreeDigit(number%1000);
		}else if((number%100)>9) {
			localWord = localWord + printTwoDigit(number%100);
		}else if((number%10>0)) {
			localWord = localWord + printOneDigit(number%10);
		}
		return localWord;
	}

	private static String printSixDigit(Long number) {
		String localWord="";
		if((number/100000)>0) {
			localWord = printOneDigit(number/100000);
			localWord = localWord + " LACK ";
		}
		if(number>0) {
			localWord = localWord + printFiveDigit(number%100000);
		}
		return localWord;
	}

	private static String printFiveDigit(Long number) {
		String localWord="r";
		if(number/1000>0) {
			localWord = printTwoDigit(number/1000);
			localWord = localWord + " THOUSAND ";
		}
		if((number%1000) > 99 ) {
			localWord = localWord+ printThreeDigit(number%1000);
		} else if((number%1000)>9) {
			localWord = localWord + printThreeDigit(number%100);
		}else if(number%10>0) {
			localWord = localWord + printOneDigit(number%10);
		}
		return localWord;
		
	}

	private static String printFourDigit(Long number) {
		String localWord;
		if( number % 10 ==0 && number % 100 ==0 && number%1000 == 0) {
			return mapObject.get(number/1000) + " THOUSAND " ;
			}
		else {
		localWord = mapObject.get(number/1000) + " THOUSAND ";
		localWord = localWord + convert(number%1000,3);
		return localWord;
		}
			
	}

	private static String printThreeDigit(Long number) {
		String localword;
		if(number % 10 == 0 && number%100 ==0)
			return mapObject.get(number/100) + " HUNDRED AND ";
		else {
			
			localword = mapObject.get(number/100) + " HUNDRED AND ";
			localword = localword + convert(number%100,2);
		}
		return localword;
	}

	private static String printTwoDigit(Long number) {
		if(number%10==0)
		return mapObject.get(number) + "";
		else if (number <20) {
			return mapObject.get(number) + " ";
		}else {
			String word = "";
			word = mapObject.get(number-number%10)!=null? mapObject.get(number-number%10) : "" + " ";
					return word+" "+printOneDigit(number%10);
		}
	}

	private static String printOneDigit(Long number) {
		return mapObject.get(number)!=null? mapObject.get(number):""+" ";

	}
	static {
		mapObject.put(0L, "");
		mapObject.put(1L, "ONE");
		mapObject.put(2L, "TWO");
		mapObject.put(3L, "THREE");
		mapObject.put(4L, "FOUR");
		mapObject.put(5L, "FIVE");
		mapObject.put(6L, "SIX");
		mapObject.put(7L, "SEVEN");
		mapObject.put(8L, "EIGHT");
		mapObject.put(9L, "NINE");
		mapObject.put(10L, "TEN");
		mapObject.put(11L, "ELEVEN");
		mapObject.put(12L, "TWELVE");
		mapObject.put(13L, "THIRTEEN");
		mapObject.put(14L, "FOURTEEN");
		mapObject.put(15L, "FIFTEEN");
		mapObject.put(16L, "SIXTEEN");
		mapObject.put(17L, "SEVENTEEN");
		mapObject.put(18L, "EIGHTEEN");
		mapObject.put(19L, "NINTEEN");
		mapObject.put(20L, "TWENTY");
		mapObject.put(30L, "THIRTY");
		mapObject.put(40L, "FOURTY");
		mapObject.put(50L, "FIFTY");
		mapObject.put(60L, "SIXTY");
		mapObject.put(70L, "SEVENTY");
		mapObject.put(80L, "EIGHTY");
		mapObject.put(90L, "NINTY");
	}

}

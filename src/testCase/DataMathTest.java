package testCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import app.DataMath;

class DataMathTest {
	
	DataMath testDataMath = new DataMath();
	int int1 = 12345;
	int int2 = -98765;
	int int3 = int1+1;
	int int4 = int1-1;
	long long1 = 1234567890L;
	long long2 = -9876543210L;
	long long3 = long1+1;
	long long4 = long1-1;
	float float1 = 3.14515f;
	float float2 = -99.1234567f;
	double double1 = 123.456d;
	double double2 = -789.123123d;
	double double3 = 6;
	double double4 = 2;
	double double5 = 36;
	double double6 = 216;

	// Uppgift 1
	@Test
	void testLowestLong() {
		assertEquals(long2, testDataMath.lowestLong(long1, long2));
		System.out.println("Test 1: Lowest long: " + testDataMath.lowestLong(long1, long2));
	}
	
	// Uppgift 2
	@Test
	void testLowestFloat() {
		assertEquals(float2, testDataMath.lowestFloat(float1, float2));
		System.out.println("Test 2: Lowest float: " + testDataMath.lowestFloat(float1, float2));
	}
	
	// Uppgift 3
	@Test
	void testLowestInt() {
		assertEquals(int2, testDataMath.lowestInt(int1, int2));
		System.out.println("Test 3: Lowest int: " + testDataMath.lowestInt(int1, int2));
	}
	
	
	// Uppgift 4
	@Test
	void testLowestDouble() {
		assertEquals(double2, testDataMath.lowestDouble(double1, double2));
		System.out.println("Test 4: Lowest double: " + testDataMath.lowestDouble(double1, double2));		
	}
	
	// Uppgift 5
	@Test
	void testHighestInt() {
		assertEquals(int1, testDataMath.highestInt(int1, int2));
		System.out.println("Test 5: Highest int: " + testDataMath.highestInt(int1, int2));
	}
	
	// Uppgift 6
	@Test
	void testHighestDouble() {
		assertEquals(double1, testDataMath.highestDouble(double1, double2));
		System.out.println("Test 6: Highest double: " + testDataMath.highestDouble(double1, double2));
	}
	
	// Uppgift 7 - float instead of int again
	@Test
	void testHighestFloat() {
		assertEquals(float1, testDataMath.highestFloat(float1, float2));
		System.out.println("Test 7: Highest float: " + testDataMath.highestFloat(float1, float2));
	}
	
	// Uppgift 8
	@Test
	void testHighestLong() {
		assertEquals(long1, testDataMath.highestLong(long1, long2));
		System.out.println("Test 8: Highest long: " + testDataMath.highestLong(long1, long2));
	}
	
	// Uppgift 9
	@Test
	void testReturnPower() {
		assertEquals(double5, testDataMath.returnPower(double3, double4));
		System.out.println("Test 9: The value of " + double3 + " to the power of " + double4 + " is " + testDataMath.returnPower(double3, double4));
	}
	
	// Uppgift 10
	@Test
	void testAddOneInt() {
		assertEquals(int3, testDataMath.addOneInt(int1));
		System.out.println("Test 10: " + int1 + " + 1 is " + testDataMath.addOneInt(int1));
	}
	
	// Uppgift 11
	@Test
	void testAddOneLong() {
		assertEquals(long3, testDataMath.addOneLong(long1));
		System.out.println("Test 11: " + long1 + " + 1 is " + testDataMath.addOneLong(long1));
	}
	
	// Uppgift 12
	@Test
	void testSubtractOneInt() {
		assertEquals(int4, testDataMath.subtractOneInt(int1));
		System.out.println("Test 12: " + int1 + " - 1 is " + testDataMath.subtractOneInt(int1));
	}
	
	// Uppgift 13
	@Test
	void testSubtractOneLong() {
		assertEquals(long4, testDataMath.subtractOneLong(long1));
		System.out.println("Test 13: " + long1 + " - 1 is " + testDataMath.subtractOneLong(long1));
	}
	
	// Uppgift 14
	@Test
	void testReturnSquareRoot() {
		assertEquals(double3, testDataMath.returnSquareRoot(double5));
		System.out.println("Test 14: Square root of " + double5 + " is " + testDataMath.returnSquareRoot(double5));
	}
	
	// Uppgift 15
	@Test
	void testReturnCubicRoot() {
		assertEquals(double3, testDataMath.returnCubicRoot(double6));
		System.out.println("Test 15: Cubic root of " + double6 + " is " + testDataMath.returnCubicRoot(double6));
	}
	
	// Bonusuppgift	
	@Test
    void testRandomDouble() {
        assertEquals(0.0, testDataMath.randomDouble(), 1.0);
        System.out.println("Test 16: Random Double: " + testDataMath.randomDouble());
    }
	
}

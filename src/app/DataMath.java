package app;

public class DataMath {	
	
	// Uppgift 1
	public long lowestLong(long long1, long long2) {
		return Math.min(long1, long2);
	}

	// Uppgift 2
	public float lowestFloat(float float1, float float2) {
		return Math.min(float1, float2);
	}	
	
	// Uppgift 3
	public int lowestInt(int int1, int int2) {
		return Math.min(int1, int2);
	}
	
	// Uppgift 4
	public double lowestDouble(double double1, double double2) {
		return Math.min(double1, double2);
	}
	
	// Uppgift 5
	public int highestInt(int int1, int int2) {
		return Math.max(int1, int2);
	}	
	
	// Uppgift 6
	public double highestDouble(double double1, double double2) {
		return Math.max(double1, double2);
	}
	
	// Uppgift 7 - float instead of int again
	public float highestFloat(float float1, float float2) {
		return Math.max(float1, float2);
	}
	
	// Uppgift 8 
	public long highestLong(long long1, long long2) {
		return Math.max(long1, long2);
	}
	
	// Uppgift 9
	public double returnPower(double double1, double double2) {
		return Math.pow(double1, double2);
	}
	
	// Uppgift 10 
	public int addOneInt(int int1) {
		int result = 0;
		if(int1 >= -2147483648 && int1 < 2147483647) result = int1 + 1;			
		return result;
	}
	
	// Uppgift 11
	public long addOneLong(long long1) {
		long result = 0;
		if(long1 >= -9223372036854775808L && long1 < 9223372036854775806L) result = long1 + 1;			
		return result;
	}
	
	// Uppgift 12
	public int subtractOneInt(int int1) {
		int result = 0;
		if(int1 > -2147483648 && int1 <= 2147483647) result = int1 - 1;			
		return result;
	}	
	
	// Uppgift 13
	public long subtractOneLong(long long1) {
		long result = 0;
		if(long1 > -9223372036854775808L && long1 <= 9223372036854775806L) result = long1 - 1;			
		return result;
	}
	
	// Uppgift 14
	public double returnSquareRoot(double double1) {
		return Math.sqrt(double1);
	}
	
	// Uppgift 15
	public double returnCubicRoot(double double1) {
		return Math.cbrt(double1);
	}
	
	// Bonusuppgift
	public double randomDouble() {
		return Math.random();
	}
	
	public static void main(String[] args) {
		
    }
	
	
}

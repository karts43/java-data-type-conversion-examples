class FloatTypeExample
{
	public static void main(String[] args)
	{
		// Displaying Float Range
		System.out.println("float MIN Range : " +Float.MIN_VALUE); 
	    // float MIN Range : 1.4E-45
		System.out.println("float MAX Range : " +Float.MAX_VALUE); 
	    // float MAX Range : 3.4028235E38

		// ------------------------------------------
		
		// Example 1: Assigning int to float
		float a = 1234567890; // within integer range; default data type is int
		System.out.println("float a (from int literal): " + a);
	    // float a (from int literal): 1.234568E9
	    
		// ------------------------------------------
		
		// Example 2: Exceeding int limit without suffix causes CTE
		// float b = 12345678901; // CTE: integer number too large → it's not considered within int's default range
		// int literal exceeds range

		// ------------------------------------------

		// Example 3: Using float literal with 'f' suffix
		float c = 12345678901f; 
		System.out.println("float c (float literal with 'f'): " + c);  // ✔ Correct: explicitly marked as float
	    // float c (float literal with 'f'): 1.2345679E10
		// R.H.S: it's a floating-point number with suffix 'f' to ensure it's treated as a float data type

		// ------------------------------------------

		// Example 4: Using double literal with 'd' suffix assigned to float	
		// float d = 12345678901d;
		// CTE: incompatible types: possible lossy conversion from double to float
		// R.H.S: it's a floating-point number with suffix 'd' to ensure it's treated as a double; assigning a larger container to a smaller one causes error

		// ------------------------------------------

		// Example 5: Assigning long to float
		float e = 1234567890123456789l;
		System.out.println("float e (from long literal): " + e); 
	    // float e (from long literal): 1.234568E18
		// R.H.S: it's an integer number with suffix 'l' to ensure it's treated as long; assigning a smaller container (long) to a larger one (float) is allowed

		// -----------------------------------------------

		// Type Conversion: char → long → float
		char f = 'a';
		long g = f;
		System.out.println("char -> long :" + g);
	    // char -> long :97
		float h = g;
		System.out.println("long -> float :" + h);
	    // long -> float :97.0
		
		// -------------------------------------------------

		// char → float (maximum char value)
		char i = 65535;
		System.out.println("Character shown using char keyword: " + i);
	    // Character shown using char keyword: ?     
	    // When command prompt doesn't support the symbol, it displays '?' 
		float j = i; 
		System.out.println("char -> float :" + j);
	    // char -> float :65535.0

		// ------------------------------------------------------

		// Invalid Conversions:
		/*
		float k = true;
		// CTE: incompatible types — boolean cannot be converted to float
		// boolean is not numeric; hence, conversion is not possible
			
		// float l = "Hello float";
		// CTE: incompatible types — String cannot be converted to float
		*/

		// --------------------------------------------
		// Unicode example using character literal
		// ✅ Unicode value of '🐥'
		float r = '🐥';
		// R.H.S = Considered as a symbol (Unicode)
		// L.H.S = It checks if the R.H.S value can be stored — if not, it throws an error
		System.out.println("Unicode of '🐥' symbol as float : " + r);
	    // Unicode of '?' symbol as float : 55357.0
	}
}

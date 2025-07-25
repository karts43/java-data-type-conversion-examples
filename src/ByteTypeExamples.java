class ByteTypeExamples
{
	// Integer number consists 10 digit number (int) then above digit called decimal number is a number with a fractional part (i.e., digits after a dot .

	public static void main(String[] args){

	//    1. Byte 
	System.out.println("Min range : "+Byte.MIN_VALUE);
  // Min range : -128
	System.out.println("Max range : "+Byte.MAX_VALUE);
  // Mxa range : 127

	// ------------------------------------------


	byte a = -128;  // min range
	byte b = 127 ;  // max range
	
	// ------------------------------------------

	/*
	byte c = 128;    // CTE : possible lossy conversion int -> byte

	// 128 is above max range of byte then this 128 considered integer number 
	// consider bigger container numbers not fit smaller number container
	*/
	
	// ------------------------------------------

	
	/*
	byte d = -129; // CTE : possible lossy conversion from int -> byte
	// -129 is below min range of byte then this -129 considered integer number 
	// consider bigger container numbers not fit smaller number container
	*/
	

	// ------------------------------------------


	/*
	 // byte e = 1234567890; 
	 // CTE : incompatible types: possible lossy conversion from int to byte 
	*/


	// ------------------------------------------


	/*	
	 // byte f = 12345678901;
	 // when try to store 11 digit then show CTE : integer number too large 
	 // Integer range max digit considering 10 that called Integer but when 11 digit goes it consider integer number large	
	*/	

	// ------------------------------------------

	
	byte g = 1+1; // it shows that sum is in between range that not show any error

	// ------------------------------------------


	/*
	byte h = 1;
	byte i = 1;
	byte j = h + i;  
	// it shows CTE :incompatible types: possible lossy conversion from int to byte
	// h is considered in between byte range --> i also considered in between byte range  ---> when j show CTE ??
	// j is performing arithmetic operation that operation considers 'h' & 'i' but j is considered when both number added then possibility Number sum larger / bigger number there above / below range. it not have any associativity.
	// then that number are large that's the reason RHS considered Integer range i.e int then show "possible lossy conversion from int to byte"
	*/

	// ------------------------------------------

	
	final byte k = 1;
	final byte l = 1;
	byte m = k + l;        
	// it associate byte value not change and it considered in between range where using final keyword  -- that reason not show CTE 
	System.out.println("Using Final keyword : "+m);
  // Using Final keyword : 2

	// ------------------------------------------


	// that character value not change it std.ASCII code / number which identity of symbol for (0...9),(A...Z),(a...z),(Special Character !,@,#,$,..etc)
	byte n = 'A';
	System.out.println(" 'A' show ASCII no :"+n);
    //  'A' show ASCII no : 65
	byte o = 'z';
	System.out.println(" 'z' show ASCII no :"+o);
	  //  'z' show ASCII no : 122
	byte p = '9';
	System.out.println(" '9' show ASCII no :"+p);
  //  '9' show ASCII no : 57
	byte q = '@';
	System.out.println(" '@' show ASCII no :"+q);
  //  '@' show ASCII no : 64

	// ------------------------------------------

	// it not symbol considered that print A
	char r = 'A';
	System.out.println("Character show Used char keyword : "+r);
  // Character show Used char keyword : A
    
	// ------------------------------------------

	/*
	byte s = true;	
	// CTE :  boolean cannot be converted to byte 
	// i.e true , false  is boolean value this not possible conversion boolean -> byte
	*/
	
	// ------------------------------------------

	/*
	byte t = "hello";
	// CTE :  string cannot be converted to byte 
	// string this not possible conversion string -> byte
	*/
	
	}
}

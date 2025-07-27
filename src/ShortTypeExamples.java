class ShortTypeExamples {

    public static void main(String[] args) {

        System.out.println("Short MIN Range : " + Short.MIN_VALUE);
        // Short MIN Range : -32768

        System.out.println("Short MAX Range : " + Short.MAX_VALUE);
        Short MAX Range : 32767

        //--------------------------------------------------------

        short a = -32768;
        short b = 32767;

        //--------------------------------------------------------

        // ❌ CTE 1:

        // short c = 32768;
        // ❌ CTE: possible lossy conversion from int to short
        // 32768 is above the max range of short, so it is treated as an integer.
        // Bigger container numbers cannot fit into smaller containers.

        //--------------------------------------------------------

        // ❌ CTE 2:
        
        // short d = -32769;
        // ❌ CTE: possible lossy conversion from int to short
        // -32769 is below the min range of short, so it is treated as an integer.
        // Very small (negative) values also cannot fit into smaller containers.
        
        //--------------------------------------------------------

        // ❌ CTE 3:

        // short e = 1234567890;
        // ❌ CTE: incompatible types – possible lossy conversion from int to short

        //--------------------------------------------------------

        // ❌ CTE 4:
    
        // short f = 12345678901;
        // ❌ CTE: integer number too large
        // If the number has more than 10 digits, it exceeds int range.

        //--------------------------------------------------------

        // ✅ Run successfully – no error
        byte g = 127;
        short h = g;  // ✅ A smaller container (byte) can go into a bigger container (short)

        //--------------------------------------------------------

        // ❌ CTE 5:

        byte i = 127;
        short j = g; // This line works
        // byte k = j;  // ❌ CTE: possible lossy conversion from short to byte
        // A bigger container (short) cannot be directly stored in a smaller container (byte)

        //--------------------------------------------------------

        // ✅ Character to short (ASCII value)
        // Every character has a unique number in the ASCII table:
        // - '0' to '9', 'A' to 'Z', 'a' to 'z', and special characters like !, @, #, etc.

        short l = 'A';
        System.out.println("'A' shows ASCII no: " + l);  // 'A' shows ASCII no: 65

        short m = 'a';
        System.out.println("'a' shows ASCII no: " + m);  // 'a' shows ASCII no: 97

        short n = '3';
        System.out.println("'3' shows ASCII no: " + n);  // '3' shows ASCII no: 51

        short o = '*';
        System.out.println("'*' shows ASCII no: " + o);  // '*' shows ASCII no: 42

        //--------------------------------------------------------

        // ✅ Using char type
        char p = 'D';
        System.out.println("Character shown using char keyword: " + p);  // Character shown using char keyword: D

        // ✅ ASCII number to char
        char q = 68;
        System.out.println("Character for ASCII code 68 is: " + q);  // Character for ASCII code 68 is: D

        //--------------------------------------------------------

        // ❌ CTE 6:
  
        // short r = false;
        // ❌ CTE: Conversion not possible from boolean to short
        // Boolean cannot be converted to any numeric type
        
        //--------------------------------------------------------

        // ❌ CTE 7:
      
        //short s = "hello short";
        // ❌ CTE: Conversion not possible from String to short
        // Strings cannot be directly assigned to numeric types
      
    }
}

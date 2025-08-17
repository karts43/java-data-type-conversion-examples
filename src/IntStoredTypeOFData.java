class IntStoredTypeOFData {

    public static void main(String[] args) {

        System.out.println();

        System.out.println("int MIN Range : " + Integer.MIN_VALUE);  // int MIN Range : -2147483648
        System.out.println("int MAX Range : " + Integer.MAX_VALUE);  // int MAX Range : +2147483647

        System.out.println("-------------------------------------");

        int a = -2147483648;    // OK (min range)
        int b = 2147483647;     // OK (max range)
        int c = 12;              // Normal int

        /*
        int d = -2147483649;   // Too small → compile-time error (CTE)
        // CTE : integer number too large when (below minimum range)
        */

        /*
        int e = 12345678901;   // Too large → compile-time error (CTE)
        // CTE : integer number too large where 11 digit
        */

        // Decimal literals → double by default. 
        // Even with suffix f (float), they cannot be directly assigned to int

        /*
        int f = 123456789012f;
        // CTE : incompatible types: possible lossy conversion from float --> int
        // R.H.S = any number goes 11 digit integer number it consider / know as Decimal Number (i.e double, float ,long)
        // L.H.S = It data type is int it not stroed above range then L.H.S think i am not stored float Number
        // RHS is a float, but LHS is int -> possible lossy conversion
        */

        /*
        int g = 1234567890123f;
        // R.H.S = Consider this 11 digit integer Number and Float number sign then 
        // L.H.S = It check r.h.s Can stroed it not stored thowr error
        // CTE : incompatible types: possible lossy conversion from float to int
        */

        /*
        int h = 1234567890123d;
        // R.H.S = Consider this 11 digit integer Number and double number sign then 
        // L.H.S = It check r.h.s Can stroed it not stored thowr error
        // CTE : incompatible types: possible lossy conversion from double to int
        */

        /*
        int i = 1234567890123l;
        // R.H.S = Consider this 11 digit integer Number and long number sign then 
        // L.H.S = It check r.h.s Can stroed it not stored thowr error
        // CTE : incompatible types: possible lossy conversion from long to int
        */

        // ----- default range of decimal number is double -----

        /*
        int j = 1.2;
        // incompatible types: possible lossy conversion from double to int
        // R.H.S = Consider (i.e Decimal Number) that data type is "double"
        // L.H.S = It check r.h.s Can stroed it can not possiable stored thowr error
        */

        /*  
        int k = 1.2f;
        // incompatible types: possible lossy conversion from float to int
        // R.H.S = Consider (i.e Decimal Number) but Asign sign to identifiey float data type
        // L.H.S = It check r.h.s Can stroed it can not possiable stored thowr error
        */

        /*
        int l = 1.2d;
        // incompatible types: possible lossy conversion from double to int
        // R.H.S = Consider (i.e Decimal Number) but Asign sign to identifiey long data type
        // L.H.S = It check r.h.s Can stroed it can not possiable stored thowr error
        */

        // float a = 1234567890123456789012345678901234567890f;
        // CTE : floating-point number too large -> 39 digit (ok) -> 40 digit (wrong)

        /*
        int m = 1234567890123456789012345678901234567890f;
        // CTE : floating-point number too large
        */

        /*
        int n = true;   // ❌ boolean → int not allowed
        // CTE : incompatible types: boolean cannot be converted to int
        // boolean cannot be converted to any numeric type
        */

        /*
        int o = "hello int";   // ❌ String → int not allowed
        // CTE : incompatible types: String cannot be converted to int
        // String can't be assigned to a numeric type like short
        */

        // Character values are stored as ASCII/Unicode numbers:
        // (0...9), (A...Z), (a...z), special characters (!, @, #, $, ...)

        // ✅ 'A' is a character with ASCII value 65
        int q = 'A';
        System.out.println("Character 'A' ASCII code : " + q);  // Character 'A' ASCII code : 65

        // ✅ Unicode value of '🐥'
        int r = '🐥';
        System.out.println("Unicode of '🐥' symbol : " + r);  // Unicode of '🐥' symbol : 128037

        // ✅ Unicode value of '9'
        int s = '9';
        System.out.println("That '9' symbol Unicode : " + s);  // That '9' symbol Unicode : 57

        // Final short assigned to char (allowed, since within range)
        final short x = 32767;
        char dd = x;
        System.out.println(dd);  // ?
    }
}

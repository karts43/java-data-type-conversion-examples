# java-data-type-conversion-examples 📚💻

This repository contains Java example files demonstrating primitive data types and type conversion rules.  
Each file focuses on one data type, covering valid and invalid assignments, range limits, and compile-time errors.

---

## Included Examples ✨

### 🧮 ByteTypeExamples.java
- 🔢 Shows byte min & max values (-128 to 127)  
- ➕ Explains byte arithmetic and type promotion to int  
- 🔒 Demonstrates use of final bytes in expressions  
- 🔤 Shows ASCII character values stored in bytes  
- ❌ Includes invalid assignments causing compile errors  
- 🎯 Great for beginners to understand byte behavior and conversions  

---

### 🌊 FloatTypeExamples.java 🚀
This Java file demonstrates the use of the **float** data type in Java along with type conversions involving:

- 🔄 int to float  
- 🔄 long to float  
- 🔄 char to long to float  
- ❌ Invalid conversions like boolean or String to float  
- 🔣 Unicode and literal suffix usage: `f`, `l`, `d`  

**Covered Topics:**
- 📉 Float min & max range  
- 🏷️ Literal suffix usage (`f`, `l`, `d`)  
- 🔼 Widening conversions (e.g., char → float)  
- ⚠️ Compile-time errors with incompatible types  

**Invalid Examples:**
- 🚫 Assigning `true` to float  
- 🚫 Assigning `"Hello"` to float  
- 🚫 Using large double literals without casting  

**Learning Outcome:**  
By running this file, you’ll understand how Java handles primitive type conversions and where type mismatches cause errors.  

---

### 🔢 IntStoredTypeOFData.java
This Java file demonstrates the use of the **int** data type in Java with examples of valid/invalid assignments, ranges, and type conversion issues.

**Covered Topics:**
- 📉 Int min & max range (`-2147483648` to `2147483647`)  
- ✅ Valid int assignments within range  
- ❌ Invalid assignments: too small, too large, float/double/long to int  
- 🔣 Character to int conversions (`'A'` → 65, `'9'` → 57, Unicode symbols like 🐥)  
- ⚠️ Compile-time errors with boolean and String to int  
- 🔄 Special case: final short → char assignment  

**Invalid Examples:**
- 🚫 `int d = -2147483649;` → below min range  
- 🚫 `int e = 12345678901;` → above max range  
- 🚫 `int j = 1.2;` → double to int (lossy conversion)  
- 🚫 `int n = true;` → boolean not convertible  
- 🚫 `int o = "hello int";` → String not convertible  

**Learning Outcome:**  
By running this file, you’ll understand how Java restricts int values, how characters map to their ASCII/Unicode numeric values, and why some assignments fail at compile time.

---

### 🟢 ShortTypeExamples.java
This Java file demonstrates the use of the **short** data type in Java, including range checks, type promotions, and compile-time errors.

**Covered Topics:**
- 📉 Short min & max range (`-32768` to `32767`)  
- ✅ Valid short assignments within range  
- ❌ Invalid assignments: too large, too small, int-to-short lossy conversion  
- 🔄 Conversions between `byte` and `short`  
- 🔣 Character to short conversions (ASCII values of `'A'`, `'a'`, `'3'`, `'*'`)  
- ✅ Using ASCII code numbers to display characters  
- ⚠️ Compile-time errors with boolean and String to short  

**Invalid Examples:**
- 🚫 `short c = 32768;` → above max range  
- 🚫 `short d = -32769;` → below min range  
- 🚫 `short e = 1234567890;` → lossy conversion from int  
- 🚫 `short f = 12345678901;` → integer number too large  
- 🚫 `short r = false;` → boolean not convertible  
- 🚫 `short s = "hello short";` → String not convertible  

**Learning Outcome:**  
By running this file, you’ll understand how `short` works in Java, how it interacts with smaller (`byte`) and larger (`int`) types, and how ASCII/Unicode values can be stored in `short`.

---

## 🔮 Future Plans
More files for the remaining primitive types will be added:
- 🟠 long  
- 🔴 double  
- 🟣 char  
- ⚫ boolean  

---

## 🏷️ Tags
#JavaBasics #ByteType #FloatType #IntType #ShortType #TypeConversion #DataTypes #LearnJava #JavaExamples

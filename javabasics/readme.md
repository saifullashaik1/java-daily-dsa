# Welcome to Java Daily DSA
# day 1 :
## Datatypes,Variables,operators:

# 1.Datetypes:
* In Java, data types specify the different sizes and values that can be stored in a variable.
* Java data types are broadly categorized into two types:

## 1.Primitive datatypes: 

1.int:Most commonly used integer data type.
*size: 4 bytes (32 bits)
* Stores whole numbers from -2^31 to 2^31-1.

2.short: Can be used for small integers.
* Range: -32,768 to 32,767
* size : 2 bytes (16 bits)

3.byte : Stores whole numbers from -128 to 127.
* size : 1 byte (8 bits)
* Useful for saving memory in large arrays.

4.long : Stores whole numbers from -2^63 to 2^63-1.
* size : 8 bytes (64 bits)
* Useful when a wider range than int is needed.
* Must be suffixed with L.

5.float : Stores fractional numbers with 6-7 decimal digits
* size : 4 bytes (32 bits)
* Single-precision 32-bit IEEE 754 floating-point.
* Must be suffixed with f.

6.double: Stores fractional numbers with 15-16 decimal digits
* size : 8 bytes (64 bits)
* Double-precision 64-bit IEEE 754 floating-point.
* Default type for decimal values.

7.boolean :Only two possible values: true or false.
* size : 1 bit.

8.char : Stores a single 16-bit Unicode character
* size : 2 bytes (16 bits)
* Enclosed in single quotes.

## Non-Primitive (Reference) Data Types:
* These data types are objects and can hold multiple values or complex objects. They include:

1.String: A sequence of characters.
2.Arrays: A collection of elements of the same data type.
3.Classes: User-defined data types used to create objects.
4.Interfaces: A collection of abstract methods.
5.Enums: Represents a group of constants.

# 2.Variables:
* In Java, variables are containers for storing data values.
* Variables in Java must be declared with a specific data type before being used.
*  Java variables are classified into several types based on their scope, lifetime, and the kind of data they hold.

## 1.  Local Variables:
* Definition: Local variables are declared inside methods, constructors, or blocks and can only be used within that method or block.
* Lifetime: They are created when the method is invoked and destroyed once the method is exited.
* Default Value: Local variables do not have default values, so they must be initialized before use.

## 2. Instance Variables (Non-Static Fields):
* Definition: Instance variables are declared in a class but outside any method or constructor. They belong to an instance of the class (i.e., objects), and each object has its own copy of the instance variable.
* Lifetime: They exist as long as the object exists.
* Default Value: Instance variables are initialized with default values (0, false, null, etc.) if not explicitly initialized.

## 3.Static Variables (Class Variables):
* Definition: Static variables are declared with the static keyword and are shared among all instances of the class. They belong to the class itself rather than to any object.
* Lifetime: Static variables exist as long as the class is loaded in memory.
* Default Value: Like instance variables, static variables have default values if not initialized.

# 3. Operators:
* In Java, operators are special symbols or keywords that perform operations on variables and values.
* Java provides a wide variety of operators to perform arithmetic, logical, bitwise, comparison, and other types of operations. 
* In Java, operators are special symbols or keywords that perform operations on variables and values. Java provides a wide variety of operators to perform arithmetic, logical, bitwise, comparison, and other types of operations. 
* Types of Operators in Java:
1.Arithmetic Operators:
* These operators perform mathematical operations such as addition, subtraction, multiplication, division, etc.
* addition ; + ; a+b.
* subtraction ; - ; a-b.
* multiplication ; * ; a*b.
* division ; / ; a/b.
* remainder ; % ; a%b.

2.Assignment Operators :
* Assigns the value ; = .
* adds and assigns ; += .
* subtracts and assigns ; -= .
* divides and assigns ; /= .
* modulus and assigns ; %= .


3.Relational (Comparison) Operators:
* equal to ; == .
* not equal to ; != .
* greater than ; > .
* less than ; < .
* greater than equals to ; >= ;
* less than equals to ; <=.


4.Logical Operators :
* Logical AND (true if both conditions are true) ; && .
* logical or ; || .
* logical not ; ! .


5.Unary Operators:
* Unary plus (indicates positive value) ; +a .
* Unary minus (negates value) ; -a .
* Increment (increases value by 1) ; a++ .
* 	Decrement (decreases value by 1) ; a-- .
* Logical complement (inverts the boolean value) ; !


6.Bitwise Operators:
* Bitwise AND ; a&b .
* Bitwise OR ; a|b. 
* Bitwise XOR ; a^b.
* Bitwise NOT (complement) ; ~ ,
* left shift ; <<:
* right shift ; >> ;
* unsiigned right shift ; >>> ;

## control flows and loops :

# 1. Control Flow Statements

* 1. if-else Statement;
* The if-else statement allows you to execute a block of code based on a condition.
* syntax :
* if (condition) {
  // code to be executed if the condition is true
  } else {
  // code to be executed if the condition is false
  }

* 2. else if Ladder
The else if ladder checks multiple conditions in sequence.
syntax :
if (condition1) {
// code to be executed if condition1 is true
} else if (condition2) {
// code to be executed if condition2 is true
} else {
// code to be executed if none of the conditions are true
}

* 3.switch Statement
The switch statement allows you to select one of many code blocks to be executed based on the value of an expression.
syntax :
switch (expression) {
case value1:
// code to be executed if expression equals value1
break;
case value2:
// code to be executed if expression equals value2
break;
// you can have any number of case statements
default:
// code to be executed if expression doesn't match any case
}

# 2.Loop statements :

* a. for Loop
The for loop is used when you know how many times you want to iterate over a block of code.

syntax :
for (initialization; condition; update) {
// code to be executed
}

* b. while Loop
  The while loop repeats the code as long as the condition is true.

syntax :
while (condition) {
// code to be executed
}

* c. do-while Loop
  The do-while loop is similar to the while loop, but it checks the condition after executing the loop body. Therefore, the loop is guaranteed to execute at least once.

syntax :
do {
// code to be executed
} while (condition);

# 3.
Control flow statements and loops in Java allow you to execute code in different ways depending on conditions and repeating certain blocks of code multiple times. Java offers several types of control flow mechanisms and loop structures to manage program execution efficiently.

1. Control Flow Statements
   a. if-else Statement
   The if-else statement allows you to execute a block of code based on a condition.

Syntax:


if (condition) {
// code to be executed if the condition is true
} else {
// code to be executed if the condition is false
}
Example:


int age = 18;
if (age >= 18) {
System.out.println("You are an adult.");
} else {
System.out.println("You are not an adult.");
}
b. else if Ladder
The else if ladder checks multiple conditions in sequence.

Syntax:


if (condition1) {
// code to be executed if condition1 is true
} else if (condition2) {
// code to be executed if condition2 is true
} else {
// code to be executed if none of the conditions are true
}
Example:


int score = 85;
if (score >= 90) {
System.out.println("Grade A");
} else if (score >= 75) {
System.out.println("Grade B");
} else {
System.out.println("Grade C");
}
c. switch Statement
The switch statement allows you to select one of many code blocks to be executed based on the value of an expression.

Syntax:


switch (expression) {
case value1:
// code to be executed if expression equals value1
break;
case value2:
// code to be executed if expression equals value2
break;
// you can have any number of case statements
default:
// code to be executed if expression doesn't match any case
}
Example:


int day = 3;
switch (day) {
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
default:
System.out.println("Invalid day");
}
2. Loops in Java
   Loops allow you to repeatedly execute a block of code as long as a certain condition is met.

a. for Loop
The for loop is used when you know how many times you want to iterate over a block of code.

Syntax:

for (initialization; condition; update) {
// code to be executed
}
Example:

for (int i = 0; i < 5; i++) {
System.out.println("i: " + i);
}
b. while Loop
The while loop repeats the code as long as the condition is true.

Syntax:

while (condition) {
// code to be executed
}
Example:

int i = 0;
while (i < 5) {
System.out.println("i: " + i);
i++;
}
c. do-while Loop
The do-while loop is similar to the while loop, but it checks the condition after executing the loop body. Therefore, the loop is guaranteed to execute at least once.

Syntax:

do {
// code to be executed
} while (condition);
Example:

int i = 0;
do {
System.out.println("i: " + i);
i++;
} while (i < 5);

# 3. Enhanced for Loop (For-Each Loop):
The enhanced for loop is used to iterate over arrays or collections.
 syntax :
for (dataType variable : array) {
// code to be executed for each element
}

# 4.Control Flow Statements within Loops:
* a. break Statement
  The break statement is used to exit a loop or switch statement prematurely.
 
syntax :

for (int i = 0; i < 10; i++) {
if (i == 5) {
break;  // exits the loop when i equals 5
}
System.out.println(i);
}

* b. continue Statement
  The continue statement skips the current iteration of the loop and jumps to the next iteration.

syntax:
for (int i = 0; i < 10; i++) {
if (i == 5) {
continue;  // skips the rest of the loop body when i equals 5
}
System.out.println(i);
}

* c. return Statement
  The return statement exits from the current method and optionally returns a value.

syntax:

public class Example {
public static void main(String[] args) {
System.out.println(sum(5, 10));
}

    public static int sum(int a, int b) {
        return a + b;  // returns the sum of a and b
    }
}







//packages holds classes for orginazation 

//these two provide the same method but from different class: 
Date(java.util) or Date(java.sql)
//Date object can used from the utility class or the sql class

//the main method shold always be 'static'

//the java compiler converts the source code into bytes and then the java virtual machine takes the byte code and turns it into native code for macs, windows etc...
  //this is why the Java can be written on a Mac and executed on anyother OS such as Linux or Windows, as long as the Java Runtime Environment is present..C sharp and Python are the same

// SE standard Edition - 
// EE enterprise endition - enterprise edition
// ME micro Edition - mobile devices
// Java Card - for smart cards

//multiple variables on the same line:
byte age = 30, byte her_age = 35; 

// Primitive types: 
  //1 byte: byte [-128, 127]
  //2 bytes: short [-32k, 32k]
  //4 bytes: int [-2B, 2B]
  //8 bytes: long []
  //float 4 bytes: stores decimals
  //double 8 bytes: 
  //char 2 bytes: stores letters and can store international letters
  //boolean 1 byte: true/false

//with long data types..use the L
long views = 3_123_456_789L

//float data types: need the F
float price = 10.99F;

//reference types: 
Array now = new Array(); 
//'now' is now an object of the Array class and the new keyword allocates memory for 'now'

//Lesson 6: Strings

//ANY METHOD THAT MODIFIES A STRING OBJECT, WILL RETURN A NEW STRING OBJECT CAUSE STRINGS ARE IMMUATBLE. 


String test = 'this'
test.endsWith("s")
//methods: .endsWith(), .startsWith(), .length(), .indexOf(), .replace(), .toLowerCase(), .toUpperCase(), .trim()

//Lesson 7: Escape Sequence

String name = "Hello "\Jamal\"" 
String line = "the next \nline"
String tab = "the tab \nline"

//Lesson 8: Arrays

int[] numbers = new int[5];
numbers[0] = 1;
System.out.print(numbers); //this will return the address of the array, to get the values of the array use:
System.out.println(Arrays.toString(numbers))

//when you instaniate an int[], the default values are 0, String[] default values are " " empty spaces, boolean[] default vaules false. 

//you can also create an array as:
int[] = {1,2,3,4,5};
String[] = {"this is an example"}
//ARRAYS HAVE A FIXED LENGTH, ONCE CREATED, YOU CANT CHANGE IT

//Lesson 9: multi dimensional array
int[][] numbers = new int[2][5];
numbers[1][2] = 1;

int[][][] cubeArray = new int[3][3][5];
int[][][] cubeArray1 = new {
                            {1,2,3},
                            {4,5,6},
                            {7,8,9}
                            }

//Lesson 10: Constants 
  final float PI = 3.14F;


// Lesson 11: Arithmetic Expressions
  
  //remember the right hand side of the assignment gets evaluated first. so x will be incremented and then assigned to y...in the end x will be 2 and y will be 2
  int x = 1; 
  int y = ++x; 

//in this example, x will be stored in y and then x will incremented...so x and y will print different results. x will be 2 and y will be 1
int x = 1; 
int y = x++;

//Lesson 12 Order of Operations

//Please Excuse My Dear Aunt Sally
int x = 10 + 3 * 2;
int x = (10 + 3) * 2

//Lesson 13 Casting and Type Conversion 

short x = 1; 
int y = x + 2; 
//this is implicit casting(automatic conversion) when the smaller data types are converted into the larger data types: byte > short > int > long > float > double
//so in the above example, x will be converted into an int and then added..but the following equation requires explicit conversion: 

double x = 1.1;
int y = (int)x + 2;
//we are explicited converting x, a double, into an int.

// you can perform explicit conversion with the following types cause they are numbers: byte > short > int > long > float > double...but with other data types such as Strings..you cant...the Integer class has to be used...Integer.parseInt(x), x was a String and now an Int..or Integer.parseFloat(x) is was a String and now is a Float. 

//Lesson 14 Math Class

int num = Math.round(1.1F)
int num = (int)Math.ceil(1.1F) //this will return a double and we are explictly casting this as a int

//to format a number as a currency:
import java.text.NumberFormat //remember to import

NumberFormat currency = NumberFormat.getCurrencyInstanceOf();
//the NumberFormat is an abstract class so you can NOT instantiate it..so you have to use the .getCurrencyInstanceOf() method to get an instance of NumberFormat. 
String result = currency.format(1234567.891);
//this will return a string of the number passed in, so the result has to be saved in a string data type. the result for this would be $1,234,567.89

//to format a number into a percent
String percent = NumberFormat.getPercentInstanceOf().format(0.1) //will return 10%
//again, the NumberFormat is abstract and we are this time using .getPercentInstanceOf() to get an istance of the NumberFormat abstract class and then formatting the number into a percentage..it will return a string so we store it in a string data type. 

//Lesson 16: Reading input from user
//difference btw .next() and .nextLine(), is that .next() will only read the first or next token not the entire line as nextLine() does. 

//Lesson 17: Mortgage Calculator
package com.codewithmosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Principal: ");
    int principal = scanner.nextInt();

    System.out.print("Annual Interest Rate: ");
    float annualInterest = scanner.nextFloat();
    float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

    System.out.print("Period (Years): ");
    byte years = scanner.nextByte();
    int numberOfPayments = years * MONTHS_IN_YEAR;

    double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println("Mortgage: " + mortgageFormatted);
  }
}


//************************************** CONTROL FLOW ****************************************

//Lesson 2: 

//if an 'if clause' has only one statement in it, the curly braces are optional 

//Lesson 5: Simplifying IF Statements:
int income = 120_000;
boolean hasHighIncome;

if(income > 100_000)
  hasHighIncome = true;
else
  hasHighIncome = false;

//above if statement can be written as: 
boolean hasHighIncome = income > 100_000;
//it can be written as this cause cause the comaprison sign will return a boolaean..plus there is no need to state false cause the comparison operator will return a boolean value. 

//Lesson 6: Ternary Operator:

int income = 120_000;
String className = income > 100_000 ? "First" : "Economy";

//Lesson 7: Switch Statements: 

String role = "admin"; 

switch (role) {
  case "admin":
    System.out.println("you are admin.");
    break;
  case "moderator": 
    System.out.println("you are moderator.");
  default: 
    System.out.println("you are a guest")

//the switch statment can be used with integers that are byte, short and int, but NOT long types. 

//Lesson 8: FizzBuzz:

Scanner scanner = new Scanner(System.in);
System.out.print("Number: ");
int number = scanner.nextInt();

if(number % 15 == 0) System.out.println("FizzBuzz");
else if(number % 5 == 0) System.out.println("Fizz");
else if(number % 3 == 0) System.out.println("Buzz");
else System.out.println(number);

//in Java, Strings are no primitive values, so the following would not work. 
String input = "";
while (input == "quit"){};
//This would attempt to compare the addresses of the two strings, cause Strings in Java are saved by reference...they are not primitive values in JavaScript or Ruby.Instead do: 
while (!input.equalsIgnoreCase("quit")) {};

//the code will execute an least, even if the condition is false
do{
  //code
} while(!input.equalsIgnoreCase("quit"))

//Lesson : Break and Continue Keywords: 
//break keyword will terminate the block of code. 
//continue statement will take you back to the top of the loop: 
while(!input.equals("quit")){
  System.out.print("pass");
  continue;
  System.out.print("I will not be printed");
}//line 235 will not be printed, cause the continue keyword will take the loop back to line 232, the beginning of the loop.

package com.codewithmosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;

    int principal;
    float annualInterest;
    float monthlyInterest;
    int numberOfPayments;

    Scanner scanner = new Scanner(System.in);

    while(true){
      System.out.print("Principal ($1K - $1M) ");
      principal = scanner.nextInt();
      if(principal >= 1_000 && principal <= 1_000_000) break;
      System.out.println("Please enter an amount btw 1K and 1M.");
    }

    while(true){
      System.out.print("Annual Interest Rate: ");
      annualInterest = scanner.nextFloat();
      if(annualInterest > 0 && annualInterest <= 10) {
        monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        break;
      }
      System.out.println("Please enter a value btw 1 and 10.")
    }
    
    while(true){
      System.out.print("Period (Years): ");
      byte years = scanner.nextByte();
      if(years >= 1 && years <= 30){
        numberOfPayments = years * MONTHS_IN_YEAR;
        break;
      }
      System.out.println("Please enter a value btw 1 and 30");
    }
      

      double mortgage = principal
                  * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                  / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

      String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
      System.out.println("Mortgage: " + mortgageFormatted);
      break;
    }
  }
}

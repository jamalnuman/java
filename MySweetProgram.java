//**************************0-1********************************

//import java.util.Scanner; //this is similar to namespacing in Ruby..we are stating that we want to use the util Scanner..not just any scanner.

//public class MySweetProgram {
  //public static void main(String[] args) { //this is a method or a function. name of this method is main

    //System.out.println("hello there " + args[0] + " " + args[1]); //this is what the method prints.

    // System.out.println("What is your name?"); 
    // Scanner scanner = new Scanner(System.in); 
    // // you can also type java.util.Scanner scanner = new java.util.Scanner(System.in); and you would not need the import comment above on line 3
    // //the System.in allows us to take in info from the command line
    // String name = scanner.nextLine();
    // System.out.println("hello " + name);
  //String x = new String("hello"); //this is considered a property. this is the same as the following:
  //String y = "hello";
  //System.out.println(y + " " + x);
  //int num = 5; //this creates the int in a primitive data type
  //Integer number = 5; //this creates the int as an object data type...The CAPITALIZATION is important. creating the integer in this example from the class of Integer. 
  //System.out.println(num);
  //System.out.println(number);
  //}

//}

//JAVA IS A STATICALLY TYPED PROGRAMMING LANGUAGE..MEANING YOU HAVE TO STATE WHAT TYPE OF DATA YOUR VARIABLES ARE 

//Whereas Dynamically typed languages such as JS or Ruby...the data types do not need to be defined upfront.

//primitive types: boolean, byte, int, long, float, double, char ..they are created in a different manner than object types. example on line 20

//object type data


//line 10: system is a class and a member of the class is 'out'..'out' has a method called 'println'

//line 6: public keyword is an access modifier. every single java executable needs a public class called main

//line 6: static allows you to use this method without the need of creating an instance of the class

//class contains everything and has members.

//methods are like functions

//properties, line 16, store something

//line 8..args[0] is the first argument passed in from the command line. 

//difference btw compiling errors and run-time errors. compile errors means there is something wrong with the written code. run-time errors crash the program

//SINGLE QUOTATIONS NOT USED IN JAVA..Except in certain circumstances

//SEMI-COLONS ARE NEEDED OR COMPILE ERROR WILL BE TRIGGERED.

//EVERY OBJECT (CAUSE EVERYING IN JAVA IS AN OBJECT) FOLLOWS THE FOLLOWING STRUCTURE: 
//type "variable name" = new type()
//Scanner scanner = new Scanner()
//String x = new String()



//***********************1-2******************************************

//import java.util.Scanner; 
//import java.math.BigDecimal;


//public class MySweetProgram {

  //public static final double PI = 3.14; //global constant variable that can be used anywhere in the class. if you wanted to use this in another class, then you would have to use namespacing...MySweetProgram.PI...this is possible cause of the public keyword on line 71.

  //public static void main(String[] args) { 
    // int x; //declaring the varaible
    // x = 5; //assigning a value to the variable 
    // final int Y = 5; //final keyword with capitalization is a constant.  

    //getting user input
    //Scanner scanner = new Scanner(System.in);
    //String x = scanner.nextLine();//this gives you input..like 'gets' in ruby..so you have to store the input in a variable. 
    //System.out.println(x);
    //int y = scanner.nextInt(); //expecting back a whole number
    //System.out.println(y); 

    //when working with money use BigDecimal cause it allow the most precise number..also have to import it..see above
    //BigDecimal money = scanner.nextBigDecimal();

    //to get a boolean
    //boolean x = scanner.nextBoolean();
    //System.out.println(x);

    //to force one input type into another..in this case, forcing a double into an int...you will lose the numbers after the decimal 
    //int x = (int)scanner.nextDouble();
    //System.out.println(x);


    // System.out.println(Integer.MIN_VALUE); //the minimum value Integer can hold 
    // System.out.println(Integer.MAX_VALUE); //maximum value it can hold 
    // System.out.println(Integer.SIZE); //show how many bits Integer can hold. 
    // System.out.println(Double.MIN_VALUE);
    // System.out.println(Double.SIZE);
    // //asking Double is math.sqrt of -1 is Nan
    // System.out.println(Double.isNaN(Math.sqrt(-1))); response is a boolean
    // System.out.println(Double.isNaN(Math.sqrt(1))); response is a boolean
    // System.out.println(Math.pow(-99999, 999999)); prints infinity
    // System.out.println(Math.pow(99999, 999999)); prints infinity

    //i can now get a decimal value back, cause one of the numbers is a double and the other is a int...so the double value will be used in the return..and the return will always have a '.'...similar to Ruby.
    //double x = 10.0 / 2;
    //System.out.println(x);

    // int a = 5;
    // double y = (double)a / 2;
    // System.out.println(y);

    //IMPORTANT..this gives back 5 and 6 cause of where the '++' are at 
    // int x = 5; 
    // int a = x++;
    // System.out.println(x);
    // System.out.println(a);

    //this gives back 6 and 6 cause of where the '++' are at 
    // int x = 5; 
    // int a = ++x;
    // System.out.println(x);
    // System.out.println(a);

    // int x = Integer.max(10, 20);
    // System.out.println(x);
    // System.out.println(Integer.compare(10,20)); provides the -1, 1, 0 in the return..like sort() in JS

    //converting string into a number..valueOf gives you an object..Integer and parseInt gives you a primitive value like int = 
    // String money = "300";
    // System.out.println(Integer.parseInt(money));
    // System.out.println(Integer.valueOf(money)); so you can call methods on this cause valueOf will return an object. 

    //working with strings...you have to use double quotes..and it there is not a primitive way of assigning a value to the string class..like there is with numbers (int and Integer)...only String with string data types.

    // String x = "hello";
    // System.out.println(x.charAt(0));
    // String y = "hello\n\n\n\ncats";
    // String z = "hello\\cats";

    // System.out.println(z); 

    //string interpolitation
    //String name = "jamal ";
    //System.out.println(String.format("hello %s", name));
    //System.out.println(name.length());
    //System.out.println(name.charAt(name.length() - 1));
    // System.out.println(name.contains("j"));
    // System.out.println(name.indexOf("j"));
    // System.out.println(name.indexOf("k"));
    // System.out.println(name.lastIndexOf("a"));
    // System.out.println(name.toUpperCase());
    // System.out.println(name.toLowerCase());
    //????System.out.println(name.stripLeading());
    // System.out.println(name.substring(2));
    // System.out.println(name.substring(1,5)); inclusive and exclusive
    //????System.out.println(name.repeat(2));
    //System.out.println(name.equals("hello"));
  //}
//}

// scope also matters in java like it does in ruby or js

//int data type is a whole number

//double data type is a float 

//boolean isPizzaGood = true;

//byte c = 67 or byte c = 'C'; can store numbers or letters cause this data type is based on the ASCII Table..stores 8 bit data..also need to be stored in single quotes

//char c = 'Z' used to store unicode letters to access different languages...stores 16 bit data...needs single quotes. 

//short s = 16 bit data...stores number data type..highest is 32768 in length

// int i = 4555; ...32 bit data type..can store large numbers

// long l = 454433L; ...64 bit data type...can store large large numbers...you may get an error if the L is not present, cause then java may think you are using the long data type to store an int data type...best practice to use the L when using long data type. 

//float f = 20.5f; 32 bit data type..if you use float then you have to use 'f' ..not the case with double data type. 

//double d = 20.5; 64 bit data type 

//*********************************2-3***************************

// import java.util.Scanner;

// public class MySweetProgram{

//   public static void main(String[] args) {
    //simple class instance
    // User user = new User();
    // user.firstName = "jamal";
    // user.lastName = "numan";
    // System.out.println(user.getFullName());

    
    //another difference btw primitive and objects
    // String password = "let me in";
    // System.out.println("Guess the password.");
    // Scanner scanner = new Scanner(System.in);
    // String guess = scanner.nextLine();
    // System.out.println(password.equals(guess));
    // System.out.println(password == guess);
    //this will return false..remember for primitive values, in an if statement this will work, but not for objects...cause primitives actually hold the value whereas, objects point or hold a reference to the value.




    //if / else if / else statments 
    // String password = "let me in";
    // System.out.println("Guess the password.");
    // Scanner scanner = new Scanner(System.in);
    // String guess = scanner.nextLine();
    // System.out.println(password.equals(guess));

    // if(password.equals(guess)) {
    //   System.out.println("guess is correct!");
    // } else {
    //   System.out.println("guess is NOT correct!");
    // }




    //logical comparison / operators are the same in JS..> < => <= == != || &&
    // System.out.println("How old are you");
    // Scanner scanner = new Scanner(System.in);
    // int age = scanner.nextInt();


    // System.out.println("Cats or Dogs?");
    // Scanner scanners = new Scanner(System.in);
    // String animal = scanners.nextLine();

    // if(age > 12) {
    //   System.out.println("You are " + age + " and like " + animal);
    // }



    //Switch Statements
    // System.out.println("What is your name?");
    // Scanner scanner = new Scanner(System.in);
    // String name = scanner.nextLine();

    // switch(name) { //put just the name variable
    //   case "jamal":
    //     System.out.println("your name is jamal");
    //     break;
    //   case "clare":
    //     System.out.println("your name is clare");
    //     break;
    //   default:
    //     System.out.println("Your name is not jamal or clare");
    //     break; //this break statement is optional cause it is the last statement.
    // }  


    //Ternary Operator
    //important to make sure result matches the type of data type..as seen in line 266 and 267
    // String name = "clare";
    // String x = name.equals("clare") ? "clare" + "h" : "clare"; 
    // boolean x = name.equals("clare") ? true : false;
    // System.out.println(x);


    //loops 
    //initialization, comparison, update (icu)

    // int index = 0;
    // while (index < 10) {
    //   System.out.println("jamal");
    //   index++;
    // }



    // System.out.println("guess the password");
    // String password = "let me in";
    // Scanner scanner = new Scanner(System.in);
    // String guess = scanner.nextLine();

    // while (!guess.equals(password)) {
    //   System.out.println("guess again");
    //   guess = scanner.nextLine();
    // }

    // System.out.println("congrats..you guessed correctly!");
    // scanner.close();



    //the above code had wet code...this is do/while loop helped to get around the wet code. 
    // String password = "jamal";
    // Scanner scanner = new Scanner(System.in);
    // String guess; //this needs to be defined outside the loop, so it can be accessed in the while portion of the loop on line 307..if it was not defined here, then it would not be available for line 307.

    // do {

    //   System.out.println("Guess the password!");
    //   guess = scanner.nextLine();

    // } while (!guess.equals(password));

    // System.out.println("congrats..you guessed correctly!");
    // scanner.close();



    // for(int index = 0; index < 10; index++) {
    //   System.out.println("jamal");
    // }

  //}

//}

//****************** 3 to 4 ***************************


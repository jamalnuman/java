//**************************0-1********************************

import java.util.Scanner; //this is similar to namespacing in Ruby..we are stating that we want to use the util Scanner..not just any scanner.

public class MySweetProgram {
  public static void main(String[] args) { //this is a method or a function. name of this method is main

  System.out.println("hello there " + args[0] + " " + args[1]); //this is what the method prints.

  System.out.println("What is your name?"); 
  Scanner scanner = new Scanner(System.in); 
  // you can also type java.util.Scanner scanner = new java.util.Scanner(System.in); and you would not need the import comment above on line 3
  //the System.in allows us to take in info from the command line
  String name = scanner.nextLine();
  System.out.println("hello " + name);
  String x = new String("hello"); //this is considered a property. this is the same as the following:
  String y = "hello";
  System.out.println(y + " " + x);
  int num = 5; //this creates the int in a primitive data type
  Integer number = 5; //this creates the int as an object data type...The CAPITALIZATION is important. creating the integer in this example from the class of Integer. 
  System.out.println(num);
  System.out.println(number);
  }

}

//JAVA IS A STATICALLY TYPED PROGRAMMING LANGUAGE..MEANING YOU HAVE TO STATE WHAT TYPE OF DATA YOUR VARIABLES ARE 

//Whereas Dynamically typed languages such as JS or Ruby...the data types do not need to be defined upfront.

//primitive types: boolean, byte, int, long, float, double, char ..they are created in a different manner than object types. example on line 20

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
Scanner scanner = new Scanner()
String x = new String()



//***********************1-2******************************************

import java.util.Scanner; 
import java.math.BigDecimal;


public class MySweetProgram {

  public static final double PI = 3.14; //global constant variable that can be used anywhere in the class. if you wanted to use this in another class, then you would have to use namespacing...MySweetProgram.PI...this is possible cause of the public keyword on line 70.

  public static void main(String[] args) { 
    int x; //declaring the varaible
    x = 5; //assigning a value to the variable 
    final int Y = 5; //final keyword with capitalization is a constant.  

    //getting user input
    Scanner scanner = new Scanner(System.in);
    String x = scanner.nextLine();//this gives you input..like 'gets' in ruby..so you have to store the input in a variable. 
    System.out.println(x);
    int y = scanner.nextInt(); //expecting back a whole number
    System.out.println(y); 

    //when working with money use BigDecimal cause it allows the most precise number..also have to import it..see above
    BigDecimal money = scanner.nextBigDecimal();

    //to get a boolean
    boolean x = scanner.nextBoolean();
    System.out.println(x);

    //to force one input type into another..in this case, forcing a double into an int...you will lose the numbers after the decimal 
    int x = (int)scanner.nextDouble();
    System.out.println(x);


    System.out.println(Integer.MIN_VALUE); //the minimum value Integer can hold 
    System.out.println(Integer.MAX_VALUE); //maximum value it can hold 
    System.out.println(Integer.SIZE); //show how many bits Integer can hold. 
    System.out.println(Double.MIN_VALUE);
    System.out.println(Double.SIZE);
    //asking Double is math.sqrt of -1 is Nan
    System.out.println(Double.isNaN(Math.sqrt(-1))); response is a boolean
    System.out.println(Double.isNaN(Math.sqrt(1))); response is a boolean
    System.out.println(Math.pow(-99999, 999999)); prints infinity
    System.out.println(Math.pow(99999, 999999)); prints infinity

    //i can now get a decimal value back, cause one of the numbers is a double and the other is a int...so the double value will be used in the return..and the return will always have a '.'...similar to Ruby.
    double x = 10.0 / 2;
    System.out.println(x);

    int a = 5;
    double y = (double)a / 2;
    System.out.println(y);

    //IMPORTANT..this gives back 5 and 6 cause of where the '++' are at 
    int x = 5; 
    int a = x++;
    System.out.println(x); //=> 5
    System.out.println(a); //=> 6

    //this gives back 6 and 6 cause of where the '++' are at 
    int x = 5; 
    int a = ++x; 
    System.out.println(x); //=> 6
    System.out.println(a); //=> 6

    int x = Integer.max(10, 20);
    System.out.println(x);
    System.out.println(Integer.compare(10,20)); //provides the -1, 1, 0 in the return..like sort() in JS

    //converting string into a number..valueOf gives you an object.. parseInt gives you a primitive value like int = 
    String money = "300";
    System.out.println(Integer.parseInt(money));
    System.out.println(Integer.valueOf(money)); //so you can call methods on this cause valueOf will return an object. 

    //working with strings...you have to use double quotes..and there is not a primitive way of assigning a value to the string class..like there is with numbers (int and Integer)...only String with string data types.

    String x = "hello";
    System.out.println(x.charAt(0));
    String y = "hello\n\n\n\ncats";
    String z = "hello\\cats";

    System.out.println(z); 

    //string interpolitation
    String name = "jamal ";
    System.out.println(String.format("hello %s", name));
    System.out.println(name.length());
    System.out.println(name.charAt(name.length() - 1));
    System.out.println(name.contains("j"));
    System.out.println(name.indexOf("j"));
    System.out.println(name.indexOf("k"));
    System.out.println(name.lastIndexOf("a"));
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    //????System.out.println(name.stripLeading());
    System.out.println(name.substring(2));
    System.out.println(name.substring(1,5)); inclusive and exclusive
    //????System.out.println(name.repeat(2));
    System.out.println(name.equals("hello"));
  }
}

// scope also matters in java like it does in ruby or js

//int data type is a whole number

//double data type is a float 

boolean isPizzaGood = true;

//byte c = 67 or byte c = 'C'; can store numbers or letters cause this data type is based on the ASCII Table..stores 8 bit data..also need to be stored in single quotes

char c = 'Z'; //used to store unicode letters to access different languages...stores 16 bit data...needs single quotes. 

short s = 16; //bit data...stores number data type..highest is 32768 in length

int i = 4555; //...32 bit data type..can store large numbers

long l = 454433L; //...64 bit data type...can store large large numbers...you may get an error if the L is not present, cause then java may think you are using the long data type to store an int data type...best practice to use the L when using long data type. 

float f = 20.5f; //32 bit data type..if you use float then you have to use 'f' ..not the case with double data type. 

double d = 20.5; //64 bit data type 

//*********************************2-3***************************

import java.util.Scanner;

public class MySweetProgram{

  public static void main(String[] args) {
    //simple class instance
    User user = new User();
    user.firstName = "jamal";
    user.lastName = "numan";
    System.out.println(user.getFullName());

    
    //another difference btw primitive and objects
    String password = "let me in";
    System.out.println("Guess the password.");
    Scanner scanner = new Scanner(System.in);
    String guess = scanner.nextLine();
    System.out.println(password.equals(guess));
    System.out.println(password == guess);
    //this will return false..remember for primitive values, in an if statement this will work, but not for objects...cause primitives actually hold the value whereas, objects point or hold a reference to the value.




    //if / else if / else statments 
    String password = "let me in";
    System.out.println("Guess the password.");
    Scanner scanner = new Scanner(System.in);
    String guess = scanner.nextLine();
    System.out.println(password.equals(guess));

    if(password.equals(guess)) {
      System.out.println("guess is correct!");
    } else {
      System.out.println("guess is NOT correct!");
    }




    //logical comparison / operators are the same in JS..> < => <= == != || &&
    System.out.println("How old are you");
    Scanner scanner = new Scanner(System.in);
    int age = scanner.nextInt();


    System.out.println("Cats or Dogs?");
    Scanner scanners = new Scanner(System.in);
    String animal = scanners.nextLine();

    if(age > 12) {
      System.out.println("You are " + age + " and like " + animal);
    }



    //Switch Statements
    System.out.println("What is your name?");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();

    switch(name) { //put just the name variable
      case "jamal":
        System.out.println("your name is jamal");
        break; //this is needed cause the return keyword is not present.
      case "clare":
        System.out.println("your name is clare");
        break;
      default:
        System.out.println("Your name is not jamal or clare");
        break; //this break statement is optional cause it is the last statement.
    }  


    //Ternary Operator
    //important to make sure the return value from the ternary operator matches the type of data for the variable..as seen in line 263 and 264
    String name = "clare";
    String x = name.equals("clare") ? "clare" + "h" : "clare"; 
    boolean x = name.equals("clare") ? true : false;
    System.out.println(x);


    //loops 
    //initialization, comparison, update (icu)

    int index = 0;
    while (index < 10) {
      System.out.println("jamal");
      index++;
    }


    String password = "let me in";
    System.out.println("guess the password");
    Scanner scanner = new Scanner(System.in);
    String guess = scanner.nextLine();

    while (!guess.equals(password)) {
      System.out.println("guess again");
      guess = scanner.nextLine();
    }

    System.out.println("congrats..you guessed correctly!");
    scanner.close();



    //the above is wet code...this do/while loop helped to get around the wet code. 
    String password = "jamal";
    Scanner scanner = new Scanner(System.in);
    String guess; //this needs to be defined outside the loop, so it can be accessed in the while portion of the loop on line 303..if it was not defined here, then it would not be available for line 307.

    do {

      System.out.println("Guess the password!");
      guess = scanner.nextLine();

    } while (!guess.equals(password));

    System.out.println("congrats..you guessed correctly!");
    scanner.close();



    for(int index = 0; index < 10; index++) {
      System.out.println("jamal");
    }

  }

}

//****************** 3 to 4 ***************************


import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

//nested if statement
// scope
// break keyword..takes you out of the method/function/loop
// continue keyword takes you to the next iteration of the loop

 public class MySweetProgram{

   public static void main(String[] args) {
    int i = 9;
    while (i >= 0) {
      int j = i;
      while(j >= 0){
        System.out.println(j + " ");
        j--;
      }
      System.out.println();
      i--;
    }

    for(int i = 9; i >= 0; i--) {
      for(int j = i; j >= 0; j--) {
        System.out.println(j + " ");
      }
        System.out.println(); //prints a blank line
    }

    
    int[] empty = new int[10];
    //integer array..name is grades
    int[] grades = new int[10];
    int[] othergrades = {1,2,3,99,-1,5,6,7,8,9,10};
    int[][] studentsgrades = {{1,2,3},{4,5,6,7}};
    grades[0] = 18;
    new int[10];

    //this gives the memory address of the array
    System.out.println(othergrades);

    //this is how you print the values of an array...have to import, as well.  
    System.out.println(Arrays.toString(othergrades));

    //to print the values of a nested array
    System.out.println(Arrays.deepToString(studentsgrades));

    System.out.println("enter a number");
    Scanner userinput = new Scanner(System.in);

    for (int i=0; i<10; i++ ) {
      int x = userinput.nextInt();
      //grades[i] = 5;
      empty[i] = x;
    }
    System.out.println(Arrays.toString(empty));

    //this is when you want to print out the error 
    try{
      System.out.println(othergrades[11]);  
    } catch(Exception e) {
      System.out.println(e);
    }

    //to dynamically size the array
    System.out.println("What size should the array be?");
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int[] custom = new int[size];
    System.out.println(Arrays.toString(custom));
    
    Arrays.sort(othergrades); //alters the original array
    System.out.println(Arrays.toString(othergrades));
    
    //comparing arrays
    int[] grades2 = {1,2,3,99,-1,5,6,7,8,9,10};
    boolean response = Arrays.equals(othergrades, grades2);
    System.out.println(response);

    //filling an array
    String[] practice = new String[3];
    Arrays.fill(practice, "test");
    System.out.println(Arrays.toString(practice));

    //2d Array
    int[][] grades = new int[3][4]; //the 3 is the row and 4 is the column
    System.out.println(Arrays.deepToString(grades));
    grades[1][1] = 5;
    System.out.println(Arrays.deepToString(grades));

    int[][] grades = {
      {1,2,3},
      {4,5,6,7,8,9},
      {11,22,33}
    };

    System.out.println(grades.length);
    System.out.println(grades[1].length);

    //looping through 2d arrays
    for (int row = 0; row < grades.length; row++) {
      for (int col=0; col<grades[row].length; col++ ) {
        System.out.println(grades[row][col]); 
      } 
    }
  }
}

//*********************4 to 5****************************************************
//ArraysList will resize as the input increases
ArrayList<Integer>grades = new ArrayList<Integer>();
//<within here can be any type of data structure, such as Integer, String, Float etc.
grades.add(5) //to add a value
grades.get(0) //to get the 0th value 
grades.set(0, 10) //to update an index with a value
grades.size() //will return the length of the arraylist

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MySweetProgram {

  public static void main(String[] args) {
    //Stating grades will be a list and what type of list is defined after the new keyword...in this example an ArrayList..it could also be, for example, LinkedList
    List<Integer> grades = new ArrayList<Integer>();
    grades.add(5);
    grades.add(7);
    System.out.println(grades.get(0));
    //replace the value at an index
    grades.add(0,99);
    System.out.println(grades.isEmpty());
    System.out.println(grades.contains(99));
    System.out.println(grades.indexOf(9));
    System.out.println(grades.get(0));
    //grades.remove(0);
    System.out.println(grades.get(0));
    grades.clear();
    //printing an ArrayList
    System.out.println(grades);
    //Making an Array and then converting to an ArrayList
    List<Integer> grades = Arrays.asList(4,5,3,2,2);
    System.out.println(grades);
    List<String> string = Arrays.asList("h");
    System.out.println(string);
    //iterate through the arraylist 
    for(int i = 0; i < grades.size(); i++) {
      grades.set(i, grades.get(i) * 2);
      System.out.println(grades.get(i));
    }  
    //foreach loop..for each grade in grades
    for(int grade : grades) {
      System.out.println(grade);
    } 

    //List of List of Integers
    List<List<Integer>> allGrades = new ArrayList<List<Integer>>();
    allGrades.add(Arrays.asList(1,2,3,4,5));
    allGrades.add(Arrays.asList(11,12,13,14,15));
    allGrades.add(Arrays.asList(21,22,23,24,25));

    for(List<Integer> grades : allGrades) {
      for(int grade : grades) {
        System.out.print(grade + "*");
      }
      System.out.println();
    }
    //converting ArrayList to an Array
    List<Integer> allGrades = Arrays.asList(1,2,3,9,4,5);
    int[] grades = new int[allGrades.size()];

    for(int i = 0; i < allGrades.size(); i++) {
      grades[i] = allGrades.get(i);
    }
    System.out.println(allGrades);
    System.out.println(Arrays.toString(grades));
  }
}

//if a class has the keyword "void", it can not return a value, but you can still use the return keyword...in that case, the return keyword will only exit you out of the function. 

//***************************************** 5 to 6 *************************************************

import java.util.ArrayList;
import java.util.List;

public class MySweetProgram {

  public static void main(String[] args) {
  
  //encapsulation: when you group behaviors and methods that are related into the same class. 

  User user = new User();
  System.out.println(user.getFirstName());
  user.setFirstName("jamal");
  System.out.println(user.getFirstName());
  System.out.println(user.getLastName());
  user.setLastName("numan");
  System.out.println(user.getLastName());
  System.out.println(user.getFullName());

  //to create an Array List of a custom type
  //create an object from the User class
  User me = new User();
  me.setFirstName("jamal");
  me.setLastName("numan");

  //create a List with a custom type of <User>
  List<User> customList = new ArrayList<User>();
  customList.add(me);

  //then print the values
  System.out.println(customList.get(0).getFullName());

    //dynamically create a User class and set the properties within it
    String[] firstNames = { "jamal", "yasmeen"};
    String[] lastNames = {"numan", "ahmed"};

    List<User> us = new ArrayList<User>();

    for(int i = 0; i < firstNames.length; i++) {
      User us2 = new User();
      us2.setFirstName(firstNames[i]);
      us2.setLastName(lastNames[i]);
      us.add(us2);
    }

    for (User xx : us) {
      System.out.println(xx.getFullName());
    }
  }

    //static methods are called on the class, like User.findList() and instance methods are on called on the instance, meaning the objects of the class, like User u = new User() and then u.talk().

    User x = new User();
    x.setFirstName(jamal);
    x.setLastName(numan);
    User.printFullName(x);

    User y = new User();
    y.setFirstName(yasmeen);
    y.setLastName(ahmed);


    List<User> users = new ArrayList<User>();
    users.add(x);
    users.add(y);

    //this method is called on the class and takes a list as an argument. see the printName() method in User.java
    User.printName(users);

    //method overloading
    System.out.println(x.output);
    System.out.println(x.output(true));
    System.out.println(x.output(false));

    //the method gets called on the user class, that is why the 'static' keyword is used and the method takes a List with a full name. 
    System.out.println(User.searchList(users, "yasmeen ahmed"));

    //if the User or another parent class has a method defined and the inheritance class wants to override that method, it is done as: 

    @Override //this is needed
    public void sayHello() { //the method name has to be the same as the method in the parent's class
      enter the code here
    }

    //method overwriting..this is when you change an inherited method in an object (instance). this print statment is using the toString() method overwrite ..these are the same print statement. the .toString() is implied implicitly. 
      System.out.println(x);
      System.out.println(x.toString()); 


      Searching a list for custom objects. the searchList from line 51
      System.out.println(User.searchList(users, y));

      //x is in the List - Users
      System.out.println(User.findUser(users, x));
      //y, for this example, is not in the List-Users
      System.out.println(User.findUser(users, x));

  }

//how to pass custom type as an argument. I DONT UNDERSTAND THIS 
    public void printUser (User us2) {
      System.out.println(us2.getFullName());
    }  
  


//to extend a class to another class
public class Student extends User{
  //now the Student class will have the same methods that the User class has
}

//****************** last hour ************************


//if you dont want the ability to create instances from class, use the keyword 'abstract'..for ex:
public abstract class User {} //so you CAN'T do the following: User x = new User();

//you can also have abstract methods. these types of methods are not allowed to have a body. and if a child class inherits abstract methods from the parent class, then child class MUST create their own case of the abstract method (with the @Override) or else an error will occur. the following is the syntax for an abstract method: public abstract void sayHello(); 

//Polymorphism...this is when the parent class has an abstract method and this abstract method in the child classes print different values. 
public class User {
  public abstract void sayHello();
}

public class Student extends User {
  @Override
  public void sayHello() {
    System.out.println("I am a student");
  }
}

public class Teacher extends User {
  @Override
  public void sayHello() {
    System.out.println("I am a teacher.");
  }
}

//Constructor: doesnt have return types like String or Int etc and is envoked with the new keyword. the name of the constructor has to be the SAME as the class. this is like the initialize method in Ruby or the constructor method in JS. 
//in the User class the constructor syntax:
public class User {
  public User(String firstName, String lastName){
    firstName = firstName;
    lastName = lastName;
  }
}
//now when the this class is envoked, it will expect two arguments. User x = new User ("jamal", "numan")

//from the child, if you want to invoke a method from the parent class..use the super keyword...super.sayHello();

//Interfaces define behavior (how you work with something) 

//to create an interface: 
public interface Talk {
  void sayHello();
} //the method will not include a body, the body will be coded once the interface is implemented into a class. 

//to include an interface in a class: 
public class Student extends User implements Talk
//now the class will be forced to include a method sayHello() in it with a body. 

//to make sure a method is not overwritten by a child class, use the final keyword. 
public final void sayHello();

//to make sure that a class can not have any child classes, use the final keyword:
public final class Teacher
//now this class CAN NOT BE EXTENDED OR HAVE ANY CHILD CALSSES. 


//remember when you open a scanner or something else, then close the scanner...if the scanner is named "in"...then in.close();



package youTube;

import java.util.Scanner;

public class forTesting {

  public static void main(String[] args) {
   System.out.println("Enter your name!");
   Scanner name = new Scanner(System.in);
   String yourName = name.nextLine();
   if(yourName.equalsIgnoreCase("jamal")) {
     System.out.println("Your name is Jamal");
   } else {
     System.out.println("Your name is " + yourName);
   }
     name.close();
      
   int number = 0;
   while (number < 10) {
     System.out.println(number);
     number ++;
   }
      
    //this will print an least one time, cause of the syntax. 
   int number = 10;
   do {
     System.out.println(number);
     number++;
   } while (number < 0);
    
    }


  }

//make the size of the array, with input from the user
  System.out.println("Enter a number.");
  Scanner info = new Scanner(System.in);
  int size = info.nextInt();
  
  
  //integer array named grades
  int[] grades = new int[size];
  
  for(int i = 0; i < size; i++) {
    grades[i] = info.nextInt();
    System.out.println(grades[i]);
  }
  
  System.out.println(Arrays.toString(grades));
  info.close();



//to read from a file..remember the import 

public class forTesting {

  public static void main(String[] args) throws FileNotFoundException { 
  File file = new File("test.txt");
  Scanner print = new Scanner(file);
  while (print.hasNextLine()) { 
    System.out.println(print.nextLine()); 
  }
  print.close();
  } 
} 



//read from a file and then enter the values into a List and then print the values of the List
public static void main(String[] args) throws FileNotFoundException { 
  File file = new File("test.txt");
  Scanner print = new Scanner(file);
  List<String> names =  new ArrayList<String>();
  while (print.hasNextLine()) { 
    names.add(print.nextLine()); 
  }
  
  for(int i = 0; i < names.size(); i++) {
    System.out.println(names.get(i));
  }
  print.close();
  } 

//it is important that you keep the interface general so it can take the value assigned to it...for example: 
List<String> example = new ArrayList<String>(); //this works cause an ArrayList will be accepted by a List, but the following will not work: ArrayList<String> example = new LinkedList<String>(); cause both of these values are specific and the interface is not general like List is. 




public static void main(String[] args) throws FileNotFoundException { 
  LinkedList<String> names = new LinkedList<String>();
  names.add("jamal");
  names.add("yasmeen");
  names.add("john");
  names.add(0, "Jamal");
  for(String name : names) {
    System.out.println(name);
  }
} //REMEMBER TO ADD THE IMPORTS
System.out.println(names.remove()); //this is like a queque..removes the first item put in..FIFO ..also takes an argument as: names.remove(2);



//working with Iterator()
public static void main(String[] args) throws FileNotFoundException { 
  LinkedList<String> names = new LinkedList<String>();
  names.add("jamal");
  names.add("yasmeen");
  names.add("john");
  names.add(0, "Jamal");
  System.out.println(names.remove(2));
  System.out.println(names.remove());
 for(String name : names) {
   System.out.println(name);
   
 }
  //iterator type will be a String cause the data type for names is a String.
  Iterator<String> items = names.iterator();
  System.out.println(items.next());
  System.out.println(items.next());
  System.out.println(items.hasNext());
  if(items.hasNext()) {
    System.out.println(items.next()); 
  }
  while(items.hasNext()) {
    System.out.println(items.next());
  }
  for(String s : names) {
    System.out.println(s);
  }
  } 



//iterating through 2d array
public static void main(String[] args) { 
  
    int[][] data = {
        {1, 2, 3, 4, 5},
        {11, 22, 33, 44, 55},
        {33, 44, 55, 66, 77}
    };
    //System.out.println(data[1][2]);
    for(int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {
        System.out.print(data[i][j] + " ");
      }
      System.out.println();
    }
  } 



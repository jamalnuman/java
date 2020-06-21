import java.util.List;

public class User {

  //in order for us to call these methods in another class, these need to have the 'public' keyword. 
  
  //remember the value for these variables / fields will be assigned when an object from this class is instantiated. 
  private String firstName; 
  private String lastName;

  //getter method..that is returning a String value..you would also need to the change the public keyword on line 8 to private for firstName variable. 
  public String getFirstName() {
    return firstName;
    //return firstName.toUpperCase();
  }

  public String getLastName() {
    return lastName;
  }

  //setter method that is not returning a value, so the void keyword is used AND THEREFORE THE RETURN KEYWORD CAN NOT BE USED. parameter passed in, is a String and can be given any name.
  public void setFirstName(String fn) {
    firstName = fn;
  }

  public void setLastName(String ln) {
    lastName = ln;
  }

  //Again, the public keyword, and it also states that we are returning a String not an Integer or something else
  public String getFullName() {
    return firstName + " " + lastName;
    //you can also use the methods to get the values instead of the variables. 
    //return getFirstName() + " " + getLastName();
  }

  //method overload 
  public String output() {
    return "Hi my name is " + getFullName(); 
  }

  public String output(boolean nice) {
    if (nice) {
      return "you are a beautiful person.";
    } else {
      return "you a bad person.";
    }
  }
  //this will return an integer, that is why int is on line 31. 
  public static int searchList(List<User> xxx, String fullName) {
    for(int i = 0; i < xxx.size(); i++) {
      if (xxx.get(i).getFullName().equals(fullName)) 
      return i;
    }
    return -1;
  }

  //ABOVE IS THE INSTANCE METHOD AND THIS IS THE STATIC METHOD WHICH IS CALLED ON THE CLASS:

  public static void printFullName(User x) {
    System.out.println(x.getFullName());
  }

  // STATIC METHOD, so it is called on a class, and it is TAKING A LIST as an argument.. NOT A CLASS
  public static void printName(List<User> xxx) {
    for (User x : xxx) { //for every user in the list
      System.out.println(x.getFullName());
    }
  }

  //searching for an object within a List..this will return the index cause it is using the code from the above searchList method ..this is also method overloading
  //Searching a list for custom objects. 
  public static int searchList(List<User> xx, User xxx) {
    return searchList(xx, xxx.getFullName());
  } 

  //searching through a List and return the user object if found in the List 
  public static User findUser(List<User> xxx, User x) {
    for(User anyuser : xxx) { //looping thru xxx
      if(anyuser.equals(x)) {//x being the passed in User
        return anyuser;
      }
    }
    return null;
  }

  

  //method overwriting
  @Override
  public String toString() { //this method must have the same name of the method you are trying to overwrite
    return getFullName();
  }
  

}
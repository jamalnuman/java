public class User {

  //in order for us to call these methods in another class, these need to have the 'public' keyword. 
  //remember the value for these variables / fields will be assigned when an object from the is class is instantiated. 
  public String firstName; 
  public String lastName;

  //Again, the public keyword, and it also states that we are returning a String not an Integer or something else
  public String getFullName() {
    return firstName + " " + lastName;
  }
}
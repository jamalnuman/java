public class User {

  //in order for us to call these methods in another class, these need to have the 'public' keyword. 
  public String firstName; 
  public String lastName;

  //Again, the public keyword and also states that we are returning a String not an Integer or somthing else
  public String getFullName() {
    return firstName + " " + lastName;
  }
}
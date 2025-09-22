class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }


  void init(){
    
    /* 
    Lesson 6: Use the Input Class provided to you, to get input from a user via the keyboard. In the examples below, the function calls for each datatype: int, double, string, char, boolean. 
   */
 

    // Always prompt the user for what information you are requesting
    // Declare the variables you will need to store the information
    // Print the information
    
    // Problem 1:   Ask a student for their age.  
    System.out.println("Enter your age");
    int age = Input.readInt();
    System.out.println("Age " + age);
    
    // Problem 2:   Ask a student for their GPA.
   System.out.println("Enter GPA");
   double GPA = Input.readDouble();
   System.out.println("GPA is " + GPA);
    
    
    // Problem 3:   Ask a student for their first name.
   System.out.println("Enter first name");
   String firstName = Input.readString();
   System.out.println("First name is " + firstName);
    

    // Problem 4:   Ask a player if they want to continue to play  
    // There are a few ways to do this (maybe Y/N for Yes or No)
    System.out.println("Continue?");
    boolean resume = Input.readBoolean();
    System.out.println("Contiune game is: " + resume);
    
      
    
    System.out.println("======== ++++++ =======\n*** End of exercise ***");

  }
}
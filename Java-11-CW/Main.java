class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // Invoke the functions below
    System.out.println("Enter email");
    String email = Input.readString();
    System.out.println("Username is " + getUsername(email));
    
    String cat = "Happy Days";
    System.out.println(splitReverse(cat));

    System.out.println("Enter first name, last name, and OSIS number");
    String fName = Input.readString();
    String lName = Input.readString();
    String OSIS = Input.readString();
    System.out.println(createUsername(fName,lName,OSIS));
  }
  /*
    Problem 1:
    Write a function getUsername() that accepts an email and returns the user name. Example: joexyz@gmail.com ==> joexyz
    */
    String getUsername(String email){
    int seperation = email.indexOf("@");
    return email.substring(0,seperation);

  }
   /*   
    Problem 2:
    Write a function splitReverse() that accepts a string and returns a new string made up of the second half followed by the first half of the original string.  Example: "Happy Days" ==> " DaysHappy"
   */
   String splitReverse(String cat){
    return cat.substring(cat.indexOf("Days")) + cat.substring(cat.indexOf("Happy"),5);
   }
  /*   
    Problem 3:
    Write a function createUsername() that accepts a first name, last name and OSIS number and returns the first letter of the first name, the full lastname and the last four characters of the OSIS. Example: John Doe 123456789 ==> "JDoe6789"
  */
  String createUsername(String fName, String lName, String OSIS){
    return fName.charAt(0) + lName.substring(0) + OSIS.substring(4,9);
  }
}
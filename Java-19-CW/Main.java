class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   System.out.println(addNums());
   System.out.println(addNums());
   
   System.out.println(generatePin());
   System.out.println(generatePin());
  }
  /*
  Problem 1:
  Write a function addNums() that returns a string displaying the addition of two random integers that range from -50 to 50 inclusively. 
  Example:
  addNums()==> "-23 + 10 = ?"
  addNums()==> "17 + 41 = ?"
  */
 String addNums(){
  int n1 = (int)(Math.random()*(50-(-50)+1))+(-50);
  int n2 = (int)(Math.random()*(50-(-50)+1))+(-50);
  String result = n1 + " + " + n2 + "=?";
  return result;
 }

  /*
  Problem 2:
  Write a function generatePIN() that generates a random PIN, with each digit being from 3 to 8.
  Example:
  generatePin() ==> 4547
  generatePin() ==> 8365
  */
  String generatePin(){
    int n1 = (int)(Math.random()*(8-3+1))+3;
    int n2 = (int)(Math.random()*(8-3+1))+3;
    int n3 = (int)(Math.random()*(8-3+1))+3;
    int n4 = (int)(Math.random()*(8-3+1))+3;
    String pin = n1 + "" + n2 + "" + n3 + "" + n4;
    return pin;
  }
  
}

class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/* For each of the challenges below:
    a) declare the variables, 
    b) ask the user for the variable values, 
    c) write the specified equation, and 
    d) display the equation value.
*/    
 
//    Challenge 1:  See file Actvy7_Eq1  (done for you)
      System.out.println("Enter the value for x ");
      double x =Input.readDouble();
      double y = Math.pow(x,7);
      System.out.println("Value of y is "+y);   
  
//    Challenge 2:  See file Actvy7_Eq2
     System.out.println("Enter value for a");
     System.out.println("Enter value for b");
     double a =Input.readDouble();
     double b =Input.readDouble();
     double c = Math.sqrt(a+b);
     System.out.println("Value of C is " + c);
     
  
//    Challenge 3:  See file Actvy7_Eq3
    System.out.println("Enter value for z");
    double z = Input.readDouble();
    double q = Math.pow(z,3) + 5;
    System.out.println("Value of q is " + q);
    
  
//    Challenge 4:  See file Actvy7_Eq4
  System.out.println("Enter value for m");
  System.out.println("Enter value for n");
  double m =Input.readDouble();
  double n =Input.readDouble();
  double k = Math.pow(m,5)/Math.sqrt(n+1);
  System.out.println("Value of k is " + k);

//    Challenge 5:  See file Actvy7_Eq5
  System.out.println("Enter value for t");
  System.out.println("Enter value for r");
  double t = Input.readDouble();
  double r = Input.readDouble();
  double s = Math.pow(t,5)*(Math.pow(r,4)+Math.pow(2,4));
  System.out.println("Value of s is " + s );
  
//    Challenge 6:  See file Actvy7_Eq6
 System.out.println("Enter value for x1");
 System.out.println("Enter value for y1");
 System.out.println("Enter value for x2");
 System.out.println("Enter value for y2");
 double x1 =Input.readDouble();
 double y1 =Input.readDouble();
 double x2 =Input.readDouble();
 double y2 =Input.readDouble();
 double d = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
 System.out.println("Value of d is " + d);

//    Challenge 7:  See file Actvy7_Eq7    (HINT: What does the "plus minus: after "-b" mean?)
 System.out.println("Enter value of a");
 System.out.println("Enter value of b");
 System.out.println("Enter value of c");
  a = Input.readDouble();
  b = Input.readDouble();
  c = Input.readDouble();
  double x_plus = -b/(2*a) + Math.sqrt(Math.pow(b,2)-4*(a*c))/(2*a);
  double x_minus = -b/(2*a) - Math.sqrt(Math.pow(b,2)-4*(a*c))/(2*a);
  System.out.println("Value of x is " + x_plus + "and" + x_minus);

    // **************************************************
    // ******** Don't write any code below here. ********
    // **************************************************
  }
}
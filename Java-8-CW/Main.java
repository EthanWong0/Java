class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  // define the functions

  void init(){
    // call the functions
     String madlib(String noun,String adjective,String verb){
      String sentence = noun + adjective + verb;
      return sentence;
     }
    result = madlib(dog,barked,loudly);
    System.out.println("The " + result);
  }
 
   double areaSq(double side){
    double area = side*side;
    return area;
   }
  double result = areaSq(4);
  System.out.println("Area is " + result);

  double areaCircle(double radius){
    double area2 = Math.PI*Math.pow(radius,2);
    return area2;
  }

  double result3 = areaCircle(4);
  System.out.println("Area is " + result3);
}
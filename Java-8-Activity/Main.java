class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  //1: printing a string
  void print(String s){
    System.out.println(s);
  }

  //2: Fahrenheit to Celsius temperature conversion
    double FtoC(double F){
    double C = (F-32)*(5/9.0);
    return C;
   }

  //3: Sphere volume
   double sphereVolume(double R){
    double cV = ((4/3.0)*Math.PI)*Math.pow(R,3);
    return cV;
   }
  
  //4: Cone volume
   double coneVolume(double H, double R2){
    double cV2 = Math.PI*Math.pow(R2,2)*(H/2);
    return cV2;
   }

  //5: Distance between two coordinate points
   double distance(double x1, double y1, double x2, double y2){
    double D = Math.sqrt(Math.pow(x2-x1,2)+(Math.pow(y2-y1,2)));
    return D;
   }


  
  void init(){
    //1
    System.out.println("Enter your name ");
    String name = Input.readString();
    print("Welcome "+name);

    //2
  System.out.println("Enter temperature in farenheight");
  double F = Input.readDouble();
  System.out.println("Temperature in C is " +  FtoC(F));
    //3
  System.out.println("Enter radius of sphere");
  double R = Input.readDouble();
  System.out.println("Volume of sphere is " + sphereVolume(R));
    //4
  System.out.println("Enter height of cone");
  System.out.println("Enter radius of cone");
  double H = Input.readDouble();
  double R2 = Input.readDouble();
  System.out.println("Volume of cone is " + coneVolume(H,R2));
    //5
  System.out.println("Enter x1");
  System.out.println("Enter y1");
  System.out.println("Enter x2");
  System.out.println("Enter y2");
  double x1 = Input.readDouble();
  double y1 = Input.readDouble();
  double x2 = Input.readDouble();
  double y2 = Input.readDouble();
  System.out.println("Distance is " + distance(y2,y1,x2,x1));
    
  }
 
}
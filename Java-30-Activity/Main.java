class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    // create objects
    Car car1 = new Car("Toyota","Camry", "Turquoise", 2026, 29100);
    Car car2 = new Car("Tesla","Model Y", "Red", 2026, 57490);

    // display brand, model and value of each car
    System.out.println(car1.brand + " " + car1.model + " " + car1.value);
    System.out.println(car2.brand + " " + car2.model + " " + car2.value);
    // Display brand and model of any car with value over 30,000
    print("\nCars with value exceeding $30,000:");
	   valuableCars(car2.value, car2.model);
     valuableCars(car1.value, car1.model);
	// Make BMW honk
	print("\nUsing car functions(behavior):");	
    car1.honk(car1.model);
    
  }
  void valuableCars(double value, String model){
    if(value >= 30000)
     System.out.println(model);
  }
}
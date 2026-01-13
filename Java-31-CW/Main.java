class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
  // 3) Create two animal objects in the init function and store each animal in a variable.
   Animal animal1 = new Animal("Turtle",34,23.4);
   Animal animal2 = new Animal("Dog",25.45,21.5);

  // 4) Display if each of the animals is healthy or unhealthy using the function isHealthy(). Also display the weight of each animal in kilos.
    if(animal1.isHealthy()){
      System.out.println(animal1.animalSpecies + " is healthy");
      System.out.println(animal1.convertPoundsToKilos());
    }else{
      System.out.println(animal1.animalSpecies + " is not healthy");
      System.out.println(animal1.convertPoundsToKilos());
    }

      if(animal2.isHealthy()){
      System.out.println(animal2.animalSpecies + " is healthy");
      System.out.println(animal2.convertPoundsToKilos());
    }else{
      System.out.println(animal2.animalSpecies + " is not healthy");
      System.out.println(animal2.convertPoundsToKilos());
    }
  }

}
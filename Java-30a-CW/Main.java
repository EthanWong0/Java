class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // create 3 dogs
    Dog dog1 = new Dog("Golden Retriver", 5, "Pork");
    Dog dog2 = new Dog("German Shepard", 3, "Weasel");
    Dog dog3 = new Dog("Pug", 6, "Pugsley");

    // display object property values
    System.out.println(dog3.age);
    System.out.println(dog2.name);
    System.out.println(dog1.breed);
    
    // invoke object behaviors(functions)
    dog1.bark();
    dog3.bark();
  }

  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }

}
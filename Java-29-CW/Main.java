class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // create new dog objects 
      Dog dog1 = new Dog();
        dog1.name = "Woof";
        dog1.age = 3;
        dog1.breed = "yorkie";
      
      
       Dog dog2 = new Dog();
        dog2.name = "Paul";
        dog2.age = 6;
        dog2.breed = "Pug";
      

       Dog dog3 = new Dog();
        dog3.name = "John";
        dog3.age = 2;
        dog3.breed = "Golden Retriver";
      

    // make dogs bark (invoke function)
        dog1.bark();
        dog2.bark();
        dog3.bark();
   
    
  }




  
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) +lower;
  }

}
class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
   System.out.println(rollDice());
   System.out.println(lotto());
   diceDistribution(100);
    
  }
  /*
  Challenge 1:
  Write a function rollDice() that rolls a die once and returns a value from 1 to 6.
  Example:
  rollDice() ==> "2"
  */
 int rollDice(){
  int result =(int)(Math.random()*(6-(1)+1))+(1);
  return result;
 }

  
  /*
  Challenge 2:
  Write a function lotto() that returns a string of 5 numbers from 1 to 48.
  Example:
  lotto() ==> "1 23 34 9 18"
  */
  String lotto(){
    int n1 = (int)(Math.random()*(48-(1)+1))+(1);
    int n2 = (int)(Math.random()*(48-(1)+1))+(1);
    int n3 = (int)(Math.random()*(48-(1)+1))+(1);
    int n4 = (int)(Math.random()*(48-(1)+1))+(1);
    int n5 = (int)(Math.random()*(48-(1)+1))+(1);
    //or for loop\\
    String result = "" + n1 + " " + n2  + " " + n3 + " " + n4 + " " + n5; // or single "" to force string output\\
    return result; 
  }
  
  /*
  Challenge 3:
  Write a function diceDistribution() that accepts an integer N and rolls a die N times, keeps a counter of the number of times 1,2,3,4,5,6 was rolled (need a counter for each) and displays the counters for each.
  Test with N values of 100, 1000, 100000, and 1000000.  What do the results look like as the number N gets larger?
  */
   void diceDistribution(int N){
   int count1 =  0;
   int count2 =  0;
   int count3 =  0;
   int count4 =  0;
   int count5 =  0;
   int count6 =  0;
   //or int d1=0,d2=0,d3=0,d4=0,d5=0,d6=0\\
   for(int i = 0; i <= N; i ++){
    if(rollDice() == 1){
      count1 += 1;
    }else if(rollDice() == 2){
      count2 += 1;
    }else if(rollDice() == 3){
      count3 += 1;
    }else if(rollDice() == 4){
      count4 += 1;
    }else if(rollDice() == 5){
      count5 += 1;
    }else if(rollDice() == 6)
     count6 += 1;
    else count1 += 0;
   }
   print("roll of 1: " + count1);
   print("roll of 2: " + count2);
   print("roll of 3: " + count3);
   print("roll of 4: " + count4);
   print("roll of 5: " + count5);
   print("roll of 6: " + count6);
  }

  /*
  Challenge 4:
  Write a function additionTutor() that generates two random numbers and prompts the user to enter the sum of the two numbers. The random integers should range from -20 to 20 (inclusively). If the answer is correct return "Correct!" otherwise return "Incorrect".
  */


  /*
  Challenge 5:
  Write a function mathQuiz() that generates a random addition, subtraction, multiplication or division problem of two random integers, prompts the user for the answer. It returns "Correct!" if the answer is correct, otherwise returns "Incorrect". The random integers should range from -20 to 20 (inclusively).
  Hint: For the random operations (+,-,*,/) using a random number from 0 to 3 where 0 means +, 1 means -, 2 means * and 3 means /.
  */

  


}
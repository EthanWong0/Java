class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
  /* Call the functions with appropriate arguments */
    range(1,4,3);
    range(1,5,1);

    compound(1000.0,0.05,4);
  }
  
  /*
    1) 
    Write a function range() that accepts a start value, end value and incremental step to display all the integers from the start to end values (inclusive). 
    For example start=1, end=7, step=2 function displays 1 3 5 7
  */
   void range(int start, int end, int incremental){
     for(int i = start; i <= end; i += incremental){
      System.out.println(i);
    }
     System.out.println(":end");
   }

   /* 
    2) Compound Interest
    Write a function compound() that accepts an investment amount, annual interest rate and the # of years of investment. Display how the investment grows per year.
    For example: 
    Investment $1,000, interest rate 5% and term 3 years:
    Year 1: 1070.00
    Year 2: 1144.90
    Year 3: 1225.04
  */
  void compound(double investment, double interest, int years){
    for(int i = 1; i <= years; i ++){
      System.out.println("Year" + i + ":" + investment*Math.pow((interest+1),i));
    }
     System.out.println(":end");
  }

  
}
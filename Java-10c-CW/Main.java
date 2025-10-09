class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
   System.out.println("Enter number of tickets");
   int tickets = Input.readInt();
   System.out.println("Total cost is " + groupSavings(tickets));
   

   System.out.println("Enter amount spent");
   System.out.println("Enter cans purchased");
   double spent = Input.readDouble();
   int cans = Input.readInt();
   System.out.println(groceryDiscount(spent,cans));
  }

  /*
    Problem 1:      
    Write a function groupSavings() that takes the number of tickets you want 
    to purchase. Return the total cost by applying the following prices:
    1 to 8 tickets  : each ticket costs $11.00
    9 to 16 tickets : each ticket costs $10.50
    over 16 tickts  : each ticket costs $8.50
  */
  double groupSavings(int tickets){
    if(tickets >= 1 && tickets <= 8){
      return 11.00*tickets;
    }else if(tickets >= 9 && tickets <= 16){
      return tickets*10.50;
    }else if(tickets > 16){
      return tickets*8.5;
    }else{
      return 0;
    }
  }
  
  /*
    Problem 2:
    Write a function groceryDiscount() that takes the total amount spent at 
    a grocery store and the number of cans purchased. Based on the total amount 
    and the number of cans purchased, you get a savings on your total bill.
    
    Return the amount saved:
      Spend $100 to $200 and purchase at least 3 cans: $10 savings
      Spend over $200 and purchase more than 4 cans: $25 savings
      Otherwise: No discount.
    */
  String groceryDiscount(double spent, int cans){
   if(spent >=100 && spent <= 200 && cans >=3){
    return "$10 savings";
   }else if(spent > 200 && cans > 4){
    return "$25 savings";
   }else{
    return "No discount.";
   }
  }

}
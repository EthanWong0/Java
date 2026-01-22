class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){

	//3: create 3 new item objects
	CartItem cartItem1 = new CartItem("Apple",1,5,true);
  CartItem cartItem2 = new CartItem("Toothbrush",2.5,3,false);
  CartItem cartItem3 = new CartItem("Orange",1.5,6,true);
	
	//4: display name & original price of items that are on sale
	print("Items on sale: ");
  if(cartItem1.onSale == true)
   print(cartItem1.itemName + ": Original price is $" + cartItem1.itemPrice*cartItem1.quantity);
	if(cartItem2.onSale == true)
   print(cartItem2.itemName + ": Original price is $" + cartItem2.itemPrice*cartItem2.quantity);
  if(cartItem3.onSale == true)
      print(cartItem3.itemName + ": Original price is $" + cartItem3.itemPrice*cartItem3.quantity);
	//5: subtotal (for all quantities of all items in cart, using discounted prices)
	
	
	// display subtotal, tax and total
    double subtotal = cartItem1.getPrice()*cartItem1.quantity + cartItem2.getPrice()*cartItem2.quantity + cartItem3.getPrice()*cartItem3.quantity;
    double tax = 0.08875;
    double total = (subtotal*tax) + subtotal;

    print("Subtotal: " + subtotal);
    print("Tax: " + tax);
    print("Total: " + total);
  }

}
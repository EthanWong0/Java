class Car{
 
 String brand;
 String model;
 String color;
 int year;
 double value;

 void honk(String model){
    System.out.println(model + ": Beep Beep!");
 }

 Car(String brand, String model, String color, int year, double value){
  this.brand = brand;
  this.model = model;
  this.color = color;
  this.year = year;
  this.value = value;
 }
}
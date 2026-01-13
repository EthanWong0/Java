class Animal{
  // variables
  String animalSpecies;
  double weight;
  double height;  
  // Constructor
  Animal(String animalSpecies, double weight, double height){
    this.animalSpecies  = animalSpecies;
    this.weight         = weight;
    this.height         = height;
  }
  
// 1) Write a function isHealthy() in the Animal class that returns true if the animal's weight is between 30 and 100 pounds(exclusive); otherwise return false.
 boolean isHealthy(){
  if(this.weight > 30 && this.weight < 100)
   return true;
  else
   return false;
 }
 
//2) Write a function convertPoundsToKilos() in the Animal class that returns the weight in kilograms. {kilo = lbs * 0.45359237}
 double convertPoundsToKilos(){
  return this.weight*0.45359237;
 }
 
  
}
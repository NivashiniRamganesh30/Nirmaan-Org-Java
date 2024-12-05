package day10;

public class ConstructorCar {
	String make;
	int year;
 ConstructorCar(){
	 this.make="unknown";
	 this.year=2000;
	 }
 ConstructorCar(String make){
	 this.year=2000;
	 this.make=make;
	 }
 ConstructorCar(String make,int year){
	 this.year=year;
	 this.make=make;
     }
 void displayConstructorCarDetails(){
	 System.out.println(make);
	 System.out.println(year);
 }
 }



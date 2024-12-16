package day16;

 class Dog implements IAnimal  {

	@Override
	public void move() {
		System.out.println("The dog runs on four legs");
		
	}
	@Override
	public void speak() {
		System.out.println("The Dog says:WOOF! WOOF!");
	}

}
 class Bird implements IAnimal{

	@Override
	public void move() {
		System.out.println("The birds flies in the sky");
		
	}
	public void speak() {
		System.out.println("The birds says: CHIRP CHIRP!!");
	}
	 
 }
 
  public class Testing {
	  public static void main(String[] args) {
	Dog dog =new Dog();
	Bird bird =new Bird();
	dog.move();
	dog.speak();
	bird.move();
	bird.speak();
		System.out.println(IAnimal.isMammal("dog"));
		System.out.println(IAnimal.isMammal("bird"));
	}

}

package day13;

class Animal {
	void sound() {
		System.out.println("This Animal make sound");
	}
	
}
	class Dog extends Animal{
		@Override
		void sound() {
			System.out.println("This Dog barks");
		}
	}
		class Cat extends Dog{
			@Override
			void sound() {
				System.out.println("The cat meows");
			}
		}
			public class Inheritance{
			public static void main(String[] args) {
				Dog dog = new Dog ();
				Cat cat = new Cat ();
				dog.sound();
				cat.sound();
}
}


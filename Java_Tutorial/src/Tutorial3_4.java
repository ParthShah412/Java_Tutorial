/*This tutorial would cover dynamic Polymorphism
and would also give a glimpse on Casting and Instance of Function*/
/*
class Animal{
	protected int age;
	Animal(int age){
		this.age = age;
	}
	public void getAge() {
		System.out.println("Age is "+ age);
	}
	public void MakeSound() {
		System.out.println("This animal makes a sound");
	}
}

class Dog extends Animal{
	Dog(int age){
		super(age);
	}
	public void MakeSound() {
		super.MakeSound();// This would help us to add some more functionality 
						  // to the same method Make Sound that is overrided
		System.out.print("Bow woow");
	}
}
*/

//Creating one more class Duck

class Duck extends Animal{
	Duck(int age){
		super(age);
	}
	public void MakeSound() {
		super.MakeSound();// This would help us to add some more functionality 
						  // to the same method Make Sound that is overrided
		System.out.println("QQuack quack");
	}
	public void FlapWings() {
		System.out.println("Flapping the wings");
	}
}

public class Tutorial3_4{
	public static void main(String[] args) {
		//We will now define an animal as either a Dog or Duck
		Animal newAnimal = new Dog(4);
		newAnimal.getAge();
		newAnimal.MakeSound();
		System.out.println(newAnimal.getClass());
		Animal newAnimal1 = new Duck(2);
		((Duck)newAnimal1).FlapWings(); // This is called Casting an instance
		// As newAnimal is an instance of Dog it will give an Error
		if (newAnimal instanceof Duck) {
			((Duck) newAnimal).FlapWings();
		}
		
	}
}
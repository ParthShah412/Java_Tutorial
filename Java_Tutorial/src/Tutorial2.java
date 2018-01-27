/*This tutorial talks about Inheritance
 * See the comments to better understand the code
 */
// We will work with the classic example of Animal

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
		System.out.println("Bow woow");
	}
}

public class Tutorial2{
	public static void main(String[] args) {
		Dog dog = new Dog(1);
		dog.getAge();
		dog.MakeSound();
		
	}
}

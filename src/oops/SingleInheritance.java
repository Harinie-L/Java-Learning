package oops;

class Animal{
	void eat() {
		System.out.print("This Animal can Eat");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.print("This Animal can Bark");
	}
}
public class SingleInheritance{
	public static void main (String[] args) {
		Dog g = new Dog();
		g.eat();
	}
}
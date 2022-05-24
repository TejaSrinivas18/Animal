class Animal{
	void eat() {
		System.out.println("eating");
	}
	
	void sleep() {
		System.out.println("dog is sleeping");
	}
	
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking");
	}
}

class BabyDog extends Dog{
	void weep() {
		System.out.println("weeping");
	}	
}

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog bd = new BabyDog();
		bd.weep();
		bd.bark();
		bd.eat();
		bd.sleep();
		
	}
}

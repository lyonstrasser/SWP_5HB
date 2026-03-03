package genericsTypebounds;

public class AnimalCage<T extends Animal> {
	
	private T animal;
	
	public AnimalCage(T animal) {
		this.animal = animal;
	}
	
	public void sound() {
		this.animal.makeSound();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog1 = new Dog("Werner");
		Cat cat1 = new Cat("Susi");
		
		AnimalCage<Dog> dogCage = new AnimalCage<>(dog1);
		dogCage.sound();
		
		AnimalCage<Cat> catCage = new AnimalCage<>(cat1);
		catCage.sound();
		
		
	}

}

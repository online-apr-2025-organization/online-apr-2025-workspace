
public class AnimalDemo {

	public static void main(String[] args) {
		Animal animal = new Animal("Animal");
		System.out.println(animal.lives());
		System.out.println(animal.mobility());
		
		System.out.println("----------------");
		Dog dog = new Dog("Dog");
		System.out.println(dog.lives());
		System.out.println(dog.mobility());
		System.out.println(dog.friendly());
		
		System.out.println("----------------");
		Snake snake = new Snake("Snake");
		System.out.println(snake.lives());
		System.out.println(snake.mobility());
		System.out.println(snake.attacks());
		
		System.out.println("----------------");
		Animal animal2 = new Dog("Doggie");
		System.out.println(animal2.lives());
		System.out.println(animal2.mobility());
		//System.out.println(dog1.friendly());
		
		System.out.println("----------------");
		animal2 = new Snake("Snakie");
		System.out.println(animal2.lives());
		System.out.println(animal2.mobility());
		//System.out.println(animal2.attacks());
		
		System.out.println("----------------");
		Snake snake2 = (Snake) animal2; // explicit casting
		System.out.println(snake2.lives());
		System.out.println(snake2.mobility());
		System.out.println(snake2.attacks());
		
		System.out.println("----------------");
		Animal animal3 = snake2; // implicit casting
		
		//instance of operator and what it is it used for?
		
	}

}

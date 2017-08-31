public class Problem_3_6{

	public static void main(String[] args){
		Animal_Shelter kennel = new Animal_Shelter();

		kennel.enqueue(new Animal("dog", "Jeff"));
		kennel.enqueue(new Animal("dog", "Jim"));
		kennel.enqueue(new Animal("cat", "Beth"));
		kennel.enqueue(new Animal("dog", "Buddy"));
		kennel.enqueue(new Animal("cat", "Jill"));
		kennel.enqueue(new Animal("cat", "Jax"));
		kennel.enqueue(new Animal("dog", "Bill"));

		System.out.println(kennel.dequeueAny() + " has been dequeued");
		System.out.println(kennel.dequeueCat() + " has been dequeued");
		System.out.println(kennel.dequeueDog() + " has been dequeued");
		System.out.println(kennel.dequeueCat() + " has been dequeued");
		System.out.println(kennel.dequeueCat() + " has been dequeued");
		System.out.println(kennel.dequeueDog() + " has been dequeued");
	}

}
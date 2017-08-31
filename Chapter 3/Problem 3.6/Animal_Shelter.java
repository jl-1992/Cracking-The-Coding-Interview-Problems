import java.util.LinkedList;

public class Animal_Shelter{
	LinkedList<Animal> shelter = new LinkedList<Animal>();

	public void enqueue(Animal a){
		shelter.add(a);
	}

	public Animal dequeueAny(){
		return shelter.remove();
	}

	public Animal dequeueDog(){
		int count=0, index=0;
		for(Animal a : shelter){
			if(a.type.equals("dog")){
				index=count;
				break;
			}
			++count;
		}
		return shelter.remove(index);
	}

	public Animal dequeueCat(){
		int count=0, index=0;
		for(Animal a : shelter){
			if(a.type.equals("cat")){
				index=count;
				break;
			}
			++count;
		}
		return shelter.remove(index);
	}
}
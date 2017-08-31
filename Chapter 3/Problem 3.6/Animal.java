public class Animal{

	String type;
	String name;

	public Animal(String type, String name){
		this.type=type;
		this.name=name;
	}

	public String toString(){
		return name + " the " + type;
	}
}
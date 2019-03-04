
public abstract class Animal {
	String name;
	int legs;
	
	public String getName() {
		return name;	
	};
	
	public int getLegs() {
		return legs;	
	};
	
	@Override
	public String toString(){
	        return (name + " " + legs + " legs");
	    }

}

package metOveriding3;

public class Parent {
	Animal mary() // overriedden method  
	{
		System.out.println("automation ");
		//return new Animal();
		return new Animal();
		
	}
public static void mains(String args[]) {
	
	Parent p = new Parent();
	p.mary();
}

}

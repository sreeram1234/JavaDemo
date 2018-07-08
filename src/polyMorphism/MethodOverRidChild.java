package polyMorphism;

public class MethodOverRidChild  extends MethOverRidParent{
	
	void parent() { // overriding method
		System.out.println("Performance");
	}

	public static void main(String[] args) {
		new MethodOverRidChild().parent();
		

	}

}

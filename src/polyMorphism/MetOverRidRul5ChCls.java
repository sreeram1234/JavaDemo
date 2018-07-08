package polyMorphism;

public class MetOverRidRul5ChCls  extends MetOverRidRul5PCls {
	static void m1() {System.out.println("child m1()");};

	public static void main(String[] args) {
		MetOverRidRul5PCls p =  new MetOverRidRul5ChCls();
		p.m1();

	}

}

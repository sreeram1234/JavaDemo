package polyMorphism;

public class MethOverLoad {
	
	void  m1( int a){
		System.out.println(a);
		
	}
   void  m1( int a, int b){
	   System.out.println(a+b);
	}
   void  m1( String a){	
	   System.out.println(a);
}
	public static void main(String[] args) {
		MethOverLoad mvl = new MethOverLoad();	
		mvl.m1("Test");
		mvl.m1(10, 30);
		mvl.m1(100);
	}

}

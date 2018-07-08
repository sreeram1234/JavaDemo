package ineritanceDem;

public class C extends B {

	
    public  void m5() {
	System.out.println("m5 method");
}
    public  void m6() {
	System.out.println("m6 method");
}
    
	public static void main(String[] args) {
		C objc = new C();
		objc.m6();
		objc.m5();
		objc.m4();
		objc.m3();
		objc.m2();
		objc.m1();
		
		
		
	}

}

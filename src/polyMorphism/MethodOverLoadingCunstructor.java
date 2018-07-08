package polyMorphism;

public class MethodOverLoadingCunstructor {
	MethodOverLoadingCunstructor(int a){
      System.out.println(a);			
	}
	MethodOverLoadingCunstructor(int a, int b){
	      System.out.println(a+b);			
		}
	MethodOverLoadingCunstructor(String a){
	      System.out.println(a);			
		}

	public static void main(String[] args) {
		new MethodOverLoadingCunstructor (10);
		new MethodOverLoadingCunstructor (10,20);
		new MethodOverLoadingCunstructor ("test");
		

	}

}

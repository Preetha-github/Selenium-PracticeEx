package pack;

public class swapTwoNumbers {
	
	void method1(){
		int Preetha = 20;
		int Shrishti = 50;
		int temp;
		System.out.println("Before swapping - Salary of Preetha: " + Preetha + "; Salary of Shrishti: " + Shrishti );
		temp=Preetha;
		Preetha = Shrishti;
		Shrishti =temp;
		System.out.println("After swapping - Salary of Preetha: " + Preetha + "; Salary of Shrishti: " + Shrishti );
	}
	
	void method2() {
		int first = 20;
		int second = 50;
		
				
		first = first - second;
		second = first + second;
		first = second - first;
		System.out.println(first);
		System.out.println(second);
	}
	
	void method3() {
		int f = 20;
		int s = 50;
		
				
		f = f * s;
		s = f / s;
		f = f/s;
		System.out.println(f);
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		swapTwoNumbers swap = new swapTwoNumbers();
		swap.method1();
		swap.method2();
		swap.method3();
		
		
				

}
}
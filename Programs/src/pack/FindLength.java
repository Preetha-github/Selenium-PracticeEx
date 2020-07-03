package pack;

public class FindLength {

	static String name ="ShrishtiKaviarasu";
	
	void method1() {
		System.out.println("Given name is:" + name);
		int len= name.length();
		System.out.println("Length of the name: " + len);
		
	}
	
	void method2() {
		char[] namearray = name.toCharArray();
		System.out.println(namearray);
		
		int length = 0;
		for (char c : namearray) {
			System.out.println(c);
			length++;
			
			
		}
		System.out.println(length);
		
	}
	
	public static void main(String[] args) {
		
	FindLength length = new FindLength();
	length.method1();
	
	length.method2();
		
		
	}

}

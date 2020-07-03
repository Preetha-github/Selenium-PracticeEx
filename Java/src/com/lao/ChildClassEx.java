package com.lao;

public class ChildClassEx extends ParentClassEx {

	static {

		System.out.println("Static A");
	}

	static {

		System.out.println("Static B");
	}

	static {

		System.out.println("Static C");
	}

	public void car() {
		String color = "white";
		int Year = 2020;

		System.out.println("Color is " + color + " and make is " + Year);

	}
	private void abc() {
		System.out.println("abc");
	}

	
	
	void bike() {
		System.out.println("My bike");
	}

	public static void main(String[] args) {
		
		
		ChildClassEx child = new ChildClassEx();
		//child.engine();
	
		child.car();
		licence();
		child.bike();
		child.cycle();
		child.abc();
	
		
	
		
		
		
		
		
		

	}

}

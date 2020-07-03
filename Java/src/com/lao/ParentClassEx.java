package com.lao;

public class ParentClassEx {
	
	static {
		System.out.println("Static D");
	}
	
	public void engine() {
		String Model = "sports  car";
		System.out.println("Latest engine :" + Model + " model" );
	}
	
	
	void cycle() {
		
		System.out.println("My cycle");
	}
	
	private void toy() {
		System.out.println("Toy");
	}
	
	public static  void licence() {
		
		System.out.println("Got the licence");
	}
	
	
	public static void main(String[] args) {
		
	
	ParentClassEx PClass = new ParentClassEx();
	PClass.toy();
	
	

}
}

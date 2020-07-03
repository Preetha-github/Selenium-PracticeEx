package com.java.learn.sp;

public class ReturnEx {
	
	int Amt_to_collect = 2000;
	
	public int shriCollect() {
		System.out.println("Pls collect the amt: " + Amt_to_collect);
		
		return Amt_to_collect;
	}

	public static void main(String[] args) {
		
		ReturnEx ex = new ReturnEx();
		int i = ex.shriCollect();
		System.out.println(i);
		

	}

}

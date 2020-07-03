package pack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNum {

	public static Integer GivenArray[] = { 28, 75, 22, 55, 21 };

	public void smallestNum() {

		int smallestNumber = Integer.MAX_VALUE;

		for (int i = 0; i < GivenArray.length; i++) {

			if (GivenArray[i] < smallestNumber) {
				smallestNumber = GivenArray[i];

			}

		}
		System.out.println("The number is : " + smallestNumber);
	}
	
	// Using Arrays
	public void UsingArrays() {
		
		Arrays.sort(GivenArray);
		System.out.println(GivenArray[0]);
		
	}
	
	//Using Collection
	
	public void UsingCollection() {
		
		List<Integer> list = Arrays.asList(GivenArray);
		Collections.sort(list);
		
		System.out.println(list.get(0));
	}

	public static void main(String[] args) {

		
		SmallestNum SM = new SmallestNum();
		SM.UsingCollection();	
	}

}

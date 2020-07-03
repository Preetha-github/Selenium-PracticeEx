package pack;

public class ReverseNum {

	
	
	public static void main(String[] args) {
		
		int GivenNumber = 223145;
		int ReversedNumber = 0;
		
		while(GivenNumber!=0) {
		ReversedNumber = ReversedNumber * 10;
		ReversedNumber = ReversedNumber+ GivenNumber % 10;
		GivenNumber = GivenNumber/10;
		}
		System.out.println(ReversedNumber);

   }
	
		 
}

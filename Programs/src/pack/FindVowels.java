package pack;

import java.util.Scanner;

public class FindVowels {

	public static void main(String[] args) {
		
		String Name = "Preetharajan";
		int VowelCount = 0;
		
//		Scanner scanner = new Scanner (System.in);
//		System.out.println("Enter your name: " );
		//FindVowels Vow = new FindVowels();
		
		int namesize = Name.length();
		System.out.println("The size of the givenName = " + namesize );
		
		for(int i=0; i < namesize; i++){
				if (Name.charAt(i)== 'a'||Name.charAt(i)== 'A'||
					Name.charAt(i)== 'e'||Name.charAt(i)== 'E'||
					Name.charAt(i)== 'i'||Name.charAt(i)== 'I'||
					Name.charAt(i)== 'o'||Name.charAt(i)== 'O'||
					Name.charAt(i)== 'u'||Name.charAt(i)== 'U')
		VowelCount++;
					
		}
		System.out.println("Number of vowels in the given name is: " + VowelCount);
		

	}

}

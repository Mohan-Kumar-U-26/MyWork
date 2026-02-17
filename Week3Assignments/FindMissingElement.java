package week3Assignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] input = {1,4,3,2,8,6,7}; 
		Arrays.sort(input);
		
		//System.out.println(input);
		for (int i = input[0]; i <= input.length; i++) {
			if(input[i - input[0]] != i) {
				System.out.println(i);
				break;
				
			}
			
		}
		

	}

}

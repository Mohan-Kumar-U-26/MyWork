package week1assignment;

public class Palindrome {
	 public static void main(String[] args) {
	        int num = 121, reversed = 0, temp = num;
	        for (; num != 0; num /= 10) {
	            int remainder = num % 10;
	            reversed = reversed * 10 + remainder;
	            }

	        if (temp == reversed)
	            System.out.println(temp + " is a palindrome.");
	        else
	            System.out.println(temp +  " is not a palindrome.");
	        }
	 }

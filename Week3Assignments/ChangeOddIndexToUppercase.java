package week3Assignments;

public class ChangeOddIndexToUppercase {
	public static void main(String[] args) {
		 String test = "changeme";
		 char[] s = test.toCharArray();
		 
		 for (int i = 0; i < s.length; i++) {
			 if (i%2==1) {
				 s[i] = Character.toUpperCase(s[i]);
			}
		}
		 System.out.println(s);
	}

}

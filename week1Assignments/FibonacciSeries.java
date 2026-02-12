package week1assignment;

public class FibonacciSeries {
	public static void main(String[] args) {
		int range = 8;
		int Firstnumber = 0;
		int Secondnumber = 1;
		
		for (int i = 0; i < range; i++) {
			int Thirdnumber = Firstnumber + Secondnumber;
			System.out.println(Firstnumber);
			Firstnumber = Secondnumber;
			Secondnumber = Thirdnumber;		
		}	
	}
}

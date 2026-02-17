package week3Assignments;

public class FindDups {

	public static void main(String[] args) {
		String stringtext = "We learn Java basics as part of java sessions in java week1";
		String[] split = stringtext.split(" ");
		
		for (int i = 0; i <= split.length; i++) {
			for (int j = i+1; j < split.length; j++) {
				if(split[i].equalsIgnoreCase(split[j])) {
					//System.out.println(split[j]);
					stringtext = stringtext.replace(split[j], "");
					}
				}
			}
		System.out.println(stringtext);
	}
}



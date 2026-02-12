package week1assignment;

public class LibraryManagement {
	public static void main(String[] args) {
		Library newlib = new Library();
		String bookname = newlib.addBook("JungleBook");
		System.out.println(bookname);
		newlib.issueBook();
	}

}

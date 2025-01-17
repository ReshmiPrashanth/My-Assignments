package week2.Day1.HomeAssignment;

public class Library {
	public String addBook(String bookTitle) {
		System.out.println(bookTitle+" Book added successfully");
		return(bookTitle);
	}
	public void issueBook() {
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		Library lb=new Library();
		lb.addBook("The Dragon Fly");
		lb.issueBook();
		
	}

}

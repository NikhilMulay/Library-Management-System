package LibraryManagement;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class LibraryServiceManager {
	//Collection has taken
	private static List<Book>list;
	
	//static block will be invoked when class will be loaded and value will be assign.
	static {
		list = new ArrayList<Book>();
	}
	
	//method to add book in collection
	public static void addBook(Book book) {
		if(book==null) {
			throw new IllegalArgumentException("Please enter valid book details");
		}
		
		Optional<Book> existingBook = list.stream().filter(obj->obj.getBookId().equals(book.getBookId())).findFirst();
		
		if(existingBook.isPresent())System.out.println("Already book exist with : "+book.getBookId());
	    System.out.println("Book added successfully.");
		list.add(book);
	}
	
	//method to view book in collection
	public static void viewBooks() {
        if (list.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("List of available books:");
            list.stream().map(book->book.getBookId()+".  "+book.getBookTitle()).forEach(System.out::println);;
        }
    }
	
	//method to search book in collection and return that book
	public static Book searchBook(String bookId) {
        if (bookId == null) {
            throw new IllegalArgumentException("Book ID cannot be null.");
        }

        return list.stream()
                .filter(book -> book.getBookId().equals(bookId))
                .findFirst().orElse(null); 
    }

	//method to update book in collection
	public static void updateBook(String bookId, String newTitle) {
        if (bookId == null || newTitle == null) {
            throw new IllegalArgumentException("Book ID and new title cannot be null.");
        }

        Book bookToUpdate = list.stream().filter(book -> book.getBookId().equals(bookId)).findFirst().orElse(null);

        if (bookToUpdate != null) {
           bookToUpdate.setBookTitle(newTitle); 
            System.out.println("Book updated successfully.");
        } else {
            System.out.println("No book found with ID: " + bookId);
        }
    }
	
	//method to delete book in collection
	public static void deleteBook(String bookId) {
        if (bookId == null) {
            throw new IllegalArgumentException("Book ID cannot be null.");
        }

        Book bookToRemove = list.stream()
                .filter(book -> book.getBookId().equals(bookId))
                .findFirst()
                .orElse(null);

        if (bookToRemove != null) {
            list.remove(bookToRemove);
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("No book found with ID: " + bookId);
        }
	}

}

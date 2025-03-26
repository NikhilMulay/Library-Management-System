package LibraryManagement;

import java.util.Scanner;

public class LibraryManagementApp {
	
    public static void main(String[] args) {
    	Scanner sobj = new Scanner(System.in);
        // 1. While loop will be running until the condition is true
        while(true) {
            
            // 2. Format to be displayed to the user
            System.out.println("\t\t*************** Welcome to Digital Book Management System.....! ***************"
                    + "\n\t\tSelect option to perform :"
                    + "\n\t\t1. Add book"
                    + "\n\t\t2. View all books"
                    + "\n\t\t3. Search book"
                    + "\n\t\t4. Update book"
                    + "\n\t\t5. Delete book"
                    + "\n\t\t6. Exit"
                    + "\n\t\t******************************************************************************");
            
            try  {
                
                // 3. Read the user choice
                int userChoice = sobj.nextInt();
                sobj.nextLine(); // Consume the newline character left behind by nextInt
                
                // 4. Switch condition statement for different cases
                switch(userChoice) {
                    case 1:  
                        boolean isAvailable = true;
                        System.out.println("Enter bookId :");
                        String bookId = sobj.nextLine();
                        System.out.println("Enter book title :");
                        String bookTitle = sobj.nextLine();
                        System.out.println("Enter author name :");
                        String bookAuthorName = sobj.nextLine();
                        System.out.println("Enter book genre :");
                        String bookGenre = sobj.nextLine();
                       
                        /*  can execute by adding this object
                         *  new Book("1", ""Hundred Stitches", "Sudha Murthy", "Fiction", true);
                         *  new Book("2", "The God of Small Things", "Arundhati Roy", "Fiction", true);
                         *  new Book("3", "Midnight's Children", "Salman Rushdie", "Historical Fiction", true)
                         *  new Book("4", "Wise and Otherwise", "Sudha Murthy", "Non-fiction", true);                        
                         *  new Book("5", "The Namesake", "Jhumpa Lahiri", "Fiction", true);
                         
                         */
                        // Add the book to the library
                        LibraryServiceManager.addBook(new Book(bookId, bookTitle, bookAuthorName, bookGenre, isAvailable));
                        break;

                    case 2:  
                        // View all books in the library
                        LibraryServiceManager.viewBooks();
                        break;

                    case 3:  
                        System.out.println("Enter bookId :");
                        String searchId = sobj.nextLine();
                       
                        // Search the book based on ID 
                        Book bookToBeSearch = LibraryServiceManager.searchBook(searchId);
                        if(bookToBeSearch==null)System.out.println("No book exist with Id  :"+searchId);
                        	System.out.println(bookToBeSearch);
                        break;

                    case 4:  
                        System.out.println("Enter bookId :");
                        String updateId = sobj.nextLine();
                        System.out.println("Enter new book title :");
                        String updateTitle = sobj.nextLine();
                        
                        // Update book details based on ID
                        LibraryServiceManager.updateBook(updateId, updateTitle);
                        break;

                    case 5: 
                        System.out.println("Enter bookId :");
                        String deleteId = sobj.nextLine();
                        
                        // Delete the book from the library
                        LibraryServiceManager.deleteBook(deleteId);
                        break;

                    case 6:  
                        // Exit the program
                        System.out.println("Exiting the system...");
                        System.exit(0);
                        break;

                    default: 
                        // If user inputs an invalid option
                        System.out.println("Invalid option, try again.");
                        break;
                }
            } catch (Exception e) { 
                // Catch any exceptions and print stack trace for debugging
                e.printStackTrace();
            }
        }
    }
}

# Library-Management-

   Book.java
  ------------
1)It include information about book (bookId,bookTitle,bookAurthor,gen,isAvailable)
2)using paraametarized constructor properties will be assigned. 
3)Also defined getter setter for the all the properties along with hashcode,equals and toString method.
   
 
  LibraryManagementApp.java
--------------------------------
1) LibraryManagementApp.java is the main file which include the data to be displayed and accept user I/P.
2) There is while loop which will execute until and unless condition doesn't get false.
3) Format to be displayed for user which include option like :
                       [ Add book View all books Search book Update book Delete book Exit ]
4) Inside try block i have written logic which'll accept user I/P and proceed as per user I/P(Numerical value)
5) If any Exception occured it'll be handled by catch block.

  LibraryServiceManager.java  
---------------------------------  
1)In LibraryServiceManager.java i have declared list(Loose coupling) as a static member of class.
2)Which will be assigned with  ArrayList<Book>()  when class will be loaded 
3)public static void addBook(Book book) :
        -- Implemented the addBook logic using Exception handling if the object in null it'll throw 
           IllegalArgumentException and if bookId already exist it'll not be added as bookId is unique if both condition
           is false book will be added in list. 
4)public static void viewBooks() :
        -- Implemented the viewBooks logic using streamAPI it'll display bookId and bookTitle
4)public static Book searchBook(String bookId) :
        -- Implemented the searchBook logic using streamAPI it'll search book based on bookId. 
6)public static void updateBook(String bookId, String newTitle) :
        -- Implemented the updateBook logic using Exception handling if (bookId||newTitle) is null it'll throw 
           IllegalArgumentException. Using streamAPI concept it'll search book and record will be updated. 
7)public static void deleteBook(String bookId) :
        -- Implemented the deleteBook logic if bookId is null it'll throw exception and if book is found it'll be 
           removed.
               

package LibraryManagement;

import java.util.Objects;

public class Book {
	private String bookId;
	private String bookTitle;
	private String bookAurthor;
	private String gen;
	private boolean isAvailable;
	
	public Book(String bookId, String bookTitle, String bookAurthor, String gen, boolean isAvailable) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAurthor = bookAurthor;
		this.gen = gen;
		this.isAvailable = isAvailable;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAurthor() {
		return bookAurthor;
	}

	public void setBookAurthor(String bookAurthor) {
		this.bookAurthor = bookAurthor;
	}

	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(bookAurthor, bookId, bookTitle, gen, isAvailable);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookAurthor, other.bookAurthor) && Objects.equals(bookId, other.bookId)
				&& Objects.equals(bookTitle, other.bookTitle) && Objects.equals(gen, other.gen)
				&& isAvailable == other.isAvailable;
	}
	
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAurthor=" + bookAurthor + ", gen=" + gen
				+ ", isAvailable=" + isAvailable + "]";
	}
	

}

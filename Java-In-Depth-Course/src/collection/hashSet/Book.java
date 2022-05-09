package collection.hashSet;

public class Book {

	private String title;
	private String author;
	private int year;
	
	public Book(String title, String author, int year) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
	}
	
	public int hashCode() {
		return title.hashCode();
	}
	
	//Always override hashCode When you override equals
	public boolean equals(Object obj) {
		return (year == (((Book)obj).getYear())) && (author.equals(((Book)obj).getAuthor()));
	}

	
}

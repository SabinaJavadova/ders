package pck2;

import java.util.Comparator;

public class Book implements Comparable<Book> {
	
	String title;
	String author;
	int publicationYear;
	
	public Book(String title,String author,int publicationYear ) {
		this.title=title;
		this.author=author;
		this.publicationYear=publicationYear;
		
	}

	@Override
	public String toString() {
		
		return title + author + publicationYear;
	}

	@Override
	public int compareTo(Book b) {
		if (this.publicationYear>b.publicationYear) {
			return 1;
		}else if(this.publicationYear<b.publicationYear){
			return -1;
		}
		return 0;
	}

	
	}


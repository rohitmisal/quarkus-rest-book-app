package org;

public class Book {

	public int id;
	public String title;
	public String auther;
	public int yearOfPublication;
	public String genre;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String title, String auther, int yearOfPublication, String genre) {
		super();
		this.id = id;
		this.title = title;
		this.auther = auther;
		this.yearOfPublication = yearOfPublication;
		this.genre = genre;
	}

}

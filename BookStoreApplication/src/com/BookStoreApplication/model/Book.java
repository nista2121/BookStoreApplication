/**
 * 
 */
package com.BookStoreApplication.model;

import java.util.List;

/**
 * Provide the representation of the Book object data model
 * 
 * @author 16165
 *
 */
public class Book {

	private int id;
	private int categoryId;
	private String bookTitle;
	private String publisher;
	private List<Author> authors;

	/**
	 * Default Constructor with no parameter
	 */
	public Book() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param categoryId
	 * @param bookTitle
	 * @param publisher
	 * @param authors
	 */
	public Book(int id, int categoryId, String bookTitle, String publisher, List<Author> authors) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.bookTitle = bookTitle;
		this.publisher = publisher;
		this.authors = authors;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the bookTitle
	 */
	public String getBookTitle() {
		return bookTitle;
	}

	/**
	 * @param bookTitle the bookTitle to set
	 */
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return the authors
	 */
	public List<Author> getAuthors() {
		return authors;
	}

	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", categoryId=" + categoryId + ", bookTitle=" + bookTitle + ", publisher=" + publisher
				+ ", authors=" + authors + "]";
	}

}

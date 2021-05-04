/**
 * 
 */
package com.BookStoreApplication.model;

/**
 * Provide a Representation of Author object data model
 * 
 * @author 16165
 *
 */
public class Author {
	private int id;
	private int bookId;
	private String firstname;
	private String lastName;

	/**
	 * default Constructor with no parameterF
	 */
	public Author() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param bookId
	 * @param firstname
	 * @param lastName
	 */
	public Author(int id, int bookId, String firstname, String lastName) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.firstname = firstname;
		this.lastName = lastName;
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
	 * @return the bookId
	 */
	public int getBookId() {
		return bookId;
	}

	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", bookId=" + bookId + ", firstname=" + firstname + ", lastName=" + lastName + "]";
	}

}

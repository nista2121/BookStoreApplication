/**
 * 
 */
package com.BookStoreApplication.model;

/**
 * Provide the representation of the category object domain model
 * 
 * @author 16165
 *
 */
public class Category {
	private int id;
	private String categoryDescription;

	/**
	 * Default constructor without parameter
	 */
	public Category() {

	}

	/**
	 * @param id
	 * @param categoryDescription
	 */
	public Category(int id, String categoryDescription) {
		super();
		this.id = id;
		this.categoryDescription = categoryDescription;
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
	 * @return the categoryDescription
	 */
	public String getCategoryDescription() {
		return categoryDescription;
	}

	/**
	 * @param categoryDescription the categoryDescription to set
	 */
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", categoryDescription=" + categoryDescription + "]";
	}

}

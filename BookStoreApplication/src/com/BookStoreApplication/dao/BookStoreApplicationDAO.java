package com.BookStoreApplication.dao;

import java.util.List;

import com.BookStoreApplication.model.Book;
import com.BookStoreApplication.model.Category;

/**
 * The class represent the Data Access layer interface that encapsulate all the
 * data from the web application
 * 
 * @author 16165
 *
 */
public interface BookStoreApplicationDAO {
	
	public void insert(Book book);
	public void update(Book book);
	public void delete(int id);
	
	public List<Book> findAllBooks();
	public List<Book> searchBookBykeyWord(String keyword);
	public List<Category> findAllCategories();
	
	

}

package com.capgemini.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book {
	@Id
	long isbn;
	String title;
	float price;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "book_Author", joinColumns = @JoinColumn(name = "book_name"), inverseJoinColumns = @JoinColumn(name = "author_name"))
	List<Author> list;
	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public List<Author> getList() {
		return list;
	}

	public void setList(List<Author> list) {
		this.list = list;
	}
	

}

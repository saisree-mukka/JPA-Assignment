package com.capgemini.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Author")
public class Author {
	@Id
	int id;
	String name;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "book_Author", joinColumns = @JoinColumn(name = "author_name"), inverseJoinColumns = @JoinColumn(name = "book_name"))
	List<Book> list;

	public List<Book> getList() {
		return list;
	}

	public void setList(List<Book> list) {
		this.list = list;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + "]";
	}

}

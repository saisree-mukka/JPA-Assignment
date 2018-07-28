package com.capgemini.jpa.Entities;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

import com.capgemini.jpa.beans.Author;
import com.capgemini.jpa.service.AuthorService;
import com.capgemini.jpa.service.AuthorServiceImpl;

public class Client {
public static void main(String[] args) {
	AuthorService service=new AuthorServiceImpl();
	
	Author author=new Author();
	author.setAuthorId(100);
	author.setFirstName("sai");
	author.setMiddleName("sree");
	author.setLastName("mukka");
	author.setPhoneNumber("9640178686");
	service.addAuthor(author);
	
	author = service.findAuthorById(100);
	System.out.print("ID:"+author.getAuthorId());
	System.out.println(" firstName:"+author.getFirstName());
	System.out.println("middleName:"+author.getMiddleName());
	System.out.println("lastName:"+author.getLastName());
	System.out.println("phoneNumber:"+author.getPhoneNumber());
	
	author.setFirstName("nikki");
	service.updateStudent(author);
	
	//at this breakpoint, we have updated record added in first section
	author= service.findAuthorById(100);
	System.out.print("ID:"+author.getAuthorId());
	System.out.println(" firstName:"+author.getFirstName());
	
	//at this breakpoint, record is removed from table
	service.removeAuthor(author);
	System.out.println("End of program...");
	
	
	
	
}
}

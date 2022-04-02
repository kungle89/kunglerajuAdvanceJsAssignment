package com.greatlearning.library;



import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



@Repository
public class BookServiceImpl implements BookService {


	private SessionFactory sessionFactory;

	// create session
	private Session session;

	@Autowired
	BookServiceImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}


	}





	@Transactional
	public List<Book> findAll() {
		//		Session session;
		//
		//		try {
		//		    session = sessionFactory.getCurrentSession();
		//		} catch (HibernateException e) {
		//		    session = sessionFactory.openSession();
		//		}
		Transaction tx = session.beginTransaction();

		// find all the records from the database table
		List<Book> books=session.createQuery("from Book").list();

		tx.commit();


		return books;
	}

	@Transactional
	public Book findById(int id) {

		Book book = new Book();

		//		Session session;
		//
		//		try {
		//		    session = sessionFactory.getCurrentSession();
		//		} catch (HibernateException e) {
		//		    session = sessionFactory.openSession();
		//		}
		Transaction tx = session.beginTransaction();

		// find record with Id from the database table
		book = session.get(Book.class, id);

		tx.commit();


		return book;
	}

	@Transactional
	public void save(Book theBook) {

		//		Session session;
		//
		//		try {
		//		    session = sessionFactory.getCurrentSession();
		//		} catch (HibernateException e) {
		//		    session = sessionFactory.openSession();
		//		}
		Transaction tx = session.beginTransaction();

		// save transaction
		session.saveOrUpdate(theBook);


		tx.commit();


	}
	@Transactional
	public void deleteById(int id) {

		//		Session session;
		//
		//		try {
		//		    session = sessionFactory.getCurrentSession();
		//		} catch (HibernateException e) {
		//		    session = sessionFactory.openSession();
		//		}
		Transaction tx = session.beginTransaction();

		// get transaction
		Book book = session.get(Book.class, id);

		// delete record
		session.delete(book);

		tx.commit();

	}

	@Transactional
	public List<Book> searchBy(String Name, String Author) {

		//		Session session;
		//
		//		try {
		//		    session = sessionFactory.getCurrentSession();
		//		} catch (HibernateException e) {
		//		    session = sessionFactory.openSession();
		//		}
		Transaction tx = session.beginTransaction();
		String query="";
		if(Name.length()!=0 && Author.length()!=0)
			query ="from Book where name like '%"+Name+"%' or author like '%"+Author+"%'";
		else if(Name.length()!=0)
			query ="from Book where name like '%"+Name+"%'";
		else if(Author.length()!=0)
			query ="from Book where author like '%"+Author+"%'";
		else
			System.out.println("Cannot search without input data");


		List<Book> book=session.createQuery(query).list();

		tx.commit();


		return book;
	}

	// print the loop
	@Transactional
	public void print(List<Book> book) {

		for(Book b:book) 
		{
			System.out.println(b);
		}
	}



}
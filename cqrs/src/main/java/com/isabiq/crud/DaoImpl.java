package com.isabiq.crud;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DaoImpl implements IDao {

  private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

  @Override
  public void updateCustomer(Customer customer) {
    Session session = sessionFactory.openSession();
    session.beginTransaction();
    session.update(customer);
    session.getTransaction().commit();
    session.close();
  }

  @Override
  public void createCustomer(Customer customer) {
    Session session = sessionFactory.openSession();
    session.beginTransaction();
    session.save(customer);
    session.getTransaction().commit();
    session.close();
  }

  @Override
  public void deleteCustomer(Customer customer) {
    Session session = sessionFactory.openSession();
    session.beginTransaction();
    session.delete(customer);
    session.getTransaction().commit();
    session.close();

  }

  @Override
  public Customer getCustomerByUsername(String username) {
    Session session = sessionFactory.openSession();
    Query query = session.createQuery("from Customer where username=:username");
    query.setParameter("username", username);
    Customer customer = (Customer) query.uniqueResult();
    session.close();
    return customer;
  }

  @Override
  public List<Customer> getAllCustomers() {
    Session session = sessionFactory.openSession();
    session.beginTransaction();
    List<Customer> result = session.createQuery("from Customer").list();
    session.getTransaction().commit();
    return result;
  }

  @Override
  public void updateProduct(Product product) {
    Session session = sessionFactory.openSession();
    session.beginTransaction();
    session.update(product);
    session.getTransaction().commit();
    session.close();
  }

  @Override
  public void createProduct(Product product) {
    Session session = sessionFactory.openSession();
    session.beginTransaction();
    session.save(product);
    session.getTransaction().commit();
    session.close();
  }

  @Override
  public void deleteProduct(Product product) {
    Session session = sessionFactory.openSession();
    session.beginTransaction();
    session.delete(product);
    session.getTransaction().commit();
    session.close();
  }

  @Override
  public List<Product> getAllProducts() {
    Session session = sessionFactory.openSession();
    session.beginTransaction();
    List<Product> result = session.createQuery("from Product").list();
    session.getTransaction().commit();
    return result;
  }

}

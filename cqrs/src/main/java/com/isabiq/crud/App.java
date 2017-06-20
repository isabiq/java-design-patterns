package com.isabiq.crud;

import java.util.Arrays;

public class App {

  public static void main(String[] args) {
    IDao dao = new DaoImpl();
    // Products
    Product product1 = new Product("Samsung", 3000);
    Product product2 = new Product("IPad", 9000);
    Product product3 = new Product("Nexus", 4500);

    // Customers
    Customer customer1 = new Customer("isabiq", "sabiq", "mypass", Arrays.asList(product1));
    Customer customer2 = new Customer("username", "name", "pass", Arrays.asList(product2, product3));

    // add products to database
    dao.createProduct(product1);
    dao.createProduct(product2);
    dao.createProduct(product3);

    // add customers to database
    dao.createCustomer(customer1);
    dao.createCustomer(customer2);
    customer1.setPasswd("newpass");
    dao.updateCustomer(customer1);

    // get customers and their products
    dao.getAllCustomers().stream().forEach(c -> System.out.println(c + " Products : " + c.getProducts()));

    // Close Session
    HibernateUtil.getSessionFactory().close();
  }

}
